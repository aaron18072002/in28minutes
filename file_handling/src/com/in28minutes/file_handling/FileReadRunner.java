package com.in28minutes.file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
	public static void main(String[] args) throws IOException {
		Path pathToRead = Paths.get("./resources/text.txt");
		List<String> lines = Files.readAllLines(pathToRead);
		
		for(int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i).toString());
		}
		
		System.out.println("---------------------------------");
		
		Files.lines(pathToRead)
			 .map(str -> str.toUpperCase())
			 .forEach(str -> System.out.println(str.toString()));
	}
}
