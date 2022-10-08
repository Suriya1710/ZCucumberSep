package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.helper.files.PageObjectManager;
import com.runner.Runner_Class;
import com.utilityfiles.Utility_Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Utility_Files {

	public static WebDriver driver = Runner_Class.driver;

	public static PageObjectManager manager = new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		get("https://adactinhotelapp.com/");

	}
	
	@When("^user Enter Username$")
	public void user_Enter_Username() throws Throwable {

		send_Keys(manager.getInstanceLogin().getUsername(), "SuriyaVeeran17");

	}

	@When("^user Enter Password$")
	public void user_Enter_Password() throws Throwable {

		send_Keys(manager.getInstanceLogin().getPassword(), "Music1710");

	}

	@Then("^user Click On Login Button And It Navigates To The Search HotelPage$")
	public void user_Click_On_Login_Button_And_It_Navigates_To_The_Search_HotelPage() throws Throwable {

		click_On_Element(manager.getInstanceLogin().getLogin());

	}

	@When("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {

		dropdown(manager.getInstanceSearch().getLocation(), "byValue", "Sydney");

	}

	@When("^User Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {

		dropdown(manager.getInstanceSearch().getHotel(), "byValue", "Hotel Creek");

	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {

		dropdown(manager.getInstanceSearch().getRoomtype(), "byValue", "Standard");

	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {

		dropdown(manager.getInstanceSearch().getNumberofrooms(), "byValue", "2");

	}

	@When("^User Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {

		clear(manager.getInstanceSearch().getCheckin());

		send_Keys(manager.getInstanceSearch().getCheckin(), "1/10/2021");

	}

	@When("^User Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {

		clear(manager.getInstanceSearch().getCheckout());

		send_Keys(manager.getInstanceSearch().getCheckout(), "2/10/2021");

	}

	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {

		dropdown(manager.getInstanceSearch().getAdultroom(), "byValue", "2");

	}

	@When("^User Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {

		dropdown(manager.getInstanceSearch().getChildroom(), "byValue", "2");

	}

	@Then("^User Click The Search Button It Navigates To The \"([^\"]*)\" Page$")
	public void user_Click_The_Search_Button_It_Navigates_To_The_Page(String title) throws Throwable {

		click_On_Element(manager.getInstanceSearch().getSumbit());

		Assert.assertEquals(title, driver.getTitle());

	}

	@When("^User Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {

		driver.navigate().to("https://adactinhotelapp.com/SelectHotel.php");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		click_On_Element(manager.getInstanceSelect().getClickradiobtn());

	}

	@Then("^User Click The Continue Button It Navigates To The \"([^\"]*)\" Page$")
	public void user_Click_The_Continue_Button_It_Navigates_To_The_Page(String title) throws Throwable {

		click_On_Element(manager.getInstanceSelect().getContinuebtn());

		Assert.assertEquals(title, driver.getTitle());

	}
}
