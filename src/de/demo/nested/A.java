package de.demo.nested;

public class A {

	private void mA(String s) {
		System.out.println(s);
	}

	class B {
		/* This is an inner class */
		void mB() {
			mA("helloB");
		}
	}
}
