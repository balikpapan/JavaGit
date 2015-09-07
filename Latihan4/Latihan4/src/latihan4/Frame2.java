/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author steven
 */
public class Frame2 {
    
    
    // Menciptakan dan Menampilkan Jendela Baru
    
    public static void menciptakanDanMenampilkanGUI(){
        
        
        JFrame bingkai = new JFrame("Demo Tombol dan Text Box");
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat JTextField
        
        Font font1 = new Font("Courier",Font.BOLD,14);
        
        
        JTextField namaLengkap = new JTextField(50);
        
        namaLengkap.setFont(font1);
        
        namaLengkap.setPreferredSize(new Dimension (200, 200));
        
        
        // Membuat Button
        
        JButton tombolPrint = new JButton("Cetak Text Box");
        
        tombolPrint.setFont(font1);
        
        tombolPrint.setPreferredSize(new Dimension (200, 100));
        
        
        bingkai.getContentPane().add(namaLengkap, JTextField.CENTER);
        
        
        
        bingkai.getContentPane().add(tombolPrint, BorderLayout.CENTER);
        
        
        
        bingkai.pack();
        bingkai.setVisible(true);
        
        
    }
    
    
    public static void main (String[]args){
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                
                menciptakanDanMenampilkanGUI();
            }
        });
        
        
        
        
        
    }
    
}


// Gagal yang ini menemukan cara menampilkan JTextField