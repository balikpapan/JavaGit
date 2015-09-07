/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.awt.*;

import javax.swing.*;



/**
 *
 * @author steven
 */
public class Frame9 {
    
    public static void main (String[]args){
        
        
    
    
    JFrame bingkai = new JFrame();
    
    bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // bingkai.setBackground(Color.yellow);
    
    // bingkai.pack();
    
    // bingkai.setSize(500, 500);
    
    // bingkai.getContentPane().setBackground(Color.red);
    
    
    JPanel container = new JPanel();
    
    container.setBackground(Color.BLUE);
    
    // Membuat perataan Horizontal
    
    container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
    
    
    JPanel panel1 = new JPanel();
    
    panel1.setBackground(Color.WHITE);
    
    
    JPanel panel2 = new JPanel();
    
    panel2.setBackground(Color.ORANGE);
    
    
    container.add(panel1);
    
    container.add(panel2);
    
    
    
    bingkai.add(container);
    
    bingkai.pack();
    
    bingkai.setSize(500, 500);
    
    bingkai.setVisible(true);
    
            }
    
}
