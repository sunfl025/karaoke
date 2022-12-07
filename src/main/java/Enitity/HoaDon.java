package Enitity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Lenovo
 *
 */
public class HoaDon {
	private String maHoaDon;
	private Date ngayLapHoaDon;
	private NhanVien nhanvien;
	private KhachHang khachhang;
	private ChiTietDatPhong chiTietDatPhong;
	private Phong phong;
	private DichVu dichvu;
	private ArrayList<ChiTietDichVu> chitietdichvu;
	
	public HoaDon(String maHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
	}









	public HoaDon(String maHoaDon, Date ngayLapHoaDon, NhanVien nhanvien, KhachHang khachhang,
			ChiTietDatPhong chiTietDatPhong, Phong phong, ArrayList<ChiTietDichVu> chitietdichvu) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.chiTietDatPhong = chiTietDatPhong;
		this.phong = phong;
		this.chitietdichvu = chitietdichvu;
	}









	public HoaDon(String maHoaDon, Date ngayLapHoaDon, NhanVien nhanvien, KhachHang khachhang,
			ChiTietDatPhong chiTietDatPhong, DichVu dichvu) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.chiTietDatPhong = chiTietDatPhong;
		this.dichvu = dichvu;
	}







	public HoaDon(String maHoaDon, Date ngayLapHoaDon, NhanVien nhanvien, KhachHang khachhang,
			ChiTietDatPhong chiTietDatPhong) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.chiTietDatPhong = chiTietDatPhong;
	}







	public HoaDon(String maHoaDon, Date ngayLapHoaDon, NhanVien nhanvien, KhachHang khachhang, DichVu dichvu) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.dichvu = dichvu;
	}







	public HoaDon(String maHoaDon, NhanVien nhanvien, KhachHang khachhang, ChiTietDatPhong chiTietDatPhong,
			DichVu dichvu) {
		super();
		this.maHoaDon = maHoaDon;
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.chiTietDatPhong = chiTietDatPhong;
		this.dichvu = dichvu;
	}














//
	public HoaDon(String maHoaDon, NhanVien nhanvien, KhachHang khachhang, ChiTietDatPhong chiTietDatPhong, Phong phong,
			DichVu dichvu) {
		super();
		this.maHoaDon = maHoaDon;
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.chiTietDatPhong = chiTietDatPhong;
		this.phong = phong;
		this.dichvu = dichvu;
	}
//








	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}





	

	public ArrayList<ChiTietDichVu> getChitietdichvu() {
		return chitietdichvu;
	}









	public void setChitietdichvu(ArrayList<ChiTietDichVu> chitietdichvu) {
		this.chitietdichvu = chitietdichvu;
	}









	public String getMaHoaDon() {
		return maHoaDon;
	}







	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}







	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}







	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}







	public NhanVien getNhanvien() {
		return nhanvien;
	}







	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}







	public KhachHang getKhachhang() {
		return khachhang;
	}







	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}







	public ChiTietDatPhong getChiTietDatPhong() {
		return chiTietDatPhong;
	}







	public void setChiTietDatPhong(ChiTietDatPhong chiTietDatPhong) {
		this.chiTietDatPhong = chiTietDatPhong;
	}







	public Phong getPhong() {
		return phong;
	}







	public void setPhong(Phong phong) {
		this.phong = phong;
	}







	public DichVu getDichvu() {
		return dichvu;
	}







	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}







	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", ngayLapHoaDon=" + ngayLapHoaDon + ", nhanvien=" + nhanvien
				+ ", khachhang=" + khachhang + ", chiTietDatPhong=" + chiTietDatPhong + "]";
	}

	
	
	
}
