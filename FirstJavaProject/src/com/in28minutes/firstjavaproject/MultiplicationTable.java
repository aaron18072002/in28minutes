package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	public void printTable(int table, int from, int to) {
		for(int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i).println();
		}
	}
	
	public void printf() {
//		printTable(5, 1, 10);
		printf(5 ,1, 10);
	}
	
	public void printf(int table) {
//		printTable(table, 1, 10);
		printf(table, 1, 10);
	}
	
	public void printf(int table, int from, int to) {
//		printTable(table, from, to);
		for(int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i).println();
		}
	}
}
