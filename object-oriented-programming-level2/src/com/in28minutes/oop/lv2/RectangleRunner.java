package com.in28minutes.oop.lv2;

public class RectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(5.55f,3.33f);
		
		System.out.println(rectangle1.toString());
		System.out.println(rectangle1.area());
		System.out.println(rectangle1.perimeter());
		
		rectangle1.setLength(6.66f);
		rectangle1.setWidth(2.22f);
		
		System.out.println(rectangle1.toString());
		System.out.println(rectangle1.area());
		System.out.println(rectangle1.perimeter());
	}

}
