package com.cg.oct12.day5.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		System.out.println("Enter another number to divide:");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);
		} 
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
			System.out.println("Dont divide by zero");
		}
		finally {
			System.out.println("End");
		}

	}

}
