package com.validation.validators;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.SimpleResult;

public class MinLengthValidator implements Validator{

	private final Result FAILED;
	private Integer minLength;

	public MinLengthValidator() {
		this(8);
	}

	public MinLengthValidator(Integer minLength) {
		this.minLength = minLength;
		FAILED = new SimpleResult("String must be min length " + minLength
				+ " characters long.", false);
	}

	@Override
	public Result validate(String value) {
		return value.length() >= minLength ? Result.OK : FAILED;
	}
	
	@Override
	public String toString() {
		return "MinLengthValidator";
	}

}
