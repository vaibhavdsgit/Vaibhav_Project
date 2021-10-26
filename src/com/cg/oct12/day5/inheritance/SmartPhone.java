package com.cg.oct12.day5.inheritance;

public class SmartPhone extends FeaturePhone {
	
	void camera() {
		System.out.println("Snap a pic");
	}

	@Override
	void music() {
		System.out.println("Play music with Dolby");
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
