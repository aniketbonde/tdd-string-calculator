package com.sample.tdd_string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator 
{
	public int addTwoNumber(String input) {
		int addition = 0;
		if(input.isEmpty()) {
			addition = 0;
		}else {
			String[] num = delimiterSeperator(input);
			for (String n : num) {
				addition += Integer.parseInt(n);
			}
		}
		return addition;
	}
	
	
	private String[] delimiterSeperator(String input) {
		String[] split = {};
		if(input.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
			if(m.matches()) {
				split = m.group(2).split(m.group(1));
			}
		}else
			split = input.split("[\\,\\r\\n]+");
		
		return split;
	}
	
}
