package de.demo.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		//FIFO
		
		deque.add(12);
		deque.add(23);
		deque.add(53);
		deque.add(28);
		
		System.out.println(deque.peekLast());
		System.err.println(deque.poll());
		System.out.println(deque.peekFirst());
		System.err.println(deque.poll());
	//	System.err.println(deque.poll());
		deque.addLast(75);
		System.out.println(deque.peek());
		System.out.println("SIZE: "+deque.size());
	}
}
