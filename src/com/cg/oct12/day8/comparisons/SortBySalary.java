package com.cg.oct12.day8.comparisons;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("compare");
		return (int) (o1.salary - o2.salary);
	}
}
