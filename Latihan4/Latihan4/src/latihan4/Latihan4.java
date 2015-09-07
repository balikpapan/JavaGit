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
public class Latihan4 { 
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        JFrame frame = new JFrame("Input Data Ke PostgreSQL");
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        JTextField textFieldNamaLengkap = new JTextField(50);
        
        
        frame.add(textFieldNamaLengkap);
        
        
        
        
        
        frame.pack();
        
        frame.setSize(300, 300);
        
        frame.setVisible(true);
        
        
    }
    
}
