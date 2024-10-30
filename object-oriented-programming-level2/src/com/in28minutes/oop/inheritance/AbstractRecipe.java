package com.in28minutes.oop.inheritance;

public abstract class AbstractRecipe {
	public final void execute() { 
		this.getReady();
		this.doTheDish();
		this.cleanup();
	}
	
	public abstract void getReady();
	public abstract void doTheDish();
	public abstract void cleanup();
}
