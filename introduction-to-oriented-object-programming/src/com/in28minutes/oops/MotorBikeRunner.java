package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(20);
		
		ducati.start();
		honda.start();
		
//		ducati.setSpeed(100);
//		honda.setSpeed(20);
		
		ducati.increaseSpeed(50);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(1000);
		
		System.out.printf("ducati speed is %d", ducati.getSpeed()).println();
		System.out.printf("honda speed is %d", honda.getSpeed()).println();
	}

}
