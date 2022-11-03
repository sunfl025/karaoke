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

public class ChiTietHoaDon_Dao {
	public static ArrayList<HoaDon> getAll() {
		ArrayList list_hd = new ArrayList<HoaDon>();
		try {
			Connection con = Connect.getInstance().getConnection();
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement("select maHoaDon,nv.tenNhanVien,kh.tenKhachHang,dp.thoiGianVao,dp.thoiGianRa,v.tenDichVu,v.soLuong,v.gia"
					+ "	from HoaDon hd join KhachHang kh on hd.maKhachHang=kh.maKhachHang"
					+ "	join NhanVien nv on nv.maNhanVien=hd.maNhanVien"
					+ "	join ChiTietDatPhong dp on hd.maChiTietDatPhong=dp.maChiTietDatPhong"
					+ "	join Phong p on p.maPhong=dp.maPhong "
					+ "	join ChiTietDichVu dv on dv.maPhong=p.maPhong"
					+ "	join DichVu v on v.maDichVu=dv.maDichVu");
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				NhanVien nv = new NhanVien(result.getString(2));
				KhachHang kh = new KhachHang(result.getString(3));
				
				ChiTietDatPhong ctdp = new ChiTietDatPhong(result.getTime(4),result.getTime(5));
				DichVu dv = new DichVu(result.getString(6), result.getInt(7), result.getDouble(8));
				HoaDon hd = new HoaDon(result.getString(1), nv, kh, ctdp, dv);
				list_hd.add(hd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hd;
	}
}
