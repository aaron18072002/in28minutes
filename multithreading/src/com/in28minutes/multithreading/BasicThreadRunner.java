package com.in28minutes.multithreading;

public class BasicThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 199; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("Task1 done: \n");
		for (int i = 200; i <= 299; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("Task2 done: \n");
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("Task3 done");
		System.out.println("Main done");
	}

}
