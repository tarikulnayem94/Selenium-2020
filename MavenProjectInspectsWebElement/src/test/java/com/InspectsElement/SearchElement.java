package com.InspectsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
				+"\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("iphone");
		
		WebElement searchButton = driver.findElement(By.cssSelector("#search > span > button"));
		searchButton.click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		WebElement searchOption = driver.findElement(By.name("search"));
		searchOption.clear();
		searchOption.sendKeys("macBook");
		
		WebElement searchBtn = driver.findElement(By.cssSelector("#search > span > button"));
		searchBtn.click();
		
//		search.clear();
//		search.sendKeys("macBook");
//		searchButton.click();
		System.out.println(driver.getTitle());

	}

}
