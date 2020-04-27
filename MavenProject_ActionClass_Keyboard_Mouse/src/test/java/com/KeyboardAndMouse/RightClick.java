package com.KeyboardAndMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

//		Launching Sample site
		driver.get("https://www.cricbuzz.com/");

//      create an web element
		WebElement element = driver.findElement(By.linkText("Rankings"));

//      assign action class 
		Actions action = new Actions(driver);
		Thread.sleep(3000);

//      use right click
		action.clickAndHold(element).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//		action.keyDown(element, "ICC Rankings Women").sendKeys(Keys.ENTER).perform();
//		action.clickAndHold(element)
//		  .click(first_WebElement).build().perform();
//        action.clickAndHold(element).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

	}

}
