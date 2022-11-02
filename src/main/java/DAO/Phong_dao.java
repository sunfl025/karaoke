package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Enitity.KhachHang;
import Enitity.Phong;


public class Phong_dao {
	public static ArrayList<Phong>getAllPhong(){
		ArrayList<Phong>dsphong = new ArrayList<Phong>();
		Connection connection = null;
		Statement sm = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql = "select * from Phong";
			sm = connection.createStatement();
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next()) {
				String maPhong = rs.getString(1);
				String tenPhong = rs.getString(2);
				String loaiPhong = rs.getString(3);
				String trangThai = rs.getString(4);
				int sucChua = rs.getInt(5);
				int dienTich = rs.getInt(6);
				double giaPhong = rs.getDouble(7);
				Phong p = new Phong(maPhong, tenPhong, loaiPhong, trangThai, sucChua, dienTich, giaPhong);
				dsphong.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sm!=null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return dsphong;
	}
	public static Phong findbyId(String maPhong){
		Connection connection = null;
		PreparedStatement sm =null;
		Phong p = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select *from Phong where maPhong like ?";
			sm = connection.prepareCall(sql);
			sm.setString(1,"%"+maPhong+"%");
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				maPhong = rs.getString(1);
				String tenPhong = rs.getString(2);
				String loaiPhong = rs.getString(3);
				String trangThai = rs.getString(4);
				int sucChua = rs.getInt(5);
				int dienTich = rs.getInt(6);
				double giaPhong = rs.getDouble(7);

				 p = new Phong(maPhong, tenPhong, loaiPhong, trangThai, sucChua, dienTich, giaPhong);
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
		return p;
		
	}
	/////////////////////////////////////////////////////////////////////////
	public static void updateTrangThaiPhong(Phong p) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql ="update Phong set trangThai=? where maKhachHang=? ";
			sm = connection.prepareStatement(sql);
			sm.setString(1, p.getTrangThai());
			sm.setString(2, p.getMaPhong());
			sm.execute();
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
		
	}
	
	
}
