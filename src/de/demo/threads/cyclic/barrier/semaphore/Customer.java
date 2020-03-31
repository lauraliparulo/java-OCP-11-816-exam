package de.demo.threads.cyclic.barrier.semaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Customer extends Thread {
 
    CyclicBarrier standByMessage;
    private Semaphore operators;
 
    public Customer(Semaphore operators, CyclicBarrier standByMessage,
            String name) {
        this.standByMessage = standByMessage;
        this.operators = operators;
        this.setName(name);
        this.start();
    }
 
    @Override
    public void run() {
 
        // simulate the time required for the phone call (between one and six seconds...
        long duration = ThreadLocalRandom.current().nextLong(1,10);
 
        try {
 
            System.out.println(getName()
                    + " is waiting to speak to the operator...");
 
            standByMessage.await();
            // if you put acquire first and then await the operators are not
            // free and all the customers are not called
 
            operators.acquire();
 
            System.out.println(getName()
                    + " is getting the connection to the operator ...");
                        //using TimeUnit enumeration to make the code more readable
            Thread.sleep(TimeUnit.SECONDS.toMillis(duration));
             
            System.out.println(getName()
                    + "´s phone call with the operator ending.");
            operators.release();
             
            System.out.println("Available operators="
                    + operators.availablePermits());
             
        } catch (InterruptedException | BrokenBarrierException e) {
            System.err.println(e);
        } 
 
    }
}