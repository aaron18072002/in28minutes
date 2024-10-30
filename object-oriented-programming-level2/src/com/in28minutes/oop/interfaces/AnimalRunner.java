package com.in28minutes.oop.interfaces;

import java.util.ArrayList;

public class AnimalRunner {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(dog);
		animals.add(cat);
		
		for(int i = 0; i <= animals.size() - 1; i++) {
			animals.get(i).bark();
		}
	}
}
