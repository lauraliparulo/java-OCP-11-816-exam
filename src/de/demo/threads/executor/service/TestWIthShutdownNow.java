package de.demo.threads.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWIthShutdownNow {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		service.submit(() -> {
			System.out.println("Task 1");
		});
		
		service.submit(() -> {
			try{
				Thread.sleep(1000);
				System.out.println("Task 2");	//this is no longer executed:
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		
		});
		
		service.shutdownNow();
		
//		service.isShutdown()
//		service.isTerminated()
	}
}
