package com.in28minutes.loop;

public class MyNumber {
	private int number;
	
	public MyNumber(int number) {
		if(number > 0) {			
			this.number = number;
		} else {
			this.number = 1;
		}
	}
	
	public boolean isPrime() {
		if(this.number >= 2) {
//			int count = 0;
//			for(int i = 1; i <= this.number/2; i++) {
//				if(count > 1) {
//					break;
//				}
//				if(number%i == 0) {
//					count++;
//				}
//			}
//			if(count > 1) {
//				return false;
//			}
//			return true;
			if(this.number == 2) {
				return true;
			}
			for(int i = 2; i < this.number; i++) {
				if(this.number%i == 0) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}
	
	public int sumOfN() {
		int sum = 0;
		for(int i = 1; i <= this.number; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public int sumOfDivisors() {
		if(this.number == 2 || this.number == 3) {
			return 0;
		}
		
		int sum = 0;
		for(int i = 2; i < this.number; i++) {
			if(this.number%i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public void printANumberTriangle() {
		for(int i = 1; i <= this.number; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
