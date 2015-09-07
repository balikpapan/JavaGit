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
public class Frame12 extends JFrame {
    
    public static void main (String[]args){
        
        JFrame bingkai = new JFrame("Menampilkan user form");
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bingkai.getContentPane().setBackground(Color.CYAN);
        
        bingkai.setLayout(new GridLayout(5,0));
        
        
        // JPanel container = new JPanel();
        
        // headPanel.add(fatLabel);
        
        // container.setBackground(Color.red);
        
        
        
        
        JLabel heading = new JLabel("Percent of Calories from Fat");
        
        JLabel fatLabel = new JLabel("Enter grams of fat: ");
        
        JLabel calLabel = new JLabel("Enter total calories: ");
        
        JLabel perLabel = new JLabel("Percent calories form fat: ");
        
        
        JTextField inFat = new JTextField(7);
        
        JTextField inCal = new JTextField(7);
        
        JTextField outPer = new JTextField(7);
        
        
        
        JButton doit = new JButton("Do It !")        ;
        
        
        JPanel container = new JPanel();
        
        // container.add(fatLabel);
        
        container.setBackground(Color.red);
        
        


        JPanel headPanel = new JPanel();
        
        headPanel.setBackground(Color.BLUE);
        
       // headPanel.add(fatLabel);
        
        JPanel fatPanel = new JPanel();
        
        fatPanel.add(fatLabel);
        
        fatPanel.setBackground(Color.GREEN);
        
        JPanel calPanel = new JPanel();
        
        calPanel.add(inFat);
        
        calPanel.setBackground(Color.YELLOW);
        
        JPanel perPanel = new JPanel();
        
        perPanel.add(calLabel);
        
        perPanel.setBackground(Color.pink);
        
        perPanel.add(inCal);
        
        JPanel butPanel = new JPanel();
        
        butPanel.setBackground(Color.DARK_GRAY);
        
        // JPanel bebanPanel = new JPanel();
        
        // bebanPanel.setBackground(Color.WHITE);
        
        
        
     
        
        
        
        

        
        bingkai.add(container);
        
        bingkai.add(headPanel);
        
        bingkai.add(fatPanel);
        
        bingkai.add(calPanel);
        
        bingkai.add(perPanel);
        
        bingkai.add(butPanel);
        
        //bingkai.add(bebanPanel);
        
        
        
        bingkai.pack();
        
        bingkai.setSize(500, 500);
        
        bingkai.setVisible(true);
        
    }
    
    
}
