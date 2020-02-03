package com.validation.test.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.validation.entity.BaoLucGiaDinh;
import com.validation.entity.CoreObject;

public class BaoLucGiaDinhDAO {

	public List<CoreObject> getListTrungTamVanHoa() throws SQLException {
		List<CoreObject> list = new ArrayList<>();

		Connection conn = ConnectionProvider.getConnection();

		try {
			PreparedStatement stm = conn.prepareStatement("select * from baolucgiadinh");
			ResultSet rs = stm.executeQuery();
			list = getListTTVHWithResultSet(rs);
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}

		conn.close();

		return list;
	}

	public static final String QUERY_CREATE_PROCEDURE = "CREATE PROCEDURE baolucgiadinh_insert_procedure"
			+ " (IN tenQuanHuyen varchar(255), " + " IN soHoGiaDinhBiBaoLuc int, IN namBaoCao int, " + " "
			+ "IN ngayBaoCao date, IN tenNguoiThucHienBaoCao VARCHAR(255), IN chucVu VARCHAR(255))" + " BEGIN "
			+ "insert into baolucgiadinh(tenQuanHuyen, soHoGiaDinhBiBaoLuc, namBaoCao, ngayBaoCao, tenNguoiThucHienBaoCao, chucVu) "
			+ "values (tenQuanHuyen, soHoGiaDinhBiBaoLuc, namBaoCao, ngayBaoCao, tenNguoiThucHienBaoCao, chucVu);"
			+ " END ";

	public static final String PROCEDURE_NAME = "baolucgiadinh_insert_procedure";

	public void callProcedureInsertBaoLucGiaDinh() throws SQLException {

		Connection conn = ConnectionProvider.getConnection();
		conn.setAutoCommit(false);

		if (!UtilService.checkProcedureExist(conn, PROCEDURE_NAME)) {
			UtilService.createProcedure(conn, QUERY_CREATE_PROCEDURE);
			conn.commit();
		}

		int count = 0;
		
		
		for (int i = 0; i < 1000000; i++) {

			count++;

			String query = "{call_baolucgiadinh_insert_procedure(?, ?, ?, ?, ?, ?)}";
			try {
				CallableStatement stmt = conn.prepareCall(query);
				stmt.setString(1, "Quận" + i);
				stmt.setInt(2, i);
				stmt.setInt(3, i);
				stmt.setDate(4, new Date(i));
				stmt.setString(5, "tenNguoiThucHienBaoCao " + i);
				stmt.setString(6, "chucVu" + i);
				stmt.executeQuery();
				System.out.println(i);
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (count == 50000) {
				System.out.println("commit");
				count = 0;
				conn.commit();
			}

		}

		conn.close();
	}

	private List<CoreObject> getListTTVHWithResultSet(ResultSet rs) throws SQLException {
		List<CoreObject> list = new ArrayList<>();

		while (rs.next()) {
			BaoLucGiaDinh blgd = new BaoLucGiaDinh();
			blgd.setId(rs.getInt(1));
			blgd.setTenQuanHuyen(rs.getString(2));
			blgd.setSoHoGiaDinhBiBaoLuc(rs.getInt(3));
			blgd.setNamBaoCao(rs.getInt(4));
			blgd.setNgayBaoCao(rs.getDate(5));
			blgd.setTenNguoiThucHienBaoCao(rs.getString(6));
			blgd.setChucVu(rs.getString(7));
			list.add(blgd);
		}

		return list;
	}
}
