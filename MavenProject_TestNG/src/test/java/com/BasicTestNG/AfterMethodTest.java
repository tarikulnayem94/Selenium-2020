package com.BasicTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AfterMethodTest {

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Opening Firefox Browser........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Firefox Browser Opened Successfully.");
	}
	
	@Test
	public void simpleTest() {
		System.out.println("@Test executing...........");
		driver.get("https://www.google.com/");
		WebElement googleTextBox = driver.findElement(By.name("q"));
		googleTextBox.sendKeys("facebook  ");
		driver.findElement(
				By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b"))
				.click();
		System.out.println("@Test executed Successfully.");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		 Thread.sleep(100000);
		 driver.close();
	}

}



