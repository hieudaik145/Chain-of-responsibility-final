package com.validation.rules;

import java.util.ArrayList;
import java.util.List;

public class RowValidate {

	private String id;

	private String table;
	
	private List<FieldValidate> fieldValidates;

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

	public List<FieldValidate> getFieldValidates() {
		return fieldValidates;
	}

	public void setFieldValidates(List<FieldValidate> fieldValidates) {
		this.fieldValidates = fieldValidates;
	}
	
	public static class Builder {
		
		private String id;
		
		private String table;
		
		private List<FieldValidate> fieldValidate;
		
		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		
		public Builder setTable(String table) {
			this.table = table;
			return this;
		}
		
		public Builder addFieldValidate(FieldValidate fieldValidate) {
			
			if(this.fieldValidate == null || this.fieldValidate.isEmpty()) {
				this.fieldValidate = new ArrayList<>();
			}
			this.fieldValidate.add(fieldValidate);
			return this;
		}
		public RowValidate createRowValidate() {
			
			RowValidate rowValidate = new RowValidate(id, table, fieldValidate);
			
			return rowValidate;
		}
	}

	public RowValidate(String id, String table, List<FieldValidate> fieldValidates) {
		super();
		this.id = id;
		this.table = table;
		this.fieldValidates = fieldValidates;
	}
	
}
