/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan10;

import java.awt.BorderLayout;

import java.util.Vector;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JTable;



/**
 *
 * @author steven
 */
public class VectorTable {
    
    public static void main(String args[]){
        
        JFrame bingkai = new JFrame();
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Vector<String> barisSatu = new Vector<String>();
        
        barisSatu.addElement("Baris1 - Kolom1");
        
        barisSatu.addElement("Baris1 - Kolom2");
        
        barisSatu.addElement("Baris1 - Kolom3");
        
        
        Vector<String> barisDua = new Vector<String>();
        
        barisDua.addElement("Baris2 - Kolom1");
        
        barisDua.addElement("Baris2 - Kolom2");
        
        barisDua.addElement("Baris2 - Kolom3");
        
        
        Vector<Vector> barisData = new Vector<Vector>();
        
        barisData.addElement(barisSatu);
        
        barisData.addElement(barisDua);
        
        
        Vector<String> namaKolom = new Vector<String>();
        
        namaKolom.addElement("Kolom Satu");
        
        namaKolom.addElement("Kolom Dua");
        
        namaKolom.addElement("Kolom Tiga");
        
        JTable tabel = new JTable(barisData, namaKolom);
        
        
        JScrollPane scrollPane = new JScrollPane(tabel);
                
        bingkai.add(scrollPane, BorderLayout.CENTER);
        
        bingkai.setSize(300, 150);
        
        bingkai.setVisible(true);
        
        
        
    }
    
}
