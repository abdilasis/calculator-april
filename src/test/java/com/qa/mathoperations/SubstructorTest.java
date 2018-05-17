package com.qa.mathoperations;

import org.junit.Assert;

import org.junit.Test;

public class SubstructorTest {

	@Test
	public void test() {
		Substructor substruct = new Substructor();
		
		int actual = substruct.substruct(6,2);
		Assert.assertEquals(4, actual);
	
	}

}
