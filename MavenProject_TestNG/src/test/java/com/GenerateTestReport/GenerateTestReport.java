package com.GenerateTestReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GenerateTestReport {
	
	WebDriver driver;

	@BeforeTest
	public void googleOpen() {
		System.out.println("@Before test executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
		driver = new FirefoxDriver();
	}

	@Test(description = "This is the test method for open test site & show title")
	public void googleTitle() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

	@Test(description = "This is the test method for close google")
	public void tearDown() {
		driver.close();
	}
}
