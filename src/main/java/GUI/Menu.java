/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Lenovo
 */
public class Menu extends javax.swing.JFrame {

    private QuanLyNhanVien panelquanlinhanvien;
    private QuanLyDichVu panelquanlidichvu;
    private QuanLyKhachHang panelquanlikhachhang;
    private QuanLyHoaDon panelquanlihoadon;
    private QuanLyDanhSachPhong panelquanlidsphong;
    private ThongKe panelthongkedoanhthu;
    private ThongKeKhachHang panelthongkekhachhang;
    private QuanLyTimKiem paneltimkiem;
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneMenuMain = new javax.swing.JTabbedPane();
        jMenuBarMain = new javax.swing.JMenuBar();
        jMenu_hethong = new javax.swing.JMenu();
        jMenuItem_trangchu = new javax.swing.JMenuItem();
        jMenuItem_taikhoan = new javax.swing.JMenuItem();
        jMenuItem_trogiup = new javax.swing.JMenuItem();
        jMenuItem_dangxuat = new javax.swing.JMenuItem();
        jMenuItem_thoat = new javax.swing.JMenuItem();
        jMenu_danhmuc = new javax.swing.JMenu();
        jMenuItem_hoadon = new javax.swing.JMenuItem();
        jMenuItem_khachhang = new javax.swing.JMenuItem();
        jMenuItem_nhanvien = new javax.swing.JMenuItem();
        jMenuItem_dichvu = new javax.swing.JMenuItem();
        jMenu_xuli = new javax.swing.JMenu();
        jMenuItem_dsphong = new javax.swing.JMenuItem();
        jMenu_timkiem = new javax.swing.JMenu();
        jMenuItem_phieudatphong = new javax.swing.JMenuItem();
        jMenu_thongke = new javax.swing.JMenu();
        jMenuItem_doanhthu = new javax.swing.JMenuItem();
        jMenuItem_tkKhachhang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quán karaoke");
        setLocation(new java.awt.Point(500, 200));

        jMenuBarMain.setBackground(new java.awt.Color(204, 204, 204));

        jMenu_hethong.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\parts-maintenance-32.png")); // NOI18N
        jMenu_hethong.setText("Hệ thống");

        jMenuItem_trangchu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_trangchu.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\home2.png")); // NOI18N
        jMenuItem_trangchu.setText("Trang chủ");
        jMenuItem_trangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_trangchuActionPerformed(evt);
            }
        });
        jMenu_hethong.add(jMenuItem_trangchu);

        jMenuItem_taikhoan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem_taikhoan.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\account-center-1-32.png")); // NOI18N
        jMenuItem_taikhoan.setText("Tài khoản");
        jMenu_hethong.add(jMenuItem_taikhoan);

        jMenuItem_trogiup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem_trogiup.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\Actions-help-about-icon-32.png")); // NOI18N
        jMenuItem_trogiup.setText("Trợ giúp");
        jMenuItem_trogiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_trogiupActionPerformed(evt);
            }
        });
        jMenu_hethong.add(jMenuItem_trogiup);

        jMenuItem_dangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem_dangxuat.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\logout-icon-32.png")); // NOI18N
        jMenuItem_dangxuat.setText("Đăng xuất");
        jMenuItem_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dangxuatActionPerformed(evt);
            }
        });
        jMenu_hethong.add(jMenuItem_dangxuat);

        jMenuItem_thoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_thoat.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\exit-8-32.png")); // NOI18N
        jMenuItem_thoat.setText("Thoát");
        jMenuItem_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_thoatActionPerformed(evt);
            }
        });
        jMenu_hethong.add(jMenuItem_thoat);

        jMenuBarMain.add(jMenu_hethong);

        jMenu_danhmuc.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\List.png")); // NOI18N
        jMenu_danhmuc.setText("Danh mục");

        jMenuItem_hoadon.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\bill-5-32.png")); // NOI18N
        jMenuItem_hoadon.setText("Hóa đơn");
        jMenuItem_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_hoadonActionPerformed(evt);
            }
        });
        jMenu_danhmuc.add(jMenuItem_hoadon);

        jMenuItem_khachhang.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\customer-47-32.png")); // NOI18N
        jMenuItem_khachhang.setText("Khách hàng");
        jMenuItem_khachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_khachhangActionPerformed(evt);
            }
        });
        jMenu_danhmuc.add(jMenuItem_khachhang);

        jMenuItem_nhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem_nhanvien.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\customer-service-81-32.png")); // NOI18N
        jMenuItem_nhanvien.setText("Nhân viên");
        jMenuItem_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nhanvienActionPerformed(evt);
            }
        });
        jMenu_danhmuc.add(jMenuItem_nhanvien);

        jMenuItem_dichvu.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\service-76-32.png")); // NOI18N
        jMenuItem_dichvu.setText("Dịch vụ");
        jMenuItem_dichvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dichvuActionPerformed(evt);
            }
        });
        jMenu_danhmuc.add(jMenuItem_dichvu);

        jMenuBarMain.add(jMenu_danhmuc);

        jMenu_xuli.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\Actions-document-edit-icon-32.png")); // NOI18N
        jMenu_xuli.setText("Xử lí");

        jMenuItem_dsphong.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\karaoke-32.png")); // NOI18N
        jMenuItem_dsphong.setText("Đặt phòng hát");
        jMenuItem_dsphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dsphongActionPerformed(evt);
            }
        });
        jMenu_xuli.add(jMenuItem_dsphong);

        jMenuBarMain.add(jMenu_xuli);

        jMenu_timkiem.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\search-icon-32.png")); // NOI18N
        jMenu_timkiem.setText("Tìm kiếm");

        jMenuItem_phieudatphong.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\bill-of-lading-32.png")); // NOI18N
        jMenuItem_phieudatphong.setText("phiếu đặt phòng");
        jMenuItem_phieudatphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_phieudatphongActionPerformed(evt);
            }
        });
        jMenu_timkiem.add(jMenuItem_phieudatphong);

        jMenuBarMain.add(jMenu_timkiem);

        jMenu_thongke.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\Statistics.png")); // NOI18N
        jMenu_thongke.setText("Thống kê");

        jMenuItem_doanhthu.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\wallet-45-32.png")); // NOI18N
        jMenuItem_doanhthu.setText("Doanh thu");
        jMenuItem_doanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_doanhthuActionPerformed(evt);
            }
        });
        jMenu_thongke.add(jMenuItem_doanhthu);

        jMenuItem_tkKhachhang.setIcon(new javax.swing.ImageIcon("D:\\PTUD\\img\\cooperation-32.png")); // NOI18N
        jMenuItem_tkKhachhang.setText("Khách hàng");
        jMenuItem_tkKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_tkKhachhangActionPerformed(evt);
            }
        });
        jMenu_thongke.add(jMenuItem_tkKhachhang);

        jMenuBarMain.add(jMenu_thongke);

        setJMenuBar(jMenuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_trogiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_trogiupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_trogiupActionPerformed

    private void jMenuItem_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_hoadonActionPerformed
        if(panelquanlihoadon == null)
        {
            panelquanlihoadon = new QuanLyHoaDon();
            jTabbedPaneMenuMain.addTab("Quản lí hóa đơn",panelquanlihoadon);
        }
        jTabbedPaneMenuMain.setSelectedComponent(panelquanlihoadon);
    }//GEN-LAST:event_jMenuItem_hoadonActionPerformed

    private void jMenuItem_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nhanvienActionPerformed
       if(panelquanlinhanvien == null)
       {
           panelquanlinhanvien = new QuanLyNhanVien();
            jTabbedPaneMenuMain.addTab("Quản lí nhân viên", panelquanlinhanvien);
           
       }
        jTabbedPaneMenuMain.setSelectedComponent(panelquanlinhanvien);
    }//GEN-LAST:event_jMenuItem_nhanvienActionPerformed

    private void jMenuItem_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_thoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_thoatActionPerformed

    private void jMenuItem_trangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_trangchuActionPerformed
       
    }//GEN-LAST:event_jMenuItem_trangchuActionPerformed

    private void jMenuItem_dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dangxuatActionPerformed
        Dangnhap logout = new Dangnhap();
        logout.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem_dangxuatActionPerformed

    private void jMenuItem_dichvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dichvuActionPerformed
        if(panelquanlidichvu == null)
        {
            panelquanlidichvu  = new QuanLyDichVu();
            jTabbedPaneMenuMain.addTab("Quản lí dịch vụ", panelquanlidichvu);
        }
        jTabbedPaneMenuMain.setSelectedComponent(panelquanlidichvu );
        
        
    }//GEN-LAST:event_jMenuItem_dichvuActionPerformed

    private void jMenuItem_khachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_khachhangActionPerformed
       if(panelquanlikhachhang== null)
        {
            panelquanlikhachhang  = new QuanLyKhachHang();
            jTabbedPaneMenuMain.addTab("Quản lí khách hàng", panelquanlikhachhang);
        }
        jTabbedPaneMenuMain.setSelectedComponent(panelquanlikhachhang );
        
    }//GEN-LAST:event_jMenuItem_khachhangActionPerformed

    private void jMenuItem_dsphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dsphongActionPerformed
        if(panelquanlidsphong == null)
        {
            panelquanlidsphong = new QuanLyDanhSachPhong();
            jTabbedPaneMenuMain.addTab("Quản lí danh sách phòng", panelquanlidsphong);
        }
        jTabbedPaneMenuMain.setSelectedComponent(panelquanlidsphong);
    }//GEN-LAST:event_jMenuItem_dsphongActionPerformed

    private void jMenuItem_doanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_doanhthuActionPerformed
         if(panelthongkedoanhthu == null)
        {
            panelthongkedoanhthu = new ThongKe();
            jTabbedPaneMenuMain.addTab("Thống kê doanh thu", panelthongkedoanhthu); 
        }
        jTabbedPaneMenuMain.setSelectedComponent(panelthongkedoanhthu);
    }//GEN-LAST:event_jMenuItem_doanhthuActionPerformed

    private void jMenuItem_tkKhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_tkKhachhangActionPerformed
        if(panelthongkekhachhang == null)
        {
            panelthongkekhachhang = new ThongKeKhachHang();
            jTabbedPaneMenuMain.addTab("Thống kê khách hàng", panelthongkekhachhang);
        }
        jTabbedPaneMenuMain.setSelectedComponent(panelthongkekhachhang);
    }//GEN-LAST:event_jMenuItem_tkKhachhangActionPerformed

    private void jMenuItem_phieudatphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_phieudatphongActionPerformed
        if(paneltimkiem == null)
        {
            paneltimkiem = new QuanLyTimKiem();
            jTabbedPaneMenuMain.addTab("Tìm phiếu đặt phòng", paneltimkiem);
        }
        jTabbedPaneMenuMain.setSelectedComponent(paneltimkiem);
    }//GEN-LAST:event_jMenuItem_phieudatphongActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarMain;
    private javax.swing.JMenuItem jMenuItem_dangxuat;
    private javax.swing.JMenuItem jMenuItem_dichvu;
    private javax.swing.JMenuItem jMenuItem_doanhthu;
    private javax.swing.JMenuItem jMenuItem_dsphong;
    private javax.swing.JMenuItem jMenuItem_hoadon;
    private javax.swing.JMenuItem jMenuItem_khachhang;
    private javax.swing.JMenuItem jMenuItem_nhanvien;
    private javax.swing.JMenuItem jMenuItem_phieudatphong;
    private javax.swing.JMenuItem jMenuItem_taikhoan;
    private javax.swing.JMenuItem jMenuItem_thoat;
    private javax.swing.JMenuItem jMenuItem_tkKhachhang;
    private javax.swing.JMenuItem jMenuItem_trangchu;
    private javax.swing.JMenuItem jMenuItem_trogiup;
    private javax.swing.JMenu jMenu_danhmuc;
    private javax.swing.JMenu jMenu_hethong;
    private javax.swing.JMenu jMenu_thongke;
    private javax.swing.JMenu jMenu_timkiem;
    private javax.swing.JMenu jMenu_xuli;
    private javax.swing.JTabbedPane jTabbedPaneMenuMain;
    // End of variables declaration//GEN-END:variables
}
