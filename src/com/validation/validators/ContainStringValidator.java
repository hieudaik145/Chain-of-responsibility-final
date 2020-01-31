package com.validation.validators;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.SimpleResult;

public class ContainStringValidator implements Validator {

	private final Result FAILED;

	public ContainStringValidator() {
		super();
		FAILED = new SimpleResult("Tên quận huyện phải bắt đầu bằng Quận", false);
	}

	private boolean isContainString(String s) {
		return s.indexOf("Quận") == 0;
	}

	@Override
	public Result validate(String value) {
		return isContainString(value) ? Result.OK : FAILED;
	}

}
