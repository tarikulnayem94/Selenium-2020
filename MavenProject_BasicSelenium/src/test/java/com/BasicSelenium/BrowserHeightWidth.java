package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserHeightWidth {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		int height = driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;
		
		System.out.println(height + " ; " + width);
		System.out.println("Height : " + driver.manage().window().getSize().getHeight());
		
		
	}

}


