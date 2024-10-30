package com.in28minutes.oop.inheritance;

public class Student extends Person {
	private String college;
	private int year;
	
	public Student(String id, String name, String college) {
		super(id,name);
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
