package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T extends Number> {
	private List<T> list;
	
	public MyCustomList(List<T> list) {
		this.list = new ArrayList<T>(list);
	}
	
	public T getElement(int index) {
		return this.list.get(index);
	}
	
	public void addElement(T element) {
		this.list.add(element);
	}
	
	public void removeElement(T element) {
		this.list.remove(element);
	}
	
	@Override
	public String toString() {
		return this.list.toString();
	}
}
