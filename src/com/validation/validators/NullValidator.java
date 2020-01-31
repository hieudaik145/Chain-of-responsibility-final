package com.validation.validators;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.SimpleResult;

public class NullValidator implements Validator {
	
	public final Result FAILED;

	 public NullValidator() {
		 FAILED = new SimpleResult("Null Value", false);
	}
	
	private boolean isNullValidate(String value) {
		return value == null;
	}

	@Override
	public Result validate(String value) {
		
		return !isNullValidate(value) ? Result.OK : FAILED;
	}

}
