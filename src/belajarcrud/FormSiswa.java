/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarcrud;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;


/**
 *
 * @author franc
 */
public class FormSiswa extends javax.swing.JFrame {

    /**
     * Creates new form FormSiswa
     */
    public FormSiswa() {
        initComponents();  
        koneksi();
        display();
    }
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statSiswa;
    Boolean ada = false;
    
    private void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:4306/crud_java?useSSL=false";
            String user="root";
            String pass="root";
            con = DriverManager.getConnection(url, user, pass);
            statSiswa = con.createStatement(rs.TYPE_SCROLL_SENSITIVE, rs.CONCUR_UPDATABLE);
            rs = statSiswa.executeQuery("SELECT * FROM siswa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
    }
    
    private void display(){
        try{
            String sql = "SELECT * FROM siswa";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
    }
    
    private void Reset(){
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSimpan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel1.setText("Form Siswa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 6, -1, -1));

        jTextField1.setToolTipText("NIS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 310, -1));

        jLabel2.setText("NIS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextField2.setToolTipText("Nama");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 310, -1));

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField3.setToolTipText("Rombel");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 310, -1));

        jLabel4.setText("Rombel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 350, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try{
            koneksi();
            statSiswa = con.createStatement();
            
            String nis = jTextField1.getText();
            String nama = jTextField2.getText();
            String rombel = jTextField3.getText();
            
            // validation
            if (nis.equals("") || nama.equals("") || rombel.equals("")) {
                JOptionPane.showMessageDialog(null, "Data perlu diisi semua");
            }else{        
                String SQL = "INSERT INTO siswa (nis, nama, rombel) VALUES ('" + nis + "', '" + nama + "', '" + rombel + "')";

                statSiswa.executeUpdate(SQL);
                display();
                statSiswa.close();
                con.close();
                Reset();
                JOptionPane.showMessageDialog(null, "berhasil simpan");   
            }
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            koneksi();
            statSiswa = con.createStatement();
            
            String nis = jTextField1.getText();
            String nama = jTextField2.getText();
            String rombel = jTextField3.getText();
            
            // validation null
            if (nis.equals("") || nama.equals("") || rombel.equals("")) {
                JOptionPane.showMessageDialog(null, "Data perlu diisi semua");
            }else{
                String SQL = "UPDATE siswa SET nama = ?, rombel = ? WHERE nis = ?";
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setString(1, nama); 
                pst.setString(2, rombel); 
                pst.setString(3, nis); 

                int rowsAffected = pst.executeUpdate(); 

                if (rowsAffected > 0) {
                    display(); 
                    Reset(); 
                    JOptionPane.showMessageDialog(null, "berhasil edit");
                } else {
                    JOptionPane.showMessageDialog(null, "gagal edit");
                }

                pst.close();
                con.close();
            }
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            koneksi();
            
            String nis = jTextField1.getText();
            
            String SQL = "DELETE FROM siswa WHERE nis = ?";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, nis); 

            int rowsAffected = pst.executeUpdate(); 

            if (rowsAffected > 0) {
                display(); 
                JOptionPane.showMessageDialog(null, "Berhasil hapus"); 
            } else {
                JOptionPane.showMessageDialog(null, "Gagal hapus");
            }

        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            koneksi();
            int row = jTable1.getSelectedRow();
            String nis = jTable1.getModel().getValueAt(row, jTable1.getColumnModel().getColumnIndex("nis")).toString();

            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM siswa WHERE nis = '" + nis + "'");

            if (sql.next()) {
                String id = sql.getString("nis");
                String nama = sql.getString("nama");
                String rombel = sql.getString("rombel");

                jTextField1.setText(id);
                jTextField2.setText(nama);
                jTextField3.setText(rombel);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Don't leave catch blocks empty, at least print the exception
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
