package com.utilityfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility_Files {

	public static WebDriver driver; // ---> null

	public static String value; // ---> null

	public static WebDriver get_Browser(String name) {

		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void get(String url) {

		driver.get(url);

	}

	public static void close() {

		driver.close();

	}

	public static void quit() {

		driver.quit();

	}

	public static String get_Title() {

		String title = driver.getTitle();

		return title;

	}

	public static void click_On_Element(WebElement ele) {

		ele.click();

	}

	public static void send_Keys(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void clear(WebElement element) {

		element.clear();

	}

	public static void robot_Down() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);

		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static String get_Attribute(WebElement ele, String attributeName) {

		String value = ele.getAttribute(attributeName);

		return value;

	}

	public static String get_Text(WebElement ele) {

		String text = ele.getText();

		return text;

	}

	public static boolean is_Displayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		return displayed;

	}

	public static void dropdown(WebElement element, String type, String data) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(data);

		}

		else if (type.equalsIgnoreCase("byText")) {

			s.selectByVisibleText(data);

		}

		else if (type.equalsIgnoreCase("byIndex")) {

			int val = Integer.parseInt(data);

			s.selectByIndex(val);

		}

	}

	public static String read_Data(String path, int sheet, int row, int cell) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(sheet);

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();

		}

		else if (type.equals(CellType.NUMERIC)) {

			double numericCellValue = c.getNumericCellValue();

			// double to String

			value = String.valueOf(numericCellValue);

		}

		wb.close();
		
		return value;

	}

}
