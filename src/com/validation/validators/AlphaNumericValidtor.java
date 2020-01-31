package com.validation.validators;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.SimpleResult;

public class AlphaNumericValidtor implements Validator {

	private final Result FAILED;

	public AlphaNumericValidtor() {
		FAILED = new SimpleResult("The Stirng should be alphanumeric.", false);
	}

	@Override
	public Result validate(String value) {
		return isAlphaNumeric(value) ? Result.OK : FAILED;
	}

	private boolean isAlphaNumeric(String s) {
		String pattern = "^[a-zA-Z0-9]*$";
		return s.matches(pattern);
	}
	
	@Override
	public String toString() {
		return "AlphaNumericValidator";
	}

}
