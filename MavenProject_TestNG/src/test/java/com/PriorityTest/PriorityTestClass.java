package com.PriorityTest;

import org.testng.annotations.Test;

public class PriorityTestClass {
	
	@Test(priority = 4)
	public void test1() {
		System.out.println("test 1 execute");
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("test 2 execute");
	}

	@Test(priority = 2)
	public void test3() {
		System.out.println("test 3 execute");
	}

	@Test(priority = -1)
	public void test4() {
		System.out.println("test 4 execute");
	}
}
