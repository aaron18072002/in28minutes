package com.in28minutes.generics;

import java.util.List;

public class MyCustomListRunner {
	
	private static <X extends Number> X doubleValue(X value) {
		return value;
	}
	
	private static double sumOfNums(List<? extends Number> nums) {
		double sum = 0.0;
		for(int i = 0; i <= nums.size() - 1; i++) {
			sum += nums.get(i).doubleValue();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumOfNums(List.of(1,2,3,4,5)));
		System.out.println(sumOfNums(List.of(5.5f,3.3f,4.4f)));
		
//		MyCustomList<Integer> numbers = new MyCustomList<Integer>
//			(List.of(1,2,3,4,5));
//		
//		numbers.addElement(6);
//		
//		System.out.println(numbers.toString());
//		
//		System.out.println(numbers.getElement(0));
	}

}
