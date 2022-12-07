package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.ChiTietDatPhong;
import Enitity.ChiTietDichVu;
import Enitity.DichVu;
import Enitity.HoaDon;
import Enitity.KhachHang;
import Enitity.NhanVien;
import Enitity.Phong;

public class ChiTietHoaDon_Dao {
	public static ArrayList<HoaDon> getAll() {
		ArrayList list_hd = new ArrayList<HoaDon>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select maHoaDon,nv.tenNhanVien,kh.tenKhachHang,dp.thoiGianVao,dp.thoiGianRa,v.tenDichVu,v.soLuong,v.gia,p.maPhong,p.tenPhong,p.giaphong"
					+ "						from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "						join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "						join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
					+ "						join Phong p on p.maPhong=dp.maPhong "
					+ "						join ChiTietDichVu dv on dv.maPhong=p.maPhong"
					+ "						join DichVu v on v.maDichVu=dv.maDichVu");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				NhanVien nv = new NhanVien(result.getString(2));
				KhachHang kh = new KhachHang(result.getString(3));
				
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getTime(4),result.getTime(5));
				DichVu dv = new DichVu(result.getString(6), result.getInt(7), result.getDouble(8));
				Phong p = new Phong(result.getString(9),result.getString(10), result.getDouble(11));
				HoaDon hd = new HoaDon(result.getString(1), nv, kh, ctdp,p, dv);
				list_hd.add(hd);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
	
//	public static ArrayList<HoaDon> getIdforAll(String mahoadon) {
//		ArrayList list_hd = new ArrayList<HoaDon>();
//		try {
//			Connection con = Connect.getInstance().getConnection();
//			PreparedStatement preparedStatement = null;
//			preparedStatement = con.prepareStatement("select maHoaDon,nv.tenNhanVien,kh.tenKhachHang,dp.thoiGianVao,dp.thoiGianRa,v.tenDichVu,v.soLuong,v.gia,p.maPhong,p.tenPhong,p.giaphong"
//					+ "						from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
//					+ "						join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
//					+ "						join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
//					+ "						join Phong p on p.maPhong=dp.maPhong"
//					+ "						join ChiTietDichVu dv on dv.maPhong=p.maPhong"
//					+ "						join DichVu v on v.maDichVu=dv.maDichVu"
//					+ "						where maHoaDon = ?");
//			preparedStatement.setString(1, mahoadon);
//			ResultSet result = preparedStatement.executeQuery();
//			while (result.next()) {
//				NhanVien nv = new NhanVien(result.getString(2));
//				KhachHang kh = new KhachHang(result.getString(3));
//				
//				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getTime(4),result.getTime(5));
//				DichVu dv = new DichVu(result.getString(6), result.getInt(7), result.getDouble(8));
//				Phong p = new Phong(result.getString(9),result.getString(10), result.getDouble(11));
//				HoaDon hd = new HoaDon(result.getString(1), nv, kh, ctdp,p, dv);
//				list_hd.add(hd);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list_hd;
//	}
	
	public static ArrayList<HoaDon> getIdforAll(String mahoadon) {
		ArrayList list_hd = new ArrayList<HoaDon>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "					 	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "					 	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
					+ "					 	join Phong p on p.maPhong=dp.maPhong"
					
					+ "						where hd.maHoaDon = ? and dp.thoiGianRa is not null"
					 );
			preparedStatement.setString(1, mahoadon);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				NhanVien nv = new NhanVien(result.getString(13));
				KhachHang kh = new KhachHang(result.getString(7),result.getString(8),result.getString(10));
				Phong p = new Phong(result.getString(23), result.getString(24), result.getDouble(29));
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getString(5),result.getTime(19),result.getTime(20),p);
				
				ArrayList<ChiTietDichVu>  ctdv = getChiTietDichVuCuaHoaDon(result.getString(1));
				HoaDon hd = new HoaDon(result.getString(1),result.getDate(2), nv, kh, ctdp,p, ctdv);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
	
	public static ArrayList<ChiTietDichVu> getChiTietDichVuCuaHoaDon(String  mahoadon) {
		ArrayList list_ctdv = new ArrayList<ChiTietDichVu>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "					 	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "					 	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
					+ "					 	join Phong p on p.maPhong=dp.maPhong"
					+ "					 	join ChiTietDichVu dv on dv.maPhong=p.maPhong"
					+ "					 	join DichVu v on v.maDichVu=dv.maDichVu"
					+ "						where hd.maHoaDon = ? and dp.thoiGianRa is not null "
					 );
			preparedStatement.setString(1, mahoadon);
			ResultSet result = preparedStatement.executeQuery();
			
			while (result.next()) {
				DichVu dv = new DichVu( result.getString(36), result.getInt(37),result.getDouble(38));
				ChiTietDichVu ctdv = new ChiTietDichVu(result.getString(30), result.getInt(31), dv);
				list_ctdv.add(ctdv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_ctdv;
	}
}
