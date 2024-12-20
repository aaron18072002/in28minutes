package com.in28minutes.oop.lv2;

public class Review {
	private int id;
	private String description;
	private int rating;
	
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return String.format(" id - %d,description - %s,rating - %d.",
				this.id, this.description, this.rating);
	}
}
