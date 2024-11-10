package com.in28minutes.java_tips;

class DefaultClass {
	
}

public class NestedClassRunner {
	private static int i;
	
	class InnerClass {
		public void method() {
			i = 5;
		}
	}
	
	static class StaticNestedClass {
		public static void method() {
			i = 5;
		}
	}
	
	public void method() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		NestedClassRunner.StaticNestedClass staticNestedClass
			= new StaticNestedClass();
		
		NestedClassRunner nestedClassRunner = 
				new NestedClassRunner();
		
		InnerClass innerClass = nestedClassRunner.new InnerClass();
		
		System.out.println(staticNestedClass);
		System.out.println(innerClass);
	}
}
