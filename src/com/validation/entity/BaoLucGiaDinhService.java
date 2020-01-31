package com.validation.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BaoLucGiaDinhService {
	
	public static List<Object> getBaoLucGiaDinhs() {
		
		return Arrays.asList(new BaoLucGiaDinh("1","Quậnhaichau", 100, 2010, new Date(), "vovanhieu", "nhanvien"),
				new BaoLucGiaDinh("2","Quận thanh khe", 150, 2008, new Date(), "hiev.*/", ".%nvien"),
				new BaoLucGiaDinh("3","hoa khanh", 0, 2007, new Date(), "hieuvv", "nhanvien"),
				new BaoLucGiaDinh("4","ngu hanh son", -2, 2019, new Date(), "hieuvv", "nhanvien"),
				new BaoLucGiaDinh("5","haiChau", 2012, 250, new Date(), "hieuvv", "123"),
				new BaoLucGiaDinh("6","lien chieu", 56, 2019, new Date(), "hieuvv", "nhanvien"),
				new BaoLucGiaDinh("7","cam le", -55, 2019, new Date(), "hieuvv", "nhanvien"),
				new BaoLucGiaDinh("8","hai chau 1", 24, 2019, new Date(), "hieuvv", "nhanvien"),
				new BaoLucGiaDinh("9","hai chau 222", 100, 2019, new Date(), "hieuvv", "nhanvien"),
				new BaoLucGiaDinh("10","Quận Hải Châu", 1203, 120, new Date(), "hieuvv", ""));
		
	}

}
