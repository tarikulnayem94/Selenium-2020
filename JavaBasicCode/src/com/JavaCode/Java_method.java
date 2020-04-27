package com.JavaCode;

public class Java_method {
	public static void main(String[] args) 
	{
		System.out.println("this is main method");
//		anothermethod();                               // called anothermethod 
//		anothermethod();                              // called anothermethod 2nd times
		int sumValue=sum(100, 200);
		System.out.println(sumValue);
		System.out.println(sum(200, 200));
	}
	public static void anothermethod()    //accessmodefier returntype methodname parameterlist
	{
		System.out.println("this is anothermethod");
	}
	public static int sum(int A, int B)
	{
		return A+B;
	}
	
	
	
	
	
	
	
}
