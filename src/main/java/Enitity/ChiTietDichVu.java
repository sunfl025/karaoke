package Enitity;

public class ChiTietDichVu {
	private String maChiTietDichVu;
	private int soLuongSanPham;
	private DichVu dichvu;
	private Phong phong;
	public ChiTietDichVu(String maChiTietDichVu, int soLuongSanPham, DichVu dichvu, Phong phong) {
		super();
		this.maChiTietDichVu = maChiTietDichVu;
		this.soLuongSanPham = soLuongSanPham;
		this.dichvu = dichvu;
		this.phong = phong;
	}
	public ChiTietDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaChiTietDichVu() {
		return maChiTietDichVu;
	}
	public void setMaChiTietDichVu(String maChiTietDichVu) {
		this.maChiTietDichVu = maChiTietDichVu;
	}
	public int getSoLuongSanPham() {
		return soLuongSanPham;
	}
	public void setSoLuongSanPham(int soLuongSanPham) {
		this.soLuongSanPham = soLuongSanPham;
	}
	public DichVu getDichvu() {
		return dichvu;
	}
	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	@Override
	public String toString() {
		return "ChiTietDichVu [maChiTietDichVu=" + maChiTietDichVu + ", soLuongSanPham=" + soLuongSanPham + ", dichvu="
				+ dichvu + ", phong=" + phong + "]";
	}
	
	
}
