/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan11;


import javax.swing.JTable;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.ResultSetMetaData;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.logging.Logger;

import java.util.logging.Level;

import javax.swing.table.DefaultTableModel;

import java.text.DateFormat;


import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.sql.*;

import java.util.Vector;

/**
 *
 * @author steven
 */
public class FrameInputData7 extends javax.swing.JFrame {

    /**
     * Creates new form FrameInputData7
     */
    public FrameInputData7() {
        initComponents();
        
        
        Vector namaKolom = new Vector();
        
        namaKolom.addElement("ID Pengguna");
        namaKolom.addElement("Nama Lengkap");
        namaKolom.addElement("Nama Pengguna");
        namaKolom.addElement("Kata Kunci");
        namaKolom.addElement("Tanggal Mulai");
        namaKolom.addElement("Tanggal Berakhir");
        
        
        // Vector barisData = new Vector();
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        
        String query = "SELECT idpengguna,namalengkap,namapengguna,katakunci,tanggalmulai,tanggalberakhir FROM pengguna";
        
        
        try {
            
            
            String url = "jdbc:postgresql://localhost:5432/pdam";
            
            String user = "steven";
            
            String password = "kucing";
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            
            if (koneksi != null);
            
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numberOfColumns = rsmd.getColumnCount();
            
            
          // namaKolom.addElement("ID Pengguna");
         // namaKolom.addElement("Nama Lengkap");
         // namaKolom.addElement("Nama Pengguna");
         // namaKolom.addElement("Kata Kunci");
         // namaKolom.addElement("Tanggal Mulai");
        //  namaKolom.addElement("Tanggal Berakhir");
          
          
          while (rs.next());
          
          //namaKolom.addElement("ID Pengguna");
          // namaKolom.addElement("Nama Lengkap");
          // namaKolom.addElement("Nama Pengguna");
          // namaKolom.addElement("Kata Kunci");
          // namaKolom.addElement("Tanggal Mulai");
          // namaKolom.addElement("Tanggal Berakhir");
          
          
          
          int idPengguna = rs.getInt("idpengguna");
          
          String namaLengkap = rs.getString("namalengkap");
          
          String namaPengguna = rs.getString("namapengguna");
          
          String kataKunci = rs.getString("katakunci");
          
          
          Date tanggalMulai = rs.getDate("tanggalmulai");
          
          Date tanggalBerakhir = rs.getDate("tanggalberakhir");
          
          
          Vector barisData = new Vector();
          
          
          barisData.addElement(idPengguna);
          
          barisData.addElement(namaLengkap);
          
          barisData.addElement(namaPengguna);
          
          barisData.addElement(kataKunci);
          
          barisData.addElement(tanggalMulai);
          
          barisData.addElement(tanggalBerakhir);
          
          
          
          DefaultTableModel tabel1 = new DefaultTableModel(barisData,namaKolom);
          
          
          jTable1.setModel(tabel1);
          
          
          // koneksi.close();
          
          // stmt.close();
          
            
        
            
            
        
        
       
    } catch (SQLException ex) {
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameInputData7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInputData7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInputData7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInputData7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInputData7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
