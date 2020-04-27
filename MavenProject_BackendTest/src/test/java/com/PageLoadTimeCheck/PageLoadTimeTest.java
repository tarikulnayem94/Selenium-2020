package com.PageLoadTimeCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		long startingTime = System.currentTimeMillis();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		long endingTime = System.currentTimeMillis();

		long waitingTime = endingTime-startingTime;
		System.out.println("Load Time : " +waitingTime/1000 + " second ");
		
	}

}



