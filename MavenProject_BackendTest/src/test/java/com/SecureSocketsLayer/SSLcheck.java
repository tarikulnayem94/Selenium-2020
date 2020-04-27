package com.SecureSocketsLayer;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLcheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
		
//		Accept Secure Sockets Layer Certificate...............
//		firefoxOptions.setAcceptInsecureCerts(true);
		
//		Deny Secure Sockets Layer Certificate...............
		firefoxOptions.setAcceptInsecureCerts(false);
		
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("http://www.cacert.org/");
		
		System.out.println(driver.getTitle());
		

	}

}
