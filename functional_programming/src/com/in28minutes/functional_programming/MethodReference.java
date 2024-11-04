package com.in28minutes.functional_programming;

import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
			.map(str -> str.length())
			.forEach(System.out::println);
	}

}
