package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.Connect;
import Enitity.DichVu;

public class DichVu_dao {
	
	public ArrayList<DichVu> getAll(){
		ArrayList dsDichVu = new ArrayList<DichVu>();
           try {
       		Connection con = Connect.getInstance().getConnection();
    		PreparedStatement preparedStatement = null;
    		preparedStatement = con.prepareStatement("select * from DichVu");
    		ResultSet result = preparedStatement.executeQuery();
    		
    		while (result.next()) {
    		DichVu dichvu = new DichVu(result.getString(2),result.getString(1),result.getString(3),
    				result.getInt(4),Double.parseDouble(result.getString(5)));
    		dsDichVu.add(dichvu);
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
           return dsDichVu;
	}

	public ArrayList<DichVu> search(String maDichVu,String tenDichVu,String loaiDichVu){
		ArrayList dsDichVu = new ArrayList<DichVu>();
		try {
       		Connection con = Connect.getInstance().getConnection();
    		PreparedStatement preparedStatement = null;
    		preparedStatement = con.prepareStatement("select * from DichVu where maDichVu like '%"
    		+maDichVu+"%' and tenDichVu like N'%"+tenDichVu+"%' and loaiDichVu like N'%"+loaiDichVu+"%'");
    		ResultSet result = preparedStatement.executeQuery();
    		
    		while (result.next()) {
    		DichVu dichvu = new DichVu(result.getString(2),result.getString(1),result.getString(3),
    				result.getInt(4),Double.parseDouble(result.getString(5)));
    		dsDichVu.add(dichvu);
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
           return dsDichVu;
	}
	

	public static boolean Them(DichVu dv) {
		Connection connection = null;
		PreparedStatement sm = null;
		ArrayList<DichVu>dsnv = new ArrayList<DichVu>();
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKaraoke", "sa", "0123");
			String sql ="insert into DichVu(loaiDichVu, maDichVu, tenDichVu,soLuong,Gia) values (?,?,?,?,?)";
			sm = connection.prepareCall(sql);
			sm.setString(1, dv.getLoaiDichVu());
			sm.setString(2, dv.getMaDichVu());
			sm.setString(3, dv.getTenDichVu());
			sm.setInt(4, dv.getSoLuong());
			sm.setDouble(5, dv.getGia());
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
					return true;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public ArrayList<DichVu> searchCapNhatDichVu(String maDichVu,String tenDichVu){
		ArrayList dsDichVu = new ArrayList<DichVu>();
		try {
       		Connection con = Connect.getInstance().getConnection();
    		PreparedStatement preparedStatement = null;
    		preparedStatement = con.prepareStatement("select * from DichVu where maDichVu like '%"
    		+maDichVu+"%' and tenDichVu like N'%"+tenDichVu+"%'");
    		ResultSet result = preparedStatement.executeQuery();
    		
    		while (result.next()) {
    		DichVu dichvu = new DichVu(result.getString(2),result.getString(1),result.getString(3),
    				result.getInt(4),Double.parseDouble(result.getString(5)));
    		dsDichVu.add(dichvu);
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
           return dsDichVu;
	}
	public ArrayList<DichVu> getChiTietDichVu(String maPhong){
		ArrayList dsDichVu = new ArrayList<DichVu>();
           try {
       		Connection con = Connect.getInstance().getConnection();
    		PreparedStatement preparedStatement = null;
    		preparedStatement = con.prepareStatement
    				("select * from DichVu dv , ChiTietDichVu ctdv where dv.maDichVu=ctdv.maDichVu and maPhong like '"+maPhong+"';");
    		ResultSet result = preparedStatement.executeQuery();
    		
    		while (result.next()) {
    		DichVu dichvu = new DichVu(result.getString(2),result.getString(1),result.getString(3),
    				result.getInt(7),Double.parseDouble(result.getString(5)));
    		dsDichVu.add(dichvu);
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
           return dsDichVu;
	}
	
	public int getSoLuongSanPham(String maDV) {
		ArrayList dsDichVu = new ArrayList<DichVu>();
		int soluong =0;
		Connection connection = null;
		PreparedStatement sm = null;

        try {
    	 Connection con = Connect.getInstance().getConnection();
 		PreparedStatement preparedStatement = null;
 		preparedStatement = con.prepareStatement("Select * from ChiTietDichVu where maDichVu = '"+maDV+"';");
 		ResultSet result = preparedStatement.executeQuery();
 		
 		soluong = result.getInt(2);

		} catch (SQLException e) {
			e.printStackTrace();
		}
        return soluong;

	}
	
	public boolean delete(String maDichVu) {
		Connection con = Connect.getInstance().getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = con.prepareStatement("delete DichVu where maDichVu = ?");
			preparedStatement.setString(1, maDichVu);
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
