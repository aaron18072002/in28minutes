package com.in28minutes.oop.lv2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan1 = new Fan("Manufacturer1", 0.35, "Green");
		
		System.out.println(fan1.toString());
		
		fan1.switchOn((byte)6);
		System.out.println(fan1.toString());
		
		fan1.switchOff();
		System.out.println(fan1.toString());
	}
}