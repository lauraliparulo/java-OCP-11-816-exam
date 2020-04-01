package de.demo.formats;

import java.text.DecimalFormat;

public class TestDecimal {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##");
		
		double number = -12.345;
		
		String output = df.format(number);
		
		System.out.println(output);
		

	}

}
