package com.Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		
		driver.switchTo().alert().sendKeys("Selenium");
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());

	}

}
