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
	
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;

	}
	
	public void switchOff() {
		this.setIsOn(false);
		this.setSpeed((byte)0);
	}
	
	public void switchOn(byte speed) {
		if(speed >= 0 && speed <= 5) {		
			this.setIsOn(true);
			this.setSpeed(speed);
		}
	}
	
	@Override
	public String toString() {
		return String.format
				("make - %s, radius - %f, color - %s, isOn - %b, speed - %d"
						, this.make, this.radius, this.color, this.isOn, this.speed);
	}
}
