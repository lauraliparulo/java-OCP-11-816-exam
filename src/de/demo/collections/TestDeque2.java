package de.demo.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque2 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		
		deque.add("a");
		deque.push("b");
		deque.offer("c");
		
		System.out.println(deque);
	}
}
