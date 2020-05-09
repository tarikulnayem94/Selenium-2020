package com.BrowserOpem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpen {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "G:\\selenium driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		
	}

}
