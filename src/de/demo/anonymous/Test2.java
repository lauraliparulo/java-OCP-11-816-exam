package de.demo.anonymous;

public class Test2 {

	int i = 0;
	
	void m() {
		
	//	final int i = 2;
		 int i = 2;  //effectivily final
		Foo2 foo = new Foo2() {
			
			void m() {
				System.out.println(i);;
			//	i++;   // wont compile
			}
		};
		
		System.out.println(i);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Test2().m();
	}
}

abstract class Foo2 {
	abstract void m();
}