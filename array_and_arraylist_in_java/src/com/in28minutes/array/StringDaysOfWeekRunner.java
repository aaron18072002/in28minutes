package com.in28minutes.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringDaysOfWeekRunner {
	public static void main(String[] args) {
		StringDaysOfWeek days = new StringDaysOfWeek();
		
		System.out.println(days.getDayWithMostCharacters());
		
		System.out.println(Arrays.toString(days.getDaysOfWeekBackward()));
	}
}
