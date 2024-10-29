package com.in28minutes.oop.lv2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress1 = new Address("68LNQ","DaNang","123");
		Address workAddress1 = new Address("ToaNhaFPT","DaNang","456");
		
		Customer customer1 = new Customer("NTA",homeAddress1);
		
		System.out.println(customer1.toString());
		
		customer1.setWorkAddress(workAddress1);
		
		System.out.println(customer1.toString());
	}

}
