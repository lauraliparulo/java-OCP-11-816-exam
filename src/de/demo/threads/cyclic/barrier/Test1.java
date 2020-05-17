package de.demo.threads.cyclic.barrier;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		Runnable barrierAction = () -> System.out.println("Barrier");
		
		CyclicBarrier barrier = new CyclicBarrier(1,barrierAction);
		
		Callable task = () -> {
			
			try {
				barrier.await(1,TimeUnit.SECONDS);
				return 0;
			} catch (Exception e) {
				throw new RuntimeException();
			}
			
		};
		
		List tasks = List.of(task,task,task,task);
		ExecutorService service = Executors.newFixedThreadPool(4);
		service.invokeAll(tasks);
		service.shutdown();
		System.out.println("Main");
	}
}
