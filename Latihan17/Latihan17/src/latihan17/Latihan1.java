/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17;

import javax.swing.AbstractListModel;

import javax.swing.ComboBoxModel;

import javax.swing.JComboBox;

import javax.swing.JFrame;


class MyComboBoxModel extends AbstractListModel implements ComboBoxModel{String[] ComputerComps = {"Monitor","Key Board","Mouse","Joy Stick"};

String selection = null;

public Object getElementAt(int index){
    
    return ComputerComps[index];
    
    
}

public int getSize(){
    
    return ComputerComps.length;
    
}

public void setSelectedItem(Object anItem) {
    
    selection = (String) anItem; // to select and register an

} // item from pull-down list

// Methods implemented from the interface ComboBoxModel

public Object getSelectedItem(){
    
    return selection; // to add the selection to the combobox
    
    
}
}


/**
 *
 * @author steven
 */
public class Latihan1 {
    
   public static void main(String[] a){
       
       JFrame frame = new JFrame();
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JComboBox cbox = new JComboBox(new MyComboBoxModel());
       
       cbox.setMaximumRowCount(5);
       
       frame.add(cbox);
       
       frame.setSize(300, 200);
       
       frame.setVisible(true);
       
       
   }
    
    
}
