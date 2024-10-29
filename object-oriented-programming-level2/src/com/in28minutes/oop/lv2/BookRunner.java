package com.in28minutes.oop.lv2;

public class BookRunner {
	public static void main(String[] args) {
		Book book = new Book(123,"Oriented Object Programming With Java","Range");
		
		Review review1 = new Review(1, "Good", 4);
		Review review2 = new Review(2, "Exellent", 5);
		
		book.addReview(review1);
		book.addReview(review2);
		
		System.out.println(book.toString());
	}
}
