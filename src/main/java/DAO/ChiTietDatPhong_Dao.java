package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import Connect.Connect;
import Enitity.ChiTietDatPhong;


public class ChiTietDatPhong_Dao {
	public static void them(ChiTietDatPhong ct) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="insert into ChiTietDatPhong(maChiTietDatPhong,thoiGianVao,maPhong) values (?,?,?)";
			sm = connection.prepareCall(sql);
			sm.setString(1, ct.getMaChiTietDatPhong());
			Time timeIn = new Time(new Date().getTime());
			sm.setTime(2, timeIn);
			sm.setString(3, ct.getMaPhong().getMaPhong());
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
}