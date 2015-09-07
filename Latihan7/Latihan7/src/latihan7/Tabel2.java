/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;


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
public class Tabel2 extends JPanel {
    
    private boolean DEBUG = false;
    
    
    Connection koneksi = null;
    
    Statement stmt = null;
    
    static Vector<Vector<String>> data = new Vector <Vector<String>>();
    
    
    public Tabel2() {
        
        super (new GridLayout(1,0));
        
        Vector<String> columnNames = new Vector<String>();
        
        
        columnNames.add("id");
        
        columnNames.add("nik");
        
        columnNames.add("namapegawai");
        
        
        String query = "select id, nik, namapegawai from nama";
        
        
        try {
            
            String url = "jdbc:postgresql://localhost:5432/pdam";
            
            String user = "steven";
            
            String password = "kucing";
            
            
            koneksi = DriverManager.getConnection(url, user, password);
            
            
            
        }
        
    }
    
    
}
