package Enitity;

public class KhachHang {
	private String maKhachHang;
	private String tenKhachHang;
	private String gioiTinh;
	private String sdt;
	private String diaChi;
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String maKhachHang, String tenKhachHang, String gioiTinh, String sdt, String diaChi) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}
	
	

	
	public KhachHang(String maKhachHang, String tenKhachHang, String sdt) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.sdt = sdt;
	}
	
	///
	
	public KhachHang(String tenKhachHang, String gioiTinh, String sdt, String diaChi) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}
	//Moi
	
	//////////
	public KhachHang(String tenKhachHang, String sdt) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.sdt = sdt;
	}
	
	public KhachHang(String maKhachHang) {
		super();
		this.maKhachHang = maKhachHang;
	}
	
	
	
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", gioiTinh=" + gioiTinh
				+ ", sdt=" + sdt + ", diaChi=" + diaChi + "]";
	}
	
}
