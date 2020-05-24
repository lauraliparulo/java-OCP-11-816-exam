package de.demo.function;

public interface Payback<T> {

	T apply(T origin, T rate);
	
}

