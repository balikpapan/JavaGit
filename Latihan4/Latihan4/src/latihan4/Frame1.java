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
public class Frame1 {
    
    // Menciptakan dan menampilkan jendela baru

    
    public static void menciptakanDanMenampilkanGUI(){
    
    JFrame bingkai = new JFrame("Demo Level Teratas");
    
    bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    //membuat menu bar. dan berikan warna latar hijau.
    
    JMenuBar menuBarHijau = new JMenuBar();
    
    menuBarHijau.setOpaque(true);
    
    menuBarHijau.setBackground(Color.BLUE);
    
    menuBarHijau.setPreferredSize(new Dimension(200, 20));
    
    
    // Menciptakan sebuah label berwarna kuning yang diletakan di content pane
    
    JLabel labelKuning = new JLabel();
    
    labelKuning.setOpaque(true);
    
    labelKuning.setBackground(Color.YELLOW);
    
    labelKuning.setPreferredSize(new Dimension(200,180));
    
    
    // menaruh menu bar dan label ke content pane
    
    bingkai.setJMenuBar(menuBarHijau);
    
    bingkai.getContentPane().add(labelKuning, BorderLayout.CENTER);
    
    // Menampilkan window
    
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
