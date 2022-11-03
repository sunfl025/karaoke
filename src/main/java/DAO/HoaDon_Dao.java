package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.ChiTietDatPhong;
import Enitity.DichVu;
import Enitity.HoaDon;
import Enitity.KhachHang;
import Enitity.NhanVien;
import Enitity.TaiKhoan;


public class HoaDon_Dao {
	
	public static ArrayList<HoaDon> getAll() {
		ArrayList list_hd = new ArrayList<HoaDon>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select hd.maHoaDon,hd.ngayLapHoaDon,kh.[tenKhachHang],kh.sdt,nv.[tenNhanVien],dp.maChiTietDatPhong"
					+ "	from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				NhanVien nv = new NhanVien(result.getString(5));
				KhachHang kh = new KhachHang(result.getString(3),result.getString(4));
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getString(6));
				HoaDon hd = new HoaDon(result.getString(1), result.getDate(2),nv , kh, ctdp);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
	public static ArrayList<HoaDon> getAll2() {
		ArrayList list_hd = new ArrayList<HoaDon>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select maHoaDon,ngayLapHoaDon,kh.tenKhachHang,kh.sdt,nv.tenNhanVien,v.soLuong,v.gia"
					+ "	from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
					+ "	join Phong p on p.maPhong=dp.maPhong"
					+ "	join ChiTietDichVu dv on dv.maPhong=p.maPhong"
					+ "	join DichVu v on v.maDichVu=dv.maDichVu"
					+ "");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				NhanVien nv = new NhanVien(result.getString(5));
				KhachHang kh = new KhachHang(result.getString(3),result.getString(4));
			    DichVu dv = new DichVu(result.getInt(6), result.getDouble(7));
				HoaDon hd = new HoaDon(result.getString(1), result.getDate(2), nv, kh, dv);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
	public static ArrayList<HoaDon> searchMaHD(String keyword) {
		ArrayList list_hd = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select hd.maHoaDon,hd.ngayLapHoaDon,kh.[tenKhachHang],kh.sdt,nv.[tenNhanVien],dp.maChiTietDatPhong"
			+ "	from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong where hd.maHoaDon = ?");
			preparedStatement.setString(1, keyword);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				
				NhanVien nv = new NhanVien(result.getString(5));
				KhachHang kh = new KhachHang(result.getString(3),result.getString(4));
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getString(6));
				HoaDon hd = new HoaDon(result.getString(1), result.getDate(2),nv , kh, ctdp);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
	
	public static ArrayList<HoaDon> searchTenKh(String keyword) {
		ArrayList list_hd = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select hd.maHoaDon,hd.ngayLapHoaDon,kh.[tenKhachHang],kh.sdt,nv.[tenNhanVien],dp.maChiTietDatPhong"
			+ "	from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong where kh.tenKhachHang like ?");
			preparedStatement.setString(1, "%" +keyword + "%");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				
				NhanVien nv = new NhanVien(result.getString(5));
				KhachHang kh = new KhachHang(result.getString(3),result.getString(4));
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getString(6));
				HoaDon hd = new HoaDon(result.getString(1), result.getDate(2),nv , kh, ctdp);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
	
	public static ArrayList<HoaDon> searchSDT(String keyword) {
		ArrayList list_hd = new ArrayList<NhanVien>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select hd.maHoaDon,hd.ngayLapHoaDon,kh.[tenKhachHang],kh.sdt,nv.[tenNhanVien],dp.maChiTietDatPhong"
			+ "	from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong where kh.sdt = ?");
			preparedStatement.setString(1, keyword);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				
				NhanVien nv = new NhanVien(result.getString(5));
				KhachHang kh = new KhachHang(result.getString(3),result.getString(4));
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getString(6));
				HoaDon hd = new HoaDon(result.getString(1), result.getDate(2),nv , kh, ctdp);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
//	public static ArrayList<KhachHang> searchTenKH(String keyword) {
//		ArrayList list_kh = new ArrayList<NhanVien>();
//		try {
//			Connection con = Connect.getInstance().getConnection();
//			PreparedStatement preparedStatement = null;
//			preparedStatement = con.prepareStatement("select * from HoaDon inner join KhachHang on HoaDon.maKhachHang = KhachHang.maKhachHang "  );
//			preparedStatement.setString(1,"%" + keyword + "%" );
//			ResultSet result = preparedStatement.executeQuery();
//			while (result.next()) {
//				TaiKhoan taiKhoan = new TaiKhoan(result.getString(7));
//			
//				HoaDon hoadon = new HoaDon
//				
//				list_nv.add(nv);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list_nv;
//	}
	
	
	
}
