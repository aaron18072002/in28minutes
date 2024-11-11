package com.in28minutes.java_tips;

import java.util.ArrayList;
import java.util.List;

public class CopyOfRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		
		names.add("Adam");
		names.add("Eva");
		names.add("Ranga");
		
		List<String> copyOfNames = List.copyOf(names);
		
		System.out.println(copyOfNames.toString());
		
		copyOfNames.add("Invalid");
	}
}
