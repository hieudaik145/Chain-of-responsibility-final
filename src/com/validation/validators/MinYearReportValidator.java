package com.validation.validators;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.SimpleResult;

public class MinYearReportValidator implements Validator {

	private int minYear;
	private final Result FAILED;

	public MinYearReportValidator() {
		super();
		minYear = 2010;
		FAILED = new SimpleResult("Năm báo cáo phải lớn hơn hoặc bằng năm " + minYear, false);
		
	}

	private boolean isMinYearValidator(String s) {
		return Integer.valueOf(s) >= minYear;

	}

	@Override
	public Result validate(String value) {
		
		return isMinYearValidator(value) ? Result.OK : FAILED;
	}

}
