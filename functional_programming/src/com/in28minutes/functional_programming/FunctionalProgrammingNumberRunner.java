package com.in28minutes.functional_programming;

import java.util.List;

public class FunctionalProgrammingNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
//		printNumber(numbers);
		System.out.println(sumOfNumbers(numbers));
	}
	
	private static void printNumber(List<Integer> nums) {
		nums.stream().forEach(num -> System.out.println(num));
	}
	
	private static int sumOfNumbers(List<Integer> nums) {
		return nums.stream().filter(num -> true)
							.reduce(0, (num1,num2) -> {
								System.out.printf("%d %d",num1,num2).println();
								return num1 + num2;
							});
	}
}
