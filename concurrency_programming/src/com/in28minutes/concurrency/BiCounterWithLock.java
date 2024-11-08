package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	
	private Lock lockForI = new ReentrantLock();
	private Lock lockForJ = new ReentrantLock();
	
	public void increaseI() {
		this.lockForI.lock();
		this.i++;
		this.lockForI.unlock();
	}
	
	public int getI() {
		return this.i;
	}
	
	public void increaseJ() {
		this.lockForJ.lock();
		this.j++;
		this.lockForJ.unlock();
	}
	
	public int getJ() {		
		return this.j;
	}
}
