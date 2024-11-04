package com.in28minutes.functional_programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBehindTheScreenRunner {
	public static class EvenNumberPredicate implements Predicate<Integer> {
		@Override
		public boolean test(Integer num) {
			// TODO Auto-generated method stub
			return num%2 == 0;
		}	
	}
	
	private static class SystemOutConsumer implements Consumer<Integer> {
		@Override
		public void accept(Integer num) {
			// TODO Auto-generated method stub
			System.out.println(num);
		}		
	}
	
	public static class SquareOfNumberFunctional implements Function<Integer, Integer> {
		@Override
		public Integer apply(Integer num) {
			// TODO Auto-generated method stub
			return num*num;
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of(23,43,34,45,36,48).stream()
				.filter(new EvenNumberPredicate())
				.forEach(new SystemOutConsumer());
		
		System.out.println("---------------");
		
		List<Integer> numbers = List.of(23,43,34,45,36,48);
		
		printEvenNumber(numbers, new EvenNumberPredicate());
		
		System.out.println("---------------");
		
		numbers.stream().filter(num -> num%2 == 0)
						.map(new SquareOfNumberFunctional())
						.forEach(num -> {
							System.out.println(num);
						});
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
