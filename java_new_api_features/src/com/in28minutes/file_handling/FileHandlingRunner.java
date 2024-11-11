package com.in28minutes.file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandlingRunner {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File readFile = new File("./resources/sample.txt");	
		Scanner scanner = new Scanner(readFile);
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		
		
		
//		Path path = Paths.get(new URI("./resources/sample.txt"));
		
		File writeFile = new File("./resources/write.txt");
		
		FileWriter fw = new FileWriter(writeFile);
		fw.write("Files in Javafdsf are seriously good!");
		fw.close();
		
	}
}
