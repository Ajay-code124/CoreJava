package com;

import java.util.Scanner;

public class Voters {

	
	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your input");
		int age = input.nextInt();
		try {
		if(age>18) {
			System.out.println("Yoiur are eligible for vote");
		}
		else {
			throw new InvalidAgeException("Age should be greater than or equal to 18");
		}
		
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
