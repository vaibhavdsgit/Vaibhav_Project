package com.cg.oct12.day5;

public class Employee {
	
	private int eid;
	private String ename;
	private double salary=10000;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
