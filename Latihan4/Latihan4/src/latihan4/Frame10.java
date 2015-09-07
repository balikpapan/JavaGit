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
public class Frame10 {
    
    
    public static void main (String[]args){
        
        
        JFrame bingkai = new JFrame("Menampikan 2 Panel yg tersusun Horizontal");
                
                bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                bingkai.getContentPane().setBackground(Color.red);
                
                
                // bikin panel lapisan pertama diatas JFrame yg dikasih warna biru
                
                JPanel container = new JPanel();
                
                container.setBackground(Color.BLUE);
                
                
                /* JPanel nya diberi nama container
                * Container ini diberi Layout Manager berjenis BoxLayout
                * Sebagai nantinya menjadi kerangka untuk menempatkan 2 buat JPanel lagi diatasnya.
                * BoxLayout ini di beri X_AXIS yg berarti nanti perataannya akan menjadi horizontal
                */
                
                container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
                
                /* Membuat panel1 (JPanel) yang akan diletakan di atas container
                
                * panel1 akan diberi warna kuning
                
                */
                
                JPanel panel1 = new JPanel();
                
                panel1.setBackground(Color.yellow);
                
                
                /* Membuat panel2 (JPanel) yang akan diletakan di atas container
                
                * panel1 akan diberi warna putih
                
                */
                
                
                JPanel panel2 = new JPanel();
                
                panel2.setBackground(Color.WHITE);
                
                
                
                
                
                
                /* Letakan panel1 ke atas container(JPanel) dan perhatikan 
                 * kalau warnanya berubah mengikuti warna panel1
                 *      
                 */
                
                
                container.add(panel1);
                
                
                /* Letakan panel2 ke atas container(JPanel) dan perhatikan 
                 * kalau warnanya berubah mengikuti warna panel2
                 * dan akhirnya ada 2 lapisan warna yg berbeda & bersebelahan
                 * di atas container
                 */
                
                
                container.add(panel2);
               
                
                
                // Selanjutnya container (Jpanel) akan ditaruh diatas bingkai (JFrame)
                
                bingkai.add(container);
                
                bingkai.pack();
                
                bingkai.setSize(500, 500);
                
                bingkai.setVisible(true);
    }
    
}
