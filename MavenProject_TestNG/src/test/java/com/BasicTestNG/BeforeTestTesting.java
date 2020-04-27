package com.BasicTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BeforeTestTesting {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("@Before Test executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
		driver = new FirefoxDriver();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@Before Method started work");
		System.out.println("Opening Firefox Browser........");
		System.out.println("Firefox Browser Opened Successfully.");
	}
	
	@Test
	public void BasicTest() {
		System.out.println("@Test site executing...........");
		driver.get("https://www.google.com/");
		System.out.println("google is open.");
		System.out.println("@Test executed Successfully.");
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		WebElement googleTextBox = driver.findElement(By.name("q"));
		System.out.println(driver.getTitle());
		googleTextBox.sendKeys(" A, B, C, D, E, F, G, H . . . . . . . . . . . . . . . . ");
		Thread.sleep(10000);
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
		driver.close();
		System.out.println("Browser closed!");
	}
}



