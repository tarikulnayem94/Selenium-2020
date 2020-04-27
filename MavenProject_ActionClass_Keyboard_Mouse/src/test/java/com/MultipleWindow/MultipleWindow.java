package com.MultipleWindow;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");

		String parentGUID = driver.getWindowHandle();
		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		Thread.sleep(3000);

		Set<String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);
		System.out.println("total window : " + allGUID.size());

		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(childGUID);
				System.out.println("new window title : " + driver.getTitle());
				break;
			}
		}

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		for (String newGUID : allGUID) {
			if (!newGUID.equals(parentGUID)) {
				driver.switchTo().window(parentGUID);
				driver.get("https://www.bing.com/");
				System.out.println("new window title : " + driver.getTitle());
				break;
			}
		}
		
	}

}



