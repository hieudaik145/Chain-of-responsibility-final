package com.validation.rules;

import java.util.ArrayList;
import java.util.List;

import com.validation.component.Validator;

public class FieldValidate {

	private String type;

	private String fieldName;

	private String value;

	private List<Validator> rules;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Validator> getRules() {
		return rules;
	}

	public void setRules(List<Validator> rules) {
		this.rules = rules;
	}

	public static class Builder {

		private String type;

		private String fieldName;

		private String value;

		private List<Validator> rules;

		public Builder setType(String type) {
			this.type = type;
			return this;
		}

		public Builder setFieldName(String fieldName) {
			this.fieldName = fieldName;
			return this;
		}

		public Builder setValue(String value) {
			this.value = value;
			return this;
		}

		public Builder addRules(Validator validator) {
			if (rules == null || rules.isEmpty()) {
				this.rules = new ArrayList<>();
			}
			this.rules.add(validator);
			return this;
		}

		public Builder addRules(List<Validator> validators) {
			if (rules == null || rules.isEmpty()) {
				this.rules = new ArrayList<>();
			}
			this.rules.addAll(validators);
			return this;
		}

		public FieldValidate createFieldValidate() {
			FieldValidate fieldValidate = new FieldValidate(type, fieldName, value, rules);
			return fieldValidate;
		}
	}

	public FieldValidate(String type, String fieldName, String value, List<Validator> rules) {
		super();
		this.type = type;
		this.fieldName = fieldName;
		this.value = value;
		this.rules = rules;
	}

}
