package com.sample.tdd_string_calculator.exception;

public class NegativeNumberNotAllowedException extends RuntimeException {

	public NegativeNumberNotAllowedException(String s) {
		super(s);
	}
	
}
