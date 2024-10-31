package com.in28minutes.collections;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("id - %d,name - %s", this.id, this.name);
	}

	@Override
	public int compareTo(Student student) {
		return Integer.compare(this.id, student.id);
	}
}
