package com.CSSproperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		String name = driver.findElement(By.xpath("/html/body/div[2]/div/div/"
				+ "form/fieldset[1]/div[2]/div/input")).getAttribute("id");
		System.out.println(name);

		String mail = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/"
				+ "fieldset[1]/div[4]/div/input")).getAttribute("class");
		System.out.println(mail);
		
	}

}


