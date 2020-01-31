package com.validation.entity;

import java.util.Date;

public class BaoLucGiaDinh {

	private String id;
	
	private String tenQuanHuyen;
	
	private int soHoGiaDinhBiBaoLuc;
	
	private int namBaoCao;
	
	private Date ngayBaoCao;
	
	private String tenNguoiThucHienBaoCao;
	
	private String chucVu;

	public String getTenQuanHuyen() {
		return tenQuanHuyen;
	}

	public void setTenQuanHuyen(String tenQuanHuyen) {
		this.tenQuanHuyen = tenQuanHuyen;
	}

	public int getSoHoGiaDinhBiBaoLuc() {
		return soHoGiaDinhBiBaoLuc;
	}

	public void setSoHoGiaDinhBiBaoLuc(int soHoGiaDinhBiBaoLuc) {
		this.soHoGiaDinhBiBaoLuc = soHoGiaDinhBiBaoLuc;
	}

	public int getNamBaoCao() {
		return namBaoCao;
	}

	public void setNamBaoCao(int namBaoCao) {
		this.namBaoCao = namBaoCao;
	}

	public Date getNgayBaoCaO() {
		return ngayBaoCao;
	}

	public void setNgayBaoCaO(Date ngayBaoCaO) {
		this.ngayBaoCao = ngayBaoCaO;
	}

	public String getTenNguoiThucHienBaoCao() {
		return tenNguoiThucHienBaoCao;
	}

	public void setTenNguoiThucHienBaoCao(String tenNguoiThucHienBaoCao) {
		this.tenNguoiThucHienBaoCao = tenNguoiThucHienBaoCao;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public BaoLucGiaDinh(String id, String tenQuanHuyen, int soHoGiaDinhBiBaoLuc, int namBaoCao, Date ngayBaoCaO,
			String tenNguoiThucHienBaoCao, String chucVu) {
		super();
		this.id = id;
		this.tenQuanHuyen = tenQuanHuyen;
		this.soHoGiaDinhBiBaoLuc = soHoGiaDinhBiBaoLuc;
		this.namBaoCao = namBaoCao;
		this.ngayBaoCao = ngayBaoCaO;
		this.tenNguoiThucHienBaoCao = tenNguoiThucHienBaoCao;
		this.chucVu = chucVu;
	}

	public BaoLucGiaDinh() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "save Bao Luc Gia Dinh " + id;
	}
	
	
	
}
