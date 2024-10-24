package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunnerWithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number 1: ");
			int num1 = scanner.nextInt();
			
			System.out.print("Enter number 2:");
			int num2 = scanner.nextInt();
//			System.out.printf("Num1 is %d, Num2 is %d", num1, num2).println();
			
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - Multiply");
			System.out.println("4 - Divide");
			System.out.print("Choose operation: ");
			
			int operation = scanner.nextInt();
			
			int result = 0;;
			if(operation == 1) {
				result = num1 + num2;
			} else if(operation == 2) {
				result = num1 - num2;
			} else if(operation == 3) {
				result = num1 * num2;
			} else if(operation == 4) {
				result = num1 / num2;
			} else {
				System.out.printf("%d is invalid operation", operation).println();
			}
			
			System.out.printf("Result is - %d",result).println();
		} finally {
			scanner.close();
		}
	}

}
