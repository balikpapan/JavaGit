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
public class Frame3 {
    
    public static boolean RIGHT_TO_LEFT = false;
    
    public static void addComponentsToPane(Container pane){
        
        if (!(pane.getLayout() instanceof BorderLayout)){
            
            pane.add(new JLabel("Container tidak menggunakan Border Layout"));
            
            return;
            
        }
        
        if (RIGHT_TO_LEFT){
            
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        }
        
        
        JButton button = new JButton("Tombol1(PAGE_START)");
        
        pane.add(button, BorderLayout.PAGE_START);
                
        // membuat bagian pusat komponen menjadi besar. dikarenakan itu adalah cara penggunaan BorderLayout
        
       button = new JButton ("Tombol 2(CENTER)");
       
       button.setPreferredSize(new Dimension (200, 100));
       
       pane.add(button, BorderLayout.CENTER);
       
       
       button = new JButton("Button 3 (LINE_START)");
       
       pane.add(button, BorderLayout.LINE_START);
       
                
       button = new JButton("Long-Named Button 4(PAGE_END)");
       
       pane.add(button, BorderLayout.PAGE_END);
       
       
       button = new JButton("5 (LINE_END)");
       
       pane.add(button, BorderLayout.LINE_END);
       
       
    }
    
    
    /**
     * Membuat GUI dan Menampilkannya. Untuk Keamanan thread,
     * Metode ini seyogyanya dipicu dari  event dispatch thread
     * 
     * 
     */
    
    
    private static void createAndShowGUI(){
        
        // Menciptakan dan Menampilkan Jendela.
        
        JFrame frame = new JFrame("BorderLayoutDemo");
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Mensetup Content Pane
            
            addComponentsToPane(frame.getContentPane());
            
            
            frame.pack();
            frame.setVisible(true);
            
    }
    
    public static void main (String[]args){
        
        try{
            
           UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
           
        } catch (UnsupportedLookAndFeelException ex) {
            
            ex.printStackTrace();
            
        } catch (IllegalAccessException ex) {
            
            ex.printStackTrace();
            
        } catch (InstantiationException ex) {
            
            ex.printStackTrace();
            
        } catch (ClassNotFoundException ex) {
            
            ex.printStackTrace();
            
            
        }
        
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){

public void run() {
    
    createAndShowGUI();
    
}
});
        
            
    
            
        }
    
    }
    

