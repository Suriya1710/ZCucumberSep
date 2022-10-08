package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utilityfiles.Utility_Files;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = ".\\Feature\\Home_Page.feature",

		glue = "com.stepdef",

		monochrome = true,

		dryRun = false,

		strict = false,

		tags =

		// {"~@Ad-Hoc"},

		{ "@Smoke,@Sanity" },

		plugin = { "html:Reports"

		}

)

public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		driver = Utility_Files.get_Browser("chrome");

	}

	@AfterClass
	public static void tear_Down() {

		driver.close();

	}

}
