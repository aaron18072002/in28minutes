package com.in28minutes.oop.lv2;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle(float length, float width) {
		if(length > 0 && width > 0 && length > width) {		
			this.length = length;
			this.width = width;
		}
	}
	
	public float area() {
		return this.length * this.width;
	}
	
	public float perimeter() {
		return (this.length+this.width)*2;
	}
}
