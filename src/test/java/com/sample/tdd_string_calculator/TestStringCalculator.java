package com.sample.tdd_string_calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for String calculator
 */
public class TestStringCalculator 
{
	@Test
	public void testAddforEmptyString() {
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(0, sc.addTwoNumber(""), 0);
	}
     
}
