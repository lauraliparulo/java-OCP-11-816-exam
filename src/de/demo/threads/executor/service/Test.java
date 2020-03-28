package de.demo.threads.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		
		service.submit(() -> {
			throw new RuntimeException();
		});
		
		service.submit(() -> {
			System.out.println("Task 1");
		});
		
		
		service.submit(() -> {
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("Task 2");
		});
		
		service.shutdown();

	}
}
