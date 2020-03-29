package de.demo.anonymous;

public class Test {

	public static void main(String[] args) {
		Foo foo = new Foo() {
			
			static final String s = "hi";
			
//			static final void m() {
//				
//			}
			
			{System.out.println("bye");}
			
			class Bar{}
		};
	}
}
