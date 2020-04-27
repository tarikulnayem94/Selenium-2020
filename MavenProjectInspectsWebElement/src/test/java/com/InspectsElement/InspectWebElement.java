package com.InspectsElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class InspectWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
		
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("iPhone");
		
		WebElement SearchButton = driver.findElement(By.
				xpath("/html/body/header/div/div/div[2]/div/span/button"));
		SearchButton.click();
		

//		Title verification................
		String expectedTitle = "Search - iphone";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Successfully get the result");
		} 
		else {
			System.out.println("failed");
			System.out.println("actual Title : " + driver.getTitle());
		}

	}

}

