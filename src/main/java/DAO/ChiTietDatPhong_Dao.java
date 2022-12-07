package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import Connect.Connect;
import Enitity.ChiTietDatPhong;
import Enitity.DatTruocPhong;
import Enitity.Phong;


public class ChiTietDatPhong_Dao {
	public static void them(ChiTietDatPhong ct) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="insert into ChiTietDatPhong(maChiTietDatPhong,thoiGianVao,thoiGianRa,maPhong,maKhachHang,ngayDat) values (?,?,?,?,?,?)";
			sm = connection.prepareCall(sql);
			sm.setString(1, ct.getMaChiTietDatPhong());
			Time timeIn = new Time(new Date().getTime());
			sm.setTime(2, timeIn);
			sm.setTime(3, ct.getThoiGianRa());
			sm.setString(4, ct.getMaPhong().getMaPhong());
			sm.setString(5, ct.getKhachHang().getMaKhachHang());
			sm.setDate(6, ct.getNgayDat());

			sm.execute();
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
	}
	
	public static ChiTietDatPhong findMaDatPByMaPhong(String maPhong){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select maChiTietDatPhong from ChiTietDatPhong where maPhong = '"+maPhong+"'";
			sm = connection.prepareStatement(sql);
			
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String ma = rs.getString(1);
				ChiTietDatPhong dp = new ChiTietDatPhong(ma);
				return dp;
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
		return null;
		
	}
	
}
