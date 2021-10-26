package com.cg.oct12.day4;

public class FinalDemo {
	
	/*
	 * final
	 * final variable/field --> cannot be changed
	 * final method --> cannot be overridden
	 * final class --> cannot be extended
	 *
	 */
	
	static final int NUMBER_OF_OVERS = 20;
	
	private static final int num = 10;
	private static int num2 = 20;

	public static void main(String[] args) {
		
		

		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
//		FinalDemo.num = 15; // CE
		FinalDemo.num2 = 25;

		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
	}
}
