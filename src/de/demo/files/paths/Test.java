package de.demo.files.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {

	public static void main(String[] args) throws IOException {

		String homedir = System.getProperty("user.home");
		System.out.println(homedir);
		Path docker = Path.of(homedir).getFileSystem().getPath(homedir+"/docker", "Dockerfile");
		BufferedReader reader = Files.newBufferedReader(docker, StandardCharsets.UTF_8);

	}
}
