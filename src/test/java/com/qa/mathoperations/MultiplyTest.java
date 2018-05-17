package com.qa.mathoperations;

import org.junit.Assert;

import org.junit.Test;



public class MultiplyTest {

	@Test
	public void test() {
		Multiply multiply = new Multiply();
		int actual = multiply.multiply(4,5);
		Assert.assertEquals(20, actual);
	}

}
