package com.validation.service;

import java.util.ArrayList;
import java.util.List;

import com.validation.config.BaoLucGiaDinhConfigBuilder;
import com.validation.entity.BaoLucGiaDinh;
import com.validation.rules.ResultError;
import com.validation.rules.RowValidate;

public class ValidateService {

	RowValidateService rowValidateService = new RowValidateService();

	public void applyValidate(List<Object> list) {

		List<Object> pass = new ArrayList<>();

		List<ResultError> fail = new ArrayList<>();

		for (Object object : list) {

			List<ResultError> resultErrors = rowValidateService.applyRowValidate(callConstantsRowCheck(object));
			if (resultErrors.isEmpty()) {
				pass.add(object);
			} else {
				fail.addAll(resultErrors);
			}
		}
		
		for (ResultError resultError : fail) {
			System.out.println(resultError.toString());
		}
		
		for (Object object : pass) {
			System.out.println(object.toString());
		}
		System.out.println("end");

	}

	public RowValidate callConstantsRowCheck(Object object) {

		RowValidate rowValidate = null;
		
		if(object instanceof BaoLucGiaDinh) {
			rowValidate = BaoLucGiaDinhConfigBuilder.createRowValidate(object);
		}
		
		return rowValidate;
		
	}
}
