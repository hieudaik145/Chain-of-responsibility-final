package com.validation.validators;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.SimpleResult;

public class NumberValidator implements Validator {

	private final Result FAILED;

	public NumberValidator() {
		super();
		FAILED = new SimpleResult("Number Error", false);
	}

	private boolean isNumberValidate(String s) {
		String pattern = "^[0-9]*$";
		return s.matches(pattern);
	}

	@Override
	public Result validate(String value) {
		return isNumberValidate(value) ? Result.OK : FAILED;
	}

}
