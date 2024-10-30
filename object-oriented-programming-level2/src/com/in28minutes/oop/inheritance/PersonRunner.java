package com.in28minutes.oop.inheritance;

import java.math.BigDecimal;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("1","Ranga","DTU");

		student1.setEmail("in28minutes@gmai.com");

//		System.out.println(student1.toString());

		Employee employee1 = new Employee("E1","EmployeeName1","Fresher JAVA");
		
		employee1.setEmail("employee1@gmail.com");
		
//		employee1.setTitle("Fresher JAVA");
		employee1.setEmployer("Nemo");
		employee1.setEmployeeGrade(9);
		employee1.setSalary(new BigDecimal("7000000.00"));
		
		System.out.println(employee1.toString());
	}

}
