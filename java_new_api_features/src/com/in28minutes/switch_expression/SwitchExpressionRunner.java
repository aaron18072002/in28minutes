package com.in28minutes.switch_expression;

public class SwitchExpressionRunner {
	public static String getDayOfWeek(int day) {
		String dayOfWeek = switch(day) {
			case 0 -> {
				yield "Sunday";
			}
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> 
				throw new IllegalArgumentException("Invalid day: " + day);			
		};
		
		return dayOfWeek;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
