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
	
	@Test
	public void testAddforNumber() {
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(1, sc.addTwoNumber("1"), 0);
	}
	
	@Test
	public void testAddforNumbersUsingCommaSeperate() {
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(20, sc.addTwoNumber("5,5,10"), 0);
	}
	
	@Test
	public void testAddforNumbersUsingNewLineEscapeChar() {
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(20, sc.addTwoNumber("5\n5\n10"), 0);
	}
	
	@Test
	public void testAddforNumbersUsingMixDelimiter() {
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(20, sc.addTwoNumber("5\n5,2\n4,4\n"), 0);
	}
	
	@Test
	public void testAddforNumbersUsingCustomDelimiter() {
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(20, sc.addTwoNumber("//;\n5;5;2;8;"), 0);
	}
     
}
