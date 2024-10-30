package com.in28minutes.oop.inheritance;

import java.math.BigDecimal;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();

		student1.setId("1");
		student1.setEmail("in28minutes@gmai.com");
		student1.setName("Ranga");

//		System.out.println(student1.toString());

		Employee employee1 = new Employee();
		
		employee1.setId("E1");
		employee1.setEmail("employee1@gmail.com");
		employee1.setName("EmployeeName1");
		
		employee1.setTitle("Fresher JAVA");
		employee1.setEmployer("Nemo");
		employee1.setEmployeeGrade(9);
		employee1.setSalary(new BigDecimal("7000000.00"));
		
		System.out.println(employee1.toString());
	}

}
