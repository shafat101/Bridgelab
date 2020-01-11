package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the UserName : ");
		String userName = input.next();
		
	  
	  System.out.println("Hello <<" + userName + ">>, How are you?");
	  

	}

}