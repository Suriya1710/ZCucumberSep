package com.helper.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData_Reader {
	
	public static Properties p; // --> null

	public TestData_Reader() throws IOException {

		File f = new File("C:\\Eclipse\\ZCucumber_Sep\\src\\test\\java\\com\\helper\\files\\TestData.properties");

		FileInputStream fis = new FileInputStream(f);

		 p = new Properties();

		p.load(fis);

	}

	public String get_Browser() throws IOException {

		String browser = p.getProperty("browser");

		return browser;

	}

	public String get_Url() throws IOException {

		String url = p.getProperty("url");

		return url;

	}

}
