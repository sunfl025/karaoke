package Enitity;

public class Authentication {
	private boolean isLogin;
	private TaiKhoan taikhoan;
	public Authentication(boolean isLogin, TaiKhoan taikhoan) {
		super();
		this.isLogin = isLogin;
		this.taikhoan = taikhoan;
	}

	public boolean isLogin() {
		return isLogin;
	}
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	public TaiKhoan getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(TaiKhoan taikhoan) {
		this.taikhoan = taikhoan;
	}
	@Override
	public String toString() {
		return "Authentication [isLogin=" + isLogin + ", taikhoan=" + taikhoan + "]";
	}
	
	
}
