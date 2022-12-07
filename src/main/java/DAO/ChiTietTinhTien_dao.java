package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.ChiTietDatPhong;
import Enitity.ChiTietDichVu;
import Enitity.DatTruocPhong;
import Enitity.DichVu;
import Enitity.HoaDon;
import Enitity.KhachHang;
import Enitity.NhanVien;
import Enitity.Phong;

public class ChiTietTinhTien_dao {
	public static void them(HoaDon hd) {
		Connection connection = null;
		PreparedStatement sm = null;
		ArrayList<KhachHang>dsnv = new ArrayList<KhachHang>();
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="insert into HoaDon(maHoaDon,ngayLapHoaDon,maNhanVien,maKhachHang,maChiTietDatPhong) values (?,?,?,?,?)";
			sm = connection.prepareCall(sql);
			sm.setString(1, hd.getMaHoaDon());
			sm.setDate(2, hd.getNgayLapHoaDon());
			sm.setString(3, hd.getNhanvien().getMaNhanVien());
			sm.setString(4, hd.getKhachhang().getMaKhachHang());
			sm.setString(5, hd.getChiTietDatPhong().getMaChiTietDatPhong());
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
	public static NhanVien findNhanVienByTenDangNhap(String tenDangNhap){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select nv.maNhanVien, nv.tenNhanVien from NhanVien nv join TaiKhoan tk on nv.tenDangNhap=tk.tenDangNhap where nv.tenDangNhap= '"+tenDangNhap+"'";
			sm = connection.prepareStatement(sql);
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maNhanVien = rs.getString(1);
				String tenNhanVien = rs.getString(2);
				NhanVien nv = new NhanVien(maNhanVien, tenNhanVien);
				return nv;
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
	public static ChiTietDatPhong find(String maPhong,Date ngay){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select top 1 dp.maChiTietDatPhong,dp.thoiGianVao,dp.thoiGianRa,kh.maKhachHang, kh.tenKhachHang, p.giaPhong from ChiTietDatPhong dp join KhachHang kh on dp.maKhachHang=kh.maKhachHang join Phong p on p.maPhong=dp.maPhong "
					+ "where dp.maPhong = '"+maPhong+"' and dp.ngayDat='"+ngay+"' order by dp.thoiGianVao DESC";
			sm = connection.prepareStatement(sql);
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maCT = rs.getString(1);
				Time timeIn = rs.getTime(2);
				Time timeOut = rs.getTime(3);
				String maKhachHang = rs.getString(4);
				String tenKhachHang = rs.getString(5);
				
				Double giaPhong = rs.getDouble(6);
				Phong p = new Phong(maPhong, "", giaPhong);
				
				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, "");
				ChiTietDatPhong dp = new ChiTietDatPhong(maCT, timeIn, timeOut, p, kh);
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
	public static ArrayList<ChiTietDichVu> getChiTietDichVu(String  maPhong) {
		ArrayList list_ctdv = new ArrayList<ChiTietDichVu>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("	select dv.maChiTietDichVu,dv.soLuongSanPham, v.tenDichVu,v.gia,p.giaPhong from Phong p join ChiTietDichVu dv on dv.maPhong=p.maPhong"
					+ "	join DichVu v on v.maDichVu=dv.maDichVu"
					+ "	where dv.maPhong = ?"
					 );
			preparedStatement.setString(1, maPhong);
			ResultSet result = preparedStatement.executeQuery();
			
			while (result.next()) {
				String tenDichVu = result.getString(3);
				Double gia = result.getDouble(4);
				DichVu dv = new DichVu(tenDichVu, 0, gia);
				String maChiTietDV = result.getString(1);
				int soLuong = result.getInt(2);
				Double giaPhong = result.getDouble(5);
				Phong p = new Phong(maPhong, "", giaPhong);
				ChiTietDichVu ctdv = new ChiTietDichVu(maChiTietDV, soLuong, dv, p);
				list_ctdv.add(ctdv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_ctdv;
	}
	public static void updateThoiGianRa(ChiTietDatPhong dp) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql ="update ChiTietDatPhong set thoiGianRa=? where maChiTietDatPhong=? ";
			sm = connection.prepareStatement(sql);
			Time timeIn = new Time(new java.util.Date().getTime());
			sm.setTime(1, timeIn);
			sm.setString(2, dp.getMaChiTietDatPhong());
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
	//Moi ne
	public static DatTruocPhong findDTP(String maPhong,Date ngay){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select top 1 dtp.maDatTruocPhong,dtp.gioDatPhong,dtp.thoiGianRa,dtp.maKhachHang, kh.tenKhachHang, p.giaPhong"
					+ "from DatTruocPhong dtp join KhachHang kh on dtp.maKhachHang=kh.maKhachHang join Phong p on p.maPhong=dtp.maPhong"
					+ "where dtp.maPhong = '"+maPhong+"' and dtp.ngayDatPhong='"+ngay+"'"
					+ "order by dtp.gioDatPhong DESC,dtp.ngayDatPhong DESC";
			sm = connection.prepareStatement(sql);
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maCT = rs.getString(1);
				Time timeIn = rs.getTime(2);
				Time timeOut = rs.getTime(3);
				String maKhachHang = rs.getString(4);
				String tenKhachHang = rs.getString(5);
				
				Double giaPhong = rs.getDouble(6);
				Phong p = new Phong(maPhong, "", giaPhong);
				
				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, "");
				DatTruocPhong dp = new DatTruocPhong(maPhong, ngay, timeIn, null, timeOut, p, kh);
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
