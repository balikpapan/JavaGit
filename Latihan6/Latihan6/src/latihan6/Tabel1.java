/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;


import java.awt.*;

import javax.swing.*;

/**
 *
 * @author steven
 */
public class Tabel1 extends JFrame {
    
    StaticTable(Object [][] obj, String[] header){
        
        
        super ("Static JTable example");
        
        //JPanel to horl the JTable
        
        JPanel panel = new JPanel(new BorderLayout());
        
        // constructor of JTable with a fix number of objects
        
        JTable table = new JTable(obj, header);
        
        panel.add(new JScrollPane(table));
        
        add(panel); // adding panel to frame
        
        
        // and display it
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setVisible(true);
        
        pack();
        
        
    }
    
    
    // to run the whole thing
    
    
    public static void main (String[] args) {
        
        
        // defines rows and column of the JTable
        
        String [][] rowAndColumn = {
            
            {"Dog", "Mammal"},
            
            {"Cat", "Mammal"},
            
            {"Shark", "Fish"),
            
            {"Parrots", "Bird"}
            
            
    };
    
    
    String[] header = {"Animal", "Family"};
    
    new StaticTable(rowAndColumn, header);
        }
        
       
    
    
}
