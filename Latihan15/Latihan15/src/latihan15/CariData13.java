/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan15;

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




/**
 *
 * @author steven
 */
public class CariData13 extends javax.swing.JFrame {

    class tampilPilihanTabel{
        
        DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
        
        int editData = jTable2.getSelectedRow();
        
        
        String jumlahIstri = tm.getValueAt(editData, 7).toString();
        
        String jumlahAnak = tm.getValueAt(editData, 8).toString();
        
        String agama = tm.getValueAt(editData, 4).toString();
        
        String golonganDarah = tm.getValueAt(editData, 5).toString();
        
        String statusPernikahan = tm.getValueAt(editData, 6).toString();
        
        String jenisKelamin = tm.getValueAt(editData, 3).toString();
        
        
        
        void tampilJumlahIstri(){
            
            if(jumlahIstri.equals("0")){
                
                jComboBox4.setSelectedIndex(0);
                
            } else if(jumlahIstri.equals("1")){
                
                jComboBox4.setSelectedIndex(1);
                
            } else if(jumlahIstri.equals("2")){
                
                jComboBox4.setSelectedIndex(2);
                
            } else if(jumlahIstri.equals("3")){
                
                jComboBox4.setSelectedIndex(3);
                
            } else if(jumlahIstri.equals("4")){
                
                jComboBox4.setSelectedIndex(4);
                
            }
            
        }
        
        
        void tampilJumlahAnak(){
            
            if(jumlahAnak.equals("0")){
                
                jComboBox5.setSelectedIndex(0);
                
            } else if(jumlahAnak.equals("1")){
                
                jComboBox5.setSelectedIndex(1);
                
            } else if(jumlahAnak.equals("2")){
                
                jComboBox5.setSelectedIndex(2);
                
            } else if(jumlahAnak.equals("3")){
                
                jComboBox5.setSelectedIndex(3);
                
            } else if(jumlahAnak.equals("4")){
                
                jComboBox5.setSelectedIndex(4);
               
                
            }
             
        }
        
        
        void tampilAgama(){
            
            if(agama.equals("Islam")){
                
                jComboBox3.setSelectedIndex(0);
                
            } else if(agama.equals("Kristen Protestan")){
                
                jComboBox3.setSelectedIndex(1);
                
            } else if(agama.equals("Kristen Katolik")){
                
                jComboBox3.setSelectedIndex(2);
                
            } else if(agama.equals("Budha")){
                
                jComboBox3.setSelectedIndex(3);
                
            } else if(agama.equals("Hindu")){
                
                jComboBox3.setSelectedIndex(4);
                
            } else if(agama.equals("Kong Hu Cu")){
               
                jComboBox3.setSelectedIndex(5);
            }
            
            
        }
        
        
        void tampilJenisKelamin(){
            
            if(jenisKelamin.equals("Pria")){
                
                buttonGroup1.setSelected(jRadioButton1.getModel(), true);
                
            } else if(jenisKelamin.equals("Wanita")){
                
                buttonGroup1.setSelected(jRadioButton2.getModel(), true);
                
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
        
        
        void tampilStatusPernikahan(){
            
            if(statusPernikahan.equals("Belum Menikah")){
                
                buttonGroup3.setSelected(jRadioButton7.getModel(), true);
                
            } else if(statusPernikahan.equals("Menikah")){
                
                buttonGroup3.setSelected(jRadioButton8.getModel(), true);
                
            } else if(statusPernikahan.equals("Bercerai")){
                
                buttonGroup3.setSelected(jRadioButton9.getModel(), true);
            }
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    /**
     * Creates new form CariData13
     */
    public CariData13() {
        initComponents();
        
        /**
         * 
         * buttonGroup untuk jenis kelamin
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
        
        
        
        jComboBox3.addItem("Islam");
        
        jComboBox3.addItem("Kristen Protestan");
        
        jComboBox3.addItem("Kristen Katolik");
        
        jComboBox3.addItem("Budha");
        
        jComboBox3.addItem("Hindu");
        
        jComboBox3.addItem("Kong Hu Cu");
        
        
        jComboBox4.addItem("0");
        
        jComboBox4.addItem("1");
        
        jComboBox4.addItem("2");
        
        jComboBox4.addItem("3");
        
        jComboBox4.addItem("4");
        
        
        jComboBox5.addItem("0");
        
        jComboBox5.addItem("1");
        
        jComboBox5.addItem("2");
        
        jComboBox5.addItem("3");
        
        jComboBox5.addItem("4");
        
        
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
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
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
                
                jTable2.setModel(tabel1);
                
                koneksi.close();
                
            }
            
        } catch(SQLException ex){
            
            ex.printStackTrace();
                
                
            
            
            
        }
        
        /**
         * 
         * Pilihan ComboBox untuk pencarian tanggal
         */
        
        jComboBox1.addItem("tanggallahir");
        
        jComboBox1.addItem("berkerjamulaitanggal");
        
        
        /**
         * 
         * Pilihan ComboBox untuk pencarian data berupa teks
         * 
         */
        
        
        jComboBox2.addItem("nik");
        
        jComboBox2.addItem("namalengkap");
        
        jComboBox2.addItem("jeniskelamin");
        
        jComboBox2.addItem("agama");
        
        jComboBox2.addItem("golongandarah");
        
        jComboBox2.addItem("statuspernikahan");
        
        jComboBox2.addItem("jumlahistri");
        
        jComboBox2.addItem("jumlahanak");
        
        jComboBox2.addItem("alamat");
        
        jComboBox2.addItem("tempatlahir");
        
        jComboBox2.addItem("nomerktp");
        
        
        
        
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cari Edit Data Pegawai");
        setPreferredSize(new java.awt.Dimension(1280, 680));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Pencarian Tanggal");

        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Kolom Tanggal");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton1.setText("Cari Tanggal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Variabel Teks");

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Kolom Varchar");

        jComboBox2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton2.setText("Cari Teks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("ID");

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("NIK");

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Nama Pegawai");

        jTextField4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Alamat");

        jTextField6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("Tempat Lahir");

        jTextField7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Tanggal Lahir");

        jDateChooser2.setDateFormatString("EEEE, dd MMMM yyyy");
        jDateChooser2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setText("Nomer KTP");

        jTextField5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("Jenis Kelamin");

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel13.setText("Berkerja Mulai Tanggal");

        jDateChooser3.setDateFormatString("EEEE, dd MMMM yyyy");
        jDateChooser3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel14.setText("Agama");

        jComboBox3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel15.setText("Golongan Darah");

        jRadioButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton3.setText("A");

        jRadioButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton4.setText("B");

        jRadioButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton5.setText("AB");

        jRadioButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton6.setText("O");

        jLabel16.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel16.setText("Status Pernikahan");

        jRadioButton7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton7.setText("Belum Menikah");

        jRadioButton8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton8.setText("Menikah");

        jRadioButton9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton9.setText("Bercerai");

        jLabel17.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel17.setText("Jumlah Istri/Suami");

        jComboBox4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel18.setText("Jumlah Anak");

        jComboBox5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton4.setText("Simpan Ulang");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton6.setText("Cetak Laporan");

        jButton7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton7.setText("Clear Inputan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton8.setText("Simpan");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(62, 62, 62)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jRadioButton1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton2)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton6))
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton7)
                                            .addComponent(jRadioButton8)
                                            .addComponent(jRadioButton9))
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        /**
         * 
         * Dibawah ini adalah untuk fungsi pencarian berdasarkan tanggal
         * 
         */
        
        
        
        String kolomTanggal1 = jComboBox1.getSelectedItem().toString();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String dataTanggal1 = sdf.format(jDateChooser1.getDate().getTime());
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String cariTanggal = "SELECT * FROM testdatapegawai1 WHERE " + kolomTanggal1 + " = '" + dataTanggal1 + "'";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(cariTanggal);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir1 = rs.getDate("tanggallahir");
                
                Date berkerjaMulaiTanggal1 = rs.getDate("berkerjamulaitanggal");
                
                
                String tanggalLahir2 = terformat1.format(tanggalLahir1);
                
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
                
                jTable2.setModel(tabel1);
                
                koneksi.close();
                
                
            }
            
            
        }catch(SQLException ex){
            
            ex.printStackTrace();
            
            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        /**
         * 
         * Di bawah ini adalah fungsi pencarian berdasarkan pada teks
         * 
         * 
         */
        
        
        String dataVarchar = jTextField1.getText();
        
        String kolomVarchar = jComboBox2.getSelectedItem().toString();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        
        String cariData = "SELECT * FROM testdatapegawai1 WHERE to_tsvector(" + kolomVarchar + ") @@ to_tsquery('" + dataVarchar + "')";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            stmt = koneksi.createStatement();
            
            ResultSet rs = stmt.executeQuery(cariData);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            Vector<Vector> coba2 = new Vector<Vector>();
            
            while(rs.next()){
                
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date berkerjaMulaiTanggal1 = rs.getDate("berkerjamulaitanggal");
                
                String berkerjaMulaiTanggal2 = terformat1.format(berkerjaMulaiTanggal1);
                
                
                Date tanggalLahir1 = rs.getDate("tanggallahir");
                
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
                
                jTable2.setModel(tabel1);
                
                koneksi.close();
                
                
            }
            
            
            
        }catch(SQLException ex){
            
            ex.printStackTrace();
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        String NIK = jTextField3.getText();
        
        String namaLengkap = jTextField4.getText();
        
        String alamat = jTextField7.getText();
        
        String tempatLahir = jTextField6.getText();
        
        String nomerKTP = jTextField5.getText();
        
        
        
        String agama = jComboBox3.getSelectedItem().toString();
        
        String jumlahIstriSuami = jComboBox4.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox5.getSelectedItem().toString();
        
        
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        java.sql.Date berkerjaMulaiTanggal = new java.sql.Date(jDateChooser3.getDate().getTime());
        
        
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSInsert = null;
        
        
        String query = "SELECT id,nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String masukanData = "INSERT INTO testdatapegawai1" + "(nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal)VALUES" + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
            
            while(rs.next()){
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date berkerjaMulaiTanggal2 = rs.getDate("berkerjamulaitanggal");
                
                String berkerjaMulaiTanggal3 = terformat1.format(berkerjaMulaiTanggal2);
                
                
                Date tanggalLahir2 = rs.getDate("tanggallahir");
                
                String tanggalLahir3 = terformat1.format(tanggalLahir2);
                
                
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
                
                isiBaris.add(rs.getString("nomerKTP"));
                
                isiBaris.add(berkerjaMulaiTanggal3);
                
                
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
                
                namaKolom.add(rsmd.getColumnLabel(11));
                
                namaKolom.add(rsmd.getColumnLabel(12));
                
                namaKolom.add(rsmd.getColumnLabel(13));
                
                namaKolom.add(rsmd.getColumnLabel(14));
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable2.setModel(tabel1);
                
                koneksi.close();
                
                
                jTextField3.setText("");
                
                jTextField4.setText("");
                
                jTextField7.setText("");
                
                jTextField6.setText("");
                
                jTextField5.setText("");
                
                
                
                jDateChooser2.setDate(null);
                
                jDateChooser3.setDate(null);
                
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                buttonGroup3.clearSelection();
                
                
                jComboBox3.setSelectedIndex(0);
                
                jComboBox4.setSelectedIndex(0);
                
                jComboBox5.setSelectedIndex(0);
                
                
            }
                
                
                
                
            }catch(SQLException ex){
                
                ex.printStackTrace();
            
            
            
            
            
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        tampilPilihanTabel obj1 = new tampilPilihanTabel();
        
        obj1.tampilJumlahAnak();
        
        obj1.tampilJumlahIstri();
        
        obj1.tampilAgama();
        
        obj1.tampilJenisKelamin();
        
        obj1.tampilGolonganDarah();
        
        obj1.tampilStatusPernikahan();
        
        
        
        try{
            
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            
            int editData = jTable2.getSelectedRow();
            
            
            // ID
            
            jTextField2.setText(tm.getValueAt(editData, 0).toString());
            
            // NIK
            
            jTextField3.setText(tm.getValueAt(editData, 1).toString());
            
            
            // Nama Lengkap
            
            jTextField4.setText(tm.getValueAt(editData, 2).toString());
            
            
            // Alamat
            
            jTextField7.setText(tm.getValueAt(editData, 9).toString());
            
            
            // Tempat Lahir
            
            jTextField6.setText(tm.getValueAt(editData, 10).toString());
            
            
            // Nomer KTP
            
            jTextField5.setText(tm.getValueAt(editData, 12).toString());
            
            
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            
            String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
            
            String berkerjaMulaiTanggal1 = tm.getValueAt(editData, 13).toString();
            
            Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
            
            Date berkerjaMulaiTanggal2 = terformat1.parse(berkerjaMulaiTanggal1);
            
            
            jDateChooser2.setDate(tanggalLahir2);
            
            jDateChooser3.setDate(berkerjaMulaiTanggal2);
            
            
        }catch(Exception ex){
            
            ex.printStackTrace();
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        /**
         * 
         * Source code dibawah ini berguna untuk mengedit data yg ada di tabel
         * 
         * postgresql
         * 
         */
        
        
        String ID = jTextField2.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        String NIK = jTextField3.getText();
        
        String namaLengkap = jTextField4.getText();
        
        String alamat = jTextField7.getText();
        
        String tempatLahir = jTextField6.getText();
        
        String nomerKTP = jTextField5.getText();
        
        
        
        String agama = jComboBox3.getSelectedItem().toString();
        
        String jumlahIstriSuami = jComboBox4.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox5.getSelectedItem().toString();
        
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        java.sql.Date berkerjaMulaiTanggal = new java.sql.Date(jDateChooser3.getDate().getTime());
        
        
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSUpdate = null;
        
        
        String query = "SELECT id,nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String updateData = "UPDATE testdatapegawai1 SET nik = ?, namalengkap = ?, jeniskelamin = ?, agama = ?, golongandarah = ?, statuspernikahan = ?, jumlahistri = ?, jumlahanak = ?, alamat = ?, tempatlahir = ?, tanggallahir = ?, nomerktp = ?, berkerjamulaitanggal = ? WHERE id = ?";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSUpdate = koneksi.prepareStatement(updateData);
            
            
            
            PSUpdate.setString(1, NIK);
            
            PSUpdate.setString(2, namaLengkap);
            
            PSUpdate.setString(3, jenisKelamin);
            
            PSUpdate.setString(4, agama);
            
            PSUpdate.setString(5, golonganDarah);
            
            PSUpdate.setString(6, statusPernikahan);
            
            PSUpdate.setString(7, jumlahIstriSuami);
            
            PSUpdate.setString(8, jumlahAnak);
            
            PSUpdate.setString(9, alamat);
            
            PSUpdate.setString(10, tempatLahir);
            
            PSUpdate.setDate(11, tanggalLahir);
            
            PSUpdate.setString(12, nomerKTP);
            
            PSUpdate.setDate(13, berkerjaMulaiTanggal);
            
            PSUpdate.setInt(14, ID2);
            
            
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
                
                
                DefaultTableModel tabel1 = new DefaultTableModel(coba2, namaKolom);
                
                jTable2.setModel(tabel1);
                
                
                koneksi.close();
                
                
                jTextField3.setText("");
                
                jTextField4.setText("");
                
                jTextField7.setText("");
                
                jTextField6.setText("");
                
                jTextField5.setText("");
                
                
                jDateChooser2.setDate(null);
                
                jDateChooser3.setDate(null);
                
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                buttonGroup3.clearSelection();
                
                
                jComboBox3.setSelectedIndex(0);
                
                jComboBox4.setSelectedIndex(0);
                
                jComboBox5.setSelectedIndex(0);
                
                
            }
            
            
            
        }catch(SQLException ex){
            
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String ID = jTextField2.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        String NIK = jTextField3.getText();
        
        String namaLengkap = jTextField4.getText();
        
        String alamat = jTextField7.getText();
        
        String tempatLahir = jTextField6.getText();
        
        String nomerKTP = jTextField5.getText();
        
        
        String agama = jComboBox3.getSelectedItem().toString();
        
        String jumlahIstriSuami = jComboBox4.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox5.getSelectedItem().toString();
        
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        java.sql.Date berkerjaMulaiTanggal = new java.sql.Date(jDateChooser3.getDate().getTime());
        
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSHapus = null;
        
        
        String query = "SELECT id,nik,namalengkap,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String hapusData = "DELETE FROM testdatapegawai1 WHERE id = ?";
        
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
                
                Date berkerjaMulaiTanggal2 = rs.getDate("berkerjamulaitanggal");
                
                String berkerjaMulaiTanggal3 = terformat1.format(berkerjaMulaiTanggal2);
                
                
                Vector<String> isiBaris = new Vector<String>();
                
                isiBaris.add(rs.getString("id"));
                
                isiBaris.add(rs.getString("nik"));
                
                isiBaris.add(rs.getString("namalengkap"));
                
                isiBaris.add(rs.getString("alamat"));
                
                isiBaris.add(rs.getString("jeniskelamin"));
                
                isiBaris.add(rs.getString("agama"));
                
                isiBaris.add(rs.getString("golongandarah"));
                
                isiBaris.add(rs.getString("statuspernikahan"));
                
                isiBaris.add(rs.getString("jumlahistri"));
                
                isiBaris.add(rs.getString("jumlahanak"));
                
                isiBaris.add(rs.getString("alamat"));
                
                
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
                
                jTable2.setModel(tabel1);
                
                
                koneksi.close();
                
                
                jTextField3.setText("");
                
                jTextField4.setText("");
                
                jTextField7.setText("");
                
                jTextField6.setText("");
                
                jTextField5.setText("");
                
                
                jDateChooser2.setDate(null);
                
                jDateChooser3.setDate(null);
                
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                buttonGroup3.clearSelection();
                
                
                jComboBox3.setSelectedIndex(0);
                
                jComboBox4.setSelectedIndex(0);
                
                jComboBox5.setSelectedIndex(0);
            }
            
            
            
        }catch(SQLException ex){
            
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        jTextField2.setText("");
        
        jTextField3.setText("");
        
        jTextField4.setText("");
        
        jTextField7.setText("");
        
        jTextField6.setText("");
        
        jTextField5.setText("");
        
        
        jDateChooser2.setDate(null);
        
        jDateChooser3.setDate(null);
        
        
        buttonGroup1.clearSelection();
        
        buttonGroup2.clearSelection();
        
        buttonGroup3.clearSelection();
        
        
        
        jComboBox3.setSelectedIndex(0);
        
        jComboBox4.setSelectedIndex(0);
        
        jComboBox5.setSelectedIndex(0);
        
        
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(CariData13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CariData13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CariData13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CariData13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CariData13().setVisible(true);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
