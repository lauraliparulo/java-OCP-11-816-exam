package de.demo.interfaces;

public class Test1 {

	public static void main(String[] args) {
		
		Foo2 foo = new Foo2() {
			public void m() {
				System.out.println("m1");				
			}
		};
		
		foo = new Foo2() {
			public void m() {
				System.out.println("m2");
			}
		};
		
		foo.m();
		
	}
	
}

interface Foo2 {
	void m();
}