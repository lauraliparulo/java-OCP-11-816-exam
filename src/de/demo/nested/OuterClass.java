package de.demo.nested;

public class OuterClass {

	int x = 3;
	
	static class StaticNestedClass {
		int x = 4;
		void m() {
			System.out.println("static inner");
		}
	}
	
	class InnerClass {
		int x = 5;
		void m() {
			System.out.println("inner");
		}
	}
	
	
	public static void main(String[] args) {
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		
		OuterClass.InnerClass innerClassObject = new OuterClass().new InnerClass();

		nestedObject.m();
		innerClassObject.m();

		System.out.println(nestedObject.x);
		
		System.out.println(innerClassObject.x);
		
		
	}
}
