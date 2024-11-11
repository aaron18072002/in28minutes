package com.in28minutes.mysorting;

import java.util.List;

import com.in28minutes.bubblesort.BubbleSort;

public class MySorting {
	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		
		return bubbleSort.sort(names);
	}
}
