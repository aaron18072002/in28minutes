package com.in28minutes.oop.interfaces;

public class MarioGame implements GameConsole {

	@Override
	public void moveUp() {
		System.out.println("Jump");
	}

	@Override
	public void moveDown() {
		System.out.println("Into a hole");
	}

	@Override
	public void moveLeft() {
		System.out.println("Go backward");
	}

	@Override
	public void moveRight() {
		System.out.println("Go foward");
	}
	
}
