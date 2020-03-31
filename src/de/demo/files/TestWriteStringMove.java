package de.demo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestWriteStringMove {

	public static void main(String[] args) throws IOException {
		
		Path path1 = Path.of("test1.txt");
		Path path2 = Path.of("test2.txt");
		
		Files.writeString(path1,  "hello");
		Files.writeString(path2,  "goodbye");
		
		Files.move(path1, path2);
		//Throws java.nio.file.FileAlreadyExistsException: test2.txt
		
	}
}
