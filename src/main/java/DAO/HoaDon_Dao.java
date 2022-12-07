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
		ArrayList list_hd = new ArrayList<HoaDon>();
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
		ArrayList list_hd = new ArrayList<HoaDon>();
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
		ArrayList list_hd = new ArrayList<HoaDon>();
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
	public static ArrayList<HoaDon> getAllThongKeHoaDonTheoKhachHang() {
		ArrayList list_hd = new ArrayList<HoaDon>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select * from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "					 	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "					 	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
					+ "					 	join Phong p on p.maPhong=dp.maPhong"
					
					+ "						where dp.thoiGianRa is not null"
					 );
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				NhanVien nv = new NhanVien(result.getString(12),result.getString(13));
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
	
	public static ArrayList<ChiTietDichVu> getChiTietDichVuCuaHoaDon(String maHD) {
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
					+ "						where hd.maHoaDon like '%"+maHD+"%' and dp.thoiGianRa is not null "
					 );
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				DichVu dv = new DichVu( result.getString(35), result.getDouble(38));
				ChiTietDichVu ctdv = new ChiTietDichVu(result.getString(30), result.getInt(31), dv);
				list_ctdv.add(ctdv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_ctdv;
	}
	
	
}
