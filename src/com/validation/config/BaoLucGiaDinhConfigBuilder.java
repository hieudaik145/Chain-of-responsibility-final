package com.validation.config;

import java.util.Arrays;

import com.validation.entity.BaoLucGiaDinh;
import com.validation.rules.FieldValidate;
import com.validation.rules.RowValidate;
import com.validation.validators.AlphaNumericValidtor;
import com.validation.validators.ContainStringValidator;
import com.validation.validators.MinLengthValidator;
import com.validation.validators.MinYearReportValidator;
import com.validation.validators.NullValidator;
import com.validation.validators.NumberValidator;

public class BaoLucGiaDinhConfigBuilder {

	public static RowValidate createRowValidate(Object object) {

		if (object instanceof BaoLucGiaDinh) {
			BaoLucGiaDinh baoLucGiaDinh = (BaoLucGiaDinh) object;

			return new RowValidate.Builder().setId(baoLucGiaDinh.getId())
					.setTable(baoLucGiaDinh.getClass().getSimpleName())
					.addFieldValidate(new FieldValidate.Builder().setFieldName("tenNguoiThucHienBaoCao")
							.setType("String").setValue(baoLucGiaDinh.getTenNguoiThucHienBaoCao())
							.addRules(new AlphaNumericValidtor()).addRules(new MinLengthValidator())
							.createFieldValidate())
					.addFieldValidate(new FieldValidate.Builder().setFieldName("quanHuyenBaoCao").setType("String")
							.setValue(baoLucGiaDinh.getTenQuanHuyen())
							.addRules(new AlphaNumericValidtor())
							.addRules(new ContainStringValidator())
							.createFieldValidate())
					.addFieldValidate(new FieldValidate.Builder()
							.setValue(baoLucGiaDinh.getId())
							.setFieldName("id")
							.setType("Integer")
							.addRules(new NullValidator())
							.createFieldValidate())
					.addFieldValidate(new FieldValidate.Builder()
							.setValue(baoLucGiaDinh.getChucVu())
							.setType("String")
							.setFieldName("ChucVu")
							.addRules(Arrays.asList(new NullValidator(), new AlphaNumericValidtor()))
							.createFieldValidate())
					.addFieldValidate(new FieldValidate.Builder()
							.setValue(String.valueOf(baoLucGiaDinh.getNamBaoCao()))
							.setType("Integer")
							.setFieldName("NamBaoCao")
							.addRules(new NumberValidator())
							.addRules(new MinYearReportValidator())
							.createFieldValidate())
					.createRowValidate();

		}

		return null;

	}
}
