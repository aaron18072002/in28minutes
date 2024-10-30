package com.in28minutes.oop.interfaces;

public class RealAlgorithm implements ComplexAlgorithm {

	@Override
	public int sumOfNumbers(int... nums) {
		int sum = 0;
		for(int i = 0; i <= nums.length - 1; i++) {
			sum += nums[i];
		}
		
		return sum;
	}
	
}
