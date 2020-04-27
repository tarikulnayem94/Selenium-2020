package com.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverManagerUse {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		/*
		 Notice that simply adding WebDriverManager.firefoxdriver().setup();
		 WebDriverManager does magic for you: 
		 It checks the version of the browser installed in your machine (e.g. Chrome, Firefox). 
		 It checks the version of the driver (e.g. chromedriver, geckodriver). 
		 If unknown, it uses the latest version of the driver. 
		 It downloads the WebDriver binary if it is not present on the WebDriverManager cache. 
		 It exports the proper WebDriver Java environment variables required by Selenium.
		*/
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(8000);
		
		driver.close();
		driver.quit();
	}
}
