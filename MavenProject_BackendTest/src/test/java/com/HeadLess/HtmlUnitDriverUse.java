package com.HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverUse {

	public static void main(String[] args) {

//		Creating a new instance of the Html Unit Driver
		WebDriver driver = new HtmlUnitDriver();

		driver.get("http://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		
		
	}

}


