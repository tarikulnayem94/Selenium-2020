package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetWindowSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/DynamicWebProjectConnectToSQL/Registration.html");
		
		driver.manage().window().setSize(new Dimension(500, 500));
		
		System.out.println(driver.manage().window().getSize());

		driver.quit();
	}

}


