/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import entity.BanDoc;
import entity.Sach;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thu Uyên
 */
public class Main1 extends javax.swing.JFrame {

    private DefaultTableModel tmS,tmBD;
    private String fileS, fileBD;
    private int maS, maBD;
    private boolean themS, themBD;
    public Main1() {
        initComponents();
        initTable();
        fileName();
        loadSach();
        loadBD();
        themS= false;
        themBD= false;
    }
    private void initTable(){
        String[] cols = {"Ma sach", "Ten Sach", "Tac Gia", "Chuyen Nganh",
                            "Nam", "So Luong"};
        tmS = new DefaultTableModel(cols,0);
        jTable1.setModel(tmS);
        
        String[] cols2 = {"Ma ban doc","Ten ban doc", "Dia chi", "So dien thoai"};
        tmBD = new DefaultTableModel(cols2, 0);
        jTable2.setModel(tmBD);
    }
    private void fileName(){
        fileS = "src/controller/SACH.DAT";
        fileBD = "src/controller/BD.DAT";
    }
    private void loadSach(){
        File f = new File(fileS);
        if(f.exists()){
            List<Sach> a = new ArrayList<>();
            IOFile.readFile(a, fileS);
            tmS.setRowCount(0);
            for (Sach i : a) {
                tmS.addRow(i.toObject());
            }
        }
    }
    private void loadBD(){
        File f = new File(fileBD);
        if(f.exists()){
            List<BanDoc> a = new ArrayList<>();
            IOFile.readFile(a, fileBD);
            tmBD.setRowCount(0);
            for (BanDoc i : a) {
                tmBD.addRow(i.toObject());
            }
        }
    }
    private int getMaS(){
        return 10000+tmS.getRowCount();
    }
    private int getMaBD(){
        return 10000+tmBD.getRowCount();
    }
  
    //pvu cho xoa sua tim kiem
   private Sach getSachByMa(int ma){
        for (int i = 0; i < tmS.getRowCount(); i++) {
            if(Integer.parseInt(tmS.getValueAt(i, 0).toString())==ma){
                return new Sach(ma,
                        tmS.getValueAt(i, 1).toString(),
                        tmS.getValueAt(i, 2).toString(), 
                        tmS.getValueAt(i, 3).toString(),
                        Integer.parseInt(tmS.getValueAt(i, 4).toString()),
                        Integer.parseInt(tmS.getValueAt(i, 5).toString()));
            }
                
        }
        return null;
    }
   private BanDoc getBDByMa(int ma){
        for (int i = 0; i < tmBD.getRowCount(); i++) {
            if(Integer.parseInt(tmBD.getValueAt(i, 0).toString())==ma){
               return new BanDoc(ma, 
                       tmBD.getValueAt(i, 1).toString(),
                       tmBD.getValueAt(i, 2).toString(),
                       tmBD.getValueAt(i, 3).toString());
            }
        }
        return null;
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Them moi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Them vao bang");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xoa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sua");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Luu vao file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Doc tu file");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText(" Ma:");

        jLabel2.setText("Ten Sach");

        jLabel3.setText("Tac Gia");

        jLabel4.setText("Chuyen Nganh");

        jLabel5.setText("Nam xuat ban");

        jLabel6.setText("So Luong:");

        jTextField1.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KHTN", "VH-NT", "DTVT", "CNTT" }));

        jButton13.setText("Sap xep theo ten");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel12.setText("Nhap tim:");

        jButton18.setText("Tim");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setText("Sap xep theo so luong Sach");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(49, 49, 49)
                                .addComponent(jButton2)
                                .addGap(47, 47, 47)
                                .addComponent(jButton3)
                                .addGap(40, 40, 40)
                                .addComponent(jButton4)
                                .addGap(45, 45, 45)
                                .addComponent(jButton5)
                                .addGap(45, 45, 45)
                                .addComponent(jButton6)))
                        .addGap(217, 217, 217))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(79, 79, 79)))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(jTextField4))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(204, 204, 204))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton20))))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton13)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18))
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sach", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton7.setText("Them moi");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Them vao bang");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Xoa");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Sua");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Luu vao file");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Doc tu file");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel7.setText(" Ma:");

        jLabel8.setText("Ho ten:");

        jLabel9.setText("Dia chi");

        jLabel11.setText("So dien thoai");

        jTextField6.setEditable(false);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton19.setText("Sap xep theo ten Ban doc");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton7)
                            .addGap(49, 49, 49)
                            .addComponent(jButton8)
                            .addGap(47, 47, 47)
                            .addComponent(jButton9)
                            .addGap(40, 40, 40)
                            .addComponent(jButton10)
                            .addGap(45, 45, 45)
                            .addComponent(jButton11)
                            .addGap(45, 45, 45)
                            .addComponent(jButton12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11))
                                    .addGap(79, 79, 79)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField8)
                                        .addComponent(jTextField9))))
                            .addGap(61, 61, 61)
                            .addComponent(jButton19)
                            .addGap(85, 85, 85))))
                .addGap(217, 217, 217))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addComponent(jButton12))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton19))))
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Ban Doc", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        List<BanDoc> list = hienThiAllBanDoc();
        Collections.sort(list, Comparator.comparing(BanDoc :: getHoten));
        hienThibangBanDoc(list);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
       
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        loadBD();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        List<BanDoc> list = new ArrayList<>();
        for (int i = 0; i < tmBD.getRowCount(); i++) {
            BanDoc b = new BanDoc(Integer.parseInt(tmBD.getValueAt(i, 0).toString()),
                tmBD.getValueAt(i, 1).toString(),
                tmBD.getValueAt(i, 2).toString(),
                tmBD.getValueAt(i, 3).toString());
            list.add(b);

        }
        IOFile.writeFile(list, fileBD);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int row = jTable2.getSelectedRow();
        if(row<0 || row >= jTable2.getRowCount()){
            JOptionPane.showMessageDialog(null, "Chon dong de sua");
            return;
        }
        else{
            tmBD.setValueAt(jTextField6.getText(), row, 0);
            tmBD.setValueAt(jTextField7.getText(), row, 1);
            tmBD.setValueAt(jTextField8.getText(), row, 2);
            tmBD.setValueAt(jTextField9.getText(), row, 3);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int row = jTable2.getSelectedRow();
        if(row<0 || row>= jTable2.getRowCount()){
            JOptionPane.showMessageDialog(null, "Chon dong de xoa");
            return;
        }
        else{
            tmBD.removeRow(row);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int ma = Integer.parseInt(jTextField6.getText());
        String hoten = jTextField7.getText();
        String diachi = jTextField8.getText();
        String sdt = jTextField9.getText();
        if(!sdt.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")){
            JOptionPane.showMessageDialog(null, "So dien thoai dung ding ndang");
            jTextField9.requestFocus();
            return;
        }else{
            BanDoc b = new BanDoc(ma, hoten, diachi, sdt);
            if(themBD){
                tmBD.addRow(b.toObject());
                themBD=false;
            }
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int ma = getMaBD();
        while(true){
            if(getBDByMa(ma)==null){
                jTextField6.setText(ma+"");
                break;
            }
            ma++;
        }
        themBD = true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        jTextField6.setText(tmBD.getValueAt(row, 0).toString());
        jTextField7.setText(tmBD.getValueAt(row, 1).toString());
        jTextField8.setText(tmBD.getValueAt(row, 2).toString());
        jTextField9.setText(tmBD.getValueAt(row, 3).toString());

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        List<Sach> list = hienThiAllSach();
        Collections.sort(list,new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getSolg()-o2.getSolg();
            }
        });
        hienThibangSach(list);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String key = jTextField11.getText().trim();
        List<Sach> a = search(key);
        hienThibangSach(a);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        List<Sach> list = hienThiAllSach();
        Collections.sort(list,new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        hienThibangSach(list);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        loadSach();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        List<Sach> list = new ArrayList<>();
        for (int i = 0; i < tmS.getRowCount(); i++) {
            Sach s = new Sach(Integer.parseInt(tmS.getValueAt(i, 0).toString()),
                tmS.getValueAt(i, 1).toString(),
                tmS.getValueAt(i, 2).toString(),
                tmS.getValueAt(i, 3).toString(),
                Integer.parseInt(tmS.getValueAt(i, 4).toString()),
                Integer.parseInt(tmS.getValueAt(i, 5).toString())
            );
            list.add(s);

        }
        IOFile.writeFile(list, fileS);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row = jTable1.getSelectedRow();
        if(row<0 || row>= jTable1.getRowCount()){
            JOptionPane.showMessageDialog(null, "Chon dong de sua");
        }else{
            tmS.setValueAt(jTextField1.getText(), row, 0);
            tmS.setValueAt(jTextField2.getText(), row, 1);
            tmS.setValueAt(jTextField3.getText(), row, 2);
            tmS.setValueAt(jComboBox1.getSelectedItem(), row, 3);
            tmS.setValueAt(jTextField4.getText(), row, 4);
            tmS.setValueAt(jTextField5.getText(), row, 5);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = jTable1.getSelectedRow();
        if(row<0 || row>= jTable1.getRowCount()){
            JOptionPane.showMessageDialog(null, "Chon dong de xoa");
            return;
        }
        else{
            tmS.removeRow(row);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ma = Integer.parseInt(jTextField1.getText());
        String ten = jTextField2.getText();
        String tgia = jTextField3.getText();
        String cnganh = jComboBox1.getSelectedItem().toString();
        String nsx =jTextField4.getText();
        if(!nsx.matches("\\d{4}")){
            JOptionPane.showMessageDialog(null, "Nam san xuat la so co 4 chu so");
            jTextField4.requestFocus();
            return;
        }
        else{
            int nam = Integer.parseInt(nsx);
            int slg = Integer.parseInt(jTextField5.getText());
            Sach  s = new Sach(ma, ten, tgia, cnganh, nam, slg);
            if(themS){
                tmS.addRow(s.toObject());
                themS = false;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ma = getMaS();
        while(true){
            if(getSachByMa(ma)==null){
                jTextField1.setText(ma+"");
                break;
            }
            ma++;
        }
        themS = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        jTextField1.setText(tmS.getValueAt(row, 0).toString());
        jTextField2.setText(tmS.getValueAt(row, 1).toString());
        jTextField3.setText(tmS.getValueAt(row, 2).toString());

        jTextField4.setText(tmS.getValueAt(row, 4).toString());
        jTextField5.setText(tmS.getValueAt(row, 5).toString());

        String cn = tmS.getValueAt(row, 3).toString();
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if(jComboBox1.getItemAt(i).toString().equals(cn)){
                jComboBox1.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public List<Sach> hienThiAllSach(){
        List<Sach> list = new ArrayList<>();
        for (int i = 0; i < tmS.getRowCount(); i++) {
            Sach s = new Sach(Integer.parseInt(tmS.getValueAt(i, 0).toString()), 
                    tmS.getValueAt(i, 1).toString(),
                    tmS.getValueAt(i, 2).toString(),
                    tmS.getValueAt(i, 3).toString(),
                    Integer.parseInt(tmS.getValueAt(i, 4).toString()), 
                    Integer.parseInt(tmS.getValueAt(i, 5).toString())
                    );
            list.add(s);
        }
        return list;
    }
    public List<BanDoc> hienThiAllBanDoc(){
        List<BanDoc> list = new ArrayList<>();
        for (int i = 0; i < tmBD.getRowCount(); i++) {
            BanDoc b = new BanDoc(Integer.parseInt(tmBD.getValueAt(i, 0).toString()),
                    tmBD.getValueAt(i, 1).toString(),
                    tmBD.getValueAt(i, 2).toString(),
                    tmBD.getValueAt(i, 3).toString());
            list.add(b);
            
        }
        return list;
    }
    private void hienThibangBanDoc(List<BanDoc> a){
        String[] cols = {"Ma ban doc","Ten ban doc", "Dia chi", "So dien thoai"};
        DefaultTableModel tm ;
        tm = new DefaultTableModel(cols, 0);
        jTable2.setModel(tm);
        tm.setRowCount(0);
        for (BanDoc i : a) {
            int ma = i.getMa();
            String hoten = i.getHoten();
            String diachi = i.getDchi();
            String sdt = i.getSodt();
            BanDoc b = new BanDoc(ma, hoten, diachi, sdt);
            tm.addRow(b.toObject());
        }
        
    }
    private void hienThibangSach(List<Sach> a){
       String[] cols3 = {"Ma sach", "Ten Sach", "Tac Gia", "Chuyen Nganh",
                            "Nam", "So Luong"};
        DefaultTableModel tm = new DefaultTableModel(cols3,0);
        jTable1.setModel(tm);
        tm.setRowCount(0);
        for (Sach i : a) {
            int ma = i.getMa();
            String ten = i.getTen();
            String tgia = i.getTgia();
            String cnganh = i.getCnganh();
            int nsx = i.getNsx();
            int slg = i.getSolg();
            Sach s = new Sach(ma, ten, tgia, cnganh, nsx, slg);
            tm.addRow(s.toObject());
        }
    }
    
    private List<Sach> search (String key){
        List<Sach> a = hienThiAllSach();
        List<Sach> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getTgia().toUpperCase().contains(key.toUpperCase())){
                b.add(a.get(i));
            }
            
        }
        return b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
