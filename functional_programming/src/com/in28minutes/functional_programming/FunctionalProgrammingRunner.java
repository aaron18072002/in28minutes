package com.in28minutes.functional_programming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Banana","Apple","Dolphin","Shark");
		
		printBasic(list);
		System.out.println("------------");
		printWithStream(list);
	}
	
	private static void printBasic(List<String> list) {
		for(int i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
	}
	
	private static void printWithStream(List<String> list) {
		list.stream().forEach(str -> System.out.println(str));
	}
}
