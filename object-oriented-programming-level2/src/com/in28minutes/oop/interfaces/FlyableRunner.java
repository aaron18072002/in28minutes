package com.in28minutes.oop.interfaces;

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyables = new Flyable[] {
			new Bird(),
			new Aeroplane()
		};
		
		for(int i = 0; i <= flyables.length - 1; i++) {
			flyables[i].fly();
		}
	}
}
