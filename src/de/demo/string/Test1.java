package de.demo.string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Test1 {
	public static void main(String[] args) throws IOException {
		var destinationPath = Path.of("example.txt");

		Files.writeString(destinationPath, "1: this is a strng to file test");
		Files.writeString(destinationPath, "2: second line");

		final String line1 = Files.readString(destinationPath);
		final String line2 = Files.readString(destinationPath);

		System.out.println(line1);
		System.out.println(line2);

		Files.writeString(destinationPath, "1: this is a strng to file test \n");
		Files.writeString(destinationPath, "2: second line", StandardOpenOption.APPEND);

		final String line3 = Files.readString(destinationPath);
		final String line4 = Files.readString(destinationPath);

		System.out.println(line3);
		System.out.println(line4);
		
		
		line3.lines().forEach(System.out::println);

	}
}
