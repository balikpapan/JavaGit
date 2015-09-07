/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import javax.swing.*;

/**
 *
 * @author steven
 */
public class Frame4 {
    
    private static void ciptakanDanTampilkanGUI(){
            
            JFrame bingkai = new JFrame("Hello World Swing");
            
            bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            JLabel label = new JLabel("Halo Dunia");
            
            // label.setPreferredSize(new Dimension(200,100));
            
            bingkai.getContentPane().add(label);
            
            label.setSize(200, 100);
            
            bingkai.pack();
            
            bingkai.setSize(200,100);
            
            bingkai.setVisible(true);
            
    }
    
            public static void main(String[]args){
                
                javax.swing.SwingUtilities.invokeLater(new Runnable(){
                    
                    public void run(){
                        
                        ciptakanDanTampilkanGUI();
                    }
                    
                });
                
            }
}
