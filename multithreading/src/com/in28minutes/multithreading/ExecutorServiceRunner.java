package com.in28minutes.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private final int number;
	
	public Task(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("\nTask %d started", this.number).println();
		for(int i = this.number*100; i <= this.number*100 + 99; i++) {
			System.out.print(i + "\t");
		}
		System.out.printf("\nTask %d done", this.number).println();
	}
}

public class ExecutorServiceRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = 
				Executors.newFixedThreadPool(5);
		
		executorService.execute(new Thread(new Task(1)));
		executorService.execute(new Thread(new Task(2)));
		executorService.execute(new Thread(new Task(3)));
		executorService.execute(new Thread(new Task(4)));
		executorService.execute(new Thread(new Task(5)));
		
		executorService.shutdown();
	}
}
