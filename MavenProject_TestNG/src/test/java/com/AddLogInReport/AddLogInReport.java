package com.AddLogInReport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AddLogInReport {
	
	WebDriver driver;
	@BeforeTest
	public void googleConfig() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
	}
	
	@Test(description = "This is the test method for google Open")
	public void googleOpen() {
		driver = new FirefoxDriver();
		Reporter.log("Browser open");
		driver.get("https://www.google.com/");
	}
	@Test
	public void googleURL() {
		Reporter.log("Browser URL");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(description = "This is the test method for show google Title")
	public void googleTitle() {
		Reporter.log(" Getting title......... ");
		System.out.println(driver.getTitle());
	}

	@Test(description = "This is the test method for google CLOSE")
	public void tearDown() {
		Reporter.log("Browser CLOSED !.");
		driver.close();
		
	}
	
}

