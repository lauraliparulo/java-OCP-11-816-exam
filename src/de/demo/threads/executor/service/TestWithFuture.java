package de.demo.threads.executor.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestWithFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	ExecutorService service = Executors.newFixedThreadPool(1);
	
	Runnable task = () -> {
		
		try {
			System.out.println("hello");
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
	};
	
	Future<String> future = service.submit(task,"Goodbye");
	
	System.out.println(future.get());
		
	service.shutdownNow();
	
	}
	
}
