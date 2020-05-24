package de.demo.threads.executor.service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {

	static void runTask() {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Callable task = () -> {
			throw new Exception("exception thrown");
		};
		
		
		service.submit(task);
		service.shutdown();
	
	}
	
	public static void main(String[] args) {
		
		try {
			runTask();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//prints nothing. the main thread is indipendent
	}
	
	
}
