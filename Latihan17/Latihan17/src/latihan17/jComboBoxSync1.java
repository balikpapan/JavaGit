/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17;

import javax.swing.SwingUtilities;

import javax.swing.JTable;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.ResultSetMetaData;

import java.sql.Statement;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

import java.sql.*;

import java.util.Locale;

import java.util.Vector;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import com.toedter.calendar.JDateChooser;

import java.text.DateFormat;

import java.util.Date;

import java.awt.event.*;

import java.awt.Event;

import java.awt.*;

import java.util.Locale.Builder;

import javax.swing.ComboBoxModel;

import javax.swing.DefaultComboBoxModel;





/**
 *
 * @author steven
 */
public class jComboBoxSync1 extends javax.swing.JFrame {

    /**
     * Creates new form jComboBoxSync1
     */
    public jComboBoxSync1() {
        initComponents();
        
        /**
         * jComboBox1 untuk variabel pangkat
         */
        
        jComboBox1.addItem(new Pangkat("Pegawai Dasar Muda"));
        
        jComboBox1.addItem(new Pangkat("Pegawai Dasar Muda 1"));
        
        jComboBox1.addItem(new Pangkat("Pegawai Dasar"));
        
        jComboBox1.addItem("Pegawai Dasar 1");
        
        jComboBox1.addItem("Pelaksana Muda");
        
        jComboBox1.addItem("Pelaksana Muda 1");
        
        jComboBox1.addItem("Pelaksana");
        
        jComboBox1.addItem("Pelaksana 1");
        
        jComboBox1.addItem("Staf Muda");
        
        jComboBox1.addItem("Staf Muda 1");
        
        jComboBox1.addItem("Staf");
        
        jComboBox1.addItem("Staf 1");
        
        jComboBox1.addItem("Staf Madya");
        
        jComboBox1.addItem("Staf Madya 1");
        
        jComboBox1.addItem("Staf Utama Madya");
        
        jComboBox1.addItem("Staf Utama");
        
        
        /**
         * jComboBox2 untuk variabel golongan
         */
        
        jComboBox2.addItem("Golongan A Ruang 1");
        
        jComboBox2.addItem("Golongan A Ruang 2");
        
        jComboBox2.addItem("Golongan A Ruang 3");
        
        jComboBox2.addItem("Golongan A Ruang 4");
        
        jComboBox2.addItem("Golongan B Ruang 1");
        
        jComboBox2.addItem("Golongan B Ruang 2");
        
        jComboBox2.addItem("Golongan B Ruang 3");
        
        jComboBox2.addItem("Golongan B Ruang 4");
        
        jComboBox2.addItem("Golongan C Ruang 1");
        
        jComboBox2.addItem("Golongan C Ruang 2");
        
        jComboBox2.addItem("Golongan C Ruang 3");
        
        jComboBox2.addItem("Golongan C Ruang 4");
        
        jComboBox2.addItem("Golongan D Ruang 1");
        
        jComboBox2.addItem("Golongan D Ruang 2");
        
        jComboBox2.addItem("Golongan D Ruang 3");
        
        jComboBox2.addItem("Golongan D Ruang 4");
        
        
        String pangkat = jComboBox1.getSelectedItem().toString();
        
        String golongan = jComboBox2.getSelectedItem().toString();
        
        
        
      
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Pangkat");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Golongan");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        String pangkat = jComboBox1.getSelectedItem().toString();
        
        String golongan = jComboBox2.getSelectedItem().toString();
        
        jTextField1.setText(pangkat);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(jComboBoxSync1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jComboBoxSync1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jComboBoxSync1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jComboBoxSync1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jComboBoxSync1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
