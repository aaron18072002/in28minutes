package com.in28minutes.loop;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNumber = new MyNumber(6);
		
		System.out.println(myNumber.isPrime());
		
		System.out.println(myNumber.sumOfN());
		
		System.out.println(myNumber.sumOfDivisors());
		
		myNumber.printANumberTriangle();
	}

}
