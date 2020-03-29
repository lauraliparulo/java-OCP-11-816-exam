package de.demo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestWriteString {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("test.txt");
		
		Files.writeString(path,  "hello");
		Files.writeString(path,  "goodbye");
		
		System.out.println(Files.readString(path));
		
	}
}
