package com.validation.rules;

public class ResultError {

	private String message;
	private String id;
	private String table;
	private String type;
	private String fieldName;
	private String value;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

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

	public ResultError(String message, String id, String table, String type, String fieldName, String value) {
		super();
		this.message = message;
		this.id = id;
		this.table = table;
		this.type = type;
		this.fieldName = fieldName;
		this.value = value;
	}

	public ResultError() {
		super();
	}

	@Override
	public String toString() {
		return "ResultError [ id=" + id +", Trường Check=" + fieldName + ",  message=" + message +  ", value=" + value + ", table=" + table + ", type=" + type + "]";
	}

}
