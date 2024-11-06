package com.in28minutes.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableStringTask> tasks = new ArrayList<CallableStringTask>();	
		tasks.add(new CallableStringTask("in28minutes"));
		tasks.add(new CallableStringTask("Adam"));
		tasks.add(new CallableStringTask("Eva"));
		
		String result = executorService.invokeAny(tasks);	
		System.out.println(result);
		
		executorService.shutdown();
		
		System.out.println("End of main thread");
	}
}
