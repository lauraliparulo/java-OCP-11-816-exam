package de.demo.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Locale locale = new Locale("fr", "FR");
		
	//	Locale locale = Locale.setDefault(Locale.US);
		ResourceBundle bundle = ResourceBundle.getBundle("NationalDay");
		
		int year = (int) bundle.getObject("year");
		
		System.out.println(year);
	}
}
