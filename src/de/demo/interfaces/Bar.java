package de.demo.interfaces;

interface Bar extends Foo{
	
	default void m() {
		Foo.super.m();
	}

}
