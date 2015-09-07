/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.awt.BorderLayout;

import java.awt.Dimension;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;


public class Latihan8 {
    
    private JFrame bingkai = new JFrame();
    
    private JPanel panel = new JPanel();
    
    private JButton tombol = new JButton("Mendapatkan ukuran JComponent");
    
    
    
    public Latihan8() {
        
    tombol.setPreferredSize(new Dimension(400, 40));
    
    tombol.addActionListener(new ActionListener(){
        
        
        @Override
        
        public void actionPerformed(ActionEvent e){
            
            System.out.println("Ukuran JButton - " + tombol.getSize());
            
            System.out.println("Ukuran JPanel -" + panel.getSize());
            
            System.out.println("Ukuran JFrame -" + bingkai.getSize());
            
            
        }
    });
    
    
    panel.setPreferredSize(new Dimension(640, 480));
    
    panel.add(tombol, BorderLayout.SOUTH);
    
    bingkai.add(panel, BorderLayout.CENTER);
    
    bingkai.setLocation(150, 100);
    
    bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    bingkai.setResizable(false);
    
    bingkai.pack();
    
    bingkai.setVisible(true);
    
}
    
    public static void main(String[]args){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            @Override
            
            public void run(){
                
                Latihan8 ukuranBingkai = new Latihan8();
            }
        });
    
    }
}

