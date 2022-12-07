/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import DAO.ChiTietDatPhong_Dao;
import DAO.KhachHang_dao;
import DAO.Phong_dao;
import Enitity.Authentication;
import Enitity.ChiTietDatPhong;
import Enitity.KhachHang;
import Enitity.Phong;

/**
 *
 * @author vanng
 */
public class DatPhong extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form DatPhong
     */
    public DatPhong() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_thoiGianVao = new javax.swing.JTextField();
        txt_sucChua = new javax.swing.JTextField();
        txt_giaPhong = new javax.swing.JTextField();
        txt_loaiPhong = new javax.swing.JTextField();
        txt_tenPhong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ngayDat = new de.wannawork.jcalendar.JCalendarComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_tenKhachHang = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        btn_datPhong = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Đặt phòng");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Phòng"));

        jLabel2.setText("Tên phòng:");

        jLabel3.setText("Loại phòng:");

        jLabel4.setText("Giá phòng:");

        jLabel5.setText("Sức chứa:");

        jLabel6.setText("Thời gian vào:");

        txt_thoiGianVao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_thoiGianVao.setBorder(null);

        txt_sucChua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_sucChua.setBorder(null);

        txt_giaPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_giaPhong.setBorder(null);

        txt_loaiPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_loaiPhong.setBorder(null);

        txt_tenPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tenPhong.setBorder(null);

        jLabel9.setText("Ngày đặt:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_thoiGianVao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(txt_sucChua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_giaPhong, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_loaiPhong, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tenPhong)
                    .addComponent(txt_ngayDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_giaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_sucChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_thoiGianVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txt_ngayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Khách hàng"));

        jLabel7.setText("Tên khách hàng:");

        jLabel8.setText("Số điện thoại:");

        txt_tenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tenKhachHang.setBorder(null);

        txt_sdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_sdt.setBorder(null);
        txt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtActionPerformed(evt);
            }
        });

        btn_timKiem.setText("Tìm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_sdt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_timKiem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_datPhong.setBackground(new java.awt.Color(0, 255, 51));
        btn_datPhong.setText("Đặt phòng");

        btn_thoat.setBackground(new java.awt.Color(255, 0, 0));
        btn_thoat.setText("Thoát");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_datPhong)
                .addGap(18, 18, 18)
                .addComponent(btn_thoat)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_datPhong)
                    .addComponent(btn_thoat))
                .addGap(21, 21, 21))
        );
        txt_ngayDat.setEnabled(false);;
        btn_timKiem.addActionListener(this);
        btn_datPhong.addActionListener(this);
        btn_thoat.addActionListener(this);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datPhong;
    private javax.swing.JButton btn_dichVu;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timKiem;
    private de.wannawork.jcalendar.JCalendarComboBox txt_ngayDat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_giaPhong;
    private javax.swing.JTextField txt_loaiPhong;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_sucChua;
    private javax.swing.JTextField txt_tenKhachHang;
    private javax.swing.JTextField txt_tenPhong;
    private javax.swing.JTextField txt_thoiGianVao;
    private String ma;
    private String loai;
	private static Authentication auth = null;

    public String sdt;
    public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}
	
	 
	// End of variables declaration//GEN-END:variables
    public void getValues(String maPhong) {
    	Phong p = Phong_dao.findbyId(maPhong);
    	txt_tenPhong.setText(p.getTenPhong());
    	txt_loaiPhong.setText(p.getLoaiPhong());
    	txt_sucChua.setText(String.valueOf(p.getSucChua()));
    	txt_giaPhong.setText(String.valueOf(p.getGiaPhong()));
    	txt_thoiGianVao.setText(String.valueOf(Time.valueOf(LocalTime.now())));	
    	txt_ngayDat.setDate(Date.valueOf(LocalDate.now()));
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btn_datPhong)) {
			int select = JOptionPane.showConfirmDialog(this, "Bạn muốn đặt phòng ?");
			if(select ==JOptionPane.YES_OPTION) {
				datPhong();
		    	this.dispose();
			}
			else {
				JOptionPane.showMessageDialog(this, "Thêm không thành công");
				this.dispose();
			}
		}
		if(o.equals(btn_timKiem))
			tim();
		if(o.equals(btn_thoat)) {
			this.dispose();
		}
	}

	private void datPhong() {
    	String ex ="DP";
    	int min = 9999;
    	int max = 1000;
    	int random_int = (int)(Math.random() * (max - min + 1) + min);
    	String maChiTietDatPhong=ex+random_int; 
    	String maPhong = ma; 
    	Phong p = Phong_dao.findbyId(maPhong);
    	if(txt_sdt.equals("")){
    		JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại");
    		txt_sdt.setRequestFocusEnabled(true);
    	}
    	String sdt = txt_sdt.getText();
    	KhachHang kh = KhachHang_dao.findByPhone(sdt);
    	Date ngay = Date.valueOf(LocalDate.now());
    	ChiTietDatPhong dp = new ChiTietDatPhong(maChiTietDatPhong, null, null, ngay, p, kh);
    	ChiTietDatPhong_Dao.them(dp);
    	
    	
    	String trangThai = "Phòng đang sử dụng";
    	Phong up = new Phong(p.getMaPhong(), trangThai);
    	Phong_dao.updateTrangThaiPhong(up);
    	QuanLyDanhSachPhong ql = new QuanLyDanhSachPhong();
    	ql.setLoai(ex);
    	ChiTietTinhTien tt = new ChiTietTinhTien();
    	tt.setLoai(ex);
    	
	}

	private void tim() {
		String sdt = txt_sdt.getText();
		if(sdt.equals(""))
		{
			JOptionPane.showMessageDialog(this, "Vui nhập số điện thoại !!!");
		}
		else {
			KhachHang kh = KhachHang_dao.findByPhone(sdt);
			if(kh == null) {
				int select = JOptionPane.showConfirmDialog(this, "Không tìm thấy khách hàng ! Bạn có muốn thêm ?");
				if(select==JOptionPane.YES_OPTION) {
					ThemThongTinKhachHang tt = new ThemThongTinKhachHang();
					tt.setVisible(true);
					tt.setMa(ma);
					lamTrong();
					this.dispose();
				}
			}else {
				txt_tenKhachHang.setText(kh.getTenKhachHang());
				txt_sdt.setText(kh.getSdt());
			}
		}	
	}

	private void lamTrong() {
		txt_sdt.setText("");
		
	}

	public void getValuesKh(KhachHang k) {
		txt_tenKhachHang.setText(k.getTenKhachHang());
		txt_sdt.setText(k.getSdt());
		
	}
	
	
}
