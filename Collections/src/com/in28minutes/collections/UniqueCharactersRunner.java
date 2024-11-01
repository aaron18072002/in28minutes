package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UniqueCharactersRunner {
	private static class CharacterComparator implements Comparator<Character> {
		@Override
		public int compare(Character char1, Character char2) {
			// TODO Auto-generated method stub
			return char1.compareTo(char2);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> chars = 
				List.of('A','Z','A','B','Z','F');
		
		List<Character> uniqueChars = new ArrayList<Character>();
		for(int i = 0; i <= chars.size() - 1; i++) {
			if(uniqueChars.contains(chars.get(i)) == false) {
				uniqueChars.add(chars.get(i));
			}
		}
		
		System.out.println(uniqueChars.toString());
		
		uniqueChars.sort(new CharacterComparator());
		
		System.out.println(uniqueChars.toString());		
	}
}
