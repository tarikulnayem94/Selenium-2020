package com.DataProviderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderImplement {
	WebDriver driver;
	
	@DataProvider(name = "searchData")
	public Object[][] searchData(){
		Object[][] data = new Object[3][2];	
		
	    data[0][0] = "admin";
	    data[0][1] = "1234";
	    data[1][0] = "admin1";
	    data[1][1] = "123456";
	    data[2][0] = "admin2";
	    data[2][1] = "12345678";	    
		return data;
	}
	@Test(dataProvider = "searchData")
	public void loginTest(String username, String password ) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println("Browser open successfully");
		
		WebElement mail = driver.findElement(By.cssSelector("#input-email"));
		mail.sendKeys(username);
		WebElement pass = driver.findElement(By.cssSelector("#input-password"));
		pass.sendKeys(password);
		
		WebElement logInButton = driver.findElement(By.
				xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input[1]"));
		logInButton.click();
	}
}

