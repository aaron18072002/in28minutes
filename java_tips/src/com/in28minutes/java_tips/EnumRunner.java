package com.in28minutes.java_tips;

import java.util.Arrays;

enum Season {
	WINTER,SPRING,SUMMER,AUTUMN
}

public class EnumRunner {
	public static void main(String[] args) {
		Season autumn = Season.AUTUMN;
		
		System.out.println(autumn);
		
		System.out.println(Season.WINTER.ordinal());
		
		System.out.println(Arrays.toString(Season.values()));
	}
}
