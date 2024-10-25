package com.in28minutes.loop;

public class WhileNumberPlayer {
	private int limit;
	
	public WhileNumberPlayer(int limit) {
		if(limit <= 0) {
			this.limit = 1;
		}
		this.limit = limit;
	}
	
	public int getLimit() {
		return this.limit;
	}
	
	public void printSquaresUpToLimit() {
		int i = 1;
		while(i*i <= this.limit) {
			System.out.print(i*i + "\t");
			i++;
		}
	}
	
	public void printCubesUptoLimit() {
		int i = 1;
		while(i*i*i <= this.limit) {
			System.out.print(i*i*i + "\t");
			i++;
		}
	}
}
