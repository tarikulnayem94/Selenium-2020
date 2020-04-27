package com.InspectsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAnAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
				+"\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Tarikul");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Nayem");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("tarikul.ewu@gmail.com");
		
		WebElement telephone = driver.findElement(By.name("telephone"));
		telephone.sendKeys("01701046851");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Nayem2888");
		
		WebElement confirmPassWord = driver.findElement(By.name("confirm"));
		confirmPassWord.sendKeys("Nayem2888");
		
		WebElement subscribeRadioButton = driver.findElement(By.
				xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input"));
		subscribeRadioButton.click();
		
		WebElement privacyPolicyRadioButton = driver.findElement(By.name("agree"));
		privacyPolicyRadioButton.click();
		
		WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
		Continue.click();
		
	}

}
