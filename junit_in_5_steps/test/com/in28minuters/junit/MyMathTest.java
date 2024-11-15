package com.in28minuters.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in28minutes.math.MyMath;

class MyMathTest {

	@Test
	void test() {
		//Arrange
		MyMath math = new MyMath();
		int expectedResult = 6;
		
		//Act
		int actualResult = math.calculatorSum(1,2,3);
		
		//Assert
		assertEquals(expectedResult, actualResult);
	}

}
