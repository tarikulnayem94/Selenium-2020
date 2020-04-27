package com.PageLoadTimeCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		
		
		

	}

}



