/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Connect.ConnecttoXAMPP;
import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import controller.BCrypt;
import dao.AccountDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Account;

/**
 *
 * @author kali
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    Connection con = null;
    Resultset rs = null;
    Color panDefualt, panEnter, panClick;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        UIManager.put("Button.focus", Color.white);
        panDefualt = new Color(89, 168, 105);
        panClick = new Color(89, 168, 120);
        panEnter = new Color(89, 168, 120);
        //JPaneLogin.setBackground(panDefualt);
        ImageIcon logo = new ImageIcon(getClass().getResource("/icon/logo.png"));
        setIconImage(logo.getImage());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordUser = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        JPaneLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào phần mềm");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(13, 39, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 260, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quên mật khẩu ?");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, 40));

        loginUser.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        loginUser.setBorder(null);
        loginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginUserMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginUserMousePressed(evt);
            }
        });
        loginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserActionPerformed(evt);
            }
        });
        loginUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginUserKeyPressed(evt);
            }
        });
        jPanel2.add(loginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 260, 30));

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 260, -1));

        passwordUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordUser.setBorder(null);
        passwordUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUserKeyPressed(evt);
            }
        });
        jPanel2.add(passwordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, 30));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 40));

        JPaneLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
        JPaneLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPaneLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseReleased(evt);
            }
        });
        JPaneLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPaneLoginKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đăng nhập");

        javax.swing.GroupLayout JPaneLoginLayout = new javax.swing.GroupLayout(JPaneLogin);
        JPaneLogin.setLayout(JPaneLoginLayout);
        JPaneLoginLayout.setHorizontalGroup(
            JPaneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLoginLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        JPaneLoginLayout.setVerticalGroup(
            JPaneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(JPaneLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 450, 300));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserActionPerformed

    private void loginUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMouseEntered
        // TODO add your handling code here:    
    }//GEN-LAST:event_loginUserMouseEntered

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());

    }//GEN-LAST:event_formKeyPressed

    private void loginUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            checkLogin();
        }
    }//GEN-LAST:event_loginUserKeyPressed

    private void passwordUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            checkLogin();
        }
    }//GEN-LAST:event_passwordUserKeyPressed

    private void loginUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginUserMousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        RecoverPassword rcv = new RecoverPassword(this, rootPaneCheckingEnabled);
        rcv.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void JPaneLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPaneLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneLoginKeyPressed

    private void JPaneLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseReleased
        // TODO add your handling code here:
        //JPaneLogin.setBackground(panClick);
    }//GEN-LAST:event_JPaneLoginMouseReleased

    private void JPaneLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMousePressed
        // TODO add your handling code here:
        //JPaneLogin.setBackground(panEnter);
    }//GEN-LAST:event_JPaneLoginMousePressed

    private void JPaneLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseExited
        // TODO add your handling code here:
        //JPaneLogin.setBackground(panClick);
        JPaneLogin.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_JPaneLoginMouseExited

    private void JPaneLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseEntered
        // TODO add your handling code here:
        //JPaneLogin.setBackground(panEnter);
          JPaneLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_JPaneLoginMouseEntered

    private void JPaneLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseClicked
        // TODO add your handling code here:
        checkLogin();
    }//GEN-LAST:event_JPaneLoginMouseClicked
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void checkLogin() {
        String usercheck = loginUser.getText();
        String passwordcheck = passwordUser.getText();
        if (usercheck.equals("") || passwordcheck.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
        } else {
            try {                
                Account acc = AccountDAO.getInstance().selectById(usercheck);                
                if (acc == null) {
                    JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại trên hệ thống !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (BCrypt.checkpw(passwordcheck, acc.getPassword())) {
                        if (acc.getStatus() == 1) {
                            try {
                                JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                                this.dispose();
                                String role = acc.getRole();
                                if (role.equals("Admin")) {
                                    Admin ad = new Admin(acc);
                                    ad.setVisible(true);
//                                    ad.setCurrentAcc(acc);
                                    ad.setName(acc.getFullName());
                                } else if (role.equals("Quản lý kho")) {
                                    QuanLiKho ql = new QuanLiKho();
                                    ql.setVisible(true);
                                    ql.setCurrentAcc(acc);
                                    ql.setName(acc.getFullName());
                                } else if (role.equals("Nhân viên nhập")) {
                                    NhapKho ql = new NhapKho(acc);
                                    ql.setVisible(true);
                                    ql.setName(acc.getFullName());
                                } else if (role.equals("Nhân viên xuất")) {
                                    XuatKho ql = new XuatKho(acc);
                                    ql.setVisible(true);
                                    ql.setName(acc.getFullName());
                                }
                            } catch (UnsupportedLookAndFeelException ex) {
                                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Tài khoản của bạn đã bị khóa !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Sai mật khẩu !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPaneLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPasswordField passwordUser;
    // End of variables declaration//GEN-END:variables
}