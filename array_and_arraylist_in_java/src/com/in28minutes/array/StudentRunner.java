package com.in28minutes.array;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Aaron", new int[] {
				5,8,9
		});
		
		System.out.println(student1.getNumberOfMarks());
		System.out.println(student1.getTotalSumOfMarks());
		
		System.out.println(student1.getMaximumMark());
		
		System.out.println(student1.getMinimumMark());
		
		System.out.println(student1.getAverageMark());
	}

}
