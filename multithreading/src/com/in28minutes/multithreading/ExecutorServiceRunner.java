package com.in28minutes.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = 
				Executors.newSingleThreadExecutor();
		
		executorService.execute(new BasicThreadRunner.Task1());
		executorService.execute(new Thread(new BasicThreadRunner.Task2()));
		
		executorService.shutdown();
	}
}
