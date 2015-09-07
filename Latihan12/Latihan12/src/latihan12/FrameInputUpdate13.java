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
public class FrameInputUpdate13 extends javax.swing.JFrame {
    
    class tampilPilihanTabel{
        
        /**
         * source code dibawah ini untuk sebagai tambahan agar source code void
         * 
         * tampilTextBox
         * 
         */
        
        
        
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        
        
        int editData = jTable1.getSelectedRow();
        
        
        String ID = tm.getValueAt(editData, 0).toString();
        
        String NIK = tm.getValueAt(editData, 1).toString();
        
        String namaLengkap = tm.getValueAt(editData, 2).toString();
        
        String alamat = tm.getValueAt(editData, 9).toString();
        
        String tempatLahir = tm.getValueAt(editData, 10).toString();
        
        
        DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        
        String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
        
        
        
        
        
        void tampilTextBox(){
            
            jTextField1.setText(ID);
            
            jTextField5.setText(NIK);
            
            jTextField2.setText(namaLengkap);
            
  
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
    
    
        
        void tampilJumlahIstri(){
            
            if (jumlahIstri.equals("0")){
                
                jComboBox2.setSelectedIndex(0);
                
                
            } else if(jumlahIstri.equals("1")){
                
                jComboBox2.setSelectedIndex(1);
                
                
            } else if(jumlahIstri.equals("2")){
                
                jComboBox2.setSelectedIndex(2);
                
                
            } else if(jumlahIstri.equals("3")){
                
                jComboBox2.setSelectedIndex(3);
                
                
            } else if(jumlahIstri.equals("4")){
                
               jComboBox2.setSelectedIndex(4);
               
                
            } 
            
            
            
        }
        
        
        void tampilJumlahAnak(){
            
            
            
            if(jumlahAnak.equals("0")){
                
                jComboBox3.setSelectedIndex(0);
                
                
            } else if(jumlahAnak.equals("1")){
                
                jComboBox3.setSelectedIndex(1);
                
                
            } else if(jumlahAnak.equals("2")){
                
                jComboBox3.setSelectedIndex(2);
                
                
            } else if(jumlahAnak.equals("3")){
                
                jComboBox3.setSelectedIndex(3);
                
                
            } else if(jumlahAnak.equals("4")){
                
                jComboBox3.setSelectedIndex(4);
                
                
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
     * Creates new form FrameInputUpdate13
     */
    public FrameInputUpdate13() {
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
                
                
                DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                
                Date tanggalLahir = rs.getDate("tanggallahir");
                
                Date berkerjaMulaiTanggal = rs.getDate("berkerjamulaitanggal");
                
                String tanggalLahir1 = terformat1.format(tanggalLahir);
                
                String berkerjaMulaiTanggal1 = terformat1.format(berkerjaMulaiTanggal);
                
                
                
                
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
                
                isiBaris.add(tanggalLahir1);
                
                isiBaris.add(rs.getString("nomerktp"));
                
                isiBaris.add(berkerjaMulaiTanggal1);
                
                
                
                
                
                
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("NIK");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Tempat Lahir");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Tanggal Lahir");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Nomer KTP");

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Jenis Kelamin");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Agama");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Golongan Darah");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("Berkerja Mulai Tanggal");

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setText("Status Pernikahan");

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("Jumlah Istri/Suami");

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel13.setText("Jumlah Anak");

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

        jTextField1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jTextField6.setToolTipText("");

        jDateChooser1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton1.setText("Pria");

        jRadioButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton2.setText("Wanita");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel14.setText("Alamat");

        jTextField5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jRadioButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton3.setText("A");

        jRadioButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton4.setText("B");

        jRadioButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton5.setText("AB");

        jRadioButton6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton6.setText("O");

        jDateChooser2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jRadioButton7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton7.setText("Belum Menikah");

        jRadioButton8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton8.setText("Menikah");

        jRadioButton9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jRadioButton9.setText("Bercerai");

        jComboBox2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jComboBox3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton2.setText("Simpan Ulang");

        jButton3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton4.setText("Hapus");

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton5.setText("Cetak Laporan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton6))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(jRadioButton7)
                                            .addComponent(jRadioButton8)
                                            .addComponent(jRadioButton9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        /**
         * 
         * Source Code untuk menginput data ke tabel postgresql
         * 
         * 
         */
        
        
        
        
        String nik = jTextField5.getText();
        
        String namaLengkap = jTextField2.getText();
        
        String jenisKelamin = buttonGroup1.getSelection().getActionCommand();
        
        String agama = jComboBox1.getSelectedItem().toString();
        
        String golonganDarah = buttonGroup2.getSelection().getActionCommand();
        
        String statusPernikahan = buttonGroup3.getSelection().getActionCommand();
        
        String jumlahIstri = jComboBox2.getSelectedItem().toString();
        
        String jumlahAnak = jComboBox3.getSelectedItem().toString();
        
        String alamat = jTextField3.getText();
        
        String tempatLahir = jTextField4.getText();
        
        java.sql.Date tanggalLahir = new java.sql.Date(jDateChooser1.getDate().getTime());
        
        String nomerKTP = jTextField6.getText();
        
        java.sql.Date berkerjaMulaiTanggal = new java.sql.Date(jDateChooser2.getDate().getTime());
        
        
        
        
        Connection koneksi = null;
        
        Statement stmt = null;
        
        PreparedStatement PSInsert = null;
        
        
        String query = "SELECT id,nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal FROM testdatapegawai1";
        
        String masukanData = "INSERT INTO testdatapegawai1" + "(nik,namapegawai,jeniskelamin,agama,golongandarah,statuspernikahan,jumlahistri,jumlahanak,alamat,tempatlahir,tanggallahir,nomerktp,berkerjamulaitanggal)VALUES" + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        String url = "jdbc:postgresql://localhost:5432/pdam";
        
        String user = "steven";
        
        String password = "kucing";
        
        
        try{
            
            
            koneksi = DriverManager.getConnection(url,user,password);
            
            PSInsert = koneksi.prepareStatement(masukanData);
            
            PSInsert.setString(1, nik);
            
            PSInsert.setString(2, namaLengkap);
            
            PSInsert.setString(3, jenisKelamin);
            
            PSInsert.setString(4, agama);
            
            PSInsert.setString(5, golonganDarah);
            
            PSInsert.setString(6, statusPernikahan);
            
            PSInsert.setString(7, jumlahIstri);
            
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
            
            Date tanggalLahir2 = rs.getDate("tanggallahir");
            
            String tanggalLahir3 = terformat1.format(tanggalLahir2);
            
            
            Date berkerjaMulaiTanggal2 = rs.getDate("berkerjamulaitanggal");
            
            String berkerjaMulaiTanggal3 = terformat1.format("berkerjamulaitanggal");
            
            
            
            
            
            Vector<String> isiBaris = new Vector<String>();
            
            isiBaris.add(rs.getString("id"));
            
            isiBaris.add(rs.getString("nik"));
            
            isiBaris.add(rs.getString("namapegawai"));
            
            isiBaris.add(rs.getString("jeniskelamin"));
            
            isiBaris.add(rs.getString("agama"));
            
            isiBaris.add(rs.getString("golongandarah"));
            
            isiBaris.add(rs.getString("statuspernikahan"));
            
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
            
            namaKolom.addElement(rsmd.getColumnLabel(15));
            
            
            DefaultTableModel tabel1 = new DefaultTableModel(coba2,namaKolom);
            
            jTable1.setModel(tabel1);
            
            koneksi.close();
            
            
            jTextField1.setText("");
            
            jTextField5.setText("");
            
            jTextField2.setText("");
            
            jTextField3.setText("");
            
            jTextField4.setText("");
            
            jTextField6.setText("");
            
            jDateChooser1.setDate(null);
            
            jDateChooser2.setDate(null);
            
            buttonGroup1.clearSelection();
            
            buttonGroup2.clearSelection();
            
            buttonGroup3.clearSelection();
            
            jComboBox1.setSelectedIndex(0);
            
            jComboBox2.setSelectedIndex(0);
            
            jComboBox3.setSelectedIndex(0);
            
            
        }
        
    } catch(SQLException ex){
    
    ex.printStackTrace();
            
            

            
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        tampilPilihanTabel obj1 = new tampilPilihanTabel();
        
        obj1.tampilTextBox();
        obj1.tampilAgama();
        obj1.tampilJumlahIstri();
        obj1.tampilJumlahAnak();
        obj1.tampilJenisKelamin();
        obj1.tampilGolonganDarah();
        obj1.tampilStatusPernikahan();
        
        
        
        
        
        
        try{
            
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            
            int editData = jTable1.getSelectedRow();
            
            // ID
            jTextField1.setText(tm.getValueAt(editData, 0).toString());
            
            // NIK
            jTextField5.setText(tm.getValueAt(editData, 1).toString());
            
            // Nama Lengkap
            jTextField2.setText(tm.getValueAt(editData, 2).toString());
            
            // Alamat
            jTextField3.setText(tm.getValueAt(editData, 9).toString());
            
            // Tempat Lahir
            jTextField4.setText(tm.getValueAt(editData, 10).toString());
            
            
            // Tanggal Lahir
            DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            
            String tanggalLahir1 = tm.getValueAt(editData, 11).toString();
            
            Date tanggalLahir2 = terformat1.parse(tanggalLahir1);
            
            
            // nomer ktp
            jTextField6.setText(tm.getValueAt(editData, 12).toString());
            
            // Jenis Kelamin
            buttonGroup1.setSelected(null, rootPaneCheckingEnabled);
            
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
            java.util.logging.Logger.getLogger(FrameInputUpdate13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInputUpdate13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInputUpdate13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInputUpdate13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInputUpdate13().setVisible(true);
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
