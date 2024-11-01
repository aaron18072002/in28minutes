package com.in28minutes.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueRunner {
	public static class StringLengthComparator implements Comparator<String> {
		@Override
		public int compare(String str1, String str2) {
			// TODO Auto-generated method stub
			return Integer.compare(str1.length(), str2.length());
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> strs = new PriorityQueue<String>
								(new StringLengthComparator());
		strs.addAll(Set.of("Apple","Zebra","Monkey","Cat"));
		
		System.out.println(strs.toString());
	}
}
