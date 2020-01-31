package com.validation.service;

import com.validation.composite.results.CompositeResult;
import com.validation.rules.CompositeRule;
import com.validation.rules.FieldValidate;

public class FieldValidateService {

	public CompositeResult applyFieldValidate(FieldValidate fieldValidate) {

		CompositeRule rule = new CompositeRule(fieldValidate.getRules());

		return rule.validate(fieldValidate.getValue());

	}

}
