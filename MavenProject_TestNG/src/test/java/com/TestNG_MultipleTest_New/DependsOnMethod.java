package com.TestNG_MultipleTest_New;
import org.testng.annotations.Test;
public class DependsOnMethod 
{
	@Test()
	public void loginTest() {
		System.out.println("loginTest...........");
//		int i = 12/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homePageTest(){
		System.out.println("homePageTest...........");
//		int i = 12/0;
	}
	@Test(dependsOnMethods="homePageTest")
	public void featureTest(){
		System.out.println("featureTest...........");
	}
	
}


