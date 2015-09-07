/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan16;

import java.text.SimpleDateFormat;

import java.text.DateFormat;

import java.util.Date;

import java.util.Locale;

import java.util.Locale.Builder;

/**
 *
 * @author steven
 */
public class MembangunLocale {
    
    public static void main (String[] args){
        
        // DateFormat terformat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        
        int style = DateFormat.LONG;
        
        Date tanggal = new Date();
        
        DateFormat df;
        
        // Berhasil dijalankan Locale Builder nya
        
        Locale indonesiaLocale = new Locale.Builder().setLanguage("in").setRegion("ID").build();
        
      
        df = DateFormat.getDateInstance(style, indonesiaLocale);
        
        System.out.println("Indonesia : " + df.format(tanggal));
        
        
    }
    
}
