package com.HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		
//		Set Firefox HeadLess............................
		firefoxOptions.setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		
	}

}

