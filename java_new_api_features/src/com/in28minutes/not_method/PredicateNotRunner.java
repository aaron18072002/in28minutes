package com.in28minutes.not_method;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(3,4,5,67,89,88);	
		Predicate<Integer> evenNumber = n -> n%2 == 0;
		
		nums.stream().filter(evenNumber).forEach(n -> System.out.println(n));
		
		System.out.println("-------------");
		
		nums.stream().filter(Predicate.not(evenNumber)).forEach(n -> System.out.println(n));
	}
}
