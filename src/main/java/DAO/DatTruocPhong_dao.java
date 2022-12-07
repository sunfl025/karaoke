package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;

import Enitity.ChiTietDatPhong;
import Enitity.DatTruocPhong;
import Enitity.KhachHang;
import Enitity.Phong;
import GUI.NhanPhongCho;

public class DatTruocPhong_dao {
	public static void themPhongCho(DatTruocPhong tp) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="insert into DatTruocPhong(maDatTruocPhong,ngayDatPhong,gioDatPhong,gioNhanPhong,thoiGianRa,maPhong,maKhachHang) values (?,?,?,?,?,?,?)";
			sm = connection.prepareCall(sql);
			sm.setString(1, tp.getMaDatTruocPhong());	
			sm.setDate(2, tp.getNgayDatPhong());
			sm.setTime(3, tp.getGioDatPhong());
			sm.setTime(4, tp.getGioNhanPhong());
			sm.setTime(5, tp.getThoiGianRa());
			sm.setString(6, tp.getMaPhong().getMaPhong());
			sm.setString(7, tp.getMaKhachHang().getMaKhachHang());
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
//	public static DatTruocPhong findKhachHangByMaPhong(String sdt,Date ngay){
//		Connection connection = null;
//		PreparedStatement sm =null;
//
//		try {
//			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
//			String sql = "select top 1 maDatTruocPhong, ngayDatPhong, gioDatPhong,dtp.maKhachhang ,kh.tenKhachHang,kh.sdt"
//					+ "from DatTruocPhong dtp join KhachHang kh on dtp.maKhachhang=kh.maKhachHang where kh.sdt ='"+sdt+"' and ngayDatPhong='"+ngay+"'"
//					+ "order by gioDatPhong DESC, ngayDatPhong DESC";
//			sm = connection.prepareStatement(sql);
//			
//			ResultSet rs = sm.executeQuery();
//			while(rs.next()) {
//				String ma = rs.getString(1);
//				ngay = rs.getDate(2);
//				Time gioDat = rs.getTime(3);
//				String maKhachHang = rs.getString(4);
//				String tenKhachHang = rs.getString(5);
//				sdt = rs.getString(6);
//				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, null, sdt, null);
//				DatTruocPhong dtp = new DatTruocPhong(ma, ngay, gioDat, null, null, null, kh);
//				return dtp;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(sm != null) {
//				try {
//					sm.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		return null;
//		
//	}
	public static DatTruocPhong findMaDatTPByMaPhong(String maPhong){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select maDatTruocPhong from DatTruocPhong where maPhong = '"+maPhong+"'";
			sm = connection.prepareStatement(sql);
			
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String ma = rs.getString(1);
				DatTruocPhong dtp = new DatTruocPhong(ma);
				return dtp;
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
	public static void updateGioNhanPhong(DatTruocPhong dtp) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql ="update DatTruocPhong set gioNhanPhong=? where maDatTruocPhong=? ";
			sm = connection.prepareStatement(sql);
			Time timeIn = new Time(new java.util.Date().getTime());
			sm.setTime(1, timeIn);
			sm.setString(2, dtp.getMaDatTruocPhong());
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
