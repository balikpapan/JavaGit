/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.JButton;

import java.awt.Dimension;

/**
 *
 * @author steven
 * 
 * bikin multiple BorderLayout lagi. Kali ini komponennya tambah banyak.
 */
public class Frame7 {
    
    public static void main (String[]args){
        
        
        JFrame bingkai = new JFrame();
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panelTerluar = new JPanel(new BorderLayout());
        
        
        JPanel panelIDPengguna = new JPanel(new BorderLayout());
        
        JPanel panelNamaLengkap = new JPanel(new BorderLayout());
        
        JPanel panelTombol = new JPanel(new BorderLayout());
        
        // label & textbox untuk ID Pengguna
        
        JLabel labelIDPengguna = new JLabel("ID Pengguna :");
        
        JTextField textIDPengguna = new JTextField();
        
        textIDPengguna.setPreferredSize(new Dimension(30,30));
        
        
        // label & textbox Nama Lengkap
        
        JLabel labelNamaLengkap = new JLabel("Nama Lengkap :");
        
        JTextField textNamaLengkap = new JTextField();
        
        textNamaLengkap.setPreferredSize(new Dimension(30,30));
        
        
        // tombol untuk terkoneksi ke PostgreSQL
        
        JButton tombolTestKoneksi = new JButton("Test Koneksi");
        
        JButton tombolInputData = new JButton("Masukan Data");
        
        
        
        
        
        
        
        // Menaruh label & textbox ID Pengguna
        
        panelIDPengguna.add(labelIDPengguna, BorderLayout.BEFORE_LINE_BEGINS);
        
        panelIDPengguna.add(textIDPengguna, BorderLayout.CENTER);
        
        
        // Menaruh label & textbox Nama Lengkap
        
        panelNamaLengkap.add(labelNamaLengkap, BorderLayout.BEFORE_LINE_BEGINS);
        
        panelNamaLengkap.add(textNamaLengkap, BorderLayout.CENTER);
        
        
        
        
        // Menaruh tombol Test Koneksi & tombol Input Data
        
        panelTombol.add(tombolTestKoneksi, BorderLayout.BEFORE_LINE_BEGINS);
        
        panelTombol.add(tombolInputData, BorderLayout.CENTER);
        
        
        
        // Panel Terluar
        
        panelTerluar.add(panelIDPengguna, BorderLayout.BEFORE_FIRST_LINE);
        
        panelTerluar.add(panelNamaLengkap, BorderLayout.CENTER);
        
        panelTerluar.add(panelTombol, BorderLayout.PAGE_END);
        
        
        
        
        bingkai.add(panelTerluar);
        
        bingkai.setSize(500, 500);
        
        bingkai.setVisible(true);
        
        
        
        
    }
    
    
    
}
