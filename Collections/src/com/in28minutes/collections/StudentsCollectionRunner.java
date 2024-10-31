package com.in28minutes.collections;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsCollectionRunner {
	
	public static class DescendingStudentId implements Comparator<Student> {
		@Override
		public int compare(Student student1, Student student2) {
			// TODO Auto-generated method stub
			return Integer.compare(student2.getId(), student1.getId());
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(3, "Eve"));
		students.add(new Student(2, "Adam"));
		students.add(new Student(1, "Ranga"));
		
//		Collections.sort(students);
		students.sort(new DescendingStudentId());
		
		System.out.println(students.toString());
	}
}
