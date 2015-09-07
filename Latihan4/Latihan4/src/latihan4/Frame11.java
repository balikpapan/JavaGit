/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;



/**
 *
 * @author steven
 */
public class Frame11 {
    
    
    public static void main (String[]args){
        
        
        JFrame bingkai = new JFrame("Menampilkan Lebih Banyak Panel");
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bingkai.getContentPane().setBackground(Color.red);
        
        
        JPanel container = new JPanel();
        
        container.setBackground(Color.blue);
        
        
        
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        
        JPanel induk1 = new JPanel();
        
        induk1.setBackground(Color.red);
        
        induk1.setLayout(new BoxLayout(induk1, BoxLayout.Y_AXIS ));
        
        
        
        JPanel panel1 = new JPanel();
        
        panel1.setBackground(Color.GREEN);
        
        
        // induk1.add(panel1);
        
        
        
        JPanel panel2 = new JPanel();
        
        panel1.setBackground(Color.MAGENTA);
        
        // induk1.add(panel2);
        
        
        JPanel panel3 = new JPanel();
        
        panel3.setBackground(Color.orange);
        
        
        induk1.add(panel1);
        
        induk1.add(panel2);
        
        induk1.add(panel3);
       
        
        JPanel induk2 = new JPanel();
        
        induk2.setBackground(Color.black);
        
        
        
        
        container.add(induk1);
        
        container.add(induk2);
        
        
        bingkai.add(container);
        
        bingkai.pack();
        
        bingkai.setSize(500, 500);
        
        bingkai.setVisible(true);
    }
    
}
