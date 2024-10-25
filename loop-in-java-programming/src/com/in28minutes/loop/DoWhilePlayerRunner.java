package com.in28minutes.loop;

import java.util.Scanner;

public class DoWhilePlayerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			int num = 0;
			do {
				System.out.print("Enter a number: ");
				num = scanner.nextInt();
				if(num > 0) {				
					System.out.printf("Cube is %d", num*num*num).println();
				}
			} while(num > 0);
			System.out.println("Thank You! Have Fun");
		} finally {
			scanner.close();
		}
	}

}
