package com.iFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class iFrame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://the-internet.herokuapp.com/iframe");
		
//		switch to iFrame................................
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement iFrame = driver.findElement(By.id("tinymce"));
		iFrame.clear();
		iFrame.sendKeys("Selenium test Autometion............ ");
		
		
		
		
		

	}

}




