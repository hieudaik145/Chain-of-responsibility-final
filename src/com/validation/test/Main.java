package com.validation.test;

import com.validation.entity.BaoLucGiaDinhService;
import com.validation.service.ValidateService;

public class Main {

	public static void main(String[] args) throws Exception {

		ValidateService validateService = new ValidateService();

		validateService.applyValidate(BaoLucGiaDinhService.getBaoLucGiaDinhs());

	}

}
