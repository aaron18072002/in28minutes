package com.in28minutes.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	public synchronized void increaseI() {
		this.i++;
	}
	
	public int getI() {
		return this.i;
	}
	
	public synchronized void increaseJ() {
		this.j++;
	}
	
	public int getJ() {
		return this.j;
	}
}
