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

import java.util.Date;

import java.sql.*;

import java.util.Vector;



/**
 *
 * @author steven
 */
public class FrameInputData9 extends javax.swing.JFrame {

    /**
     * Creates new form FrameInputData9
     */
    public FrameInputData9() {
        initComponents();
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
             //   {null, null, null, null},
             //   {null, null, null, null},
             //   {null, null, null, null},
             //   {null, null, null, null}
            },
            new String [] {
            //    "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT idnama,namalengkap FROM nama2";
        
        
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
            
            
            while (rs.next()){
            
            
            int idNama1 = rs.getInt("idnama");
            
            String namaLengkap1 = rs.getString("namalengkap");
            
            
            
            String idNama2 = rsmd.getColumnLabel(1);
            
            String namaLengkap2 = rsmd.getColumnLabel(2);
            
            
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            
            
            
            tm.setColumnIdentifiers(new Object [] {(idNama2),(namaLengkap2)});
            
            
            tm.addRow(new Object [] {(idNama1),(namaLengkap1)});
            
            
            
            
            
            
            
            koneksi.close();
            
            
           
            
            
        }
        
            stmt.close();
        
    } catch (SQLException ex) {
            
    
       
            
        
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
        jButton1 = new javax.swing.JButton();

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

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton1.setLabel("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT idNama,namaLengkap FROM nama2";
        
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
            
            
            while (rs.next()){
            
            
            int idNama1 = rs.getInt("idnama");
            
            String namaLengkap1 = rs.getString("namalengkap");
            
            
            
            String idNama2 = rsmd.getColumnLabel(1);
            
            String namaLengkap2 = rsmd.getColumnLabel(2);
            
            
            
            
            
            
            
            
            
            
            
            koneksi.close();
            
            
            
            
            }
            
            
        } catch (SQLException ex) {
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameInputData9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInputData9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInputData9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInputData9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInputData9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
