package com.BasicTestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BeforeClassTest {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.out.println("@Before class executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Opening Firefox Browser........");
		driver = new FirefoxDriver();
		System.out.println("Firefox Browser Opened Successfully.");
	}
	
	@Test
	public void BasicTest() {
		System.out.println("@Test site executing...........");
		driver.get("https://www.google.com/");
		System.out.println("@Test executed Successfully.");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
	}
	
}



