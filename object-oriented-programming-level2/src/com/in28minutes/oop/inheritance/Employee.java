package com.in28minutes.oop.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employer;
	private int employeeGrade;
	private BigDecimal salary;
	
	public Employee() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("%s,title - %s, employer - %s,employeeGrade - %d,salary - %s", 
				super.toString(),this.title,this.employer,this.employeeGrade,this.salary.toString());
	}
}
