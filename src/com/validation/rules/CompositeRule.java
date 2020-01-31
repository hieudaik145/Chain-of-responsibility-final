package com.validation.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.validation.component.Result;
import com.validation.component.Validator;
import com.validation.composite.results.CompositeResult;

public class CompositeRule extends ArrayList<Validator> implements Validator {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8414932387703832604L;

	public CompositeRule(Collection<Validator> rules) {
		addAll(rules);
	}

	public CompositeRule(Validator... rules) {
		addAll(Arrays.asList(rules));
	}

	@Override
	public CompositeResult validate(String value) {

		CompositeResult result = new CompositeResult(size());

		for (Validator rule : this) {

			Result tempResult = rule.validate(value);

			List<Result> list = new ArrayList<>();

			if (!tempResult.isOk()) {
				list.add(tempResult);
			}

			result.add(list);

		}
		return result;
	}

}