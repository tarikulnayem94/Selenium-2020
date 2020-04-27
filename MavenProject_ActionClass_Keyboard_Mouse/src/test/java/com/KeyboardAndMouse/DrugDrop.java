package com.KeyboardAndMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DrugDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement dragbox1 = driver.findElement(By.id("box1"));
		WebElement dropbox101 = driver.findElement(By.id("box101"));
		
		WebElement dragbox3 = driver.findElement(By.id("box3"));
		WebElement dropbox103 = driver.findElement(By.id("box103"));
	
		WebElement dragbox6 = driver.findElement(By.id("box6"));
		WebElement dropbox106 = driver.findElement(By.id("box106"));
		
		WebElement dragbox7 = driver.findElement(By.id("box7"));
		WebElement dropbox107 = driver.findElement(By.id("box107"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(dragbox1, dropbox101);
		actions.dragAndDrop(dragbox3, dropbox103);
		actions.dragAndDrop(dragbox6, dropbox106);
		actions.dragAndDrop(dragbox7, dropbox107);
		
		actions.perform();

	}

}


