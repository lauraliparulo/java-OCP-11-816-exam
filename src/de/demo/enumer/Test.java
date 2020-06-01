package de.demo.enumer;

public class Test {

	public static void main(String[] args) {
		Data data = Data.INTERNAL;
		System.out.println(data.number);
		
		Data data2  = Data.EXTERNAL;
		System.out.println(data2.number);
		
		data2.set();
	}
	
}
