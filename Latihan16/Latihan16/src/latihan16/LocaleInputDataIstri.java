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

import java.awt.event.*;

import java.awt.Event;

import java.awt.*;

import java.util.Locale.Builder;





/**
 *
 * @author steven
 */


public class LocaleInputDataIstri extends javax.swing.JFrame {
    
    class tampilPilihanTabel{
        
        
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
                
                if (agama.equals("Islam")){
                    
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
     * Creates new form LocaleInputDataIstri
     */
    public LocaleInputDataIstri() {
        initComponents();
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        jDateChooser1.setLocale(indonesiaLocale);
        
        jDateChooser2.setLocale(indonesiaLocale);
        
        
        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        
        jDateChooser2.setDateFormatString("EEEE, dd MMMM yyyy");
        
        
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
        
        
        jComboBox3.addItem("Islam");
        
        jComboBox3.addItem("Kristen Protestan");
        
        jComboBox3.addItem("Kristen Katolik");
        
        jComboBox3.addItem("Budha");
        
        jComboBox3.addItem("Hindu");
        
        jComboBox3.addItem("Kong Hu Cu");
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM anak";
        
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
                
                
                DefaultTableModel table1 = new DefaultTableModel(coba2,namaKolom);
                
                jTable1.setModel(table1);
                
                koneksi.close();
                
                
                
                
            }
            
            
        } catch (SQLException ex){
            
            ex.printStackTrace();
        }
        
        
        jComboBox1.addItem("tanggallahir");
        
        
        jComboBox2.addItem("nik");
        
        jComboBox2.addItem("nomerktp");
        
        jComboBox2.addItem("namalengkap");
        
        jComboBox2.addItem("alamat");
        
        jComboBox2.addItem("tempatlahir");
        
        jComboBox2.addItem("jeniskelamin");
        
        jComboBox2.addItem("agama");
        
        jComboBox2.addItem("golongandarah");
        
        
        
        
        
        
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cari Input Edit Suami/istri");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Pencarian Tanggal");

        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton1.setText("Cari Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Kolom Varchar");

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton2.setText("Cari Teks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Kolom Tanggal");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Variabel Teks");

        jComboBox2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton3.setText("Clear Pencarian");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("ID");

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton4.setText("Simpan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("NIK");

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Tempat Lahir");

        jTextField4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Nomer KTP");

        jTextField5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("Tanggal Lahir");

        jDateChooser2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton5.setText("Update Data");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setText("Nama Lengkap");

        jTextField6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("Agama");

        jComboBox3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton6.setText("Hapus");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel13.setText("Alamat");

        jTextField7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel14.setText("Golongan Darah");

        jRadioButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton3.setText("A");

        jRadioButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton4.setText("B");

        jRadioButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton5.setText("AB");

        jRadioButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton6.setText("O");

        jButton7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton7.setText("Cetak Laporan");

        jButton8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton8.setText("Clear Inputan");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        
        String kolomTanggal1 = jComboBox1.getSelectedItem().toString();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String dataTanggal1 = sdf.format(jDateChooser1.getDate().getTime());
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String cariTanggal = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM anak WHERE " + kolomTanggal1 + " = '" + dataTanggal1 + "'";
        
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
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
                
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
                
            }
            
            
        } catch(SQLException ex){
            
            ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        String dataVarchar = jTextField1.getText();
        
        String kolomVarchar = jComboBox2.getSelectedItem().toString();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String cariData = "SELECT * FROM istri WHERE to_tsvector(" + kolomVarchar + ") @@ to_tsquery('" + dataVarchar + "')";
        
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
                
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
                
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
                
                
            } catch(SQLException ex){
                
                ex.printStackTrace();
            
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        
        
        jDateChooser1.setDate(null);
        
        jComboBox1.setSelectedIndex(0);
        
        jTextField1.setText("");
        
        jComboBox2.setSelectedIndex(0);
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM istri";
        
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
            
            } catch(SQLException ex){
                
                ex.printStackTrace();
            
            
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        
        String NIK = jTextField3.getText();
        
        String nomerKTP = jTextField5.getText();
        
        String namaLengkap = jTextField6.getText();
        
        String alamat = jTextField7.getText();
        
        String tempatLahir = jTextField4.getText();
        
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox3.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSInsert = null;
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM istri";
        
        String masukanData = "INSERT INTO istri" + "(nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah)VALUES" + "(?,?,?,?,?,?,?,?,?)";
        
        
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
                
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy",indonesiaLocale);
                
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
                
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jTextField5.setText("");
                
                jTextField6.setText("");
                
                jTextField7.setText("");
                
                jTextField4.setText("");
                
                
                jDateChooser2.setDate(null);
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                
                jComboBox3.setSelectedIndex(0);
                
                
                
            }
            
            
        } catch(SQLException ex){
            
            ex.printStackTrace();
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
        
        
        String ID = jTextField2.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        String NIK = jTextField3.getText();
        
        String nomerKTP = jTextField5.getText();
        
        String namaLengkap = jTextField6.getText();
        
        String alamat = jTextField7.getText();
        
        String tempatLahir = jTextField4.getText();
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox3.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSUpdate = null;
        
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM istri";
        
        String updateData = "UPDATE istri SET nik = ?,nomerktp = ?,namalengkap = ?,alamat = ?,tempatlahir = ?,tanggallahir = ?,jeniskelamin = ?,agama = ?,golongandarah = ? WHERE id = ?";
        
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
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
                
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
                
                
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jTextField5.setText("");
                
                jTextField6.setText("");
                
                jTextField7.setText("");
                
                jTextField4.setText("");
                
                
                jDateChooser2.setDate(null);
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                jComboBox3.setSelectedIndex(0);
                
            }
            
            
        }catch(SQLException ex){
            
            ex.printStackTrace();
            
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        String ID = jTextField2.getText();
        
        Integer ID2 = Integer.valueOf(ID);
        
        String NIK = jTextField3.getText();
        
        String nomerKTP = jTextField4.getText();
        
        String namaLengkap = jTextField6.getText();
        
        String alamat = jTextField7.getText();
        
        String tempatLahir = jTextField4.getText();
        
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox3.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSHapus = null;
        
        
        String query = "SELECT id,nik,nomerktp,namalengkap,alamat,tempatlahir,tanggallahir,jeniskelamin,agama,golongandarah FROM istri";
        
        String hapusData = "DELETE FROM istri WHERE id = ?";
        
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
                
                isiBaris.add(rs.getString("tempatlahir"));
                
                isiBaris.add(rs.getString("tanggallahir"));
                
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
                
                
                jTextField2.setText("");
                
                jTextField3.setText("");
                
                jTextField5.setText("");
                
                jTextField6.setText("");
                
                jTextField7.setText("");
                
                jTextField4.setText("");
                
                
                jDateChooser2.setDate(null);
                
                buttonGroup1.clearSelection();
                
                buttonGroup2.clearSelection();
                
                
                jComboBox3.setSelectedIndex(0);
                
                
            }
                
            } catch(SQLException ex){
                
                ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        
        jTextField2.setText("");
        
        jTextField3.setText("");
        
        jTextField5.setText("");
        
        jTextField6.setText("");
        
        jTextField7.setText("");
        
        jTextField4.setText("");
        
        
        jDateChooser2.setDate(null);
        
        buttonGroup1.clearSelection();
        
        buttonGroup2.clearSelection();
        
        jComboBox3.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP){
            
            tampilPilihanTabel obj1 = new tampilPilihanTabel();
            
            obj1.tampilJenisKelamin();
            
            obj1.tampilGolonganDarah();
            
            obj1.tampilAgama();
            
            
            try{
                
                
                DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                
                int editData = jTable1.getSelectedRow();
                
                // ID
                
                jTextField2.setText(tm.getValueAt(editData, 0).toString());
                
                
                // NIK
                
                jTextField3.setText(tm.getValueAt(editData, 1).toString());
                
                
                // Nomer KTP
                
                jTextField5.setText(tm.getValueAt(editData, 2).toString());
                
                // Nama lengkap
                
                jTextField6.setText(tm.getValueAt(editData, 3).toString());
                
                
                // Alamat
                
                jTextField7.setText(tm.getValueAt(editData, 4).toString());
                
                // Tempat Lahir
                
                jTextField4.setText(tm.getValueAt(editData, 5).toString());
                
                
                // Tanggal Lahir
                
                Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
                
                String tanggalLahir1 = tm.getValueAt(editData, 6).toString();
                
                Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
                
                jDateChooser2.setDate(tanggalLahir2);
                
                
            } catch(Exception ex){
                
                ex.printStackTrace();
                
            }
            
            
        }
        
        
        
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        tampilPilihanTabel obj1 = new tampilPilihanTabel();
            
            obj1.tampilJenisKelamin();
            
            obj1.tampilGolonganDarah();
            
            obj1.tampilAgama();
            
            
            try{
                
                
                DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                
                int editData = jTable1.getSelectedRow();
                
                // ID
                
                jTextField2.setText(tm.getValueAt(editData, 0).toString());
                
                
                // NIK
                
                jTextField3.setText(tm.getValueAt(editData, 1).toString());
                
                
                // Nomer KTP
                
                jTextField5.setText(tm.getValueAt(editData, 2).toString());
                
                // Nama lengkap
                
                jTextField6.setText(tm.getValueAt(editData, 3).toString());
                
                
                // Alamat
                
                jTextField7.setText(tm.getValueAt(editData, 4).toString());
                
                // Tempat Lahir
                
                jTextField4.setText(tm.getValueAt(editData, 5).toString());
                
                
                // Tanggal Lahir
                
                Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy", indonesiaLocale);
                
                String tanggalLahir1 = tm.getValueAt(editData, 6).toString();
                
                Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
                
                jDateChooser2.setDate(tanggalLahir2);
                
                
            } catch(Exception ex){
                
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
            java.util.logging.Logger.getLogger(LocaleInputDataIstri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocaleInputDataIstri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocaleInputDataIstri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocaleInputDataIstri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocaleInputDataIstri().setVisible(true);
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
