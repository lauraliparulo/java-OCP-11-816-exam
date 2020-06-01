package de.demo.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

	public static void main(String[] args) {
		new CompletableFutureExample().perform();
	}

	private void perform() {

		// supplyAsync - one single action in parallel to the caller
		final CompletableFuture<String> supplyAsync = 
				CompletableFuture.supplyAsync(() -> longRunningCreateMsg(5));
		
		//thenAccept - something to execute after completion
		supplyAsync.thenAccept(this::notifySubscribers);
		
		//exception mapping
		CompletableFuture.supplyAsync(this::failingMsg).exceptionally(ex -> "FAILED")
		.thenAccept(this::notifySubscribers);
		
		System.out.println(getCurrentThread() + " perform()");
		
	}

	private String longRunningCreateMsg(int durationInSeconds) {
		System.out.println(getCurrentThread() + " >>> longRunningCreateMsg");
		
		sleepInSeconds(durationInSeconds);
		
		System.out.println(getCurrentThread() + " <<< longRunningCreateMsg");
		return "longRunningCreateMsg";
	}

	private String getCurrentThread() {
		return Thread.currentThread().getName();
	}

	private void notifySubscribers(final String msg) {
		System.out.println(getCurrentThread() + " notifySubscriber: "+msg);
	}
	
	public String failingMsg() {
		throw new IllegalStateException("ISE");
	}
	
	public void sleepInSeconds(final int durationInSeconds) {
		try {
			TimeUnit.SECONDS.sleep(durationInSeconds);
		} catch(InterruptedException e) {
			
		}
	}
}
