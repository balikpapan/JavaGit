/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan16;

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

import java.util.Locale.Builder;






/**
 *
 * @author steven
 * 
 * Berikut ini adalah source code untuk mengubah format tanggal di jDateChooser
 * 
 * sehingga menjadi format Indonesia
 * 
 * 
 */
public class FormatJDateChooser extends javax.swing.JFrame {

    /**
     * Creates new form FormatJDateChooser
     */
    public FormatJDateChooser() {
        initComponents();
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        jDateChooser1.setLocale(indonesiaLocale);
        
        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
                
                Date berkerjaMulaiTanggal1 = rs.getDate("berkerjamulaitanggal");
                
                Date tanggalLahir1 = rs.getDate("tanggallahir");
                
                
                String berkerjaMulaiTanggal2 = terformat1.format(berkerjaMulaiTanggal1);
                
                String tanggalLahir2 = terformat1.format(tanggalLahir1);
                
                
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
        } catch(SQLException ex){
            
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Tanggal Lahir");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try{
            
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            
            int editData = jTable1.getSelectedRow();
            
            
            // TanggalLahir
            
            Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
            
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
            
            String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
            
            Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
            
            // Locale locale = new Locale("id","ID");
            
            // jDateChooser1.setLocale(indonesiaLocale);
            
            jDateChooser1.setDate(tanggalLahir2);
            
            
            
            
            
        }catch(Exception ex){
            
            ex.printStackTrace();
            
            
            
            
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
            java.util.logging.Logger.getLogger(FormatJDateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatJDateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatJDateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatJDateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatJDateChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
