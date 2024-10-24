package com.in28minutes.ifstatement.examples;

public class CalendarSwitchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isWeekDay(1));
		
//		for(int i = 0; i <= 12; i++) {
//			System.out.println(determineNameOfMonth(i));
//		}
		
		for (int i = 0; i <= 7; i++) {
			System.out.println(determineNameOfDay(i));
		}
	}
	
	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				return true;
			default:
				return false;
		}
	}
	
	public static String determineNameOfMonth(int monthNumber) {
		switch(monthNumber) {
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				return "Invalid name of month";
		}
	}
	
	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
			case 0:
				return "Sunday";
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
			default:
				return "Invalid name of day";
			}
	}
}
