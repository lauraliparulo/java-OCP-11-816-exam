package de.demo.interfaces;

interface Foo {

	default void m() {
		System.out.println("Foo");
	}
}
