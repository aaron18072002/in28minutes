package com.in28minutes.oop.lv2;

public class Address {
	private String line1;
	private String city;
	private String zip;
	
	public Address(String line1, String city, String zip) {
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return String.format("line1 - %s,city - %s,zip - %s",
				this.line1, this.city, this.zip);
	}
}
