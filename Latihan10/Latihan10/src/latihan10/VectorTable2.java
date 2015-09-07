/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan10;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import java.awt.Dimension;

import java.awt.GridLayout;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.Vector;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;




/**
 *
 * @author steven
 */
public class VectorTable2 extends JPanel {
    
    private boolean DEBUG = false;
    
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    
    static final String DB_URL = "jdbc:postgresql://localhost:5432/pdam";
            
    static final String USER = "steven";
    
    static final String PASS = "kucing";
    
    Connection conn = null;
    
    Statement stmt = null;
    
    static Vector<Vector<String>> data = new Vector<Vector<String>>();
    
    
    public VectorTable2(){
        
        super(new GridLayout(1,0));
        
        Vector <String> namaKolom = new Vector<String>();
        
        namaKolom.add("id");
        
        namaKolom.add("nik");
        
        namaKolom.add("namapegawai");
        
        String query = "SELECT id,nik,namapegawai FROM nama";
        
        try {
            
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                
                
                Vector<String> vstring = new Vector<String>();
                
                vstring.add(rs.getString("id"));
                
                vstring.add(rs.getString("nik"));
                
                vstring.add(rs.getString("namapegawai"));
                
                vstring.add("\n\n\n\n\n\n");
                
                
                data.add(vstring);
                
            }
            
        } catch (SQLException e) {
            
            
            e.printStackTrace();
            
        } finally {
            
            
            if (stmt != null) {
                
                try {
                    
                    stmt.close();
                    
                    stmt.close();
                    
                } catch (SQLException ex) {
                    
                    
                }
                
            }
        }
        
  


// final JTable tabel = new JTable(data, columnNames);

DefaultTableModel model = new DefaultTableModel(data, namaKolom);

final JTable tabel = new JTable(model);

tabel.setPreferredScrollableViewportSize(new Dimension(500, 70));


tabel.setFillsViewportHeight(true);


if (DEBUG) {


tabel.addMouseListener(new MouseAdapter() {

public void mouseClicked(MouseEvent e) {


printDebugData(tabel);


}

});

}


// Create the scroll pane and add the table to it

JScrollPane scrollPane = new JScrollPane (tabel);


// Add the Scroll pane and add the table to it

add(scrollPane);


    }
    
    
    private void printDebugData(JTable table){
        
        
        int numRows = table.getRowCount();
        
        int numCols = table.getColumnCount();
        
        javax.swing.table.TableModel model = table.getModel();
        
        System.out.println("Value of data: ");
        
        for (int i=0; i < numRows; i++) {
            
            
            System.out.println(" row " + i + ";");
            
            
            for (int j=0; j < numCols; j++){
                
                
                System.out.println(" " + model.getValueAt(i,j));
                
                
            }
            
            System.out.println();
            
        }
        
        
        System.out.println("---------------------------");
            }
            
    public static void createAndShowGUI() {
        
        
        JFrame frame = new JFrame("Database Data");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        VectorTable2 newContentPane = new VectorTable2();
        
        newContentPane.setOpaque(true);
        
        frame.setContentPane(newContentPane);
        
        frame.pack();
        
        frame.setVisible(true);
        
    
    
        }
    
    
    public static void main(String[] args) {
    
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        
        
        public void run(){
            
            
            createAndShowGUI();
            
        }
        
        });
    
        
    }

}


