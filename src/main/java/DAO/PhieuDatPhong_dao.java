package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.ChiTietDatPhong;
import Enitity.DatTruocPhong;
import Enitity.DichVu;
import Enitity.HoaDon;
import Enitity.KhachHang;
import Enitity.NhanVien;
import Enitity.Phong;

public class PhieuDatPhong_dao {
	public static ArrayList<DatTruocPhong> getAll(){
		
		ArrayList list_dt = new ArrayList<DatTruocPhong>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement(
					"select dt.maDatTruocPhong,dt.maPhong,kh.tenKhachHang,kh.sdt,dt.gioDatPhong,dt.ngayDatPhong,dt.gioNhanPhong,dt.thoiGianRa from DatTruocPhong dt join khachhang  kh on dt.maKhachhang = kh.makhachhang");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				Phong phong = new Phong(result.getString(2));
				KhachHang khachhang = new KhachHang(result.getString(3),result.getString(4));
				DatTruocPhong dt = new DatTruocPhong(result.getString(1), result.getDate(6), result.getTime(5), result.getTime(7), result.getTime(8),phong , khachhang);
				list_dt.add(dt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  list_dt;
	}
	
		public static ArrayList<DatTruocPhong> getMaDTP(String ma){
		
		ArrayList list_dt = new ArrayList<DatTruocPhong>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement(
					"select dt.maDatTruocPhong,dt.maPhong,kh.tenKhachHang,kh.sdt,dt.gioDatPhong,dt.ngayDatPhong,dt.gioNhanPhong,dt.thoiGianRa from DatTruocPhong dt join khachhang  kh on dt.maKhachhang = kh.makhachhang where dt.maDatTruocPhong = ?");
			preparedStatement.setString(1, ma);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				Phong phong = new Phong(result.getString(2));
				KhachHang khachhang = new KhachHang(result.getString(3),result.getString(4));
				DatTruocPhong dt = new DatTruocPhong(result.getString(1), result.getDate(6), result.getTime(5), result.getTime(7), result.getTime(8),phong , khachhang);
				list_dt.add(dt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  list_dt;
		
	}
	
		public static ArrayList<DatTruocPhong> getSDT(String sdt){
			
			ArrayList list_dt = new ArrayList<DatTruocPhong>();
			try {
				Connection con = Connect.getInstance().getConnection();
				PreparedStatement preparedStatement = null;
				preparedStatement = con.prepareStatement(
						"select dt.maDatTruocPhong,dt.maPhong,kh.tenKhachHang,kh.sdt,dt.gioDatPhong,dt.ngayDatPhong,dt.gioNhanPhong,dt.thoiGianRa from DatTruocPhong dt join khachhang  kh on dt.maKhachhang = kh.makhachhang where kh.sdt = ?");
				preparedStatement.setString(1, sdt);
				ResultSet result = preparedStatement.executeQuery();
				while (result.next()) {
					Phong phong = new Phong(result.getString(2));
					KhachHang khachhang = new KhachHang(result.getString(3),result.getString(4));
					DatTruocPhong dt = new DatTruocPhong(result.getString(1), result.getDate(6), result.getTime(5), result.getTime(7), result.getTime(8),phong , khachhang);
					list_dt.add(dt);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return  list_dt;

		}	
	
}
