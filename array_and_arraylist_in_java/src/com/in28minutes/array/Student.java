package com.in28minutes.array;

public class Student {
	private String name;
	private int[] marks;
	
	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getMarks() {
		return this.marks;
	}
	
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int i = 0; i <= this.marks.length - 1; i++) {
			sum += this.marks[i];
		}
		
		return sum;
	}
}
