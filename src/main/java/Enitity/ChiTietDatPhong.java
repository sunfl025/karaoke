package Enitity;

import java.sql.Time;
import java.time.LocalTime;

public class ChiTietDatPhong {
	private String maChiTietDatPhong;
	private Time thoiGianVao;
	private Time thoiGianRa;
	private Phong maPhong;
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
	@Override
	public String toString() {
		return "ChiTietDatPhong [maChiTietDatPhong=" + maChiTietDatPhong + ", thoiGianVao=" + thoiGianVao
				+ ", thoiGianRa=" + thoiGianRa + ", maPhong=" + maPhong + "]";
	}
	
	
	
}
