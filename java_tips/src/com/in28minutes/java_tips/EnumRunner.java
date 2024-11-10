package com.in28minutes.java_tips;

import java.util.Arrays;

enum Season {
	WINTER(4),SPRING(1),SUMMER(2),AUTUMN(3);
	
	private final int value;
	
	private Season(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class EnumRunner {
	public static void main(String[] args) {
		Season autumn = Season.AUTUMN;
		
		System.out.println(autumn);
		
		System.out.println(Season.WINTER.ordinal());
		System.out.println(Season.WINTER.getValue());
		
		System.out.println(Arrays.toString(Season.values()));
	}
}
