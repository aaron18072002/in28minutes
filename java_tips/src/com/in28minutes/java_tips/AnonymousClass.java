package com.in28minutes.java_tips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {
	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return Integer.compare(str1.length(), str2.length());
	}	
}

public class AnonymousClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>
				(List.of("Ant","Cat","Ball","Elephant"));
		
		Comparator<String> anonymousLengthCompator = 
				new Comparator<String>() {		
					@Override
					public int compare(String str1, String str2) {
						return Integer.compare(str1.length(), str2.length());
					}
				};
		
		Collections.sort(animals, anonymousLengthCompator);
		
		Collections.sort(animals, new LengthComparator());
		
		Collections.sort(animals, (str1,str2) -> {
			return Integer.compare(str1.length(), str2.length());
		});
		
		System.out.println(animals);
	}
}
