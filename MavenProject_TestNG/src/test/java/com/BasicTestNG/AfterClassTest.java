package com.BasicTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AfterClassTest {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.out.println("@Beforeclass");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
		System.out.println("Opening Firefox Browser........");
		driver = new FirefoxDriver();
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
	public void afterMethod(){
		System.out.println("@AfterMethod");
		WebElement googleTextBox = driver.findElement(By.name("q"));
		System.out.println(driver.getTitle());
		googleTextBox.sendKeys(" A, B, C, D, E, F, G, H . . . . . . . . . . . . . . . . ");
	}

	
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@Afterclass");
		Thread.sleep(5000);
		driver.close();
		System.out.println("Browser closed!");
	}

}


