package com.in28minutes.math;

public class MyMath {
	public int calculatorSum(int... nums) {
		int result = 0;
		for(int i = 0; i <= nums.length - 1; i++) {
			result += nums[i];
		}
		
		return result;
	}
}
