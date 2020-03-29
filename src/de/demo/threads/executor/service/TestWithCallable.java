package de.demo.threads.executor.service;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWithCallable {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Callable<String> task1 = ()-> "Task completed";
		
		Callable<String> task2 = ()-> {
			throw new RuntimeException();
		};
		
		Callable<String> task3 = () -> {
			Thread.sleep(10_000);
			return null;
		};

		var result = service.invokeAll(List.of(task1,task2,task3));
		System.out.println(result.get(0).get());
		service.shutdown();
	}
}
