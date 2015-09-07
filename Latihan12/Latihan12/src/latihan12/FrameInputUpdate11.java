/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan12;


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

import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.swing.JRViewer;

import net.sf.jasperreports.view.JasperViewer;

import net.sf.jasperreports.engine.xml.JRXmlLoader;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.engine.design.JasperDesign;

import net.sf.jasperreports.engine.JasperReport;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import com.toedter.calendar.JDateChooser;








/**
 *
 * @author steven
 */
public class FrameInputUpdate11 extends javax.swing.JFrame {
    
    class tampilPilihanTabel{
        
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        
        int editData = jTable1.getSelectedRow();
        
        
        
        String ID = tm.getValueAt(editData, 0).toString();
        
        String NIK = tm.getValueAt(editData, 1).toString();
        
        String namaPegawai = tm.getValueAt(editData, 2).toString();
        
        String jenisKelamin = tm.getValueAt(editData, 3).toString();
        
        String agama = tm.getValueAt(editData, 4).toString();
        
        String golonganDarah = tm.getValueAt(editData, 5).toString();
        
        String statusPernikahan = tm.getValueAt(editData, 6).toString();
        
        String jumlahIstri = tm.getValueAt(editData, 7).toString();
        
        String jumlahAnak = tm.getValueAt(editData, 8).toString();
        
        
        
        void tampilTextBox(){
            
            /**
             * Untuk menampilkan nilai dari jTable ke jTextField yg ada di form
             * 
             */
            
            
            jTextField1.setText(ID);
            
            jTextField2.setText(NIK);
            
            jTextField3.setText(namaPegawai);
            
        }
            
            
            /**
             * Di bawah ini source code untuk menampilkan isi di jTable ke dalam
             * 
             * jComboBox yang ada di form
             * 
             */
            
            
        void tampilAgama(){
            
            /**
             * Untuk menampilkan nilai di kolom agama yg ada di jTable ke
             * 
             * jComboBox agama yg terdapat di form
             * 
             */
            
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
            
            
        void tampilJumlahIstri(){
            
            
            if (jumlahIstri.equals("0")){
                
                jComboBox3.setSelectedIndex(0);
            
            
            } else if(jumlahIstri.equals("1")){
                
                jComboBox3.setSelectedIndex(1);
                
                
            } else if(jumlahIstri.equals("2")){
             
                jComboBox3.setSelectedIndex(2);
                
                
            } else if(jumlahIstri.equals("3")){
                
                jComboBox3.setSelectedIndex(3);
                
                
            } else if(jumlahIstri.equals("4")){
                
                jComboBox3.setSelectedIndex(4);
                
                
            }
            
            
        }
            
        
        
        void tampilJumlahAnak(){
            
            
            
            if (jumlahAnak.equals("0")){
                
                jComboBox4.setSelectedIndex(0);
            
            } else if(jumlahAnak.equals("1")){
                
                jComboBox4.setSelectedIndex(1);
                
                
            } else if(jumlahAnak.equals("2")){
                
                jComboBox4.setSelectedIndex(2);
                
                
            } else if(jumlahAnak.equals("3")){
                
                jComboBox4.setSelectedIndex(3);
                
                
            } else if(jumlahAnak.equals("4")){
                
                jComboBox4.setSelectedIndex(4);
                
            }
            
            
        }
            
        
        void tampiljenisKelamin(){
            
            if(jenisKelamin.equals("Pria")){
                
                buttonGroup1.setSelected(jRadioButton1.getModel(), true);
                
            }else if(jenisKelamin.equals("Wanita")){
                
                buttonGroup1.setSelected(jRadioButton2.getModel(), true);
            }
            
            
            
        }
        
        
        void tampilGolonganDarah(){
            
            
            if(golonganDarah.equals("A")){
                
                buttonGroup2.setSelected(jRadioButton6.getModel(), true);
                
                
            }else if(golonganDarah.equals("B")){
                
                buttonGroup2.setSelected(jRadioButton7.getModel(), true);
                
                
            }else if(golonganDarah.equals("AB")){
                
                buttonGroup2.setSelected(jRadioButton8.getModel(), true);
                
                 
            }else if(golonganDarah.equals("O")){
                
                buttonGroup2.setSelected(jRadioButton9.getModel(), true);
            }
            }
        
        
        void tampilStatusPernikahan(){
            
            
            if(statusPernikahan.equals("Belum Menikah")){
                
                buttonGroup3.setSelected(jRadioButton3.getModel(), true);
                
                
            }else if(statusPernikahan.equals("Menikah")){
                
                buttonGroup3.setSelected(jRadioButton4.getModel(), true);
                
            
            }else if(statusPernikahan.equals("Bercerai")){
                
                buttonGroup3.setSelected(jRadioButton5.getModel(), true);
            }
        }
        
        
    }   
    
    
        
   // class variabelPastiAda{
        
        // void variabel1(){
            
        // String nik = jTextField2.getText();
        
        // Integer nik2 = Integer.valueOf(nik);
        
        // String namaPegawai = jTextField3.getText();
        
        // String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        // String agama = jComboBox1.getSelectedItem().toString();
        
        // String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        // String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        // String jumlahIstri = jComboBox3.getSelectedItem().toString();
        
        // String jumlahAnak = jComboBox4.getSelectedItem().toString();
            
            
    // }
        
    // }
            
        
        
    
    
    

    /**
     * Creates new form FrameInputUpdate11
     */
    public FrameInputUpdate11() {
        initComponents();
        
        buttonGroup1.add(jRadioButton1);
        
        buttonGroup1.add(jRadioButton2);
        
        
        jRadioButton1.setActionCommand("Pria");
        
        jRadioButton2.setActionCommand("Wanita");
        
        
        
        buttonGroup2.add(jRadioButton6);
        
        buttonGroup2.add(jRadioButton7);
        
        buttonGroup2.add(jRadioButton8);
        
        buttonGroup2.add(jRadioButton9);
        
        
        
        jRadioButton6.setActionCommand("A");
        
        jRadioButton7.setActionCommand("B");
        
        jRadioButton8.setActionCommand("AB");
        
        jRadioButton9.setActionCommand("O");
        
        
        
        
        
        buttonGroup3.add(jRadioButton3);
        
        buttonGroup3.add(jRadioButton4);
        
        buttonGroup3.add(jRadioButton5);
        
        
        
        
        jRadioButton3.setActionCommand("Belum Menikah");
        
        jRadioButton4.setActionCommand("Menikah");
        
        jRadioButton5.setActionCommand("Bercerai");
        
        
        
        
        jComboBox1.addItem("Islam");
        
        jComboBox1.addItem("Kristen Protestan");
        
        jComboBox1.addItem("Kristen Katolik");
        
        jComboBox1.addItem("Budha");
        
        jComboBox1.addItem("Hindu");
        
        jComboBox1.addItem("Kong Hu Cu");
        
        
        jComboBox3.addItem("0");
        
        jComboBox3.addItem("1");
        
        jComboBox3.addItem("2");
        
        jComboBox3.addItem("3");
        
        jComboBox3.addItem("4");
        
        
        
        jComboBox4.addItem("0");
        
        jComboBox4.addItem("1");
        
        jComboBox4.addItem("2");
        
        jComboBox4.addItem("3");
        
        jComboBox4.addItem("4");
        
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak FROM testdatapegawai1";
        
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
            
            
            Vector<String> isiBaris = new Vector<String>();
            
            isiBaris.add(rs.getString("id"));
            
            isiBaris.add(rs.getString("nik"));
            
            isiBaris.add(rs.getString("namapegawai"));
            
            isiBaris.add(rs.getString("jeniskelamin"));
            
            isiBaris.add(rs.getString("agama"));
            
            isiBaris.add(rs.getString("golongandarah"));
            
            isiBaris.add(rs.getString("statuspernikahan"));
            
            isiBaris.add(rs.getString("jumlahistri"));
            
            isiBaris.add(rs.getString("jumlahanak"));
            
            
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
            
            
            DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
            
            jTable1.setModel(tabel1);
            
            koneksi.close();
            
            
            
        }
        
        
    }catch (SQLException ex){
    
    
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("ID");

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("NIK");

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Nama Pegawai");

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Agama");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Golongan Darah");

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Status Pernikahan");

        jRadioButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton3.setText("Belum Menikah");

        jRadioButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton4.setText("Menikah");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton5.setText("Bercerai");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Jumlah Istri");

        jComboBox3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Jumlah Anak");

        jComboBox4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

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

        jRadioButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton6.setText("A");

        jRadioButton7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton7.setText("B");

        jRadioButton8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton8.setText("AB");

        jRadioButton9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton9.setText("O");

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
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton6)
                                        .addGap(28, 28, 28)
                                        .addComponent(jRadioButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton9))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton5)))))
                        .addGap(0, 374, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(85, 85, 85)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        /**
         * 
         * Source code untuk menginput data ke dalam tabel postgresql
         * 
         */
        
        String nik = jTextField2.getText();
        
        String namaPegawai = jTextField3.getText();
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        String jumlahIstri = jComboBox3.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox4.getSelectedItem().toString();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSInsert = null;
        
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak FROM testdatapegawai1";
        
        String masukanData = "INSERT INTO testdatapegawai1" + "(nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak)VALUES" + "(?,?,?,?,?,?,?,?)";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSInsert = koneksi.prepareStatement(masukanData);
            
            PSInsert.setString(1, nik);
            
            PSInsert.setString(2, namaPegawai);
            
            PSInsert.setString(3, jenisKelamin);
            
            PSInsert.setString(4, agama);
            
            PSInsert.setString(5, golonganDarah);
            
            PSInsert.setString(6, statusPernikahan);
            
            PSInsert.setString(7, jumlahIstri);
            
            PSInsert.setString(8, jumlahAnak);
            
            
            PSInsert.executeUpdate();
            
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
               
                
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("namapegawai"));
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                isiBaris.add(rs.getString("statuspernikahan"));
                
                isiBaris.add(rs.getString("jumlahistri"));
                
                isiBaris.add(rs.getString("jumlahanak"));
                
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                
                jTable1.setModel(tabel1);
                
                
                koneksi.close();
                
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                buttonGroup3.clearSelection();
                
                jComboBox1.setSelectedIndex(0);
                
                jComboBox3.setSelectedIndex(0);
                
                jComboBox4.setSelectedIndex(0);
            }
            
        }catch (SQLException ex){
            
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        tampilPilihanTabel obj1 = new tampilPilihanTabel();
        
        obj1.tampilTextBox();
        
        obj1.tampilAgama();
        
        obj1.tampilJumlahIstri();
        
        obj1.tampilJumlahAnak();
        
        obj1.tampiljenisKelamin();
        
        obj1.tampilGolonganDarah();
        
        obj1.tampilStatusPernikahan();
        
        
            
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String id = jTextField1.getText();
        
        Integer id2 = Integer.valueOf(id);
        
        
        String nik = jTextField2.getText();
        
        
        String namaPegawai = jTextField3.getText();
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        String jumlahIstri = jComboBox3.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox4.getSelectedItem().toString();
        
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSUpdate = null;
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak FROM testdatapegawai1";
        
        String updateData = "UPDATE testdatapegawai1 SET nik = ?, namapegawai = ?, jeniskelamin = ?, agama = ?, golongandarah = ?, statuspernikahan = ?, jumlahistri = ?, jumlahanak = ? WHERE id = ?";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSUpdate = koneksi.prepareStatement(updateData);
            
            PSUpdate.setString(1, nik);
            
            PSUpdate.setString(2, namaPegawai);
            
            PSUpdate.setString(3, jenisKelamin);
            
            PSUpdate.setString(4, agama);
            
            PSUpdate.setString(5, golonganDarah);
            
            PSUpdate.setString(6, statusPernikahan);
            
            PSUpdate.setString(7, jumlahIstri);
            
            PSUpdate.setString(8, jumlahAnak);
            
            PSUpdate.setInt(9, id2);
            
            
            PSUpdate.executeUpdate();
            
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("namapegawai"));
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                isiBaris.add(rs.getString("statuspernikahan"));
                
                isiBaris.add(rs.getString("jumlahistri"));
                
                isiBaris.add(rs.getString("jumlahanak"));
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2, namaKolom);
                
                jTable1.setModel(tabel1);
                
                koneksi.close();
                
            }
            
        } catch(SQLException ex){
            
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String id = jTextField1.getText();
        
        Integer id2 = Integer.valueOf(id);
        
        
        String nik = jTextField2.getText();
        
        
        String namaPegawai = jTextField3.getText();
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        String jumlahIstri = jComboBox3.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox4.getSelectedItem().toString();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSHapus = null;
        
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak FROM testdatapegawai1";
        
        String hapusData = "DELETE FROM testdatapegawai1 WHERE id = ?";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSHapus = koneksi.prepareStatement(hapusData);
            
            PSHapus.setInt(1, id2);
            
            PSHapus.executeUpdate();
            
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
            
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("namapegawai"));
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                isiBaris.add(rs.getString("statuspernikahan"));
                
                isiBaris.add(rs.getString("jumlahistri"));
                
                isiBaris.add(rs.getString("jumlahanak"));
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(tabel1);
                
                koneksi.close();
                
                
                
                jTextField1.setText("");
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jComboBox1.setSelectedIndex(0);
                
                jComboBox3.setSelectedIndex(0);
                
                jComboBox4.setSelectedIndex(0);
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                buttonGroup3.clearSelection();
            
            
                
                
            }
            
            
        }catch(SQLException ex){
            
            ex.printStackTrace();
            
            
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        /**
         * Kode untuk cetak laporan
         */
        
        
        Connection koneksi = null;
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            JasperDesign rancanganJasper = JRXmlLoader.load("/home/steven/JavaProject/Latihan12/Latihan12/src/latihan12/LaporanFIU12.jrxml");
            
            JasperReport laporanJasper = JasperCompileManager.compileReport(rancanganJasper);
            
            JasperPrint cetakJasper = JasperFillManager.fillReport(laporanJasper, null,koneksi);
            
            JasperViewer.viewReport(cetakJasper);
            
            
        }catch (Exception ex){
            
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
            java.util.logging.Logger.getLogger(FrameInputUpdate11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInputUpdate11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInputUpdate11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInputUpdate11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInputUpdate11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
