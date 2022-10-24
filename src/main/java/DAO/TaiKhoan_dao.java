package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connect.Connect;
import Enitity.TaiKhoan;

public class TaiKhoan_dao {
	

	public TaiKhoan DangNhap_dao(TaiKhoan input) {
		TaiKhoan taiKhoan = null;
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select top 1 * from TaiKhoan where tenDangNhap = ? and matKhau = ? ");
			preparedStatement.setString(1, input.getTenDangNhap());
			preparedStatement.setString(2, input.getMatKhau());
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				String tenDangNhap = result.getString(1);
				String matKhau = result.getString(2);
				String quyen = result.getString(3);
				taiKhoan = new TaiKhoan(tenDangNhap, matKhau, quyen);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return taiKhoan;
	}
}
