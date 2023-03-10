/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.event.KeyEvent;
import java.math.MathContext;

/**
 *
 * @author Admin
 */
public class Gui_DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form Gui_DangNhap
     */
    public Gui_DangNhap() {
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

        jPanel3 = new javax.swing.JPanel();
        btnHienMatKhau = new javax.swing.JButton();
        txtMatKhauAn = new javax.swing.JPasswordField();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuenMatKhau = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(242, 242, 214));
        jPanel3.setPreferredSize(new java.awt.Dimension(1250, 483));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHienMatKhau.setBackground(new java.awt.Color(204, 255, 255));
        btnHienMatKhau.setIcon(new javax.swing.ImageIcon("D:\\workspace\\QL\\demoApp\\src\\main\\java\\icon\\eye.png")); // NOI18N
        btnHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(btnHienMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 278, -1, 43));

        txtMatKhauAn.setBackground(new java.awt.Color(228, 255, 231));
        txtMatKhauAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauAnActionPerformed(evt);
            }
        });
        txtMatKhauAn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauAnKeyPressed(evt);
            }
        });
        jPanel3.add(txtMatKhauAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 257, 43));

        label2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 102, 51));
        label2.setText("B??CH H??A \n");
        jPanel3.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 10, -1, -1));

        label1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 51, 0));
        label1.setText("THANH HUY\n");
        jPanel3.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\workspace\\QL\\demoApp\\src\\main\\java\\icon\\user.png")); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 117, 68, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\workspace\\QL\\demoApp\\src\\main\\java\\icon\\pass.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 257, 68, -1));

        txtTaiKhoan.setBackground(new java.awt.Color(228, 255, 231));
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        jPanel3.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 257, 42));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\workspace\\QL\\demoApp\\src\\main\\java\\icon\\images.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 483));

        btnQuenMatKhau.setBackground(new java.awt.Color(204, 255, 255));
        btnQuenMatKhau.setIcon(new javax.swing.ImageIcon("D:\\workspace\\QL\\demoApp\\src\\main\\java\\icon\\confused.png")); // NOI18N
        btnQuenMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuenMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 360, 93, 63));

        txtMatKhau.setBackground(new java.awt.Color(228, 255, 231));
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 257, 42));

        btnDangNhap.setBackground(new java.awt.Color(204, 255, 255));
        btnDangNhap.setIcon(new javax.swing.ImageIcon("D:\\workspace\\QL\\demoApp\\src\\main\\java\\icon\\login.png")); // NOI18N
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyReleased(evt);
            }
        });
        jPanel3.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 360, 93, 63));
        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void txtMatKhauAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauAnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauAnActionPerformed

    private void btnQuenMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuenMatKhauActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        if(txtTaiKhoan.getText().equals("a")){
            this.dispose();
            new Menu().setVisible(true);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed
    static int flag = 1;
    private void btnHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienMatKhauActionPerformed
        // TODO add your handling code here:
       
        
            if(flag==1){
                txtMatKhauAn.setVisible(false);
                txtMatKhau.setVisible(true);
                txtMatKhau.setText(txtMatKhauAn.getText());
                flag = 0;
            }
            else if(flag==0){
                txtMatKhauAn.setVisible(true);
                txtMatKhau.setVisible(false);
                txtMatKhauAn.setText(txtMatKhau.getText());
                flag = 1;
            }
           
           
        

    }//GEN-LAST:event_btnHienMatKhauActionPerformed

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void btnDangNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyReleased
        // TODO add your handling code here:
            
    }//GEN-LAST:event_btnDangNhapKeyReleased

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnDangNhapKeyPressed

    private void txtMatKhauAnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauAnKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.dispose();
           new Menu().setVisible(true); 
        }
        
    }//GEN-LAST:event_txtMatKhauAnKeyPressed

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
            java.util.logging.Logger.getLogger(Gui_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnHienMatKhau;
    private javax.swing.JButton btnQuenMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauAn;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
