/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;


import javax.swing.JRadioButton;

import javax.swing.SwingUtilities;

import javax.swing.ButtonGroup;

import javax.swing.JTable;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.ResultSetMetaData;

import java.sql.Statement;

import java.util.logging.Level;

import javax.swing.table.DefaultTableModel;

import java.sql.*;

import java.util.*;

import java.util.Locale;

import java.util.Vector;

import javax.swing.JOptionPane;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import com.toedter.calendar.JDateChooser;




/**
 *
 * @author steven
 */
public class CariEditInput extends javax.swing.JFrame {
    
    class tampilPilihanTabel {
        
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        
        int editData = jTable1.getSelectedRow();
        
        
        String jumlahIstri = tm.getValueAt(editData, 7).toString();
        
        String jumlahAnak = tm.getValueAt(editData, 8).toString();
        
        String agama = tm.getValueAt(editData, 4).toString();
        
        String golonganDarah = tm.getValueAt(editData, 5).toString();
        
        String statusPernikahan = tm.getValueAt(editData, 6).toString();
        
        String jenisKelamin = tm.getValueAt(editData, 3).toString();
        
        
        
        void tampilJenisKelamin(){
            
            if(jenisKelamin.equals("Pria")){
                
                buttonGroup1.setSelected(jRadioButton1.getModel(), true);
                
                
            } else if(jenisKelamin.equals("Wanita")){
                
                buttonGroup1.setSelected(jRadioButton2.getModel(), true);
                
                
            }
        }
        
        
    }
    
    
    

    /**
     * Creates new form CariEditInput
     */
    public CariEditInput() {
        initComponents();
        
        buttonGroup1.add(jRadioButton1);
        
        buttonGroup1.add(jRadioButton2);
        
        
        jRadioButton1.setActionCommand("Pria");
        
        jRadioButton2.setActionCommand("Wanita");
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        
        try {
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                
                Date tanggalLahir1 = rs.getDate("tanggallahir");
                
                String tanggalLahir2 = terformat1.format(tanggalLahir1);
                
                
                Date berkerjaMulaiTanggal1 = rs.getDate("berkerjamulaitanggal");
                
                String berkerjaMulaiTanggal2 = terformat1.format(berkerjaMulaiTanggal1);
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                isiBaris.add(rs.getString("statuspernikahan"));
                
                isiBaris.add(rs.getString("jumlahistri"));
                
                isiBaris.add(rs.getString("jumlahanak"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("tempatlahir"));
                
                isiBaris.add(tanggalLahir2);
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(berkerjaMulaiTanggal2);
                
                
                coba2.add(isiBaris);
                
                Vector<String> namaKolom = new Vector<String>();
                
                namaKolom.addElement(rsmd.getColumnLabel(1));
                
                namaKolom.addElement(rsmd.getColumnLabel(2));
                
                namaKolom.addElement(rsmd.getColumnLabel(3));
                
                namaKolom.addElement(rsmd.getColumnLabel(4));
                
                namaKolom.addElement(rsmd.getColumnLabel(5));
                
                namaKolom.addElement(rsmd.getColumnLabel(6));
                
                namaKolom.addElement(rsmd.getColumnLabel(7));
                
                namaKolom.addElement(rsmd.getColumnLabel(8));
                
                namaKolom.addElement(rsmd.getColumnLabel(9));
                
                namaKolom.addElement(rsmd.getColumnLabel(10));
                
                namaKolom.addElement(rsmd.getColumnLabel(11));
                
                namaKolom.addElement(rsmd.getColumnLabel(12));
                
                namaKolom.addElement(rsmd.getColumnLabel(13));
                
                namaKolom.addElement(rsmd.getColumnLabel(14));
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                koneksi.close();
                
            }
                
            }catch(SQLException ex){
                
                ex.printStackTrace();
                
            
            
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Tanggal Lahir");

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Jenis Kelamin");

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton3.setText("Simpan Ulang");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("ID");

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        tampilPilihanTabel obj1 = new tampilPilihanTabel();
        
        obj1.tampilJenisKelamin();
        
        
        try{
            
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            
            int editData = jTable1.getSelectedRow();
            
            // ID
            
            jTextField1.setText(tm.getValueAt(editData, 0).toString());
            
            
            
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            
            String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
            
            Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
            
            jDateChooser1.setDate(tanggalLahir2);
            
        }catch (Exception ex){
            
            ex.printStackTrace();
        
        
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String ID = jTextField1.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser1.getDate().getTime());
       
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSUpdate = null;
        
        String query = "SELECT id,nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String updateData = "UPDATE testdatapegawai1 SET jeniskelamin = ?, tanggallahir = ? WHERE id = ?";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try {
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSUpdate = koneksi.prepareStatement(updateData);
            
            
            
            PSUpdate.setString(1, jenisKelamin);
            
            PSUpdate.setDate(2, tanggalLahir);
            
            PSUpdate.setInt(3, ID2);
            
            
            PSUpdate.executeUpdate();
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir2 = rs.getDate("tanggallahir");
                
                String tanggalLahir3 = terformat1.format(tanggalLahir2);
                
                
                Date berkerjaMulaiTanggal2 = rs.getDate("berkerjamulaitanggal");
                
                String berkerjaMulaiTanggal3 = terformat1.format(berkerjaMulaiTanggal2);
                
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                isiBaris.add(rs.getString("statuspernikahan"));
                
                isiBaris.add(rs.getString("jumlahistri"));
                
                isiBaris.add(rs.getString("jumlahanak"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("tempatlahir"));
                
                isiBaris.add(tanggalLahir3);
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(berkerjaMulaiTanggal3);
                
                
                coba2.add(isiBaris);
                
                
                Vector<String> namaKolom = new Vector<String>();
                
                namaKolom.addElement(rsmd.getColumnLabel(1));
                
                namaKolom.addElement(rsmd.getColumnLabel(2));
                
                namaKolom.addElement(rsmd.getColumnLabel(3));
                
                namaKolom.addElement(rsmd.getColumnLabel(4));
                
                namaKolom.addElement(rsmd.getColumnLabel(5));
                
                namaKolom.addElement(rsmd.getColumnLabel(6));
                
                namaKolom.addElement(rsmd.getColumnLabel(7));
                
                namaKolom.addElement(rsmd.getColumnLabel(8));
                
                namaKolom.addElement(rsmd.getColumnLabel(9));
                
                namaKolom.addElement(rsmd.getColumnLabel(10));
                
                namaKolom.addElement(rsmd.getColumnLabel(11));
                
                namaKolom.addElement(rsmd.getColumnLabel(12));
                
                namaKolom.addElement(rsmd.getColumnLabel(13));
                
                namaKolom.addElement(rsmd.getColumnLabel(14));
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                
                koneksi.close();
                
                
                jTextField1.setText("");
                
                jDateChooser1.setDate(null);
                
                buttonGroup1.clearSelection();
                
                
            }
                
            }catch(SQLException ex){
                
                ex.printStackTrace();
            
            
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CariEditInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CariEditInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CariEditInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CariEditInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CariEditInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
