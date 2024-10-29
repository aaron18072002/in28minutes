package com.in28minutes.oop.lv2;

import java.util.ArrayList;

public class Book {
	private int id;
	private String description;
	private String author;
	
	private ArrayList<Review> reviews = new ArrayList<Review>();
	
	public Book(int id, String description, String author) {
		this.id = id;
		this.description = description;
		this.author = author;
	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		StringBuilder reviewsStr = new StringBuilder();
		if(this.reviews.size() > 0) {
			for(int i = 0; i <= this.reviews.size() - 1; i++) {
				reviewsStr.append(this.reviews.get(i).toString());
			}
		}
		return String.format("id - %d, description - %s, author - %s, reviews - [%s]", 
				this.id, this.description, this.author, reviewsStr);
	}
}
