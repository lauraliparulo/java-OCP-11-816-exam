package de.demo.nested;

public class C {

	private static void mC(String s) {
		System.out.println(s);
	}

	static class D {
		/* This is an inner class */
		void mD() {
			mC("helloC");
		}
	}
}
