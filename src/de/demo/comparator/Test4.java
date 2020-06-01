package de.demo.comparator;

import java.util.Comparator;

public class Test4 {

	
	final Comparator<String> byLength = new Comparator<>() {

		@Override
		public int compare(String arg0, String arg1) {
			// TODO Auto-generated method stub
			return 0;
		}};
		
	public static void main(String[] args) {
		
		Comparator<String> byLength = Comparator.comparing(String::length);
		
	}
}
