/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author RO'I FAHREZA
 */
public class SISPAK extends javax.swing.JFrame {

        ArrayList <Integer> kata=new ArrayList<>();
        MyPredicate<Integer> filter = new MyPredicate<>();
   
    double CF1 = 0.0;
    double CF2 = 0.0;
    double CF3 = 0.0;
    double CF4 = 0.0;
    double CF5 = 0.0;
    double CF6 = 0.0;
    double nilai = 0.0;
    int count = 0;
    int NumGejala[] = new int[23];

    public SISPAK() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        G0002 = new javax.swing.JCheckBox();
        G0003 = new javax.swing.JCheckBox();
        G0004 = new javax.swing.JCheckBox();
        G0001 = new javax.swing.JCheckBox();
        G0006 = new javax.swing.JCheckBox();
        G0007 = new javax.swing.JCheckBox();
        G0008 = new javax.swing.JCheckBox();
        G0005 = new javax.swing.JCheckBox();
        G0010 = new javax.swing.JCheckBox();
        G0009 = new javax.swing.JCheckBox();
        G0011 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        G0014 = new javax.swing.JCheckBox();
        G0015 = new javax.swing.JCheckBox();
        G0016 = new javax.swing.JCheckBox();
        G0013 = new javax.swing.JCheckBox();
        G0018 = new javax.swing.JCheckBox();
        G0019 = new javax.swing.JCheckBox();
        G0020 = new javax.swing.JCheckBox();
        G0017 = new javax.swing.JCheckBox();
        G0012 = new javax.swing.JCheckBox();
        G0022 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        G0021 = new javax.swing.JCheckBox();
        K0002 = new javax.swing.JTextField();
        K0004 = new javax.swing.JTextField();
        K0001 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        K0003 = new javax.swing.JTextField();
        K0005 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        K0006 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel1.setText("GeJALA - GEJALA PENYAKIT PADA AYAM");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Kelihatan Ngantuk dan Bulu Berdiri :");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("Diare                                                 :");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setText("Bulu Kusam dan Mengkerut            :");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setText("Mencret Bercampur Darah                :");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setText("Tampak Lesu                                     :");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setText("Nafsu Makan Berkurang                   :");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setText("Mencret Kehijau-Hijauan                  :");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setText("Produksi Telur Menurun                    :");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setText("Badan Kurus                                      :");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setText("Bersin-Bersin                                     :");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setText("Muka Pucat                                       :");

        G0002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0002ActionPerformed(evt);
            }
        });

        G0003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0003ActionPerformed(evt);
            }
        });

        G0004.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0004ActionPerformed(evt);
            }
        });

        G0001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0001ActionPerformed(evt);
            }
        });

        G0006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0006ActionPerformed(evt);
            }
        });

        G0007.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0007ActionPerformed(evt);
            }
        });

        G0008.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0008ActionPerformed(evt);
            }
        });

        G0005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0005ActionPerformed(evt);
            }
        });

        G0010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0010ActionPerformed(evt);
            }
        });

        G0009.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0009ActionPerformed(evt);
            }
        });

        G0011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0011ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setText("Keluar Nanah dari Mata                   :");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel16.setText("Kelopak Mata Kemerahan               :");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel17.setText("Kaki Pincang                                     :");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel18.setText("Mencret Keputih-Putihan                 :");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel19.setText("Sayap Menggantung                        :");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel20.setText("Tidur Paruhnya Turun ke Bawah       :");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel21.setText("Sempoyongan                                   :");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel22.setText("Duduk Membungkuk                        :");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel24.setText("Pembengkakan dari Sinus dan Mata:");

        G0014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0014ActionPerformed(evt);
            }
        });

        G0015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0015ActionPerformed(evt);
            }
        });

        G0016.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0016ActionPerformed(evt);
            }
        });

        G0013.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0013ActionPerformed(evt);
            }
        });

        G0018.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0018ActionPerformed(evt);
            }
        });

        G0019.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0019ActionPerformed(evt);
            }
        });

        G0020.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0020ActionPerformed(evt);
            }
        });

        G0017.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0017ActionPerformed(evt);
            }
        });

        G0012.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0012ActionPerformed(evt);
            }
        });

        G0022.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0022ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel23.setText("Kualitas Telur Jelak                          :");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel25.setText("Nafas Cepat                                      :");

        G0021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0021ActionPerformed(evt);
            }
        });

        jLabel13.setText("Berak Darah        :");

        jLabel15.setText("Salesma Ayam    :");

        jLabel26.setText("Gumboro            :");

        jLabel27.setText("Tipus Ayam          :");

        jLabel28.setText("Mareks                :");

        jLabel29.setText("Produksi Telur  :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0010))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0005))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0008))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0007))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0006))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0003))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0004))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0009))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0001))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0002)))
                                .addGap(31, 31, 31)
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G0012))
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G0020))
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G0021))
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G0019))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G0018))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G0017)))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel22))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(G0016)
                                            .addComponent(G0015)
                                            .addComponent(G0014)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G0013))))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G0011)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G0022))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(K0005))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(K0006, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(21, 21, 21))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(15, 15, 15)))
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(K0002, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(K0004, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(K0001, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(K0003, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(G0012)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelGlass1Layout.createSequentialGroup()
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(G0001))
                                    .addGap(8, 8, 8)
                                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(G0002))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(G0003))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(G0004))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(G0005)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(G0013))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(G0014)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                    .addGap(86, 86, 86)
                                    .addComponent(G0015)))
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                                    .addComponent(G0017)
                                                    .addGap(8, 8, 8)
                                                    .addComponent(G0018)))
                                            .addGap(7, 7, 7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(G0006))
                                            .addGap(7, 7, 7)
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(G0007))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(G0008)
                                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addComponent(G0019)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelGlass1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(G0009)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(G0010)))
                        .addGroup(panelGlass1Layout.createSequentialGroup()
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addGap(115, 115, 115)
                                    .addComponent(G0016))
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addComponent(G0020)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(G0021)))
                            .addGap(1, 1, 1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(G0022)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G0011)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K0001, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K0002, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K0003, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K0004, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K0005, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K0006, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panelGlass1);
        panelGlass1.setBounds(30, 30, 810, 480);

        jPanel1.setLayout(null);

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/co.jpg"))); // NOI18N
        jPanel1.add(gambar);
        gambar.setBounds(0, 0, 860, 540);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File f = new File("data.xls");
        Workbook wb;

        try {
            wb = Workbook.getWorkbook(f);
            Sheet s = wb.getSheet(0);

            for (int i = 0; i < kata.size(); i++) {
                Cell P1 = s.getCell(1, kata.get(i));
                Cell P2 = s.getCell(2, kata.get(i));
                Cell P3 = s.getCell(3, kata.get(i));
                Cell P4 = s.getCell(4, kata.get(i));
                Cell P5 = s.getCell(5, kata.get(i));
                Cell P6 = s.getCell(6, kata.get(i));
                if (i == 0) {
                    CF1 = Double.valueOf(P1.getContents());
                    CF2 = Double.valueOf(P2.getContents());
                    CF3 = Double.valueOf(P3.getContents());
                    CF4 = Double.valueOf(P4.getContents());
                    CF5 = Double.valueOf(P5.getContents());
                    CF6 = Double.valueOf(P6.getContents());
                } else {
                    CF1 = CF1 + Double.valueOf(P1.getContents()) * (1 - CF1);
                    CF2 = CF2 + Double.valueOf(P2.getContents()) * (1 - CF2);
                    CF3 = CF3 + Double.valueOf(P3.getContents()) * (1 - CF3);
                    CF4 = CF4 + Double.valueOf(P4.getContents()) * (1 - CF4);
                    CF5 = CF5 + Double.valueOf(P5.getContents()) * (1 - CF5);
                    CF6 = CF6 + Double.valueOf(P6.getContents()) * (1 - CF6);

                }
                System.out.println("  " + P1.getContents() + "  " + P2.getContents() + "  " + P3.getContents() + "  ");
            }
            System.out.println(" Certainti factor penyakit 1    : " + CF1);
            System.out.println(" Certainti factor penyakit 2    : " + CF2);
            System.out.println(" Certainti factor penyakit 3    : " + CF3);
            System.out.println(" Certainti factor penyakit 4    : " + CF4);
            System.out.println(" Certainti factor penyakit 5    : " + CF5);
            System.out.println(" Certainti factor penyakit 6    : " + CF6);
            K0001.setText(String.valueOf(CF1));
            K0002.setText(String.valueOf(CF2));
            K0003.setText(String.valueOf(CF3));
            K0004.setText(String.valueOf(CF4));
            K0005.setText(String.valueOf(CF5));
            K0006.setText(String.valueOf(CF6));
            double value=Math.max(CF1, Math.max(CF2, Math.max(CF3,Math.max(CF4, Math.max(CF5, CF6)))));
            String kata="Penyakit Ayam Yang Mendominasi adalah\n";
            if(value==CF1){
                kata=kata+"Tipus ayam dengan nilai CF  :"+value;
                text.setText(kata);
            }
            else if(value==CF2){
                kata=kata+"Berak Darah dengan nilai CF  :"+value;
                text.setText(kata);
            }
            else if(value==CF3){
                kata=kata+" Salesma ayam dengan nilai CF   :"+value;
                text.setText(kata);
            }
            else if(value==CF4){
                kata=kata+" Gumboro dengan nilai CF   :"+value;
                text.setText(kata);
            }
            else if(value==CF5){
                kata=kata+"  Mareks dengan nilai CF    :"+value;
                text.setText(kata);
            }
            else if(value==CF6){
                kata=kata+" Produksi Telur  dengan nilai CF    :"+value;
                text.setText(kata);
            }
            if(value!=CF1&& value-CF1<=0.2){
                kata=kata+"\n ada kemungkinan juga terkena penyakit Tipus ayam ";
                text.setText(kata);
            }
            else if (value!=CF2&& value-CF2<=0.2){
                kata=kata+"\n ada kemungkinan juga terkena penyakit Berak Darah ";
                text.setText(kata);
            }
            else if (value!=CF3&& value-CF3<=0.2){
                kata=kata+"\n ada kemungkinan juga terkena penyakit Salesma ayam ";
                text.setText(kata);
            }

            else if (value!=CF4&& value-CF4<=0.2){
                kata=kata+"\n ada kemungkinan juga terkena penyakit Gumboro  ";
                text.setText(kata);
            }

            else if (value!=CF5&& value-CF5<=0.2){
                kata=kata+"\n ada kemungkinan juga terkena penyakit Mareks  ";
                text.setText(kata);
            }

            else if (value!=CF6&& value-CF6<=0.2){
                kata=kata+"\n ada kemungkinan juga terkena penyakit Produksi Telur ";
                text.setText(kata);
            }

        } catch (IOException ex) {
            Logger.getLogger(SISPAK.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(SISPAK.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void G0021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0021ActionPerformed
        if (G0021.isSelected() == true) {
            kata.add(21);
        } else {
            filter.var1=21;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0021ActionPerformed

    private void G0022ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0022ActionPerformed
        if (G0022.isSelected() == true) {
            kata.add(22);
        } else {filter.var1=22;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0022ActionPerformed

    private void G0012ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0012ActionPerformed
        if (G0012.isSelected() == true) {
            kata.add(12);
        } else {filter.var1=12;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0012ActionPerformed

    private void G0017ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0017ActionPerformed
        if (G0017.isSelected() == true) {
            kata.add(17);
        } else {filter.var1=17;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0017ActionPerformed

    private void G0020ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0020ActionPerformed
        if (G0020.isSelected() == true) {
            kata.add(20);
        } else {filter.var1=20;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0020ActionPerformed

    private void G0019ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0019ActionPerformed
        if (G0019.isSelected() == true) {
            kata.add(19);
        } else {filter.var1=19;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0019ActionPerformed

    private void G0018ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0018ActionPerformed
        if (G0018.isSelected() == true) {
            kata.add(18);
        } else {filter.var1=18;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0018ActionPerformed

    private void G0013ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0013ActionPerformed
        if (G0013.isSelected() == true) {
            kata.add(13);
        } else {filter.var1=13;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0013ActionPerformed

    private void G0016ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0016ActionPerformed
        if (G0016.isSelected() == true) {
            kata.add(16);
        } else {filter.var1=16;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0016ActionPerformed

    private void G0015ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0015ActionPerformed
        if (G0015.isSelected() == true) {
            kata.add(15);
        } else {filter.var1=15;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0015ActionPerformed

    private void G0014ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0014ActionPerformed
        if (G0014.isSelected() == true) {
            kata.add(14);
        } else {filter.var1=14;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0014ActionPerformed

    private void G0011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0011ActionPerformed
        if (G0011.isSelected() == true) {
            kata.add(11);
        } else {filter.var1=11;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0011ActionPerformed

    private void G0009ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0009ActionPerformed
        if (G0009.isSelected() == true) {
            kata.add(9);
        } else {filter.var1=9;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0009ActionPerformed

    private void G0010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0010ActionPerformed
        if (G0010.isSelected() == true) {
            kata.add(10);
        } else {filter.var1=10;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0010ActionPerformed

    private void G0005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0005ActionPerformed
        if (G0005.isSelected() == true) {
            kata.add(5);
        } else {filter.var1=5;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0005ActionPerformed

    private void G0008ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0008ActionPerformed
        if (G0008.isSelected() == true) {
            kata.add(8);
        } else {filter.var1=8;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0008ActionPerformed

    private void G0007ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0007ActionPerformed
        if (G0007.isSelected() == true) {
            kata.add(7);
        } else {filter.var1=7;
            kata.removeIf(filter);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_G0007ActionPerformed

    private void G0006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0006ActionPerformed
        if (G0006.isSelected() == true) {
            kata.add(6);
        } else {filter.var1=6;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0006ActionPerformed

    private void G0001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0001ActionPerformed
        if (G0001.isSelected() == true) {
            kata.add(1);
        } else {filter.var1=1;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0001ActionPerformed

    private void G0004ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0004ActionPerformed
        if (G0004.isSelected() == true) {
            kata.add(4);
        } else {filter.var1=4;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0004ActionPerformed

    private void G0003ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0003ActionPerformed
        if (G0003.isSelected() == true) {
            kata.add(3);
        } else {filter.var1=3;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0003ActionPerformed

    private void G0002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0002ActionPerformed
 if (G0002.isSelected() == true) {
            kata.add(2);
        } else {filter.var1=2;
            kata.removeIf(filter);
        }
    }//GEN-LAST:event_G0002ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws BiffException, IOException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SISPAK kkk = new SISPAK();
                kkk.setVisible(true);
                kkk.setSize(880, 570);
                Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();

                int x = (posisi.width - kkk.getWidth()) / 2;

                int y = (posisi.height - kkk.getHeight()) / 2;

                kkk.setLocation(x, y);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox G0001;
    private javax.swing.JCheckBox G0002;
    private javax.swing.JCheckBox G0003;
    private javax.swing.JCheckBox G0004;
    private javax.swing.JCheckBox G0005;
    private javax.swing.JCheckBox G0006;
    private javax.swing.JCheckBox G0007;
    private javax.swing.JCheckBox G0008;
    private javax.swing.JCheckBox G0009;
    private javax.swing.JCheckBox G0010;
    private javax.swing.JCheckBox G0011;
    private javax.swing.JCheckBox G0012;
    private javax.swing.JCheckBox G0013;
    private javax.swing.JCheckBox G0014;
    private javax.swing.JCheckBox G0015;
    private javax.swing.JCheckBox G0016;
    private javax.swing.JCheckBox G0017;
    private javax.swing.JCheckBox G0018;
    private javax.swing.JCheckBox G0019;
    private javax.swing.JCheckBox G0020;
    private javax.swing.JCheckBox G0021;
    private javax.swing.JCheckBox G0022;
    private javax.swing.JTextField K0001;
    private javax.swing.JTextField K0002;
    private javax.swing.JTextField K0003;
    private javax.swing.JTextField K0004;
    private javax.swing.JTextField K0005;
    private javax.swing.JTextField K0006;
    private javax.swing.JLabel gambar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
