package com.MoreTestCases_MIXED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreTestCases {
	WebDriver driver;

	@BeforeClass
	public void driverSetup() {
		System.out.println("@BeforeClass executing...........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}

	@BeforeMethod
	public void openSite() {
		System.out.println("\n");
		System.out.println("@BeforeMethod executing...........");
	}

	@Test(priority = 1, groups = "URL")
	public void showURL() {
		System.out.println("@TestCase 1 executing...........");
		System.out.println(driver.getCurrentUrl());
	}

	@Test(priority = 2, groups = "Title")
	public void TitleTest() {
		System.out.println("@TestCase 2 executing...........");
		System.out.println(driver.getTitle());
	}

	@Test(priority = 3, groups = "TestCase")
	public void textOne() {
		System.out.println("@TestCase 3 executing...........");
		;
	}

	@Test(priority = 4, groups = "TestCase")
	public void testTwo() {
		System.out.println("@TestCase 4 executing...........");
	}

	@Test(priority = 5, groups = "TestCase")
	public void testThree() {
		System.out.println("@TestCase 5 executing...........");
	}

	@Test(priority = 6, groups = "LOGO")
	public void logoTest() {
		System.out.println("@TestCase 6 executing...........");
		boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(logo);
	}

	@AfterMethod
	public void executionOver() {
		System.out.println("@AfterMethod executing........");
	}

	@AfterClass
	public void deleteAllCookies() {
		System.out.println("@AfterMethod executing........");
		driver.manage().deleteAllCookies();
	}

}



