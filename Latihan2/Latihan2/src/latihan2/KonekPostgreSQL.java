/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.util.Properties;


/**
 *
 * @author root
 */
public class KonekPostgreSQL {
    
    public static void main(String [] args){

    
    Connection Koneksi = null;
    
        try {
    
      
            String url = "jdbc:postgresql://localhost:5432/pdam";
            
            String user = "steven";
            
            String password = "kucing";
            
            Koneksi = DriverManager.getConnection(url, user, password);
            
            
            if (Koneksi != null) {
                
                System.out.println("Berhasil Konek ke Database");
                
                Koneksi.close();
                
            
                
            }
            
        } catch (SQLException ex) {
         
    System.out.println("Terjadi Error");
    
    ex.printStackTrace();
    
}
    
    
    
}
}
