package de.demo.function;

public interface Calculate {
	
	int change(int i);
	
	default int change(long l) {
		return (int) l*3;
	}

}
