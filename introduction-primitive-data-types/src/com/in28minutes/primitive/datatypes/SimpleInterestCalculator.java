package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;
	
	public SimpleInterestCalculator() {
		
	}
	
	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}
	
	public BigDecimal caculateTotalValue(int years) {
		BigDecimal totalAmount = this.principal
				.add(this.principal.multiply(this.interest)
						.multiply(new BigDecimal(years)));
		
		return totalAmount;
	}
}
