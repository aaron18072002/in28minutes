package com.in28minutes.functional_programming;

import java.util.List;
import java.util.function.Predicate;

public class LambdaBehindTheScreenRunner {
	public static class EvenNumberPredicate implements Predicate<Integer> {
		@Override
		public boolean test(Integer num) {
			// TODO Auto-generated method stub
			return num%2 == 0;
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of(23,43,34,45,36,48).stream()
				.filter(new EvenNumberPredicate())
				.forEach(num -> System.out.println(num));
		
		System.out.println("---------------");
		
		List<Integer> numbers = List.of(23,43,34,45,36,48);
		
		printEvenNumber(numbers, new EvenNumberPredicate());
	}	
	
	public static void printEvenNumber
		(List<Integer> numbers, Predicate<Integer> predicate) {
		for(int i = 0; i <= numbers.size() - 1; i++) {		
			if(predicate.test(numbers.get(i))) {
				System.out.println(numbers.get(i));
			}
		}
	}
}
