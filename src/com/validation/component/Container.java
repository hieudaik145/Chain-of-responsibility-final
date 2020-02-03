package com.validation.component;

public abstract class Container implements Validator {

	private Validator next;

	public Validator nextCheck(Validator next) {
		this.next = next;
		return next;
	}

	@Override
	public Result validate(String value) {
		if (next == null) {
			return Result.OK;
		}

		return next.validate(value);
	}

	protected abstract boolean checkNext(String value);

}
