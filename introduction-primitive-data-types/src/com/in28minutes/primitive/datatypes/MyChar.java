package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (this.ch == 'u' || this.ch == 'e' || this.ch == 'o' || this.ch == 'a' || this.ch == 'i') {
			return true;
		}
		if (this.ch == 'U' || this.ch == 'E' || this.ch == 'O' || this.ch == 'A' || this.ch == 'I') {
			return true;
		}
		return false;
	}
	
	public boolean isConsonant() {
		if(!this.isVowel() && this.isAlphabet()) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (this.ch >= 48 && this.ch <= 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (this.ch >= 65 && this.ch <= 90) {
			return true;
		}
		if (this.ch >= 97 && this.ch <= 122) {
			return true;
		}
		return false;
	}
	
	public void printLowerCaseAlphabets() {
		char ch;
		for(int i = 97; i <= 122; i++) {
			ch = (char)i;
			System.out.print(ch + "\t");
		}
	}
	
	public void printUpperCaseAlphabets() {
		char ch;
		for(int i = 65; i <= 90; i++) {
			ch = (char)i;
			System.out.print(ch + "\t");
		}
	}
}
