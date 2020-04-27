package com.JavaCode;

import java.util.Scanner;

public class Keyboard_Input {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter your name :"); 
			String name= sc.nextLine();
			
			System.out.println("Enter your number"); 
			int number = sc.nextInt();	
			
			System.out.println("Enter a float value..........");
			float x=sc.nextFloat();
			
			System.out.println(name+ "  "  +number+ " "+x);
			
			 
		}

	}