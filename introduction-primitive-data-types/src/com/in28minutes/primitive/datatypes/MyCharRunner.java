package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar myChar = new MyChar('m');
		
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
//		System.out.println(myChar.isDigit());
//		
//		System.out.println(myChar.isAlphabet());
		
		myChar.printLowerCaseAlphabets();
		System.out.println();
		myChar.printUpperCaseAlphabets();
	}

}
