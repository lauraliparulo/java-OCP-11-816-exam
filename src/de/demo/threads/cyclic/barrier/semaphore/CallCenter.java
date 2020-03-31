package de.demo.threads.cyclic.barrier.semaphore;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class CallCenter {
 
    public static void main(String[] args) {
         
        Semaphore operators = new Semaphore(3);
         
        CyclicBarrier standbyMessage = new CyclicBarrier(3, new StandBy());
     
        System.out.println("The call center is ready to answer phone calls");
         
        System.out.println("Available operators initially=" + operators.availablePermits() );
         
        new Customer(operators,standbyMessage,"Laura");
        new Customer(operators,standbyMessage,"Mario");
        new Customer(operators,standbyMessage,"Luigi");
        new Customer(operators,standbyMessage,"Paola");
        new Customer(operators,standbyMessage,"Alfonso");
        new Customer(operators,standbyMessage,"Anna");
        new Customer(operators,standbyMessage,"Giorgio");
        new Customer(operators,standbyMessage,"Francesca");
        new Customer(operators,standbyMessage,"Pietro");
        new Customer(operators,standbyMessage,"Antonio");
        new Customer(operators,standbyMessage,"Marco");
        new Customer(operators,standbyMessage,"Giovanna");
        new Customer(operators,standbyMessage,"Daniele");
        new Customer(operators,standbyMessage,"Giorgio");
    }
 
}