package com.in28minutes.array;

public class StringDaysOfWeek {
	private String[] days = new String[] {
			"Monday","Tuesday","Wednesday",
			"Thursday","Friday","Saturday","Sunday"
	};
	
	public StringDaysOfWeek() {
		
	}
	
	public String getDayWithMostCharacters() {
		String mostOfCharactersDay = this.days[0];
		for(int i = 1; i <= this.days.length - 1; i++) {
			if(this.days[i].length() >= mostOfCharactersDay.length()) {
				mostOfCharactersDay = this.days[i];
			}
		}
		
		return mostOfCharactersDay;
	}
	
	public String[] getDaysOfWeekBackward() {
		String[] days = new String[5];
		int index = 0;
		for(int i = 0; i <= this.days.length - 1; i++) {
			if(isDayOfWeek(this.days[i])) {
				days[index] = this.days[i];
				index++;
			}
		}
		
		return days;
	}
	
	public static boolean isDayOfWeek(String day) {
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
				day.equals("Thursday") || day.equals("Friday")) 
		{
			return true;
		}
		return false;
	}
}
