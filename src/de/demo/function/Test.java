package de.demo.function;

public class Test {
	
	public static void main(String[] args) {
		Calculate calculate = l -> l*2;
		System.out.println(calculate.change(1));
	}

}
