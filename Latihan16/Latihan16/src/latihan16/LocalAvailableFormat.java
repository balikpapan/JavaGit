/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan16;

import java.text.SimpleDateFormat;

import java.util.Locale;

import java.util.ResourceBundle;

import java.text.Format;

/**
 *
 * @author steven
 */
public class LocalAvailableFormat {
    
    static public void main(String[] args){
        
        Locale list[] = SimpleDateFormat.getAvailableLocales();
        
        for(int i = 0; i < list.length; i++){
            
            System.out.println(list[i].toString());
            
            
        }
        
        for(int i =0; i < list.length; i++){
            
            System.out.println(list[i].getDisplayName());
        }
        
        for(int i=0; i < list.length; i++){
            
            System.out.println(list[i].getDisplayName(Locale.ITALIAN));
            
        }
        
        
    }
}
