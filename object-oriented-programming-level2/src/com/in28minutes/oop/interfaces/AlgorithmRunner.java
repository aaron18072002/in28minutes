package com.in28minutes.oop.interfaces;

public class AlgorithmRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexAlgorithm algorithm = new RealAlgorithm();
		
		System.out.println(algorithm.sumOfNumbers(1,2,3,5));
	}

}
