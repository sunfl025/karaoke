package Enitity;



import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;


public class DatTruocPhong {
	private String maDatTruocPhong;
	private Date ngayDatPhong;
	private Time gioDatPhong;
	private Time gioNhanPhong;
	private Time thoiGianRa;
	private Phong maPhong;
	private KhachHang maKhachHang;
	
	public String getMaDatTruocPhong() {
		return maDatTruocPhong;
	}
	public void setMaDatTruocPhong(String maDacTruocPhong) {
		this.maDatTruocPhong = maDacTruocPhong;
	}
	public Date getNgayDatPhong() {
		return ngayDatPhong;
	}
	public void setNgayDatPhong(Date ngayDatPhong) {
		this.ngayDatPhong = ngayDatPhong;
	}
	public Time getGioDatPhong() {
		return gioDatPhong;
	}
	public void setGioDatPhong(Time gioDatPhong) {
		this.gioDatPhong = gioDatPhong;
	}
	public Time getGioNhanPhong() {
		return gioNhanPhong;
	}
	public void setGioNhanPhong(Time gioNhanPhong) {
		this.gioNhanPhong = gioNhanPhong;
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
	
	public KhachHang getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(KhachHang maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	
	
	public DatTruocPhong(String maDatTruocPhong, Date ngayDatPhong, Time gioDatPhong, Time gioNhanPhong,
			Time thoiGianRa, Phong maPhong, KhachHang maKhachHang) {
		super();
		this.maDatTruocPhong = maDatTruocPhong;
		this.ngayDatPhong = ngayDatPhong;
		this.gioDatPhong = gioDatPhong;
		this.gioNhanPhong = gioNhanPhong;
		this.thoiGianRa = thoiGianRa;
		this.maPhong = maPhong;
		this.maKhachHang = maKhachHang;
	}
	
	public DatTruocPhong(Phong maPhong, KhachHang maKhachHang) {
		super();
		this.maPhong = maPhong;
		this.maKhachHang = maKhachHang;
	}
	public DatTruocPhong(String maDacTruocPhong) {
		super();
		this.maDatTruocPhong = maDacTruocPhong;
	}
	
	
	public DatTruocPhong() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
	public DatTruocPhong(String maDacTruocPhong, Date ngayDatPhong, Time gioDatPhong, KhachHang maKhachHang) {
		super();
		this.maDatTruocPhong = maDacTruocPhong;
		this.ngayDatPhong = ngayDatPhong;
		this.gioDatPhong = gioDatPhong;
		this.maKhachHang = maKhachHang;
	}
	public DatTruocPhong(KhachHang maKhachHang) {
		super();
		this.maKhachHang = maKhachHang;
	}
	public DatTruocPhong(String maDacTruocPhong, Date ngayDatPhong, Time gioDatPhong, Phong maPhong,
			KhachHang maKhachHang) {
		super();
		this.maDatTruocPhong = maDacTruocPhong;
		this.ngayDatPhong = ngayDatPhong;
		this.gioDatPhong = gioDatPhong;
		this.maPhong = maPhong;
		this.maKhachHang = maKhachHang;
	}
	
	///
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "DatTruocPhong [maDacTruocPhong=" + maDatTruocPhong + ", ngayDatPhong=" + ngayDatPhong + ", gioDatPhong="
				+ gioDatPhong + ", gioNhanPhong=" + gioNhanPhong + ", thoiGianRa=" + thoiGianRa + ", maPhong=" + maPhong
				+ ", maKhachHang=" + maKhachHang + "]";
	}
	public double ThanhToanTruoc() {
		return 0;
	}
}
