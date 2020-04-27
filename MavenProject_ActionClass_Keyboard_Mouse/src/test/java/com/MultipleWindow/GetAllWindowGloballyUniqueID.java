package com.MultipleWindow;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllWindowGloballyUniqueID {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");

		String parentGUID = driver.getWindowHandle();
		System.out.println("parent window GUID : " + parentGUID);

		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		Thread.sleep(3000);

		Set<String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);

		System.out.println("page title before switching : " + driver.getTitle());
		System.out.println("total window : " + allGUID.size());

	}

}


