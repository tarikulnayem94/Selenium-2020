package com.EventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ActualDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
        EventListener listen = new EventListener();
        EventFiringWebDriver browser = new EventFiringWebDriver(driver);
        browser.register(listen);

        browser.get("https://google.com");
        browser.findElement(By.name("q")).sendKeys("Sendkeys with listener");
        browser.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
        
        browser.close();
        
	}
        
}
