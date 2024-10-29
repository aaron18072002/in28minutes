package com.in28minutes.oop.lv2;

public class Rectangle {
	private float length;
	private float width;
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if(length > this.width) {			
			this.length = length;
		}
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if(width < this.length) {		
			this.width = width;
		}
	}

	public Rectangle(float length, float width) {
		if(length > 0 && width > 0 && length > width) {		
			this.length = length;
			this.width = width;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public float area() {
		return this.length * this.width;
	}
	
	public float perimeter() {
		return (this.length+this.width)*2;
	}
	
	public String toString() {
		return String.format("length - %f, width -%f",
				this.length, this.width);
	}
}
