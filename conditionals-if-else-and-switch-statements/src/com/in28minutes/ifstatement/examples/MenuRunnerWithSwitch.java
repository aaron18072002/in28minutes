package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunnerWithSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter number 1: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter number 2: ");
			int num2 = scanner.nextInt();
			
			System.out.print("Choose your choice: ");
			int choice = scanner.nextInt();
			
			performMenuOperation(num1, num2, choice);
		} finally {
			scanner.close();
		}
	}
	public static void performMenuOperation(int num1, int num2, int choice) {
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		
		switch (choice) {
		case 1:
			System.out.printf("Result is: %d", num1 + num2).println();
			break;
		case 2:
			System.out.printf("Result is: %d", num1 - num2).println();
			break;
		case 3:
			System.out.printf("Result is: %d", num1 * num2).println();
			break;
		case 4:
			System.out.printf("Result is: %d", num1 / num2).println();
			break;
		default:
			System.out.printf("%d is invalid option", choice).println();
			break;
		}
	}
}
