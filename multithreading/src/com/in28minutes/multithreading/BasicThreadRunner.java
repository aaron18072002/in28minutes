package com.in28minutes.multithreading;

public class BasicThreadRunner {
	public static class Task1 extends Thread {
		public void run() {
			System.out.println("Task1 started\n");
			for (int i = 100; i <= 199; i++) {
				System.out.print(i + "\t");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Task1
		System.out.println("Task1 kick off");
		Thread task1 = new Task1();
		task1.start();
		System.out.println("Task1 done: \n");
		
		//Task2
		System.out.println("Task2 kick off");
		for (int i = 200; i <= 299; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("Task2 done: \n");
		
		//Task3
		System.out.println("Task3 kick off");
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("Task3 done");
		System.out.println("Main done");
	}
}
