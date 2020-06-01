package de.demo.objects;

import java.util.Objects;

public class TestObjects {
	
	public static void main(String[] args) {
		
		System.out.println(generateMsg(null, null));
		
	}
	
	private static String generateMsg(final String msg, final String param) {
		
		final String message = Objects.requireNonNullElse(msg, "Null message");
		
		final String parameter = Objects.requireNonNullElseGet(param, () -> "No Param");
		
		return message + " : " + parameter;
		
	}

}
