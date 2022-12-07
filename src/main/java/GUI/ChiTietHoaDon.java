/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.ChiTietHoaDon_Dao;
import DAO.HoaDon_Dao;
import Enitity.ChiTietDichVu;
import Enitity.HoaDon;

/**
 *
 * @author Lenovo
 */
public class ChiTietHoaDon extends javax.swing.JFrame {

    
	/**
     * Creates new form ChiTietHD
     */
    public ChiTietHoaDon(String mahoadon) {
        initComponents();
        selectDv(mahoadon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tennv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tenkh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_thoigianvao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_thoigianra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_mahoadon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_tongtien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_tongtienthanhtoan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_xuathoadon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("HÓA ĐƠN TÍNH TIỀN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Nhân viên : ");

        txt_tennv.setBackground(new java.awt.Color(204, 204, 255));
        txt_tennv.setText("Tên nhân viên");
        txt_tennv.setBorder(null);
        txt_tennv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tennvActionPerformed(evt);
            }
        });

        jLabel3.setText("Khách hàng : ");

        txt_tenkh.setBackground(new java.awt.Color(204, 204, 255));
        txt_tenkh.setText("Tên khách hàng");
        txt_tenkh.setBorder(null);
        txt_tenkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenkhActionPerformed(evt);
            }
        });

        jLabel4.setText("Thời gian vào : ");

        txt_thoigianvao.setBackground(new java.awt.Color(204, 204, 255));
        txt_thoigianvao.setText("................................................................");
        txt_thoigianvao.setBorder(null);
        txt_thoigianvao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_thoigianvaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Thời gian ra :");

        txt_thoigianra.setBackground(new java.awt.Color(204, 204, 255));
        txt_thoigianra.setText(".................................................................");
        txt_thoigianra.setBorder(null);

        table.setBackground(new java.awt.Color(199, 199, 231));
        String[] headers = "STT;Tên;Số lượng;Đơn giá;Thành tiền".split(";");
        tableModel = new DefaultTableModel(headers, 0);
        table.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(table = new JTable(tableModel));
//        jScrollPane1.setViewportView(table_cthd);

        jLabel6.setText("Mã hóa đơn : ");

        txt_mahoadon.setBackground(new java.awt.Color(204, 204, 255));
        txt_mahoadon.setText("HDXXXX");
        txt_mahoadon.setBorder(null);

        jLabel7.setText("Tên quán :          Karaoke KOKO");

        jLabel8.setText("Tổng tiền :");

        txt_tongtien.setBackground(new java.awt.Color(204, 204, 255));
        txt_tongtien.setText("2xxxxVND");
        txt_tongtien.setBorder(null);
        txt_tongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tongtienActionPerformed(evt);
            }
        });

        jLabel9.setText("Thuế VAT :                        10%");

        jLabel10.setText("Tổng tiền thanh toán :");

        txt_tongtienthanhtoan.setBackground(new java.awt.Color(204, 204, 255));
        txt_tongtienthanhtoan.setText("23XXXXVND");
        txt_tongtienthanhtoan.setBorder(null);
        txt_tongtienthanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tongtienthanhtoanActionPerformed(evt);
            }
        });

        jLabel11.setText("Địa chỉ :              số 2,Nguyễn Văn Bảo,Gò Vấp");

        btn_xuathoadon.setText("Xuất hóa đơn");
        btn_xuathoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuathoadonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tennv)
                    .addComponent(txt_tenkh, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_thoigianvao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_thoigianra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_mahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tongtienthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_xuathoadon)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_thoigianvao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_thoigianra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_mahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_tongtienthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(btn_xuathoadon)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold> 
//    private void selectDv(String mahoadon)
//    {
//    	int thoigianvao = 0;
//		int thoigianra = 0;
//		int thoigiandatphong = 0;
//
//    	Double  tongtien=0.0;
//    	Double tongtienthanhtoan = 0.0;
//    	list_hd = ChiTietHoaDon_Dao.getIdforAll(mahoadon);
//		tableModel.setRowCount(0);
//		for(HoaDon hd : list_hd) {
//			
//			txt_tennv.setText(hd.getNhanvien().getTenNhanVien());
//			txt_tenkh.setText(hd.getKhachhang().getTenKhachHang());
//			txt_thoigianvao.setText(hd.getChiTietDatPhong().getThoiGianVao().toString());
//			txt_thoigianra.setText(hd.getChiTietDatPhong().getThoiGianRa().toString());
//			txt_mahoadon.setText(hd.getMaHoaDon());
//			Double thanhtien = hd.getDichvu().getSoLuong() * hd.getDichvu().getGia();
//			tongtien += thanhtien;
//			txt_tongtien.setText(tongtien.toString() );
//			tongtienthanhtoan = tongtien + (tongtien * 0.1);
//			txt_tongtienthanhtoan.setText(tongtienthanhtoan.toString() );
//			tableModel.addRow(new Object[] {
//					tableModel.getRowCount() + 1,
//					hd.getDichvu().getTenDichVu(),
//					hd.getDichvu().getSoLuong(),
//					hd.getDichvu().getGia(),
//					thanhtien
//				
//			});
//			thoigianvao = (hd.getChiTietDatPhong().getThoiGianVao().getMinutes()+hd.getChiTietDatPhong().getThoiGianVao().getHours()*60);
//			thoigianra = (hd.getChiTietDatPhong().getThoiGianRa().getMinutes()+hd.getChiTietDatPhong().getThoiGianRa().getHours()*60);
//			thoigiandatphong = (thoigianra  - thoigianvao)/60;
//			tableModel.addRow(new Object[] {
//					
//					tableModel.getRowCount() + 1,
//					hd.getPhong().getTenPhong(),
//					thoigiandatphong,
//					hd.getPhong().getGiaPhong(),
//					thanhtien
//				
//			});
//			
//			
//		}
		
		
		
//    }
    
  private void selectDv(String mahoadon)
  {
  	int thoigianvao = 0;
	int thoigianra = 0;
	int thoigiandatphong = 0;
    Double tienphong = 0.0;
    Double  tongtiendv=0.0;
  	Double  tongtien=0.0;
  	Double tongtienthanhtoan = 0.0;
  	Double thanhtien = 0.0;
  	list_hd = ChiTietHoaDon_Dao.getIdforAll(mahoadon);
  	list_ctdv = ChiTietHoaDon_Dao.getChiTietDichVuCuaHoaDon(mahoadon);
		tableModel.setRowCount(0);
		for(HoaDon hd : list_hd) {
			
			txt_tennv.setText(hd.getNhanvien().getTenNhanVien());
			txt_tenkh.setText(hd.getKhachhang().getTenKhachHang());
			txt_thoigianvao.setText(hd.getChiTietDatPhong().getThoiGianVao().toString());
			txt_thoigianra.setText(hd.getChiTietDatPhong().getThoiGianRa().toString());
			txt_mahoadon.setText(hd.getMaHoaDon());
			thoigianvao = (hd.getChiTietDatPhong().getThoiGianVao().getMinutes()+hd.getChiTietDatPhong().getThoiGianVao().getHours()*60);
			thoigianra = (hd.getChiTietDatPhong().getThoiGianRa().getMinutes()+hd.getChiTietDatPhong().getThoiGianRa().getHours()*60);
			thoigiandatphong = (thoigianra  - thoigianvao)/60;
			tienphong = thoigiandatphong * hd.getPhong().getGiaPhong();
			for(ChiTietDichVu ctdv : list_ctdv)
			{
				thanhtien = ctdv.getSoLuongSanPham() * ctdv.getDichvu().getGia();
				tongtiendv += thanhtien;
				tongtien = tienphong + tongtiendv;
				tongtienthanhtoan = tongtien + (tongtien *0.1);
				txt_tongtienthanhtoan.setText(tongtienthanhtoan.toString() );
				txt_tongtien.setText(tongtien.toString() );
				tableModel.addRow(new Object[] {
						tableModel.getRowCount() + 1,
						ctdv.getDichvu().getTenDichVu(),
						ctdv.getSoLuongSanPham(),
						ctdv.getDichvu().getGia(),
						thanhtien
					
				});
			}
			System.out.println(list_ctdv);
			
			tableModel.addRow(new Object[] {
					
					tableModel.getRowCount() + 1,
					hd.getPhong().getTenPhong(),
					thoigiandatphong,
					hd.getPhong().getGiaPhong(),
					tienphong
				
			});
			System.out.println(tienphong);
			
			
		}
		
		
		
  }

    private void txt_tongtienActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void txt_tennvActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txt_tenkhActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txt_thoigianvaoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txt_tongtienthanhtoanActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void btn_xuathoadonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_xuathoadon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private DefaultTableModel tableModel;
    private javax.swing.JTextField txt_mahoadon;
    private javax.swing.JTextField txt_tenkh;
    private javax.swing.JTextField txt_tennv;
    private javax.swing.JTextField txt_thoigianra;
    private javax.swing.JTextField txt_thoigianvao;
    private javax.swing.JTextField txt_tongtien;
    private javax.swing.JTextField txt_tongtienthanhtoan;
    private ArrayList<HoaDon> list_hd = new ArrayList<>();
    private ArrayList<ChiTietDichVu> list_ctdv = new ArrayList<>();
    // End of variables declaration                   
}
