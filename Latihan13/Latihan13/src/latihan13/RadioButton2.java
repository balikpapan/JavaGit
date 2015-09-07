/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan13;

import javax.swing.ButtonGroup;

import javax.swing.ButtonModel;

import javax.swing.JRadioButton;


/**
 *
 * @author steven
 */
public class RadioButton2 {
    
    public static void main(String[] argv) throws Exception {
        
        
        JRadioButton radioButton = new JRadioButton();
        
        ButtonGroup group = new ButtonGroup();
        
        ButtonModel model = radioButton.getModel();
        
        group.setSelected(model, true);
    }
    
}
