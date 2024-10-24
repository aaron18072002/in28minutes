package com.in28minutes.oops;

public class MotorBike {
	private int speed;
	
	public MotorBike() {
		
	}
	
	public MotorBike(int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("Start");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;			
		}
	}
	
	public void increaseSpeed(int howMuch) {
		this.setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		this.setSpeed(this.speed - howMuch);
	}
}
