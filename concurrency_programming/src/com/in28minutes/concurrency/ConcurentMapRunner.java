package com.in28minutes.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurentMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("ABCD ABCD ABCD");
		ConcurrentMap<Character, LongAdder> occurences =
				new ConcurrentHashMap<Character, LongAdder>();
		
		for(int i = 0; i <= str.length() - 1; i++) {
			LongAdder numOfOccur = occurences.get(str.charAt(i));
			if(numOfOccur == null) {
				numOfOccur = new LongAdder();
			}
			numOfOccur.increment();
			occurences.put(str.charAt(i), numOfOccur);
		}
		
		System.out.println(occurences.toString());
	}

}
