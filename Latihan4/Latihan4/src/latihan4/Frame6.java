/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;



/**
 *
 * @author steven
 * 
 * Membuat multiple BorderLayout di JPanel
 */
public class Frame6 {
    
    public static void main (String[]args){
        
        
        JFrame bingkai = new JFrame();
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panelTerluar = new JPanel(new BorderLayout());
        
        JPanel panelTeratas = new JPanel(new BorderLayout());
        
        JLabel label = new JLabel("ID Pengguna : ");
        
        JTextField text = new JTextField();
        
        panelTeratas.add(label, BorderLayout.BEFORE_LINE_BEGINS);
        
        panelTeratas.add(text, BorderLayout.CENTER);
        
        panelTerluar.add(panelTeratas, BorderLayout.BEFORE_FIRST_LINE);
        
        
        bingkai.add(panelTerluar);
        
        bingkai.setSize(300, 200);
        
        bingkai.setVisible(true);
    }
    
    
}
