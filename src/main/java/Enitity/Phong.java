package Enitity;

public class Phong {
	private String maPhong;
	private String tenPhong;
	private String loaiPhong;
	private String trangThai;
	private int sucChua;
	private int dienTich;
	private Double giaPhong;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public int getDienTich() {
		return dienTich;
	}
	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}
	public Double getGiaPhong() {
		return giaPhong;
	}
	public void setGiaPhong(Double giaPhong) {
		this.giaPhong = giaPhong;
	}
	public Phong(String maPhong, String tenPhong, String loaiPhong, String trangThai, int sucChua, int dienTich,
			Double giaPhong) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
		this.trangThai = trangThai;
		this.sucChua = sucChua;
		this.dienTich = dienTich;
		this.giaPhong = giaPhong;
	}
	public Phong(String tenPhong, String loaiPhong, String trangThai, int sucChua, int dienTich, Double giaPhong) {
		super();
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
		this.trangThai = trangThai;
		this.sucChua = sucChua;
		this.dienTich = dienTich;
		this.giaPhong = giaPhong;
	}
	public Phong() {
		super();
	}
	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", loaiPhong=" + loaiPhong + ", trangThai="
				+ trangThai + ", sucChua=" + sucChua + ", dienTich=" + dienTich + ", giaPhong=" + giaPhong + "]";
	}
	
}
