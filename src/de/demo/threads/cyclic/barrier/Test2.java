package de.demo.threads.cyclic.barrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Test2 {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(3);

		Runnable task1 = () -> {
			try {
//				barrier.await();
				System.out.println("Task 1");
			} catch (Exception e) {
				e.printStackTrace();
			}

		};

		Runnable task2 = () -> {
			try {
				barrier.await(1, TimeUnit.SECONDS);
				System.out.println("Task 2");
			} catch (Exception e) {
				e.printStackTrace();
			}

		};

		new Thread(task1).start();
		new Thread(task2).start();

		System.out.println("Main");

	}

}
