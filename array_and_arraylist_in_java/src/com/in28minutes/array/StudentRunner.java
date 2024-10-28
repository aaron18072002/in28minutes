package com.in28minutes.array;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Aaron", new int[] {
				5,8,9
		});
		
		Student student2 = new Student("Nemo",3,2,5,9);
		
		System.out.println(student1.getNumberOfMarks());
		System.out.println(student1.getTotalSumOfMarks());
		
		System.out.println(student1.getMaximumMark());
		
		System.out.println(student1.getMinimumMark());
		
		System.out.println(student1.getAverageMark());
		
		System.out.println("-----------------");
		
		student2.addNewMark(10);
		student2.removeMarkAtIndex(1);
		
		System.out.println(student2.getNumberOfMarks());
		System.out.println(student2.getTotalSumOfMarks());
		
		System.out.println(student2.getMaximumMark());
		
		System.out.println(student2.getMinimumMark());
		
		System.out.println(student2.getAverageMark());
		
		System.out.println("-----------------");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
	}

}
