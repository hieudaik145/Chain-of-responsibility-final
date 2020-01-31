package com.validation.config;

import com.validation.rules.RowValidate;

public interface BuilderConfig {

	RowValidate createRowValidate(Object object);
}
