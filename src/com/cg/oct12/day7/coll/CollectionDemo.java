package com.cg.oct12.day7.coll;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {

//		int[] arr = new int[5];
//		System.out.println(arr[4]);


		ArrayList myList = new ArrayList();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("aaa");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(2);
		System.out.println(myList);
		System.out.println(myList.size());

		ArrayList myList2 = new ArrayList();
		myList2.add(22);
		myList2.add(myList); // comment out the next line 
//		myList2.addAll(myList); // comment out the previous line 
		myList2.add("www");
		System.out.println(myList2);
		System.out.println(myList2.size());

	}

}
