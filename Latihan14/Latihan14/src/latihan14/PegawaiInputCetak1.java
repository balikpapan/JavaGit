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


/**
 *
 * @author steven
 */
public class PegawaiInputCetak1 extends javax.swing.JFrame {
    
    class tampilPilihanTabel{
        
        /**
         * Sekarang di buat dulu untuk textbox, sementara komponen yg lain tidak
         * 
         * dibuatkan dulu. dibawah ini adalah kode untuk menampilkan data yg ada
         * 
         * di jTable ke komponen-komponen.
         * 
         * 
         */
        
        // try {
        
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        
        
        int editData = jTable1.getSelectedRow();
        
        /**
         * 
         * Di bawah ini kumpulan variabel yg untuk jTextBox
         * 
        */
        
        
        String ID = tm.getValueAt(editData, 0).toString();
        
        String NIK = tm.getValueAt(editData, 1).toString();
        
        String namaLengkap = tm.getValueAt(editData, 2).toString();
        
        String alamat = tm.getValueAt(editData, 9).toString();
        
        String tempatLahir = tm.getValueAt(editData, 10).toString();
        
        String nomerKTP = tm.getValueAt(editData, 12).toString();
        
        
        /**
         * 
         * Di bawah ini source code untuk jComboBox
         * 
         */
        
        
        
        String agama = tm.getValueAt(editData, 4).toString();
        
        String jumlahIstriSuami = tm.getValueAt(editData, 7).toString();
        
        String jumlahAnak = tm.getValueAt(editData, 8).toString();
        
        
        /**
         * 
         * Di bawah ini source code untuk jRadioButton
         * 
         */
        
        
        String golonganDarah = tm.getValueAt(editData, 5).toString();
        
        String statusPernikahan = tm.getValueAt(editData, 6).toString();
        
        String jenisKelamin = tm.getValueAt(editData, 3).toString();
        
        
        
        /**
         * 
         * Di bawah ini source code untuk jDateChooser
         * 
         */
        
        //DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        
        //String berkerjaMulaiTanggal1 = tm.getValueAt(editData, 13).toString();
        
        //String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
        
        //Date berkerjaMulaiTanggal2 = terformat1.parse(berkerjaMulaiTanggal1);
        
        //Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
        
        
        
        
        
        
        // jDateChooser1.setDate();
        
        // jDateChooser2.setDate();
        
        
        
        
        /**
         * 
         * Source Code untuk menampilkan isi jTable ke jTextField
         * 
         */
        
        void tampilTextBox(){
            
            jTextField1.setText(ID);
            
            jTextField2.setText(NIK);
            
            jTextField3.setText(namaLengkap);
            
            jTextField4.setText(alamat);
            
            jTextField5.setText(tempatLahir);
            
            jTextField6.setText(nomerKTP);
            
            
        }
        
        
        /**
         * 
         * Menampilkan isi jTable ke jComboBox Agama
         * 
         */
            
            
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
            
            
            /**
             * 
             * Menampilkan isi jTable ke jComboBox jumlah Istri/Suami
             * 
             */
        
        void tampilJumlahIstriSuami(){
            
            if(jumlahIstriSuami.equals("0")){
                
                jComboBox2.setSelectedIndex(0);
                
                
            } if(jumlahIstriSuami.equals("1")){
                
                jComboBox2.setSelectedIndex(1);
                
                
            } if(jumlahIstriSuami.equals("2")){
                
                jComboBox2.setSelectedIndex(2);
                
                
            } if(jumlahIstriSuami.equals("3")){
                
                jComboBox2.setSelectedIndex(3);
                
                
            } if(jumlahIstriSuami.equals("4")){
                
                jComboBox2.setSelectedIndex(4);
                
            }
        }
        
        
        /**
         * 
         * Menampilkan isi jTable ke jComboBox Jumlah Anak
         * 
         */
    
        void tampilJumlahAnak(){
            
            
            if(jumlahAnak.equals("0")){
                
                jComboBox3.setSelectedIndex(0);
                
                
            } if(jumlahAnak.equals("1")){
                
                jComboBox3.setSelectedIndex(1);
                
                
            } if(jumlahAnak.equals("2")){
                
                jComboBox3.setSelectedIndex(2);
                
            } if(jumlahAnak.equals("3")){
                
                jComboBox3.setSelectedIndex(3);
                
            } if(jumlahAnak.equals("4")){
                
                jComboBox3.setSelectedIndex(4);
                
                
            }
        
        }
        
        //void tampilTanggal(){
            
         //jDateChooser1.setDate(berkerjaMulaiTanggal2);
    
         //jDateChooser2.setDate(tanggalLahir2);
            
        }
            
            
        
      
            
    //} catch(Exception ex) {
        
        //ex.printStackTrace();
    //}
    
    
    

        
        /**
         * 
         * Di bawah ini source code untuk jRadioButton yg tergabung di dalam
         * 
         * buttonGroup
         * 
         */
        
        
        

    
    
    
    

    /**
     * Creates new form PegawaiInputCetak1
     */
    public PegawaiInputCetak1() {
        initComponents();
        
        /**
         * 
         * buttonGroup1 berguna untuk pilihan di Jenis Kelamin
         * 
         * buttonGroup1 digunakan untuk mengumpulkan jRadioButton1 & jRadioButton2
         * 
         * jRadioButton1 berisi nilai Pria
         * 
         * jRadioButton2 berisi nilai Wanita
         * 
         */
        
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
        
        
        
        buttonGroup3.add(jRadioButton7);
        
        buttonGroup3.add(jRadioButton8);
        
        buttonGroup3.add(jRadioButton9);
        
        
        
        jRadioButton7.setActionCommand("Belum Menikah");
        
        jRadioButton8.setActionCommand("Menikah");
        
        jRadioButton9.setActionCommand("Bercerai");
        
        
        
        jComboBox1.addItem("Islam");
        
        jComboBox1.addItem("Kristen Protestan");
        
        jComboBox1.addItem("Kristen Katolik");
        
        jComboBox1.addItem("Budha");
        
        jComboBox1.addItem("Hindu");
        
        jComboBox1.addItem("Kong Hu Cu");
        
        
        
        jComboBox2.addItem("0");
        
        jComboBox2.addItem("1");
        
        jComboBox2.addItem("2");
        
        jComboBox2.addItem("3");
        
        jComboBox2.addItem("4");
        
        
        
        jComboBox3.addItem("0");
        
        jComboBox3.addItem("1");
        
        jComboBox3.addItem("2");
        
        jComboBox3.addItem("3");
        
        jComboBox3.addItem("4");
        
        
        /**
         * 
         * Dibawah ini dibuatkan source code untuk terkoneksi ke databasenya
         * 
         */
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
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
            
            
            
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MM yyyy");
            
            Date berkerjaMulaiTanggal1 = rs.getDate("berkerjamulaitanggal");
            
            Date tanggalLahir1 = rs.getDate("tanggallahir");
            
            String berkerjaMulaiTanggal2 = terformat1.format(berkerjaMulaiTanggal1);
            
            String tanggalLahir2 = terformat1.format(tanggalLahir1);
            
            
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
            
            
            DefaultTableModel tabel1 = new DefaultTableModel(coba2, namaKolom);
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("ID");

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField1.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("NIK");

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField2.setText("jTextField2");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Berkerja Mulai Tanggal");

        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Nama Lengkap");

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField3.setText("jTextField3");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Agama");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Alamat");

        jTextField4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField4.setText("jTextField4");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Golongan Darah");

        jRadioButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton3.setText("A");

        jRadioButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton4.setText("B");

        jRadioButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton5.setText("AB");

        jRadioButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton6.setText("O");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Tempat Lahir");

        jTextField5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField5.setText("jTextField5");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("Status Pernikahan");

        jRadioButton7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton7.setText("Belum Menikah");

        jRadioButton8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton8.setText("Menikah");

        jRadioButton9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton9.setText("Bercerai");

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setText("Tanggal Lahir");

        jTextField6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField6.setText("jTextField6");

        jDateChooser2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("Jumlah Istri/Suami");

        jComboBox2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel13.setText("Nomer KTP");

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel14.setText("Jumlah Anak");

        jComboBox3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton4.setText("Hapus");

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton5.setText("Cetak Laporan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton3)
                                .addComponent(jRadioButton4)
                                .addComponent(jRadioButton5)
                                .addComponent(jRadioButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton7)
                                .addComponent(jRadioButton8)
                                .addComponent(jRadioButton9))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        /**
         * dibawah ini source code untuk jTextField yg nantinya berfungsi untuk
         * 
         * input datanya ke database.
         * 
         */
        
        
        String ID = jTextField1.getText();
        
        String NIK = jTextField2.getText();
        
        String namaLengkap = jTextField3.getText();
        
        String alamat = jTextField4.getText();
        
        String tempatLahir = jTextField5.getText();
        
        String nomerKTP = jTextField6.getText();
        
        
        /**
         * 
         * Di bawah ini source code untuk menginput data menggunakan jRadioButton,
         * 
         * jadi di jRadioButton yg diambil untuk menginput datanya itu adalah buttonGroup
         * 
         */
        
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        
        /**
         * Di bawah ini source code untuk jComboBox, bagaimana kita menginput data
         * 
         * menggunakan jComboBox.
         *
         */
        
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String jumlahIstriSuami = jComboBox2.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox3.getSelectedItem().toString();
        
        
        
        /**
         * 
         * Di bawah ini source code untuk menginput data ke dalam database
         * 
         * menggunakan jDateChooser
         * 
         */
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser1.getDate().getTime());
        
        java.sql.Date berkerjaMulaiTanggal = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        
        
        /**
         * 
         * Selanjutnya dibawah ini adalah source code untuk terkoneksi ke server
         * 
         */
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSInsert = null;
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String masukanData = "INSERT INTO testdatapegawai1" + "(nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal)VALUES" + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSInsert = koneksi.prepareStatement(masukanData);
            
            
            
            PSInsert.setString(1, NIK);
            
            PSInsert.setString(2, namaLengkap);
            
            PSInsert.setString(3, jenisKelamin);
            
            PSInsert.setString(4, agama);
            
            PSInsert.setString(5, golonganDarah);
            
            PSInsert.setString(6, statusPernikahan);
            
            PSInsert.setString(7, jumlahIstriSuami);
            
            PSInsert.setString(8, jumlahAnak);
            
            PSInsert.setString(9, alamat);
            
            PSInsert.setString(10, tempatLahir);
            
            PSInsert.setDate(11, tanggalLahir);
            
            PSInsert.setString(12, nomerKTP);
            
            PSInsert.setDate(13, berkerjaMulaiTanggal);
            
            
            PSInsert.executeUpdate();
            
            stmt = koneksi.createStatement();
            
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while (rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir2 = rs.getDate("tanggallahir");
                
                String tanggalLahir3 = terformat1.format(tanggalLahir2);
                
                Date berkerjaMulaiTanggal2 = rs.getDate("berkerjamulaitanggal");
                
                String berkerjaMulaiTanggal3 = terformat1.format(berkerjaMulaiTanggal2);
                
                
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2, namaKolom);
                
                jTable1.setModel(tabel1);
                
                
                koneksi.close();
                
                
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                
                
                jDateChooser1.setDate(null);
                jDateChooser2.setDate(null);
                
                
                jComboBox1.setSelectedIndex(0);
                
                jComboBox2.setSelectedIndex(0);
                
                jComboBox3.setSelectedIndex(0);
                
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                buttonGroup3.clearSelection();
                
            }
            
        
        } catch (SQLException ex){
            
            ex.printStackTrace();
        
            
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        tampilPilihanTabel obj1 = new tampilPilihanTabel();
        
        obj1.tampilTextBox();
        
        obj1.tampilAgama();
        
        obj1.tampilJumlahIstriSuami();
        
        obj1.tampilJumlahAnak();
        
        try{
            
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            
            int editData = jTable1.getSelectedRow();
            
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            
            String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
            
            String berkerjaMulaiTanggal1 = tm.getValueAt(editData, 13).toString();
            
            Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
            
            Date berkerjaMulaiTanggal2 = terformat1.parse(berkerjaMulaiTanggal1);
            
            
            jDateChooser2.setDate(tanggalLahir2);
            
            jDateChooser1.setDate(berkerjaMulaiTanggal2);
            
            
        } catch(Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PegawaiInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PegawaiInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PegawaiInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PegawaiInputCetak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegawaiInputCetak1().setVisible(true);
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
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
