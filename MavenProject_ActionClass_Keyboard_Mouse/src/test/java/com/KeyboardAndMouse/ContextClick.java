package com.KeyboardAndMouse;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.cricbuzz.com/");
		Actions actions = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("/html/body/header/div/nav/div[6]"));

		actions.clickAndHold(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.DOWN)
		.sendKeys(Keys.ENTER).perform();

	}

}
