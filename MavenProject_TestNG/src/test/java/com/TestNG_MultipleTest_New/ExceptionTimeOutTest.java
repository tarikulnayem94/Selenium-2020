package com.TestNG_MultipleTest_New;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test (invocationTimeOut = 1)
	public void infiniteLoopTest()
	{		
		int i = 5;	
		while(i==5)
		{
			System.out.println(i);
		}
	}
	
}


