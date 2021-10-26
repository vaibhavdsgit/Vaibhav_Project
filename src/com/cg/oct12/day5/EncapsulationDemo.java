package com.cg.oct12.day5;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println("salary is " + emp.getSalary());
		
		emp.setSalary(50000);
		System.out.println("salary is " + emp.getSalary());
	}

}
