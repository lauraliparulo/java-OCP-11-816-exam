package de.demo.threads.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		Runnable task = () -> {
			try {
				Thread.sleep(1000);
				System.out.println("Task is complete");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		service.submit(task);
		service.submit(task);
		Thread.sleep(500);
		service.isShutdown();
		
	}

}
