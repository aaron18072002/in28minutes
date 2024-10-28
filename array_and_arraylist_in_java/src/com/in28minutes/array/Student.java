package com.in28minutes.array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;
	private int[] marks;
	
//	public Student(String name, int[] marks) {
//		this.name = name;
//		this.marks = marks;
//	}
	
	public Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getMarks() {
		return this.marks;
	}
	
	public int getNumberOfMarks() {
		return this.marks.length;
	}
	
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int i = 0; i <= this.marks.length - 1; i++) {
			sum += this.marks[i];
		}
		
		return sum;
	}
	
	public int getMaximumMark() {
		int max = 0;
		for(int i = 0; i <= this.marks.length - 1; i++) {
			if(this.marks[i] >= max) {
				max = this.marks[i];
			}
		}
		
		return max;
	}
	
	public int getMinimumMark() {
		int min = this.marks[0];
		for(int i = 1; i <= this.marks.length - 1; i++) {
			if(min >= this.marks[i]) {
				min = this.marks[i];
			}
		}
		
		return min;
	}
	
	public BigDecimal getAverageMark() {
		int sum = this.getTotalSumOfMarks();
		int count = this.getNumberOfMarks();
		
		BigDecimal result = new BigDecimal(sum)
				.divide(new BigDecimal(count),3,RoundingMode.HALF_UP);
		
		return result;
	}
}
