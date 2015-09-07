/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan16;

import java.text.SimpleDateFormat;

import java.util.Locale;

import java.util.ResourceBundle;


/**
 *
 * @author steven
 */
public class DaftarJavaLocale {
    
    public static void main(String[] args){
        
        
        Locale locales[] = SimpleDateFormat.getAvailableLocales();
        
        for (int i = 0; i < locales.length; i++){
            
            System.out.printf("%10s - %s, %s \n", locales[i].toString(), locales[i].getDisplayName(), locales[i].getDisplayCountry());
        }
    }
    
}
