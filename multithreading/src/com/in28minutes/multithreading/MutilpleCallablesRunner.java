package com.in28minutes.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableStringTask implements Callable<String> {
	private final String name;
	
	public CallableStringTask(String name) {
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		
		return "Hello " + this.name;
	}
}

public class MutilpleCallablesRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableStringTask> tasks = new ArrayList<CallableStringTask>();	
		tasks.add(new CallableStringTask("in28minutes"));
		tasks.add(new CallableStringTask("Adam"));
		tasks.add(new CallableStringTask("Eva"));
		
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for (int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i).get());
		}
		
		executorService.shutdown();
		System.out.println("End of main thread");
	}
}
