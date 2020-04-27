package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		// find drop down option.............
		WebElement dropDownElementDay = driver.findElement(By.name("birthday_day"));
		WebElement dropDownEelementMonth = driver.findElement(By.name("birthday_month"));
		
		dropDownElementDay.click();
		Thread.sleep(3000);

		// create object for select class.............
		Select dropDownDay = new Select(dropDownElementDay);

		boolean singleOrMultiple = dropDownDay.isMultiple();
		if (singleOrMultiple) {
			System.out.println("dropDown is multiple value dropDown");
		} else {
			System.out.println("dropDown is single value dropDown");
		}

		// select day from drop down...........
		dropDownDay.selectByIndex(10);

		Select dropDownMonth = new Select(dropDownEelementMonth);
		dropDownMonth.selectByValue("10");
		
		// get all values and stored in list...........................
		List<WebElement> allElements = dropDownDay.getOptions();
		System.out.println("List all elements : ");

		for (WebElement element : allElements) {
			System.out.println(element.getText());
		}
	}

}
