package com.in28minutes.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	private final String name;
	
	public CallableTask(String name) {
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		
		return "Hello " + this.name;
	}	
}

public class CallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		System.out.println("Future started");
		Future<String> greetFuture =  
				executorService.submit(new CallableTask("in28minutes"));
		
		String greet = greetFuture.get();
		
		System.out.println(greet);
		
		executorService.shutdown();
		
		System.out.println("End of main thread");
	}
}
