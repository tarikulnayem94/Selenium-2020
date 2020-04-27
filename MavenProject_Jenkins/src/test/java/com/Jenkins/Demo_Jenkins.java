package com.Jenkins;

import org.apache.maven.plugin.MojoExecutionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_Jenkins {
	
	WebDriver driver;
	
	@BeforeClass
	public void driverSetup() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}
	
	@Test(priority = 2)
	public void JenkinsTitleTest() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 1)
	public void JenkinsTest() throws MojoExecutionException{
		System.out.println(" Welcome to jenkins world ");
	}

}




