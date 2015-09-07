/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan10;

import javax.swing.JTable;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.ResultSetMetaData;

import java.sql.Statement;

import java.util.Vector;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;


import javax.swing.JOptionPane;




/**
 *
 * @author steven
 */
public class HasilSetMetaData1 {
    
    public static void main (String args [] ){
    
    
       Connection koneksi = null;
       
       Statement stmt = null;
       
       ResultSet rs;
       
       ResultSetMetaData rsMd;
     
      // String tampilData = "SELECT id,nik,namapegawai FROM nama";
       
       
     try {
    
    
    
            String url = "jdbc:postgresql://localhost:5432/pdam";
    
            String user = "steven";
   
            String password = "kucing";
    
            koneksi = DriverManager.getConnection(url,user,password);
            
            String tampilData = "SELECT id,nik,namapegawai FROM nama";
            
            
            
    
    if (koneksi != null);
    
    
    rs = stmt.executeQuery(tampilData);
    
    rsMd = rs.getMetaData();
    
    String nik = rsMd.getColumnLabel(3);
    
    koneksi.close();
    
   
    System.out.print(nik);
    
    

       
} catch (SQLException ex){
    
    ex.printStackTrace();
    
    
}



    
    
    
    
    
}
    
    
    
    
}
