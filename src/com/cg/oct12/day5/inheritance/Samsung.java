package com.cg.oct12.day5.inheritance;

public class Samsung extends SmartPhone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung obj1 = new Samsung();
		obj1.call();
		obj1.sms();
//		obj1.mms();		// Cannot access private member
		obj1.music();
		obj1.camera();
	}

}
