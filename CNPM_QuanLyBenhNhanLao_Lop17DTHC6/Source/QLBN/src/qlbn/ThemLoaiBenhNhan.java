/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbn;

import Connection.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ThemLoaiBenhNhan extends javax.swing.JFrame {

    Statement statement;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    SqlConnection sqlConn = new SqlConnection();

    public DefaultTableModel tblModel = new DefaultTableModel();

    public ThemLoaiBenhNhan() {
        initComponents();
        //setLocationRelativeTo(null);
        LayDuLieu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grLoaiBenhNhan = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Loại Bệnh Nhân");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LOẠI BỆNH NHÂN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Tên loại bệnh nhân:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        getContentPane().add(txtTenLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 310, 37));

        grLoaiBenhNhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(grLoaiBenhNhan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 810, 230));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/sign-add-icon.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/i5.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 130, -1));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/xoa.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 129, -1));

        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/cancel.png"))); // NOI18N
        btnHuy.setText("HỦY");
        btnHuy.setMaximumSize(new java.awt.Dimension(129, 39));
        btnHuy.setMinimumSize(new java.awt.Dimension(129, 39));
        btnHuy.setPreferredSize(new java.awt.Dimension(129, 39));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 130, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/iconBack.png"))); // NOI18N
        btnBack.setText("Trở Về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/MA-Banner.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            if (txtTenLoai.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên loại bệnh nhân không được để trống!");
            } else {
                conn = sqlConn.getSQLServerConnection();
                ps = conn.prepareStatement("insert into LOAIBENHNHAN values(?)");
                ps.setString(1, txtTenLoai.getText());
                int ret = ps.executeUpdate();
                if (ret > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    tblModel.setRowCount(0);
                    LayDuLieu();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            conn = sqlConn.getSQLServerConnection();
            ps = conn.prepareStatement("Update LOAIBENHNHAN set TENLOAI=? where MALOAIBN=?");
            ps.setString(2, grLoaiBenhNhan.getValueAt(grLoaiBenhNhan.getSelectedRow(), 0).toString());
            ps.setString(1, txtTenLoai.getText());

            ps.executeUpdate();
            tblModel.setRowCount(0);
            LayDuLieu();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            conn = sqlConn.getSQLServerConnection();
            ps = conn.prepareStatement("Delete From LOAIBENHNHAN where MALOAIBN = ?");
            ps.setString(1, grLoaiBenhNhan.getValueAt(grLoaiBenhNhan.getSelectedRow(), 0).toString());
            ps.executeUpdate();
            tblModel.setRowCount(0);
            LayDuLieu();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn không thể xóa vì loại bệnh nhân này đã tồn tại trong Danh sách bệnh nhân!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.setVisible(false);
        ManHinhChinh mhc = new ManHinhChinh();
        mhc.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManHinhChinh mhc = new ManHinhChinh();
        mhc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ThemLoaiBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemLoaiBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemLoaiBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemLoaiBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemLoaiBenhNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable grLoaiBenhNhan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables

    private void LayDuLieu() {
        try {
            conn=sqlConn.getSQLServerConnection();
            try{
                statement=conn.createStatement();
            }
            catch(SQLException ex){
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            int number;
            int stt=1;
            Vector row,column;
            column =new Vector();
            rs=statement.executeQuery("select * from LOAIBENHNHAN");
            ResultSetMetaData metadata=rs.getMetaData();
            number =metadata.getColumnCount();
             column.addElement("STT");
            for(int i=2;i<=number;i++){
                column.add(metadata.getColumnName(i));
            }
            tblModel.setColumnIdentifiers(column);
            
            while (rs.next()) {                
                row=new Vector();
                row.addElement(stt++);
                for(int i=2;i<=number;i++){
                    row.addElement(rs.getString(i));
                }
                tblModel.addRow(row);
                grLoaiBenhNhan.setModel(tblModel);
                        
            }
            grLoaiBenhNhan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if(grLoaiBenhNhan.getSelectedRow()>=0){
                        //jTextField1.setText(grLoaiThuoc.getValueAt(grLoaiThuoc.getSelectedRow(),0)+"");
                        txtTenLoai.setText(grLoaiBenhNhan.getValueAt(grLoaiBenhNhan.getSelectedRow(),1)+"");
                        
                    }
                }
            });
//           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
