package com.TestNG_MultipleTest_New;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTitleTest {
	WebDriver driver;

	@BeforeMethod
	public void openSite() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");		
	}
	
	@Test
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google" , "title is not match");
	}
	@Test()
	public void logoTest(){
		boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertEquals(logo, true);
		System.out.println(logo);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
}



