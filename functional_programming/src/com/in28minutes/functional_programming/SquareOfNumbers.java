package com.in28minutes.functional_programming;

import java.util.List;
import java.util.stream.IntStream;

public class SquareOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strs = List.of("Apple","Ant","Bat");
		
		printSquareOf10Nums();
		
		printLowerCaseOfStrings(strs);
		
		printLengthOfStrings(strs);
	}
	
	private static void printSquareOf10Nums() {
		IntStream.range(1,10).map(num -> (int)Math.pow(num, num))
							 .forEach(num -> System.out.println(num));
	}
	
	private static void printLowerCaseOfStrings(List<String> strs) {	
		strs.stream().map(str -> str.toLowerCase())
					 .forEach(str -> System.out.println(str));
	}
	
	private static void printLengthOfStrings(List<String> strs) {
		strs.stream().map(str -> str.length())
					 .forEach(num -> System.out.println(num));
	}
}
