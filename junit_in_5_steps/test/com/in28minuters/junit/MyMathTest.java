package com.in28minuters.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.in28minutes.math.MyMath;

class MyMathTest {
	
	@Test
	void calculatorSum_SumOfNullOrEmpty_Return0() {
		//Arrange
		MyMath math = new MyMath();
		int expectedResult = 0;
		
		//Act
		int actualResultWithNull = math.calculatorSum(null);
		int actualResultWithEmpty = math.calculatorSum();
		
		//Assert
		assertEquals(expectedResult, actualResultWithNull);
		assertEquals(expectedResult, actualResultWithEmpty);
	}
	
	@Test
	void calculatorSum_SumOf123_Return6() {
		//Arrange
		MyMath math = new MyMath();
		int expectedResult = 6;
		
		//Act
		int actualResult = math.calculatorSum(1,2,3);
		
		//Assert
		assertEquals(expectedResult, actualResult);
	}

}
