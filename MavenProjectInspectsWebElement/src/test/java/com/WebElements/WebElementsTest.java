package com.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebElementsTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
//		driver.get("https://demo.opencart.com/index.php?route=account/register");

		WebElement logo = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a"));
		System.out.println(logo.getText());

		String value = driver.findElement(By.
				cssSelector("#content > div.row > div:nth-child(1) > div > div.caption > h4 > a")).getAttribute("value");
		System.out.println(value);

		String iPhonePrice = driver.findElement(By.
				cssSelector("#content > div.row > div:nth-child(2) > div > div.caption > p.price")).getText();
		System.out.println(iPhonePrice);
		
//		String ppRadioButton = driver.findElement(By.
//				cssSelector("#content > form > div > div > input.btn.btn-primary")).getAttribute("value");
//		System.out.println(ppRadioButton);
		
//		String mailIDCheck = driver.findElement(By.name("email")).getAttribute("id");
//		System.out.println(mailIDCheck);
		
	}

}


