package com.in28minutes.oop.lv2;

public class Fan {
	private String make;
	private double radius;
	private String color;

	private boolean isOn = false;
	private byte speed = 0; // 0-5

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format
				("make - %s, radius - %f, color - %s, isOn - %b, speed - %d"
						, this.make, this.radius, this.color, this.isOn, this.speed);
	}
}
