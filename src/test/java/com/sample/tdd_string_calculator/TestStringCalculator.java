package com.sample.tdd_string_calculator;

import org.junit.Assert;
import org.junit.Test;

import com.sample.tdd_string_calculator.exception.NegativeNumberNotAllowedException;

/**
 * Unit test for String calculator
 */
public class TestStringCalculator 
{
	@Test
	public void testAddforEmptyString() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(0, sc.addTwoNumber(""), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddforNumber() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(1, sc.addTwoNumber("1"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddforNumbersUsingCommaSeperate() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(20, sc.addTwoNumber("5,5,10"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddforNumbersUsingNewLineEscapeChar() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(20, sc.addTwoNumber("5\n5\n10"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddforNumberUsingMixDelimiter() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(5, sc.addTwoNumber("5\n"), 0);
			Assert.assertEquals(5, sc.addTwoNumber("5,"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}	
	
	@Test
	public void testAddforNumbersUsingMixDelimiter() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(20, sc.addTwoNumber("5\n5,2\n4,4\n"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddforNumbersUsingCustomDelimiter() {
		StringCalculator sc = new StringCalculator();
		try {
			Assert.assertEquals(20, sc.addTwoNumber("//;\n5;5;2;8;"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			e.printStackTrace();
		}
	}
     
	@Test
	public void testAddforNegativeNumbers() {
		try {
			StringCalculator sc = new StringCalculator();
			Assert.assertEquals(20, sc.addTwoNumber("-5\n5\n-10"), 0);
		} catch (NegativeNumberNotAllowedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
