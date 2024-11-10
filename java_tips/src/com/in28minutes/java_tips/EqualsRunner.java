package com.in28minutes.java_tips;

class Client {
	private int id;
	
	public Client(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		
		result = result*prime + this.id;
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) {
			return false;
		}
		Client comparedClient = (Client)obj;
		if(this.id == comparedClient.getId()) {
			return true;
		}
		
		return false;
	}
}

public class EqualsRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client(1);
		Client client2 = new Client(1);
		Client client3 = new Client(3);
		
		System.out.println(client1.equals(client2));
		System.out.println(client1.equals(client3));
	}
}
