package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Pause {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=Rb-OCe6o-Mc");

		WebElement element = driver.findElement(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]"
				+ "/div/div/div/ytd-player/div/div/div[1]/video"));
		Actions actions = new Actions(driver);

		actions.moveToElement(element);
		actions.pause(10000);
		actions.click(element);
		actions.perform();

	}

}


