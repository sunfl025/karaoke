package Enitity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

public class ChiTietDatPhong {
	private String maChiTietDatPhong;
	private Time thoiGianVao;
	private Time thoiGianRa;
	private Date ngayDat;
	private Phong maPhong;
	private KhachHang khachHang;
	
	
	//Thêm mới
	public Date getNgayDat() {
		return ngayDat;
	}


	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}


	public ChiTietDatPhong(Time thoiGianVao, Time thoiGianRa) {
		super();
		this.thoiGianVao = thoiGianVao;
		this.thoiGianRa = thoiGianRa;
	}
	
	
	public KhachHang getKhachHang() {
		return khachHang;
	}


	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}


	public String getMaChiTietDatPhong() {
		return maChiTietDatPhong;
	}
	public void setMaChiTietDatPhong(String maChiTietDatPhong) {
		this.maChiTietDatPhong = maChiTietDatPhong;
	}
	public Time getThoiGianVao() {
		return thoiGianVao;
	}
	public void setThoiGianVao(Time thoiGianVao) {
		this.thoiGianVao = thoiGianVao;
	}
	public Time getThoiGianRa() {
		return thoiGianRa;
	}
	public void setThoiGianRa(Time thoiGianRa) {
		this.thoiGianRa = thoiGianRa;
	}
	public Phong getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(Phong maPhong) {
		this.maPhong = maPhong;
	}
	public ChiTietDatPhong(String maChiTietDatPhong, Time thoiGianVao, Time thoiGianRa, Phong maPhong) {
		super();
		this.maChiTietDatPhong = maChiTietDatPhong;
		this.thoiGianVao = thoiGianVao;
		this.thoiGianRa = thoiGianRa;
		this.maPhong = maPhong;
	}
	public ChiTietDatPhong() {
		// TODO Auto-generated constructor stub
	}
	
	public ChiTietDatPhong(String maChiTietDatPhong) {
		super();
		this.maChiTietDatPhong = maChiTietDatPhong;
	}
	///
	public ChiTietDatPhong(String maChiTietDatPhong, Time thoiGianVao, Time thoiGianRa, Phong maPhong,
			KhachHang khachHang) {
		super();
		this.maChiTietDatPhong = maChiTietDatPhong;
		this.thoiGianVao = thoiGianVao;
		this.thoiGianRa = thoiGianRa;
		this.maPhong = maPhong;
		this.khachHang = khachHang;
	}
	public ChiTietDatPhong(String maChiTietDatPhong, Time thoiGianVao, Phong maPhong, KhachHang khachHang) {
		super();
		this.maChiTietDatPhong = maChiTietDatPhong;
		this.thoiGianVao = thoiGianVao;
		this.maPhong = maPhong;
		this.khachHang = khachHang;
	}
	
	
	
	public ChiTietDatPhong(String maChiTietDatPhong, Time thoiGianVao, Time thoiGianRa, Date ngayDat, Phong maPhong,
			KhachHang khachHang) {
		super();
		this.maChiTietDatPhong = maChiTietDatPhong;
		this.thoiGianVao = thoiGianVao;
		this.thoiGianRa = thoiGianRa;
		this.ngayDat = ngayDat;
		this.maPhong = maPhong;
		this.khachHang = khachHang;
	}


	@Override
	public String toString() {
		return "ChiTietDatPhong [maChiTietDatPhong=" + maChiTietDatPhong + ", thoiGianVao=" + thoiGianVao
				+ ", thoiGianRa=" + thoiGianRa + ", maPhong=" + maPhong + "]";
	}
	
	
	
}