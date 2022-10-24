package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.NhanVien;
import Enitity.TaiKhoan;

public class NhanVien_dao {
	
	public ArrayList<NhanVien> getAll() {
		ArrayList list_nv = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from NhanVien");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				TaiKhoan taikhoan = new TaiKhoan(result.getString(7));
				NhanVien nhanvien = new NhanVien(result.getString(1), result.getString(2),result.getString(3) , result.getString(4), result.getString(5), result.getDouble(6), taikhoan);
			
				
				list_nv.add(nhanvien);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_nv;
	}
	public boolean save(NhanVien nhanvien) {
		Connection con = Connect.getInstance().getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = con.prepareStatement(
					"insert NhanVien(maNhanVien,tenNhanVien,gioiTinh,sdt,chucVu,luong,tenDangNhap) values(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, nhanvien.getMaNhanVien());
			preparedStatement.setString(2, nhanvien.getTenNhanVien());
			preparedStatement.setString(3, nhanvien.getGioiTinh());
			preparedStatement.setString(4, nhanvien.getSdt());
			preparedStatement.setString(5, nhanvien.getChucVu());
			preparedStatement.setDouble(6, nhanvien.getLuong());
			preparedStatement.setString(7, nhanvien.getTenDangNhap().getTenDangNhap());
			if (preparedStatement.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
