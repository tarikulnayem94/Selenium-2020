package com.BasicTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTest {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("@BeforeClass");
		driver = new FirefoxDriver();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
		System.out.println("Firefox Browser Opened Successfully.");
	}
	
	@Test
	public void BasicTest() {
		System.out.println("@Test site executing...........");
		driver.get("https://www.google.com/");
		System.out.println("google is open.");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
		WebElement googleTextBox = driver.findElement(By.name("q"));
		System.out.println(driver.getTitle());
		googleTextBox.sendKeys(" A, B, C, D, E, F, G, H . . . . . . . . . . . . . . . . ");
	}
	@AfterClass
	public void AfterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(10000);
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
		driver.close();
		System.out.println("Browser closed!");
	}
}



