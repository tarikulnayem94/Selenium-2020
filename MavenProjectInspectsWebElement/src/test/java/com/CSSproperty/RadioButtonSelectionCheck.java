package com.CSSproperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSelectionCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

//		Default selection.....................
		WebElement subscribeRadioButton = driver.findElement(By.
				xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));
		boolean actualSelection = subscribeRadioButton.isSelected();
		if (actualSelection == true) {
			System.out.println("Default selection is 'No' ");
		} 
		else {
			System.out.println(" Default selection is 'Yes' ");
		}
		
		
		subscribeRadioButton.click();
		if (actualSelection == false) {
			System.out.println("current Selection is 'No' ");
		} 
		else {
			System.out.println("current Selection is 'Yes' ");
		}

	}

}
