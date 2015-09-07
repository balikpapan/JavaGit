/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan14;


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

import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.swing.JRViewer;

import net.sf.jasperreports.view.JasperViewer;

import net.sf.jasperreports.engine.xml.JRXmlLoader;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.engine.design.JasperDesign;

import net.sf.jasperreports.engine.JasperReport;





/**
 *
 * @author steven
 */
public class AnakInputCetak1 extends javax.swing.JFrame {
    
    class tampilPilihanTable{
        
        
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        
        int editData = jTable1.getSelectedRow();
        
        
        String jenisKelamin = tm.getValueAt(editData, 7).toString();
        
        String agama = tm.getValueAt(editData, 8).toString();
        
        
        String golonganDarah = tm.getValueAt(editData, 9).toString();
        
        
        void tampilJenisKelamin(){
            
            if(jenisKelamin.equals("Pria")){
                
                buttonGroup1.setSelected(jRadioButton1.getModel(), true);
                
                
            } else if(jenisKelamin.equals("Wanita")){
                
                buttonGroup1.setSelected(jRadioButton2.getModel(), true);
            }
            
            
        }
        
        
        void tampilAgama(){
            
            if(agama.equals("Islam")){
                
                jComboBox1.setSelectedIndex(0);
                
                
            } else if(agama.equals("Kristen Protestan")){
                
                jComboBox1.setSelectedIndex(1);
                
                
            } else if(agama.equals("Kristen Katolik")){
                
                jComboBox1.setSelectedIndex(2);
                
               
                
            } else if(agama.equals("Budha")){
                
                jComboBox1.setSelectedIndex(3);
                
                
            } else if(agama.equals("Hindu")){
                
                jComboBox1.setSelectedIndex(4);
                
                
            } else if(agama.equals("Kong Hu Cu")){
                
                jComboBox1.setSelectedIndex(5);
                
                
            }
            
            
        }
        
        
        void tampilGolonganDarah(){
            
            if(golonganDarah.equals("A")){
                
                
                buttonGroup2.setSelected(jRadioButton3.getModel(), true);
                
                
               
            } else if(golonganDarah.equals("B")){
                
                
                buttonGroup2.setSelected(jRadioButton4.getModel(), true);
                
                
            } else if(golonganDarah.equals("AB")){
                
                
                buttonGroup2.setSelected(jRadioButton5.getModel(), true);
                
                
            } else if(golonganDarah.equals("O")){
            
                buttonGroup2.setSelected(jRadioButton6.getModel(), true);
                
                
            }
        }
        
        
        
        
        
    }
    
    

    /**
     * Creates new form AnakInputCetak1
     */
    public AnakInputCetak1() {
        initComponents();
        
        buttonGroup1.add(jRadioButton1);
        
        buttonGroup1.add(jRadioButton2);
        
        
        jRadioButton1.setActionCommand("Pria");
        
        jRadioButton2.setActionCommand("Wanita");
        
        
        
        buttonGroup2.add(jRadioButton3);
        
        buttonGroup2.add(jRadioButton4);
        
        buttonGroup2.add(jRadioButton5);
        
        buttonGroup2.add(jRadioButton6);
        
        
        jRadioButton3.setActionCommand("A");
        
        jRadioButton4.setActionCommand("B");
        
        jRadioButton5.setActionCommand("AB");
        
        jRadioButton6.setActionCommand("O");
        
        
        
        jComboBox1.addItem("Islam");
        
        jComboBox1.addItem("Kristen Protestan");
        
        jComboBox1.addItem("Kristen Katolik");
        
        jComboBox1.addItem("Budha");
        
        jComboBox1.addItem("Hindu");
        
        jComboBox1.addItem("Kong Hu Cu");
        
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM anak";
        
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
                
                
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("tempatlahir"));
                
                isiBaris.add(tanggalLahir2);
                
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                koneksi.close();
                
            }
            
            
        } catch (SQLException ex){
            
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input Anak");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("ID");

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("NIK");

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Nomer KTP");

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Nama Lengkap");

        jTextField4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Alamat");

        jTextField5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Tempat Lahir");

        jTextField6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Tanggal Lahir");

        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Agama");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jComboBox1.setAutoscrolls(true);

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("Golongan Darah");

        jRadioButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton3.setText("A");
        jRadioButton3.setToolTipText("");

        jRadioButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton4.setText("B");

        jRadioButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton5.setText("AB");

        jRadioButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton6.setText("O");

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

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton5.setText("Cetak Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton6.setText("Clear Inputan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(96, 96, 96)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton6)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton6)
                                            .addComponent(jRadioButton3))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String NIK = jTextField2.getText();
        
        String nomerKTP = jTextField3.getText();
        
        String namaLengkap = jTextField4.getText();
        
        String alamat = jTextField5.getText();
        
        String tempatLahir = jTextField6.getText();
        
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser1.getDate().getTime());
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSInsert = null;
        
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM anak";
        
        String masukanData = "INSERT INTO anak" + "(nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah)VALUES" + "(?,?,?,?,?,?,?,?,?)";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSInsert = koneksi.prepareStatement(masukanData);
            
            PSInsert.setString(1, NIK);
            
            PSInsert.setString(2, nomerKTP);
            
            PSInsert.setString(3, namaLengkap);
            
            PSInsert.setString(4, alamat);
            
            PSInsert.setString(5, tempatLahir);
            
            PSInsert.setDate(6, tanggalLahir);
            
            PSInsert.setString(7, jenisKelamin);
            
            PSInsert.setString(8, agama);
            
            PSInsert.setString(9, golonganDarah);
            
            
            PSInsert.executeUpdate();
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            
            while(rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir2 = rs.getDate("tanggallahir");
                
                String tanggalLahir3 = terformat1.format(tanggalLahir2);
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("tempatlahir"));
                
                isiBaris.add(tanggalLahir3);
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                
                coba2.add(isiBaris);
                
                Vector<String> namaKolom = new Vector<String>();
                
                namaKolom.add(rsmd.getColumnLabel(1));
                
                namaKolom.add(rsmd.getColumnLabel(2));
                
                namaKolom.add(rsmd.getColumnLabel(3));
                
                namaKolom.add(rsmd.getColumnLabel(4));
                
                namaKolom.add(rsmd.getColumnLabel(5));
                
                namaKolom.add(rsmd.getColumnLabel(6));
                
                namaKolom.add(rsmd.getColumnLabel(7));
                
                namaKolom.add(rsmd.getColumnLabel(8));
                
                namaKolom.add(rsmd.getColumnLabel(9));
                
                namaKolom.add(rsmd.getColumnLabel(10));
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                koneksi.close();
                
                
                jTextField1.setText("");
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jTextField4.setText("");
                
                jTextField5.setText("");
                
                jTextField6.setText("");
                
                
                jDateChooser1.setDate(null);
                
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                
                jComboBox1.setSelectedIndex(0);
                
                
                
                
                
            }
            
        } catch(SQLException ex){
            
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        tampilPilihanTable obj1 = new tampilPilihanTable();
        
        obj1.tampilJenisKelamin();
        
        obj1.tampilAgama();
        
        obj1.tampilGolonganDarah();
        
        
        try{
            
            
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            
            int editData = jTable1.getSelectedRow();
            
            
            // ID
            
            jTextField1.setText(tm.getValueAt(editData, 0).toString());
            
            // NIK
            
            jTextField2.setText(tm.getValueAt(editData, 1).toString());
            
            // Nomer KTP
            
            jTextField3.setText(tm.getValueAt(editData, 2).toString());
            
            // Nama Lengkap
            
            jTextField4.setText(tm.getValueAt(editData, 3).toString());
            
            // Alamat
            
            jTextField5.setText(tm.getValueAt(editData, 4).toString());
            
            // Tempat Lahir
            
            jTextField6.setText(tm.getValueAt(editData, 5).toString());
            
            
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            
            String tanggalLahir1 = tm.getValueAt(editData, 6).toString();
            
            Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
            
            jDateChooser1.setDate(tanggalLahir2);
            
            
        }catch(Exception ex){
            
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String ID = jTextField1.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        String NIK = jTextField2.getText();
        
        String nomerKTP = jTextField3.getText();
        
        String namaLengkap = jTextField4.getText();
        
        String alamat = jTextField5.getText();
        
        String tempatLahir = jTextField6.getText();
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser1.getDate().getTime());
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSUpdate = null;
        
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM anak";
        
        String updateData = "UPDATE anak SET nik = ?,nomerktp = ?,namalengkap = ?,alamat = ?,tempatlahir = ?,tanggallahir = ?,jeniskelamin = ?,agama = ?,golongandarah = ? WHERE id = ?";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSUpdate = koneksi.prepareStatement(updateData);
            
            
            PSUpdate.setString(1, NIK);
            
            PSUpdate.setString(2, nomerKTP);
            
            PSUpdate.setString(3, namaLengkap);
            
            PSUpdate.setString(4, alamat);
            
            PSUpdate.setString(5, tempatLahir);
            
            PSUpdate.setDate(6, tanggalLahir);
            
            PSUpdate.setString(7, jenisKelamin);
            
            PSUpdate.setString(8, agama);
            
            PSUpdate.setString(9, golonganDarah);
            
            PSUpdate.setInt(10, ID2);
            
            
            PSUpdate.executeUpdate();
            
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir2 = rs.getDate("tanggallahir");
                
                String tanggalLahir3 = terformat1.format(tanggalLahir2);
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("tempatlahir"));
                
                isiBaris.add(tanggalLahir3);
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                koneksi.close();
                
                
                jTextField1.setText("");
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jTextField4.setText("");
                
                jTextField5.setText("");
                
                jTextField6.setText("");
                
                
                jDateChooser1.setDate(null);
                
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                
                jComboBox1.setSelectedIndex(0);
                
                
            }
            
            
            
        } catch (SQLException ex){
            
            ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String ID = jTextField1.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        String NIK = jTextField2.getText();
        
        String nomerKTP = jTextField3.getText();
        
        String namaLengkap = jTextField4.getText();
        
        String alamat = jTextField5.getText();
        
        String tempatLahir = jTextField6.getText();
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser1.getDate().getTime());
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSHapus = null;
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM anak";
        
        String hapusData = "DELETE FROM anak WHERE id=?";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSHapus = koneksi.prepareStatement(hapusData);
            
            PSHapus.setInt(1, ID2);
            
            PSHapus.executeUpdate();
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir2 = rs.getDate("tanggallahir");
                
                String tanggalLahir3 = terformat1.format(tanggalLahir2);
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("tempatLahir"));
                
                isiBaris.add(tanggalLahir3);
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                
                koneksi.close();
                
                
                jTextField1.setText("");
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jTextField4.setText("");
                
                
                jDateChooser1.setDate(null);
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                
                jComboBox1.setSelectedIndex(0);
                
                
                
            }
            
            
        } catch(SQLException ex){
            
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        jTextField1.setText("");
        
        jTextField2.setText("");
        
        jTextField3.setText("");
        
        jTextField4.setText("");
        
        jTextField5.setText("");
        
        jTextField6.setText("");
        
        
        jDateChooser1.setDate(null);
        
        buttonGroup1.clearSelection();
        
        buttonGroup2.clearSelection();
        
        
        jComboBox1.setSelectedIndex(0);
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        // Cetak Laporan
        
        Connection koneksi = null;
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            JasperDesign rancanganJasper = JRXmlLoader.load("/home/steven/JavaProject/Latihan14/Latihan14/src/latihan14/HasilInputAnak.jrxml");
            
            JasperReport laporanJasper = JasperCompileManager.compileReport(rancanganJasper);
            
            JasperPrint cetakJasper = JasperFillManager.fillReport(laporanJasper,null,koneksi);
            
            JasperViewer.viewReport(cetakJasper);
            
        }catch(Exception ex){
            
            System.out.println("Terjadi Error : " + ex.getMessage());
            
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AnakInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnakInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnakInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnakInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnakInputCetak1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
