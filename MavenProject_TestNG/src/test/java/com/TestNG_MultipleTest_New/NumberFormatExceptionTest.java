package com.TestNG_MultipleTest_New;

import org.testng.annotations.Test;

public class NumberFormatExceptionTest {
	
	@Test (expectedExceptions=NumberFormatException.class)
	public void testOne(){
		
		String x = "100A";
		Integer.parseInt(x);
		
	}
	
}


