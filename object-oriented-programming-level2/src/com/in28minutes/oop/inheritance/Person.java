package com.in28minutes.oop.inheritance;

public class Person {
	private String id;
	private String name;
	private String email;
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("id - %s,name - %s,email - %s", 
					this.id,this.name,this.email);
	}
}
