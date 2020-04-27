package com.HeadlessBrowserTestingUsingPhantomJS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowserTestingUsingPhantomJS {

	@Test
	public void phantomJSDriver() {

		// Set the path of the phantomjs.exe file in the properties
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\phantomjs.exe");

		// To declare and initialize PhantomJSDriver
		WebDriver driver = new PhantomJSDriver();

		driver.get("https://www.google.com");

		// To locate the searchbox using its name
		WebElement element = driver.findElement(By.name("q"));

		// To enter text "softwaretestingmaterial.com"
		element.sendKeys("softwaretestingmaterial.com");
		element.submit();

		// Click on Software Testing Material link
		driver.findElement(By.linkText("Software Testing Material")).click();
		System.out.println("I am at " + driver.getTitle());

	}

}
