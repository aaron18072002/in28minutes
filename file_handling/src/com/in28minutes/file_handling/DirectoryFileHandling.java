package com.in28minutes.file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryFileHandling {
	public static void main(String[] args) throws IOException {
		Path rootPath = Paths.get(".");
		Files.list(rootPath)
			.forEach(path -> System.out.println(path));
		
		System.out.println("--------------");
		
		Predicate<Path> predicate = path -> 
				path.toString().endsWith(".java");
		Files.walk(rootPath, 5).filter(predicate)
				.forEach(path -> System.out.println(path.toString()));
	}
}
