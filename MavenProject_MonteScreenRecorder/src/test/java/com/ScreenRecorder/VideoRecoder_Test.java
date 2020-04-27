package com.ScreenRecorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VideoRecoder_Test {
	WebDriver driver;

	@BeforeClass
	void setup() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	@Test
	void verifyLinks() throws Exception {
		//Starting point of video recording
		VideoRecorder_utlity.startRecord("GoogleTestRecording");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium"); 
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);
        //End point of video recording
		VideoRecorder_utlity.stopRecord();
	}

	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}



