package com.in28minutes.concurrency;

public class Counter {
	private int i = 0;
	
	public synchronized void increase() {
		this.i++;
	}
	
	public int getI() {
		return this.i;
	}
}
