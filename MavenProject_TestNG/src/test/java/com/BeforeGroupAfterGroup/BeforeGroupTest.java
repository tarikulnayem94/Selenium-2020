package com.BeforeGroupAfterGroup;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupTest {
	
	@BeforeGroups("IT Department")
	public void beforeIT() {
		System.out.println("This method will be executed before the execution of IT Department group");
	}

	@Test
	public void testcase1() {
		System.out.println("HR");
	}

	@Test(groups = { "IT Department" })
	public void testcase2() {
		System.out.println("Software Developer");
	}

	@Test(groups = { "IT Department" })
	public void testcase3() {
		System.out.println("QA Analyst");
	}

}
