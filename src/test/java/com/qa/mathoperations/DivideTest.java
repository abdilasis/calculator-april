package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;
public class DivideTest {

	@Test
	public void test() {
		Divider div = new Divider();
		int actual = div.divide(10,5);
		
		Assert.assertEquals(2, actual);
	}

}
