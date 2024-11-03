package com.in28minutes.generics;

import java.util.List;

public class MyCustomListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomList<Integer> numbers = new MyCustomList<Integer>
			(List.of(1,2,3,4,5));
		
		numbers.addElement(6);
		
		System.out.println(numbers.toString());
		
		System.out.println(numbers.getElement(0));
	}

}
