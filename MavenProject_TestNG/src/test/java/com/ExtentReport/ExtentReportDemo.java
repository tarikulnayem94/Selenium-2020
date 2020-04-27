package com.ExtentReport;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {
	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;

	@BeforeSuite
	public void BeforeSuite() {
		extent = new ExtentReports(System.
				getProperty("user.dir") + "\\ExtentReport\\MyExtentReportResults.html", true);
		extent.loadConfig(new File("G:\\Selenium 2020\\TEST_NG\\MavenProject_TestNG\\extent-config.xml"));
	}
	@BeforeMethod
	public void beforeMethod(Method method) {
		test = extent.startTest((this.getClass().getSimpleName() + " :: " +method.getName()),
				method.getName());
		test.assignAuthor(" Tarikul Nayem ");
		test.assignCategory(" COVID - 19 REPORT ");	
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		test.log(LogStatus.PASS, "Browser Open Successfully");	
	}
	
	@Test
	public void extentReportsDemo() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String currentURL = driver.getCurrentUrl();
		test.log(LogStatus.PASS, "current url of webpage :: " +currentURL);
		
		WebElement mail = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		mail.clear();
		mail.sendKeys("tarikul.wu@gmail.com");
		WebElement passWord = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input"));
		passWord.clear();
		passWord.sendKeys("Nayem2888");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary")).click();

		WebElement error = driver.findElement(By.cssSelector("#account-login > div.alert.alert-danger.alert-dismissible"));
		String actualResult = error.getText();
		String expectedResult = "enter valid email id";
		
		if (actualResult.equalsIgnoreCase(expectedResult)) {
			test.log(LogStatus.PASS, "Expected result : " + expectedResult);
		}
		else {
			test.log(LogStatus.FAIL, "Actual result is : " + actualResult);
		}	
	}
	
	@AfterMethod
	public void afterMethod() throws IOException {
		extent.endTest(test);
	}

	@AfterSuite
	public void afterSuite() {
		extent.flush();
		extent.close();
		
	}

}



