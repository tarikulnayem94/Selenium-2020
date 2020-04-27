package com.JavaCode;

import java.util.Scanner;
public class Switch_statement {
	public static void main(String[] args) {
		
		String name="";    // store name
		Scanner Name=new Scanner(System.in);
		System.out.println("Enter your name :::");
		name=Name.nextLine();
		
		switch(name)  //   while(Boolean_Expression)
		{
		case "Rahim":
		    System.out.println("He is a programmer");
		    break;
		case "karim":
			System.out.println("He is a cricketer");
			break;		
		case "munna":
			System.out.println("He is a footballer");
			break;
		default :
			System.out.println("error");
		}
	}
}
