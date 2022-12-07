package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import Connect.Connect;
import Enitity.DichVu;
import Enitity.KhachHang;

public class KhachHang_dao {
	public static ArrayList<KhachHang>getAllKhachHang(){
		ArrayList<KhachHang>dskh = new ArrayList<KhachHang>();
		Connection connection = null;
		Statement sm = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql = "select * from KhachHang";
			sm = connection.createStatement();
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next()) {
				String maKhachHang = rs.getString(1);
				String tenKhachHang = rs.getString(2);
				String gioiTinh = rs.getString(3);
				String sdt = rs.getString(4);
				String diaChi = rs.getString(5);
				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gioiTinh, sdt, diaChi);
				dskh.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sm!=null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return dskh;
	}
	public static void them(KhachHang kh) {
		Connection connection = null;
		PreparedStatement sm = null;
		ArrayList<KhachHang>dsnv = new ArrayList<KhachHang>();
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="insert into KhachHang(maKhachHang,tenKhachHang,gioiTinh,sdt,diaChi) values (?,?,?,?,?)";
			sm = connection.prepareCall(sql);
			sm.setString(1, kh.getMaKhachHang());
			sm.setString(2, kh.getTenKhachHang());
			sm.setString(3, kh.getGioiTinh());
			sm.setString(4, kh.getSdt());
			sm.setString(5, kh.getDiaChi());
			sm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sm!=null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	public static void xoa(String maKhachHang) {
		Connection connection = null;
		PreparedStatement sm = null;
		ArrayList<KhachHang>dsnv = new ArrayList<KhachHang>();
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="delete from KhachHang where maKhachHang=?";
			sm = connection.prepareCall(sql);
			sm.setString(1, maKhachHang);
			sm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sm!=null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void update(KhachHang kh) {
		Connection connection = null;
		PreparedStatement sm = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql ="update KhachHang set tenKhachHang=?, gioiTinh=?,sdt=? ,diaChi=? where maKhachHang=? ";
			sm = connection.prepareStatement(sql);
			
			sm.setString(1, kh.getTenKhachHang());
			sm.setString(2, kh.getGioiTinh());
			sm.setString(3, kh.getSdt());
			sm.setString(4, kh.getDiaChi());
			sm.setString(5, kh.getMaKhachHang());
			sm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sm != null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	///Nhan
	public static ArrayList<KhachHang> search(String maKhachHang,String tenKhachHang,String gioiTinh, String sdt){
		ArrayList dsKhachHang = new ArrayList<KhachHang>();
		try {
       		Connection con = Connect.getInstance().getConnection();
    		PreparedStatement preparedStatement = null;
    		preparedStatement = con.prepareStatement("select *from Khachhang where maKhachHang like '%"+maKhachHang+"%'and tenKhachHang like N'%"+tenKhachHang+"%' and gioiTinh like N'%"+gioiTinh+"%' and sdt like '%"+sdt+"%'");
    		ResultSet result = preparedStatement.executeQuery();
    		
    		while (result.next()) {
    		KhachHang khachhang = new KhachHang(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
    		dsKhachHang.add(khachhang);
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
           return dsKhachHang;
	}
	//
	public static ArrayList<KhachHang> findbyName(String tenKhachHang){
		Connection connection = null;
		PreparedStatement sm =null;
		ArrayList<KhachHang> dskh =  new ArrayList<KhachHang>();

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select *from KhachHang where tenKhachHang like ?";
			sm = connection.prepareCall(sql);
			sm.setString(1,"%"+tenKhachHang+"%");
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maKhachHang = rs.getString(1);
				tenKhachHang = rs.getString(2);
				String sdt = rs.getString(3);
				String gioiTinh = rs.getString(4);
				String diaChi = rs.getString(5);

				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gioiTinh, sdt, diaChi);
				dskh.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sm != null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return dskh;
		
	}
	public static ArrayList<KhachHang> find(String sdt){
		Connection connection = null;
		PreparedStatement sm =null;
		ArrayList<KhachHang> dskh =  new ArrayList<KhachHang>();

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select *from KhachHang where sdt like ?";
			sm = connection.prepareCall(sql);
			sm.setString(1,"%"+sdt+"%");
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maKhachHang = rs.getString(1);
				String tenKhachHang = rs.getString(2);
				sdt = rs.getString(3);
				String gioiTinh = rs.getString(4);
				String diaChi = rs.getString(5);

				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gioiTinh, sdt, diaChi);
				dskh.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sm != null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return dskh;
		
	}
	public static KhachHang findByPhone(String sdt){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select *from KhachHang where sdt like ?";
			sm = connection.prepareCall(sql);
			sm.setString(1,"%"+sdt+"%");
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				String maKhachHang = rs.getString(1);
				String tenKhachHang = rs.getString(2);
				sdt = rs.getString(4);
				String gioiTinh = rs.getString(3);
				String diaChi = rs.getString(5);
				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gioiTinh, sdt, diaChi);
				return kh;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sm != null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
		
	}
	public static KhachHang findByID(String id){
		Connection connection = null;
		PreparedStatement sm =null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
			String sql = "select *from KhachHang where maKhachHang like ?";
			sm = connection.prepareCall(sql);
			sm.setString(1,"%"+id+"%");
			ResultSet rs = sm.executeQuery();
			while(rs.next()) {
				 id = rs.getString(1);
				String tenKhachHang = rs.getString(2);
				String sdt = rs.getString(4);
				String gioiTinh = rs.getString(3);
				String diaChi = rs.getString(5);
				KhachHang kh = new KhachHang(id, tenKhachHang, gioiTinh, sdt, diaChi);
				return kh;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sm != null) {
				try {
					sm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
		
	}
//	public static DichVu findSL(String maDichVu){
//		Connection connection = null;
//		PreparedStatement sm =null;
//		DichVu dv = new DichVu();
//
//		try {
//			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke","sa","0123");
//			String sql = "select soLuong from DichVu where maDichVu like ?";
//			sm = connection.prepareCall(sql);
//			sm.setString(1,"%"+maDichVu+"%");
//			ResultSet rs = sm.executeQuery();
//			while(rs.next()) {
//				String maKhachHang =
//
//				KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gioiTinh, sdt, diaChi);
//				dskh.add(kh);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(sm != null) {
//				try {
//					sm.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		return dskh;
//		
//	}


}
