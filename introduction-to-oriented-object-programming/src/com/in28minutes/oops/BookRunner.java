package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = 
				new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.setNoOfCopies(120);
		effectiveJava.setNoOfCopies(250);		
		cleanCode.setNoOfCopies(10);
		
		artOfComputerProgramming.increaseNoOfCopies(10);
		artOfComputerProgramming.decreaseNoOfCopies(130);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
