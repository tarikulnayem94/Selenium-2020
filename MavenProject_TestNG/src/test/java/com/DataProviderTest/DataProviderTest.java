package com.DataProviderTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderTest {

	WebDriver driver;
	
	@DataProvider(name = "searchData")
	public Object [][] searchData()
	{
		Object [][] data = new Object[3][1];
		data [0][0] = "https://www.google.com/";
		data [1][0] = "https://www.bing.com/";
		data [2][0] = "https://www.espnfc.com/";
		
		return data;
	}
	@Test (dataProvider = "searchData")
	public void findData(String testSite) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
		driver = new FirefoxDriver();
		driver.get(testSite);
	}
	@AfterClass
	public void closeDriver()
	{
		driver.quit();
	}

}


