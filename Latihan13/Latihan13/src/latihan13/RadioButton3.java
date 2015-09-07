/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan13;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import java.util.Enumeration;

import javax.swing.AbstractButton;

import javax.swing.BorderFactory;

import javax.swing.ButtonGroup;

import javax.swing.JCheckBox;

import javax.swing.JCheckBoxMenuItem;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JRadioButtonMenuItem;

import javax.swing.JToggleButton;

import javax.swing.border.Border;




/**
 *
 * @author steven
 */
public class RadioButton3 {
    
    public static void main (String args[]){
        
        
        JFrame frame = new JFrame("Kelompok Tombol");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(0,1));
        
        Border border = BorderFactory.createTitledBorder("Contoh");
        
        panel.setBorder(border);
        
        ButtonGroup group = new ButtonGroup();
        
        
        /** Belajar tentang AbstractButton
        
        *   Menempelkan AbstractButton pada komponen-komponen semacam JToggleButton,
        
        *   JRadioButton, JCheckBox, JRadioButtonMenuItem, JCheckButtonMenuItem
        * 
        
        */
        
        AbstractButton abstract1 = new JToggleButton("JToggleButton");
        
        panel.add(abstract1);
        
        group.add(abstract1);
        
        
        
        
        AbstractButton abstract2 = new JRadioButton("JRadioButton");
        
        panel.add(abstract2);
        
        group.add(abstract2);
        
        
        AbstractButton abstract3 = new JCheckBox("JCheckBox");
        
        panel.add(abstract3);
        
        group.add(abstract3);
        
        
        AbstractButton abstract4 = new JRadioButtonMenuItem("JRadioButtonMenuItem");
        
        panel.add(abstract4);
        
        group.add(abstract4);
        
        
        AbstractButton abstract5 = new JCheckBoxMenuItem("JCheckBoxMenuItem");
        
        panel.add(abstract5);
        
        group.add(abstract5);
        
        
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setSize(300, 200);
        
        frame.setVisible(true);
        
        /**
         *  diubah-ubah urutan abstract.getModel() nya agar pada saat dijalankan
         * 
         * komponen komponen yg berbeda yang dipilih
         * 
         */
        
        group.setSelected(abstract5.getModel(), true);
        
        
        Enumeration elements = group.getElements();
        
        while(elements.hasMoreElements()){
            
            AbstractButton button = (AbstractButton)elements.nextElement();
            
            if(button.isSelected()){
                
                System.out.println("Maka juaranya adalah: " + button.getText());
            }
        }
        
        
        
    }
    
}
