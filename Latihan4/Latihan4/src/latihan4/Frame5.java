/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import javax.swing.*;

import java.awt.BorderLayout;

import java.awt.ComponentOrientation;

import java.awt.Container;

import java.awt.Dimension;

/**
 *
 * @author steven
 */
public class Frame5 {
    
    public static boolean RIGHT_TO_LEFT = false;
    
    public static void menambahkanKomponenKePane(Container pane){
        
        if(!(pane.getLayout()instanceof BorderLayout)){
            
            
            pane.add(new JLabel("Berusaha Bikin Text & Tombol Ke SQL"));
            
            
            return;
            
        }
        
        if (RIGHT_TO_LEFT){
            
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            
        }
        
        
// JTextField txtNamaPengguna = new JTextField("");

// pane.add(txtNamaPengguna, BorderLayout.PAGE_START);
        
        
JLabel label = new JLabel("Nama Pengguna");

label.setPreferredSize(new Dimension(200,50));

pane.add(label, BorderLayout.LINE_START);


JTextField txtNamaPengguna = new JTextField("");

txtNamaPengguna.setPreferredSize(new Dimension(200,50));

pane.add(txtNamaPengguna, BorderLayout.CENTER);


// txtNamaPengguna = new JTextField("");

// txtNamaPengguna.setPreferredSize(new Dimension(200,50));

// pane.add(txtNamaPengguna, BorderLayout.AFTER_LAST_LINE);


// txtNamaPengguna = new JTextField("");

// txtNamaPengguna.setPreferredSize(new Dimension(200,50));

// pane.add(txtNamaPengguna, BorderLayout.BEFORE_FIRST_LINE);





    }
    
    private static void ciptakanDanTampilkanGUI(){
        
        
        JFrame bingkai = new JFrame("Konek Ke Server");
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    menambahkanKomponenKePane(bingkai.getContentPane());
    
    bingkai.pack();
    
    bingkai.setVisible(true);
    
    
    }
    
    
    public static void main (String[]args){
        
        try{
            
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            
            
        } catch (UnsupportedLookAndFeelException ex){
            
            ex.printStackTrace();
            
            
        } catch (IllegalAccessException ex){
            
            ex.printStackTrace();
            
            
        } catch (InstantiationException ex) {
            
            ex.printStackTrace();
            
            
        } catch (ClassNotFoundException ex) {
            
            ex.printStackTrace();
            
        }
    

        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                
                ciptakanDanTampilkanGUI();
            }
        });
        
        

        }
    }
    
