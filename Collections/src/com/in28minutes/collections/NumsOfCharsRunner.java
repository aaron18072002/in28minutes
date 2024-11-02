package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumsOfCharsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a great thing This is a great thing";
		
		Map<Character, Integer> numsOfChars = new HashMap<Character, Integer>();
		
		for(int i = 0; i <= str.length() - 1; i++) {
			if(numsOfChars.containsKey(str.charAt(i)) == false) {
				numsOfChars.put(str.charAt(i), 1);
			} else {
				int ocurrances = numsOfChars.get(str.charAt(i));
				numsOfChars.put(str.charAt(i), ++ocurrances);
			}
		}
		
		List<String> strsList = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= str.length() - 1; i++) {
			if(str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			} else {
				strsList.add(sb.toString());
				sb.setLength(0);
			}
		}
		
		Map<String,Integer> numsOfStrs = new HashMap<String,Integer>();
		for(int i = 0; i <= strsList.size() - 1; i++) {
			if(numsOfStrs.containsKey(strsList.get(i)) == false) {
				numsOfStrs.put(strsList.get(i), 1);
			} else {
				int occurances = numsOfStrs.get(strsList.get(i));
				numsOfStrs.put(strsList.get(i), ++occurances);
			}
		}
		
		System.out.println(strsList.toString());
		
		System.out.println(numsOfStrs.toString());
		
		System.out.println(numsOfChars.toString());
	}

}
