package com.JavaCode;

import java.util.Scanner;
public class Grading_System {
	public static void main(String[] args){
		float number;
		Scanner Mark=new Scanner(System.in);
		System.out.println("Enter your marks :::");
		number=Mark.nextFloat();
		if(number>=80 && number<=100)   //   while(Boolean_Expression)
		{
			System.out.println("you got A+");
		}	
		else if(number>=50 && number<60)
		{
			System.out.println("you got C");
		}
		else if(number>=40 && number<50)
		{
			System.out.println("you got D");
		}
		else if(number>=70 && number<80)
		{
			System.out.println("you got A");
		}
		else if(number>=60 && number<70)
		{
			System.out.println("you got B");
		}
		else if(number<35 && number>=0)
		{
			System.out.println("you got F");
		}
		else
		{
			System.out.println("Mark is invalid..... Error ");
		}
	}
}
