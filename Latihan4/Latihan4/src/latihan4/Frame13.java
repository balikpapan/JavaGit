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
public class Frame13 extends JFrame {
    
    
    public static void main (String []args){
    
    
        // Bikin Frame dulu
        
        
        JFrame bingkai = new JFrame("Form Input Data");
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bingkai.getContentPane().setBackground(Color.CYAN);
        
        
        bingkai.setLayout(new GridLayout(5,1));
        
        
        
        
        // Bikin Label
        
        
        JLabel idPenggunaLabel = new JLabel("ID Pengguna: ");
        
        JLabel namaLengkapLabel = new JLabel("Nama Lengkap: ");
        
        JLabel namaPenggunaLabel = new JLabel("Nama Pengguna: ");
        
        JLabel kataKunciLabel = new JLabel("Kata Kunci: ");
        
        
        
        // Bikin textbox
        
        JTextField idPenggunaText = new JTextField(10);
        
        JTextField namaLengkapText = new JTextField(10);
        
        JTextField namaPenggunaText = new JTextField(10);
        
        JTextField kataKunciText = new JTextField(10);
        
        
        
        
        
        // Bikin tombol
        
        
        JButton simpan = new JButton("Simpan");
        
        JButton update = new JButton("Update");
        
        JButton hapus = new JButton("Hapus");
        
        
        
        
        // Bikin Panel
        
        
        JPanel idPenggunaPanel = new JPanel();
        
        idPenggunaPanel.setBackground(Color.red);
        
        
        idPenggunaPanel.add(idPenggunaLabel);
        
        idPenggunaPanel.add(idPenggunaText);
        
        
        
        
        
        JPanel namaLengkapPanel = new JPanel();
        
        namaLengkapPanel.setBackground(Color.magenta);
        
        namaLengkapPanel.add(namaLengkapLabel);
        
        namaLengkapPanel.add(namaLengkapText);
        
        
        
        
        
        
        
        JPanel namaPenggunaPanel = new JPanel();
        
        namaPenggunaPanel.setBackground(Color.PINK);
        
        
        namaPenggunaPanel.add(namaPenggunaLabel);
        
        namaPenggunaPanel.add(namaPenggunaText);
        
        
        
        
        
        JPanel kataKunciPanel = new JPanel();
        
        kataKunciPanel.setBackground(Color.ORANGE);
        
        kataKunciPanel.add(kataKunciLabel);
        
        kataKunciPanel.add(kataKunciText);
        
        
        
        
        
        
        JPanel tombolPanel = new JPanel();
        
        tombolPanel.setBackground(Color.white);
        
        tombolPanel.add(simpan);
        
        tombolPanel.add(update);
        
        tombolPanel.add(hapus);
        
        
        
        
        bingkai.add(idPenggunaPanel);
        
        bingkai.add(namaLengkapPanel);
        
        bingkai.add(namaPenggunaPanel);
        
        bingkai.add(kataKunciPanel);
        
        bingkai.add(tombolPanel);
        
        
        
        bingkai.pack();
        
        bingkai.setSize(500, 500);
        
        bingkai.setVisible(true);
        
    
        
    }
    
}
