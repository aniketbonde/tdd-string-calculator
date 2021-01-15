package com.sample.tdd_string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sample.tdd_string_calculator.exception.NegativeNumberNotAllowedException;

public class StringCalculator 
{
	public int add(String input){
		int addition = 0;
		String negativeNum = "";
		if(input.isEmpty()) {
			addition = 0;
		}else {
			String[] num = delimiterSeperator(input);
			for (String n : num) {
				int intN = Integer.parseInt(n);
				if(intN < 0) {
					negativeNum += String.valueOf(intN+" ");
				}else {
					if(intN > 1000) {
						continue;
					}
					addition += intN;
				}
			}
		}
		if(!negativeNum.isEmpty()) {
			throw new NegativeNumberNotAllowedException("Negatives not allowed.."+negativeNum);
		}
		return addition;
	}
	
	
	private String[] delimiterSeperator(String input) {
		String[] split = {};
		if(input.startsWith("//")) {
			split = customDelimiterSeperator(input, split);
		}else
			split = input.split("[\\,\\r\\n]+");
		
		return split;
	}


	private String[] customDelimiterSeperator(String input, String[] split) {
		String pattern = "//(.*)\n(.*)";
		Matcher m = Pattern.compile(pattern).matcher(input);
		if(m.matches()) {
			split = m.group(2).split(Pattern.quote(m.group(1)));
		}
		return split;
	}
	
}
