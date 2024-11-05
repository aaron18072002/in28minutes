package com.in28minutes.multithreading;

public class BasicThreadRunner {
	public static class Task1 extends Thread {
		public void run() {
			System.out.println("Task1 started");
			for (int i = 100; i <= 199; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\nTask1 done:");
		}
	}
	
	public static class Task2 implements Runnable {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Task2 started");
			for (int i = 200; i <= 299; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\nTask2 done:");
		}		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Task1
		System.out.println("Task1 kick off");
		Thread task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		
		//Task2
		System.out.println("Task2 kick off");
		Thread threadOfTask2 = new Thread(new Task2());
		threadOfTask2.setPriority(10);
		threadOfTask2.start();
		
		//Waits for task1 and task2 threads to die
		task1.join();
		threadOfTask2.join();
		
		//Task3
		System.out.println("Task3 kick off");
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\nTask3 done");
		System.out.println("Main done");
	}
}
