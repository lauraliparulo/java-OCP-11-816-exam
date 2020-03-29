package de.demo.trywith;

import java.io.IOException;

public class MyResource implements AutoCloseable {

	
	public void open() throws IOException {
		throw new IOException("open");
	}
	
	public void close() {
		throw new ArithmeticException("close");
	}
}
