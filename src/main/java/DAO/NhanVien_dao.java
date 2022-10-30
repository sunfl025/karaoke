package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.KhachHang;
import Enitity.NhanVien;
import Enitity.TaiKhoan;

public class NhanVien_dao {
	
	public static ArrayList<NhanVien> getAll() {
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
	public static boolean update(NhanVien nv,String manhanvien) {
		Connection con = Connect.getInstance().getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = con.prepareStatement(
					"update nhanvien set tennhanvien=?,gioitinh=?,sdt=?,chucvu=?,luong=?,tendangnhap=? where  manhanvien= ?");
			preparedStatement.setString(1, nv.getTenNhanVien());
			preparedStatement.setString(2, nv.getGioiTinh());
			preparedStatement.setString(3, nv.getSdt());
			preparedStatement.setString(4, nv.getChucVu());
			preparedStatement.setDouble(5, nv.getLuong());
			preparedStatement.setString(6, nv.getTenDangNhap().getTenDangNhap());
			preparedStatement.setString(7, nv.getMaNhanVien());
			if (preparedStatement.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public static boolean xoa(String maNhanVien) {
		Connection con = Connect.getInstance().getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = con.prepareStatement("delete nhanvien where manhanvien = ?");
			preparedStatement.setString(1, maNhanVien);
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<NhanVien> find(String sdt){
		Connection connection = null;
		PreparedStatement sm =null;
		ArrayList<NhanVien> dsnv =  new ArrayList<NhanVien>();

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select *from NhanVien where sdt like ?";
			sm = connection.prepareCall(sql);
			sm.setString(1,"%"+sdt+"%");
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maKhachhang = rs.getString(1);
				String tenKhachHang = rs.getString(2);
				String gioiTinh = rs.getString(3);
				sdt = rs.getString(4);
				String chucVu = rs.getString(5);
				double luong = rs.getDouble(6);
				TaiKhoan tenDangNhap = new 	TaiKhoan(rs.getString(7));
				NhanVien nv = new NhanVien(maKhachhang, tenKhachHang, gioiTinh, sdt, chucVu, luong, tenDangNhap);
				dsnv.add(nv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sm != null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return dsnv;
		
	}
	public static ArrayList<NhanVien> searchMaNV(String keyword) {
		ArrayList list_nv = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from NhanVien where maNhanVien = ? "  );
			preparedStatement.setString(1, keyword);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				TaiKhoan taiKhoan = new TaiKhoan(result.getString(7));
			
				NhanVien nv = new NhanVien(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getDouble(6), taiKhoan);
				
				list_nv.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_nv;
	}
	
	public static ArrayList<NhanVien> searchTenNV(String keyword) {
		ArrayList list_nv = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from NhanVien where tennhanvien like ? "  );
			preparedStatement.setString(1,"%" + keyword + "%" );
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				TaiKhoan taiKhoan = new TaiKhoan(result.getString(7));
			
				NhanVien nv = new NhanVien(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getDouble(6), taiKhoan);
				
				list_nv.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_nv;
	}
	
	public static ArrayList<NhanVien> searchChucVu(String keyword) {
		ArrayList list_nv = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from NhanVien where chucvu = ? "  );
			preparedStatement.setString(1, keyword);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				TaiKhoan taiKhoan = new TaiKhoan(result.getString(7));
			
				NhanVien nv = new NhanVien(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getDouble(6), taiKhoan);
				
				list_nv.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_nv;
	}
	public static ArrayList<NhanVien> searchGioiTinh(String keyword) {
		ArrayList list_nv = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from NhanVien where gioitinh = ? "  );
			preparedStatement.setString(1, keyword);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				TaiKhoan taiKhoan = new TaiKhoan(result.getString(7));
			
				NhanVien nv = new NhanVien(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getDouble(6), taiKhoan);
				
				list_nv.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_nv;
	}
	
	
}
