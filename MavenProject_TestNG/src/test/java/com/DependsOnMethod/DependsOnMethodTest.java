package com.DependsOnMethod;

import org.testng.annotations.Test;

public class DependsOnMethodTest {
	@Test()
	public void loginTest() {
		System.out.println("loginTest...........");
		// int i = 12/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("homePageTest...........");
		int i = 12/0;
	}

	@Test(dependsOnMethods = "homePageTest")
	public void featureTest() {
		System.out.println("featureTest...........");
	}
}
