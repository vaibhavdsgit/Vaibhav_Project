package com.cg.oct12.day8.fun;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FunIn obj = () -> {
				System.out.println("functionalMethod");
			};
			obj.functionalMethod();

		
		//
//		FunIn obj = new FunIn() {
//			@Override
//			public void abstractMethod() {
//				System.out.println("abstractMethod");
//			}
//			
//			@Override
//			public void anotherAbstractMethod() {
//				System.out.println("anotherAbstractMethod");
//			}
//		};
//		
//		obj.abstractMethod();
//		obj.anotherAbstractMethod();
	}

}
