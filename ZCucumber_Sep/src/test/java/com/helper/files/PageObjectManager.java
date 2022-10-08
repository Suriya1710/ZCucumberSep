package com.helper.files;

import org.openqa.selenium.WebDriver;

import com.adactinsite.pom.BookAHotelPage;
import com.adactinsite.pom.BookingConfirmPage;
import com.adactinsite.pom.LogInPage;
import com.adactinsite.pom.SearchHotelPage;
import com.adactinsite.pom.SelectHotelPage;

public class PageObjectManager {

	public WebDriver driver; // null

	private LogInPage login; // empty

	private SearchHotelPage search;

	private SelectHotelPage select;

	private BookAHotelPage book;

	private BookingConfirmPage confirm;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;

	}

	public LogInPage getInstanceLogin() {

		if (login == null) {

			login = new LogInPage(driver); // object

		}

		return login;

	}

	public SearchHotelPage getInstanceSearch() {

		if (search == null) {

			search = new SearchHotelPage(driver);

		}

		return search;

	}

	public SelectHotelPage getInstanceSelect() {

		if (select == null) {

			select = new SelectHotelPage(driver);

		}

		return select;
		

	}

	public BookAHotelPage getInstanceBookHotel() {

		if (book == null) {

			book = new BookAHotelPage(driver);

		}

		return book;

	}

	public BookingConfirmPage getInstanceBooking() {

		if (confirm == null) {

			confirm = new BookingConfirmPage(driver);

		}

		return confirm;

	}

}
