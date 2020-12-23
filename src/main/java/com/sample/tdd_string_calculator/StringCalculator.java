package com.sample.tdd_string_calculator;

public class StringCalculator 
{
	public int addTwoNumber(String input) {
		int addition = 0;
		if(input.isEmpty()) {
			addition = 0;
		}else {
			addition = Integer.parseInt(input);
		}
		return addition;
	}
}
