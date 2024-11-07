package com.in28minutes.file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryFileHandling {
	public static void main(String[] args) throws IOException {
		Path rootPath = Paths.get(".");
		Files.list(rootPath)
			.forEach(file -> System.out.println(file.getFileName()));
	}
}
