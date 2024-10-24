package com.in28minutes.primitive.datatypes;

public class BiNumber {
	private int num1;
	private int num2;
	
	public BiNumber() {
		
	}
	
	public BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNumber1() {
		return this.num1;
	}
	
	public int getNumber2() {
		return this.num2;
	}
	
	public int add() {
		return this.num1 + this.num2;
	}
	
	public int multiply() {
		return this.num1 * this.num2;
	}
	
	public void doubleNumbers() {
		this.num1 *= 2;
		this.num2 *= 2;
	}
}
