package de.demo.tests;

public class Test2 {

	Bar modify(Foo foo) {
		int i = foo.change(2);
		return (x, y) -> x.change(y) + 1;
	}

	public static void main(String[] args) {
		Test2 test = new Test2();
		Bar bar = test.modify(i -> i * 2);
		int result = bar.change(i -> i * 3, 4);
		System.out.println(result);
	}

}

interface Foo {
	int change(int i);
}

interface Bar {
	int change(Foo foo, int i);
}