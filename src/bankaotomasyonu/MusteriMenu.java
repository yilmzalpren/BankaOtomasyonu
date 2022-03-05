/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaotomasyonu;

/**
 *
 * @author YILMAZ
 */
public class MusteriMenu extends javax.swing.JFrame {
    public static User currentUser = null ; 
    /**
     * Creates new form MusteriMenu
     */
    public MusteriMenu() {
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

        jArkaPanel = new javax.swing.JPanel();
        jQuitLabel = new javax.swing.JLabel();
        jGeriLabel = new javax.swing.JLabel();
        jProfil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jHesaplarLael = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jParaTransferLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jFaturaLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jKardLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jKrediLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jQuitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jQuitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jQuitLabelMousePressed(evt);
            }
        });

        jGeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriLabel.setText("GERİ GİT");
        jGeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriLabelMousePressed(evt);
            }
        });

        jProfil.setBackground(new java.awt.Color(255, 255, 255));
        jProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jProfil.setText("PROFİL");
        jProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jProfilMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jHesaplarLael.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account.png"))); // NOI18N
        jHesaplarLael.setText("HESAPLARIM");
        jHesaplarLael.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jHesaplarLaelMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jParaTransferLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/money.png"))); // NOI18N
        jParaTransferLabel.setText("PARA TRANSFERİ");
        jParaTransferLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jParaTransferLabelMousePressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jFaturaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borc.png"))); // NOI18N
        jFaturaLabel.setText("FATURA İSLEMLERİ");
        jFaturaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFaturaLabelMousePressed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jKardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cart_kucuk.png"))); // NOI18N
        jKardLabel.setText("KART İSLEMLERİ");
        jKardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jKardLabelMousePressed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quit.png"))); // NOI18N
        jLabel1.setText("GÜVENLİ CIKIS");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jKrediLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kredi.png"))); // NOI18N
        jKrediLabel.setText("KREDİ İSLEMLERİ");
        jKrediLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jKrediLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jArkaPanelLayout = new javax.swing.GroupLayout(jArkaPanel);
        jArkaPanel.setLayout(jArkaPanelLayout);
        jArkaPanelLayout.setHorizontalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jQuitLabel))
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jGeriLabel))
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jKrediLabel)
                                    .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(jKardLabel)
                                        .addComponent(jFaturaLabel)
                                        .addComponent(jProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(jHesaplarLael, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator2)
                                        .addComponent(jParaTransferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                        .addComponent(jSeparator3)
                                        .addComponent(jSeparator4)
                                        .addComponent(jSeparator5)
                                        .addComponent(jSeparator6)))))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jArkaPanelLayout.setVerticalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jQuitLabel)
                .addGap(60, 60, 60)
                .addComponent(jProfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jHesaplarLael)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jParaTransferLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFaturaLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKardLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKrediLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jGeriLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jQuitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuitLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jQuitLabelMousePressed

    private void jGeriLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGeriLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MusteriMain.mainMusteriMain(currentUser);
    }//GEN-LAST:event_jGeriLabelMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jProfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProfilMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MusteriProfil.mainMusteriProfil(currentUser);
    }//GEN-LAST:event_jProfilMousePressed

    private void jHesaplarLaelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHesaplarLaelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        BireyselHesaplarFrame.mainBireyselHesaplarFrame(currentUser);
    }//GEN-LAST:event_jHesaplarLaelMousePressed

    private void jParaTransferLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jParaTransferLabelMousePressed
        // TODO add your handling code here:
      this.setVisible(false);
      this.dispose();
      ParaTransferAraFrame.mainParaTransferAraFrame(currentUser);
      
    }//GEN-LAST:event_jParaTransferLabelMousePressed

    private void jFaturaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFaturaLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Fatura1.mainFatura1(currentUser);
    }//GEN-LAST:event_jFaturaLabelMousePressed

    private void jKardLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKardLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Kart1.mainKart1(currentUser);
    }//GEN-LAST:event_jKardLabelMousePressed

    private void jKrediLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKrediLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        KrediSecim.mainKrediSecim(currentUser);
    }//GEN-LAST:event_jKrediLabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainMusteriMenu(User currentUser) {
        MusteriMenu.currentUser = currentUser ; 
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
            java.util.logging.Logger.getLogger(MusteriMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jFaturaLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JLabel jHesaplarLael;
    private javax.swing.JLabel jKardLabel;
    private javax.swing.JLabel jKrediLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jParaTransferLabel;
    private javax.swing.JLabel jProfil;
    private javax.swing.JLabel jQuitLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}