package com.BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeSuiteTest {
	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
	}

	@BeforeTest
	public void LounchBrowser() {
		System.out.println("@BeforeTest executing........");
		driver = new FirefoxDriver();
	}

	@BeforeClass
	public void enterURL() {
		System.out.println("@BeforeClass executing...........");
		driver.get("https://www.google.com/");
	}

	@BeforeMethod
	public void openSite() {
		System.out.println("@BeforeMethod executing...........");
		System.out.println("Open Browser........");
	}

	@Test
	public void TitleTest() {
		System.out.println("@Test site executing...........");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod executing........");
	}

	@AfterClass
	public void deleteAllCookies() {
		System.out.println("@AfterClass executing........");
		driver.manage().deleteAllCookies();
	}

}
