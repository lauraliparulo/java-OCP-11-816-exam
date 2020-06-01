package de.demo.files.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test1 {

	
	public static void main(String[] args) throws IOException {
		Path p1 = Path.of("f1.txt");
		Path p2 = Path.of("f2.txt");
		Path p3 = Path.of("f3.txt");
		Files.writeString(p1, "Hello");
		Files.writeString(p2, "Goodbye");
		
		Files.copy(p1, p3);
	}
}
