package com.CSSproperty;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSpropertyTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/"
				+ "form/fieldset[1]/div[2]/div/input"));
		Dimension size = firstName.getSize();
		System.out.println(size);
		
		String bgColor = firstName.getCssValue("background-color");
		System.out.println(bgColor);
		
		String bbColor = firstName.getCssValue("border-bottom-color");
		System.out.println(bbColor);

		String borderRadius = firstName.getCssValue("border-top-left-radius");
		System.out.println(borderRadius);
		
		String padding = firstName.getCssValue("padding-top");
		System.out.println(padding);
		
		String lineHeight = firstName.getCssValue("line-height");
		System.out.println(lineHeight);
		
		String color = firstName.getCssValue("color");
		System.out.println(color);
		

	}

}


