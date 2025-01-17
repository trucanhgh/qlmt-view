/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Account;

/**
 *
 * @author Tran Nhat Sinh
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Navbar
     */
    Color DefaultColor, ClickedColor;
    private Account currentAcc;

    private Admin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Account getCurrentAcc() {
        return currentAcc;
    }


    public Admin(Account t) throws UnsupportedLookAndFeelException {
        ImageIcon logo = new ImageIcon(getClass().getResource("/icon/logo.png"));
        setIconImage(logo.getImage());
        UIManager.setLookAndFeel(new FlatLightLaf());
        UIManager.put("Table.showVerticalLines", true);
        UIManager.put("Table.showHorizontalLines", true);
        initComponents();
        setLocationRelativeTo(null);
        this.currentAcc = t;
        ProductForm pf = new ProductForm();
        MainContent.add(pf).setVisible(true);
//        pf.checkRole(currentAcc);
        //DefaultColor = new Color(89, 168, 105);
          ClickedColor = new Color(40, 100, 163);
//        NavbarMenu.setBackground(DefaultColor);
          SanPham.setBackground(ClickedColor);
//        PhieuNhap.setBackground(DefaultColor);
//        NhapHang.setBackground(DefaultColor);
//        XuatHang.setBackground(DefaultColor);
//        PhieuXuat.setBackground(DefaultColor);
//        NhaCungCap.setBackground(DefaultColor);
//        TonKho.setBackground(DefaultColor);
//        TaiKhoan1.setBackground(DefaultColor);
//        ThongKe.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavbarMenu = new javax.swing.JPanel();
        SanPham = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NhapHang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PhieuNhap = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        XuatHang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        DangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NhaCungCap = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PhieuXuat = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TonKho = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TaiKhoan1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ThongKe = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        DoiThongTin = new javax.swing.JLabel();
        AboutUs = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        MainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phẩn mềm quản lý kho hàng máy tính");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavbarMenu.setBackground(new java.awt.Color(44, 116, 179));
        NavbarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SanPham.setBackground(new java.awt.Color(44, 116, 179));
        SanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SanPhamMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SẢN PHẨM");

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SanPhamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        NavbarMenu.add(SanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 260, 40));

        NhapHang.setBackground(new java.awt.Color(44, 116, 179));
        NhapHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhapHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhapHangMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NHẬP HÀNG");

        javax.swing.GroupLayout NhapHangLayout = new javax.swing.GroupLayout(NhapHang);
        NhapHang.setLayout(NhapHangLayout);
        NhapHangLayout.setHorizontalGroup(
            NhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapHangLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        NhapHangLayout.setVerticalGroup(
            NhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(NhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 260, 40));

        PhieuNhap.setBackground(new java.awt.Color(44, 116, 179));
        PhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhieuNhapMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PhieuNhapMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PHIẾU NHẬP");

        javax.swing.GroupLayout PhieuNhapLayout = new javax.swing.GroupLayout(PhieuNhap);
        PhieuNhap.setLayout(PhieuNhapLayout);
        PhieuNhapLayout.setHorizontalGroup(
            PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuNhapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        PhieuNhapLayout.setVerticalGroup(
            PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhieuNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        NavbarMenu.add(PhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 310, 260, 40));

        XuatHang.setBackground(new java.awt.Color(44, 116, 179));
        XuatHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XuatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XuatHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XuatHangMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("XUẤT HÀNG");

        javax.swing.GroupLayout XuatHangLayout = new javax.swing.GroupLayout(XuatHang);
        XuatHang.setLayout(XuatHangLayout);
        XuatHangLayout.setHorizontalGroup(
            XuatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XuatHangLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        XuatHangLayout.setVerticalGroup(
            XuatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XuatHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        NavbarMenu.add(XuatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 350, 260, 40));

        DangXuat.setBackground(new java.awt.Color(44, 116, 179));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DangXuatMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_25px.png"))); // NOI18N
        jLabel5.setText("ĐĂNG XUẤT");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        NavbarMenu.add(DangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 650, 260, -1));

        NhaCungCap.setBackground(new java.awt.Color(44, 116, 179));
        NhaCungCap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhaCungCapMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhaCungCapMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout NhaCungCapLayout = new javax.swing.GroupLayout(NhaCungCap);
        NhaCungCap.setLayout(NhaCungCapLayout);
        NhaCungCapLayout.setHorizontalGroup(
            NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhaCungCapLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        NhaCungCapLayout.setVerticalGroup(
            NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhaCungCapLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        NavbarMenu.add(NhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 220, 260, 40));

        PhieuXuat.setBackground(new java.awt.Color(44, 116, 179));
        PhieuXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhieuXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PhieuXuatMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PHIẾU XUẤT");

        javax.swing.GroupLayout PhieuXuatLayout = new javax.swing.GroupLayout(PhieuXuat);
        PhieuXuat.setLayout(PhieuXuatLayout);
        PhieuXuatLayout.setHorizontalGroup(
            PhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuXuatLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        PhieuXuatLayout.setVerticalGroup(
            PhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(PhieuXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 400, 260, 40));

        TonKho.setBackground(new java.awt.Color(44, 116, 179));
        TonKho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TonKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TonKhoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TonKhoMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TỒN KHO");

        javax.swing.GroupLayout TonKhoLayout = new javax.swing.GroupLayout(TonKho);
        TonKho.setLayout(TonKhoLayout);
        TonKhoLayout.setHorizontalGroup(
            TonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TonKhoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        TonKhoLayout.setVerticalGroup(
            TonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TonKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(TonKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 440, 260, -1));

        TaiKhoan1.setBackground(new java.awt.Color(44, 116, 179));
        TaiKhoan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TaiKhoan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaiKhoan1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TaiKhoan1MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TÀI KHOẢN");

        javax.swing.GroupLayout TaiKhoan1Layout = new javax.swing.GroupLayout(TaiKhoan1);
        TaiKhoan1.setLayout(TaiKhoan1Layout);
        TaiKhoan1Layout.setHorizontalGroup(
            TaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoan1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        TaiKhoan1Layout.setVerticalGroup(
            TaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(TaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 520, 260, -1));

        ThongKe.setBackground(new java.awt.Color(44, 116, 179));
        ThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongKeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThongKeMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("THỐNG KÊ");

        javax.swing.GroupLayout ThongKeLayout = new javax.swing.GroupLayout(ThongKe);
        ThongKe.setLayout(ThongKeLayout);
        ThongKeLayout.setHorizontalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        ThongKeLayout.setVerticalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(ThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 480, 260, -1));

        Account.setBackground(new java.awt.Color(44, 116, 179));
        Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccountMousePressed(evt);
            }
        });

        DoiThongTin.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        DoiThongTin.setForeground(new java.awt.Color(255, 255, 255));
        DoiThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-information-25.png"))); // NOI18N
        DoiThongTin.setText("ĐỔI THÔNG TIN");

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account);
        Account.setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(DoiThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoiThongTin)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        NavbarMenu.add(Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 610, 260, -1));

        AboutUs.setBackground(new java.awt.Color(44, 116, 179));
        AboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs.setText("About us");
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });
        NavbarMenu.add(AboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 160, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cute-cartoon-star-emoji-shining-17633 (2).png"))); // NOI18N
        NavbarMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 130));

        getContentPane().add(NavbarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 750));

        MainContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainContentLayout = new javax.swing.GroupLayout(MainContent);
        MainContent.setLayout(MainContentLayout);
        MainContentLayout.setHorizontalGroup(
            MainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        MainContentLayout.setVerticalGroup(
            MainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        getContentPane().add(MainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1240, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(ClickedColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
        MainContent.removeAll();
        ProductForm p = new ProductForm();
        MainContent.add(p).setVisible(true);
    }//GEN-LAST:event_SanPhamMousePressed

    private void NhaCungCapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhaCungCapMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(ClickedColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_NhaCungCapMousePressed

    private void NhapHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapHangMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(ClickedColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_NhapHangMousePressed

    private void PhieuNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuNhapMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(ClickedColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_PhieuNhapMousePressed

    private void XuatHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XuatHangMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(ClickedColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_XuatHangMousePressed

    private void PhieuXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuXuatMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(ClickedColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_PhieuXuatMousePressed

    private void SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMouseClicked
        // TODO add your handling code here:
        ProductForm ac = new ProductForm();
        MainContent.removeAll();
        MainContent.add(ac).setVisible(true);
    }//GEN-LAST:event_SanPhamMouseClicked

    private void TonKhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonKhoMousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(ClickedColor);
        TaiKhoan1.setBackground(DefaultColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_TonKhoMousePressed

    private void DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangXuatMousePressed

    private void NhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhaCungCapMouseClicked
        // TODO add your handling code here:
        NhaCungCapForm af = new NhaCungCapForm();
        MainContent.removeAll();
        MainContent.add(af).setVisible(true);
    }//GEN-LAST:event_NhaCungCapMouseClicked

    private void TonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonKhoMouseClicked
        // TODO add your handling code here:
        TonKhoForm px = new TonKhoForm();
        MainContent.removeAll();
        MainContent.add(px).setVisible(true);

    }//GEN-LAST:event_TonKhoMouseClicked

    private void NhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapHangMouseClicked
        // TODO add your handling code here:
        NhapHangForm nhaphang = new NhapHangForm();
        nhaphang.setNguoiNhapHang(this.currentAcc.getUser());
        MainContent.removeAll();
        MainContent.add(nhaphang).setVisible(true);
    }//GEN-LAST:event_NhapHangMouseClicked

    private void PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuNhapMouseClicked
        // TODO add your handling code here:
        PhieuNhapForm pn = new PhieuNhapForm(this.getCurrentAcc());
        MainContent.removeAll();
        MainContent.add(pn).setVisible(true);
    }//GEN-LAST:event_PhieuNhapMouseClicked

    private void XuatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XuatHangMouseClicked
        // TODO add your handling code here:
        XuatHangForm xh = new XuatHangForm();
        xh.setNguoiTao(this.currentAcc.getFullName());
        MainContent.removeAll();
        MainContent.add(xh).setVisible(true);
    }//GEN-LAST:event_XuatHangMouseClicked

    private void PhieuXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuXuatMouseClicked
        // TODO add your handling code here:
        PhieuXuatForm px = new PhieuXuatForm(this.getCurrentAcc());
        MainContent.removeAll();
        MainContent.add(px).setVisible(true);
    }//GEN-LAST:event_PhieuXuatMouseClicked

    private void DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMouseClicked
        // TODO add your handling code here:
        int relly = JOptionPane.showConfirmDialog(
                null,
                "Bạn muốn thoát khỏi chương trình ?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION);
        if (relly == JOptionPane.YES_OPTION) {
            this.dispose();
            Login a = new Login();
            a.setVisible(true);
        } else {
            DangXuat.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_DangXuatMouseClicked

    private void TaiKhoan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoan1MouseClicked
        // TODO add your handling code here:
        AccountForm ac = new AccountForm();
        MainContent.removeAll();
        MainContent.add(ac).setVisible(true);
    }//GEN-LAST:event_TaiKhoan1MouseClicked

    private void TaiKhoan1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoan1MousePressed
        // TODO add your handling code here:
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(ClickedColor);
        ThongKe.setBackground(DefaultColor);
    }//GEN-LAST:event_TaiKhoan1MousePressed

    private void ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeMouseClicked
        // TODO add your handling code here:
        ThongKeForm tk = new ThongKeForm();
        MainContent.removeAll();
        MainContent.add(tk).setVisible(true);
    }//GEN-LAST:event_ThongKeMouseClicked

    private void ThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeMousePressed
        // TODO add your handling code here:
        ThongKe.setBackground(ClickedColor);
        SanPham.setBackground(DefaultColor);
        PhieuNhap.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        XuatHang.setBackground(DefaultColor);
        PhieuXuat.setBackground(DefaultColor);
        NhaCungCap.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        TaiKhoan1.setBackground(DefaultColor);
    }//GEN-LAST:event_ThongKeMousePressed

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseClicked
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword(this, rootPaneCheckingEnabled, getCurrentAcc());
        cp.setVisible(true);
    }//GEN-LAST:event_AccountMouseClicked

    private void AccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát ?", "Exit?", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        // TODO add your handling code here:
        AboutUs ab = new AboutUs();
        ab.setVisible(true);
    }//GEN-LAST:event_AboutUsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

//    public void setName(String name) {
//        this.NameUser.setText(name);
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JPanel Account;
    private javax.swing.JPanel DangXuat;
    private javax.swing.JLabel DoiThongTin;
    private javax.swing.JPanel MainContent;
    private javax.swing.JPanel NavbarMenu;
    private javax.swing.JPanel NhaCungCap;
    private javax.swing.JPanel NhapHang;
    private javax.swing.JPanel PhieuNhap;
    private javax.swing.JPanel PhieuXuat;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel TaiKhoan1;
    private javax.swing.JPanel ThongKe;
    private javax.swing.JPanel TonKho;
    private javax.swing.JPanel XuatHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
