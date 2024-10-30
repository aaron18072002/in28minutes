package com.in28minutes.oop.inheritance;

public class NormalRecipe extends AbstractRecipe {

	@Override
	public void getReady() {
		System.out.println("Prepare raw materials");	
		System.out.println("Prepare utensils");
	}

	@Override
	public void doTheDish() {
		System.out.println("Do the dish");
	}

	@Override
	public void cleanup() {
		System.out.println("Cleanup utensils");
	}

}
