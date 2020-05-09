package com.BrowserOpem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpen {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		
		
	}

}
