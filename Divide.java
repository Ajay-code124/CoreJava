package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
	
	public static void main(String[] args) {
		
		try {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your input");
		int num1 = a.nextInt();
		System.out.println("Enter your input");
		int num2 = a.nextInt();
		
		int num3= num1/num2;
		
		System.out.println(num3);
		}
		catch(ArithmeticException e) {  
			System.out.println("Cannot divided by zero");

	}
		catch(InputMismatchException e) {
		
		}
		System.out.println("Please enter proper intinput");
}
}
