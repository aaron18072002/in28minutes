package com.in28minutes.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
//	public Student(String name, int[] marks) {
//		this.name = name;
//		this.marks = marks;
//	}
	
	public Student(String name, int... marks) {
		this.name = name;
		for(int i = 0; i <= marks.length - 1; i++) {
			this.marks.add(marks[i]);
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Integer> getMarks() {
		return this.marks;
	}
	
	public int getNumberOfMarks() {
		return this.marks.size();
	}
	
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int i = 0; i <= this.marks.size() - 1; i++) {
			sum += this.marks.get(i);
		}
		
		return sum;
	}
	
	public int getMaximumMark() {
		int max = 0;
		for(int i = 0; i <= this.marks.size() - 1; i++) {
			if(this.marks.get(i) >= max) {
				max = this.marks.get(i);
			}
		}
		
		return max;
	}
	
	public int getMinimumMark() {
		int min = this.marks.get(0);
		for(int i = 1; i <= this.marks.size() - 1; i++) {
			if(min >= this.marks.get(i)) {
				min = this.marks.get(i);
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
	
	@Override
	public String toString() {
		return this.name + " " + this.marks;
	}
}
