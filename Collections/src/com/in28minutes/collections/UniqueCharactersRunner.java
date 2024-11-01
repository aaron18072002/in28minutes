package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class UniqueCharactersRunner {

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
	}

}
