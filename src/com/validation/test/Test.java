package com.validation.test;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.validation.entity.CoreObject;
import com.validation.service.ValidateService;
import com.validation.test.dao.BaoLucGiaDinhDAO;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		BaoLucGiaDinhDAO baoLucGiaDinhDAO = new BaoLucGiaDinhDAO();
		
//		insert();
		
		List<CoreObject> list = baoLucGiaDinhDAO.getListTrungTamVanHoa();
		
		ValidateService service = new ValidateService();
		LocalDateTime start = LocalDateTime.now();
		service.applyValidate(list);
		LocalDateTime end = LocalDateTime.now();
		System.out.println(start + " - " + end);
		
	}

	private static void insert() throws SQLException {
		BaoLucGiaDinhDAO baoLucGiaDinhDAO = new BaoLucGiaDinhDAO();
		
		LocalDateTime start = LocalDateTime.now();
		baoLucGiaDinhDAO.callProcedureInsertBaoLucGiaDinh();
		LocalDateTime end = LocalDateTime.now();
		
		System.out.println(start + " - " + end);
	}
}
