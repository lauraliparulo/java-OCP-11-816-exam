package de.demo.interfaces;

public class Test {

	public static void main(String[] args) {
		B b= new C();
		b.m();
	}
}

interface A {
	int i = 0;
	default void m() {
		System.out.println(i);
	}
}

interface B extends A {
	int i = 2;
}

class C implements B {
	
	//int i = 4;
	
	public void m() {
		System.out.println(i+1);
	}
}