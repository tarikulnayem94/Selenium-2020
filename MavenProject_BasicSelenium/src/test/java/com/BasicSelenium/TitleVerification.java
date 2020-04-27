package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/DynamicWebProjectConnectToSQL/Registration.html");
		
		String expectedTitle = "my testing site";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("title pass");
		}
		else {
			System.out.println("title failed!");
		}

		System.out.println("Actual title : " +driver.getTitle());
	}

}


