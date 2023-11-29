/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pancasila;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Drinkopi
 */
public class Edutainment extends javax.swing.JFrame {

    /**
     * Creates new form Edutainment
     */
    
    private int point;
    public Edutainment() {
        initComponents();
        
    }

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ortu = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        btnStart = new javax.swing.JLabel();
        bgHome = new javax.swing.JLabel();
        Welcome = new javax.swing.JPanel();
        btnNext = new javax.swing.JLabel();
        bgWelcome = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        btnGame = new javax.swing.JLabel();
        btnHow = new javax.swing.JLabel();
        btnScore = new javax.swing.JLabel();
        bgMenu = new javax.swing.JLabel();
        HowTo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHow1 = new javax.swing.JLabel();
        bgHowTo1 = new javax.swing.JLabel();
        HowTo2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        bgHowTo2 = new javax.swing.JLabel();
        Soal1 = new javax.swing.JPanel();
        txtSoal1 = new javax.swing.JLabel();
        pilih1_1 = new javax.swing.JLabel();
        pilih2_1 = new javax.swing.JLabel();
        pilih3_1 = new javax.swing.JLabel();
        pilih4_1 = new javax.swing.JLabel();
        bg_soal1 = new javax.swing.JLabel();
        Soal2 = new javax.swing.JPanel();
        txtSoal2 = new javax.swing.JLabel();
        pilihan1_2 = new javax.swing.JLabel();
        pilihan2_2 = new javax.swing.JLabel();
        pilihan3_2 = new javax.swing.JLabel();
        pilihan4_2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Soal3 = new javax.swing.JPanel();
        Soal4 = new javax.swing.JPanel();
        Soal5 = new javax.swing.JPanel();
        Soal6 = new javax.swing.JPanel();
        Soal7 = new javax.swing.JPanel();
        Soal8 = new javax.swing.JPanel();
        Soal9 = new javax.swing.JPanel();
        Soal10 = new javax.swing.JPanel();
        Score = new javax.swing.JPanel();
        ctkPoint = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JLabel();
        bg_Score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ortu.setPreferredSize(new java.awt.Dimension(1366, 768));
        Ortu.setLayout(new java.awt.CardLayout());

        Home.setLayout(null);

        btnStart.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 128, 73));
        btnStart.setText("START");
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartMouseExited(evt);
            }
        });
        Home.add(btnStart);
        btnStart.setBounds(280, 490, 190, 60);

        bgHome.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        bgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/1.png"))); // NOI18N
        Home.add(bgHome);
        bgHome.setBounds(0, 0, 1370, 768);

        Ortu.add(Home, "Home");

        Welcome.setLayout(null);

        btnNext.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 128, 73));
        btnNext.setText("NEXT");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        Welcome.add(btnNext);
        btnNext.setBounds(850, 670, 160, 60);

        bgWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/2.png"))); // NOI18N
        Welcome.add(bgWelcome);
        bgWelcome.setBounds(0, 0, 1370, 770);

        Ortu.add(Welcome, "Welcome");

        Menu.setLayout(null);

        btnGame.setFont(new java.awt.Font("KaiTi", 1, 36)); // NOI18N
        btnGame.setForeground(new java.awt.Color(255, 255, 255));
        btnGame.setText("START GAME");
        btnGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGameMouseExited(evt);
            }
        });
        Menu.add(btnGame);
        btnGame.setBounds(150, 470, 240, 40);

        btnHow.setFont(new java.awt.Font("KaiTi", 1, 24)); // NOI18N
        btnHow.setForeground(new java.awt.Color(255, 255, 255));
        btnHow.setText("\"How To\"");
        btnHow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHowMouseExited(evt);
            }
        });
        Menu.add(btnHow);
        btnHow.setBounds(220, 538, 110, 40);

        btnScore.setFont(new java.awt.Font("KaiTi", 1, 36)); // NOI18N
        btnScore.setForeground(new java.awt.Color(255, 255, 255));
        btnScore.setText("About");
        Menu.add(btnScore);
        btnScore.setBounds(210, 610, 110, 50);

        bgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/3.png"))); // NOI18N
        Menu.add(bgMenu);
        bgMenu.setBounds(0, 0, 1366, 768);

        Ortu.add(Menu, "Menu");

        HowTo1.setLayout(null);
        HowTo1.add(jLabel1);
        jLabel1.setBounds(590, 690, 0, 0);

        btnHow1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnHow1.setForeground(new java.awt.Color(255, 128, 73));
        btnHow1.setText("NEXT");
        btnHow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHow1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHow1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHow1MouseExited(evt);
            }
        });
        HowTo1.add(btnHow1);
        btnHow1.setBounds(370, 650, 160, 60);

        bgHowTo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/4.png"))); // NOI18N
        HowTo1.add(bgHowTo1);
        bgHowTo1.setBounds(0, 0, 1366, 770);

        Ortu.add(HowTo1, "HowTo1");

        HowTo2.setLayout(null);

        btnBack.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 128, 73));
        btnBack.setText("BACK TO MENU");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        HowTo2.add(btnBack);
        btnBack.setBounds(190, 650, 430, 60);

        bgHowTo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/5.png"))); // NOI18N
        HowTo2.add(bgHowTo2);
        bgHowTo2.setBounds(0, 0, 1366, 770);

        Ortu.add(HowTo2, "HowTo2");

        Soal1.setLayout(null);

        txtSoal1.setText("Apa ibu kota Indonesia?");
        Soal1.add(txtSoal1);
        txtSoal1.setBounds(870, 180, 380, 16);

        pilih1_1.setText("Merah");
        pilih1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilih1_1MouseClicked(evt);
            }
        });
        Soal1.add(pilih1_1);
        pilih1_1.setBounds(760, 370, 51, 16);

        pilih2_1.setText("Biru");
        pilih2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilih2_1MouseClicked(evt);
            }
        });
        Soal1.add(pilih2_1);
        pilih2_1.setBounds(770, 500, 37, 16);

        pilih3_1.setText("Kuning");
        pilih3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilih3_1MouseClicked(evt);
            }
        });
        Soal1.add(pilih3_1);
        pilih3_1.setBounds(1120, 360, 38, 16);

        pilih4_1.setText("Hitam");
        pilih4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilih4_1MouseClicked(evt);
            }
        });
        Soal1.add(pilih4_1);
        pilih4_1.setBounds(1110, 480, 37, 16);

        bg_soal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/bg_Soal1.png"))); // NOI18N
        Soal1.add(bg_soal1);
        bg_soal1.setBounds(0, 0, 1370, 770);

        Ortu.add(Soal1, "Soal1");

        Soal2.setLayout(null);

        txtSoal2.setText("Berapa hasil dari 2 + 2?");
        Soal2.add(txtSoal2);
        txtSoal2.setBounds(940, 180, 252, 33);

        pilihan1_2.setText("1");
        pilihan1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilihan1_2MouseClicked(evt);
            }
        });
        Soal2.add(pilihan1_2);
        pilihan1_2.setBounds(780, 360, 37, 16);

        pilihan2_2.setText("2");
        pilihan2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilihan2_2MouseClicked(evt);
            }
        });
        Soal2.add(pilihan2_2);
        pilihan2_2.setBounds(780, 490, 37, 16);

        pilihan3_2.setText("3");
        pilihan3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilihan3_2MouseClicked(evt);
            }
        });
        Soal2.add(pilihan3_2);
        pilihan3_2.setBounds(1190, 360, 37, 16);

        pilihan4_2.setText("4");
        pilihan4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilihan4_2MouseClicked(evt);
            }
        });
        Soal2.add(pilihan4_2);
        pilihan4_2.setBounds(1190, 490, 37, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/bg_Soal1.png"))); // NOI18N
        Soal2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1477, 770);

        Ortu.add(Soal2, "Soal2");

        javax.swing.GroupLayout Soal3Layout = new javax.swing.GroupLayout(Soal3);
        Soal3.setLayout(Soal3Layout);
        Soal3Layout.setHorizontalGroup(
            Soal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal3Layout.setVerticalGroup(
            Soal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal3, "Soal3");

        javax.swing.GroupLayout Soal4Layout = new javax.swing.GroupLayout(Soal4);
        Soal4.setLayout(Soal4Layout);
        Soal4Layout.setHorizontalGroup(
            Soal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal4Layout.setVerticalGroup(
            Soal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal4, "Soal4");

        javax.swing.GroupLayout Soal5Layout = new javax.swing.GroupLayout(Soal5);
        Soal5.setLayout(Soal5Layout);
        Soal5Layout.setHorizontalGroup(
            Soal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal5Layout.setVerticalGroup(
            Soal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal5, "Soal5");

        javax.swing.GroupLayout Soal6Layout = new javax.swing.GroupLayout(Soal6);
        Soal6.setLayout(Soal6Layout);
        Soal6Layout.setHorizontalGroup(
            Soal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal6Layout.setVerticalGroup(
            Soal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal6, "Soal6");

        javax.swing.GroupLayout Soal7Layout = new javax.swing.GroupLayout(Soal7);
        Soal7.setLayout(Soal7Layout);
        Soal7Layout.setHorizontalGroup(
            Soal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal7Layout.setVerticalGroup(
            Soal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal7, "Soal7");

        javax.swing.GroupLayout Soal8Layout = new javax.swing.GroupLayout(Soal8);
        Soal8.setLayout(Soal8Layout);
        Soal8Layout.setHorizontalGroup(
            Soal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal8Layout.setVerticalGroup(
            Soal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal8, "Soal8");

        javax.swing.GroupLayout Soal9Layout = new javax.swing.GroupLayout(Soal9);
        Soal9.setLayout(Soal9Layout);
        Soal9Layout.setHorizontalGroup(
            Soal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal9Layout.setVerticalGroup(
            Soal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal9, "Soal9");

        javax.swing.GroupLayout Soal10Layout = new javax.swing.GroupLayout(Soal10);
        Soal10.setLayout(Soal10Layout);
        Soal10Layout.setHorizontalGroup(
            Soal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        Soal10Layout.setVerticalGroup(
            Soal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Ortu.add(Soal10, "Soal10");

        Score.setLayout(null);

        ctkPoint.setText("Total Points: ");
        Score.add(ctkPoint);
        ctkPoint.setBounds(590, 290, 90, 16);

        btnBack1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 128, 73));
        btnBack1.setText("BACK TO MENU");
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBack1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack1MouseExited(evt);
            }
        });
        Score.add(btnBack1);
        btnBack1.setBounds(480, 650, 430, 60);

        bg_Score.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pancasila/img/7.png"))); // NOI18N
        Score.add(bg_Score);
        bg_Score.setBounds(0, 0, 1366, 770);

        Ortu.add(Score, "Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Ortu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Ortu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "Welcome");
    }//GEN-LAST:event_btnStartMouseClicked

    private void btnStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseEntered
        btnStart.setForeground(new Color(255,182,0));
    }//GEN-LAST:event_btnStartMouseEntered

    private void btnStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseExited
        btnStart.setForeground(new Color(255,128,73));
    }//GEN-LAST:event_btnStartMouseExited

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "Menu");
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        btnNext.setForeground(new Color(255,182,0));
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        btnNext.setForeground(new Color(255,128,73));
    }//GEN-LAST:event_btnNextMouseExited

    private void btnHow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHow1MouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "HowTo2");
    }//GEN-LAST:event_btnHow1MouseClicked

    private void btnHow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHow1MouseEntered
        btnHow1.setForeground(new Color(255,182,0));
    }//GEN-LAST:event_btnHow1MouseEntered

    private void btnHow1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHow1MouseExited
        btnHow1.setForeground(new Color(255,128,73));
    }//GEN-LAST:event_btnHow1MouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "Menu");
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setForeground(new Color(255,182,0));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(new Color(255,128,73));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnHowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowMouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "HowTo1");
    }//GEN-LAST:event_btnHowMouseClicked

    private void btnHowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowMouseEntered
        btnHow.setForeground(new Color(50,50,50));
    }//GEN-LAST:event_btnHowMouseEntered

    private void btnHowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowMouseExited
        btnHow.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnHowMouseExited

    private void btnGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameMouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "Soal1");
    }//GEN-LAST:event_btnGameMouseClicked

    private void btnGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameMouseEntered
        btnGame.setForeground(new Color(50,50,50));
    }//GEN-LAST:event_btnGameMouseEntered

    private void btnGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameMouseExited
        btnGame.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGameMouseExited
// Soal 1
    private void pilih1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilih1_1MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilih1_1.getText().equals("Merah")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Soal2");
            JOptionPane.showMessageDialog(null, "Jawaban salah. Coba lagi!");
            ctkPoint.setText("Total Points: " + "0");
        }
    }//GEN-LAST:event_pilih1_1MouseClicked

    private void pilih2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilih2_1MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilih2_1.getText().equals("Biru")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Soal2");
            JOptionPane.showMessageDialog(null, "Jawaban Benar. Semangat!");
            point += 50;
            ctkPoint.setText("Total Points: " + point);
        }
    }//GEN-LAST:event_pilih2_1MouseClicked

    private void pilih3_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilih3_1MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilih3_1.getText().equals("Kuning")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Soal2");
            JOptionPane.showMessageDialog(null, "Jawaban salah. Coba lagi!");
        }
    }//GEN-LAST:event_pilih3_1MouseClicked

    private void pilih4_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilih4_1MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilih4_1.getText().equals("Hitam")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Soal2");
            JOptionPane.showMessageDialog(null, "Jawaban salah. Coba lagi!");
        }
    }//GEN-LAST:event_pilih4_1MouseClicked

    private void btnBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseClicked
        //Dapatkan referensi dari CardLayout yang digunakan oleh parent
        CardLayout cardLayout = (CardLayout) Ortu.getLayout();
        //Pindah ke JPanel Welcome
        cardLayout.show(Ortu, "Menu");
        point -= point;
        ctkPoint.setText("Total Points: " + point);
    }//GEN-LAST:event_btnBack1MouseClicked

    private void btnBack1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseEntered
        btnBack1.setForeground(new Color(255,182,0));
    }//GEN-LAST:event_btnBack1MouseEntered

    private void btnBack1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseExited
        btnBack1.setForeground(new Color(255,128,73));
    }//GEN-LAST:event_btnBack1MouseExited
// Soal 2
    private void pilihan1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilihan1_2MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilihan1_2.getText().equals("1")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Score");
            JOptionPane.showMessageDialog(null, "Jawaban salah. Coba lagi!");
            ctkPoint.setText("Total Points: " + "0");
        }
    }//GEN-LAST:event_pilihan1_2MouseClicked

    private void pilihan2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilihan2_2MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilihan2_2.getText().equals("2")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Score");
            JOptionPane.showMessageDialog(null, "Jawaban salah. Coba lagi!");
            ctkPoint.setText("Total Points: " + "0");
        }
    }//GEN-LAST:event_pilihan2_2MouseClicked

    private void pilihan3_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilihan3_2MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilihan3_2.getText().equals("3")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Score");
            JOptionPane.showMessageDialog(null, "Jawaban salah. Coba lagi!");
            ctkPoint.setText("Total Points: " + "0");
        }
    }//GEN-LAST:event_pilihan3_2MouseClicked

    private void pilihan4_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilihan4_2MouseClicked
        // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
        if (pilihan4_2.getText().equals("4")) {
            //Dapatkan referensi dari CardLayout yang digunakan oleh parent
            CardLayout cardLayout = (CardLayout) Ortu.getLayout();
            //Pindah ke JPanel Welcome
            cardLayout.show(Ortu, "Score");
            point += 50;
            ctkPoint.setText("Total Points: " + point);
        }
    }//GEN-LAST:event_pilihan4_2MouseClicked

    
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
            java.util.logging.Logger.getLogger(Edutainment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edutainment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edutainment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edutainment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edutainment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel HowTo1;
    private javax.swing.JPanel HowTo2;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Ortu;
    private javax.swing.JPanel Score;
    private javax.swing.JPanel Soal1;
    private javax.swing.JPanel Soal10;
    private javax.swing.JPanel Soal2;
    private javax.swing.JPanel Soal3;
    private javax.swing.JPanel Soal4;
    private javax.swing.JPanel Soal5;
    private javax.swing.JPanel Soal6;
    private javax.swing.JPanel Soal7;
    private javax.swing.JPanel Soal8;
    private javax.swing.JPanel Soal9;
    private javax.swing.JPanel Welcome;
    private javax.swing.JLabel bgHome;
    private javax.swing.JLabel bgHowTo1;
    private javax.swing.JLabel bgHowTo2;
    private javax.swing.JLabel bgMenu;
    private javax.swing.JLabel bgWelcome;
    private javax.swing.JLabel bg_Score;
    private javax.swing.JLabel bg_soal1;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnBack1;
    private javax.swing.JLabel btnGame;
    private javax.swing.JLabel btnHow;
    private javax.swing.JLabel btnHow1;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnScore;
    private javax.swing.JLabel btnStart;
    private javax.swing.JLabel ctkPoint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pilih1_1;
    private javax.swing.JLabel pilih2_1;
    private javax.swing.JLabel pilih3_1;
    private javax.swing.JLabel pilih4_1;
    private javax.swing.JLabel pilihan1_2;
    private javax.swing.JLabel pilihan2_2;
    private javax.swing.JLabel pilihan3_2;
    private javax.swing.JLabel pilihan4_2;
    private javax.swing.JLabel txtSoal1;
    private javax.swing.JLabel txtSoal2;
    // End of variables declaration//GEN-END:variables
}
