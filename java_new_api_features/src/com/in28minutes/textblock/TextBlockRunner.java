package com.in28minutes.textblock;

public class TextBlockRunner {
	public static void main(String[] args) {
		String str = """
				""Line1: %s
				""Line2: %s
				Line3: %s
				""".formatted("1","2","3");
		
		System.out.println(str);
	}
}
