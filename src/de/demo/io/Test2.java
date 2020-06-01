package de.demo.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		
		final byte[] buffer = {72,65,76,76,79};
		
		final byte[] result = new ByteArrayInputStream(buffer).readAllBytes();
		
		System.out.println(Arrays.toString(result));
		
		new ByteArrayInputStream(buffer).transferTo(System.out);
		
	}
	
}
