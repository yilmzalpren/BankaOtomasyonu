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
public class MusteriProfil extends javax.swing.JFrame {
    public static User currentUser = null ; 
    /**
     * Creates new form MusteriProfil
     */
    public MusteriProfil() {
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

        jPanel1 = new javax.swing.JPanel();
        jLeftLabel = new javax.swing.JLabel();
        jCancel = new javax.swing.JLabel();
        jAdLabel = new javax.swing.JLabel();
        jAdText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSoyadLabel = new javax.swing.JLabel();
        jSoyadText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jDateLabel = new javax.swing.JLabel();
        jDateText = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTcLabel = new javax.swing.JLabel();
        jTcText = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTelLabel = new javax.swing.JLabel();
        jTelText = new javax.swing.JTextField();
        jSifreDegisLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLeftLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jLeftLabel.setText("GERİ GİT");
        jLeftLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLeftLabelMousePressed(evt);
            }
        });

        jCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelMousePressed(evt);
            }
        });

        jAdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jAdLabel.setText("AD");

        jAdText.setEditable(false);
        jAdText.setBackground(new java.awt.Color(255, 255, 255));
        jAdText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jAdText.setText(".");
        jAdText.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSoyadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jSoyadLabel.setText("SOYAD");

        jSoyadText.setEditable(false);
        jSoyadText.setBackground(new java.awt.Color(255, 255, 255));
        jSoyadText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jSoyadText.setText(".");
        jSoyadText.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jDateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bhirtday.png"))); // NOI18N
        jDateLabel.setText("D.TARİHİ");

        jDateText.setEditable(false);
        jDateText.setBackground(new java.awt.Color(255, 255, 255));
        jDateText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDateText.setText(".");
        jDateText.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jTcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tc.png"))); // NOI18N
        jTcLabel.setText("TC");

        jTcText.setEditable(false);
        jTcText.setBackground(new java.awt.Color(255, 255, 255));
        jTcText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTcText.setText(".");
        jTcText.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jTelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smartPhone.png"))); // NOI18N
        jTelLabel.setText("TEL NO");

        jTelText.setEditable(false);
        jTelText.setBackground(new java.awt.Color(255, 255, 255));
        jTelText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTelText.setText(".");
        jTelText.setBorder(null);

        jSifreDegisLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        jSifreDegisLabel.setText("SİFRE DEGİS");
        jAdText.setText(currentUser.getAd());
        jSoyadText.setText(currentUser.getSoyad());
        jTcText.setText(currentUser.getTc());
        jTelText.setText(currentUser.getTelNo());
        jDateText.setText(currentUser.getDate().day+" "+currentUser.getDate().month+" "+currentUser.getDate().year);
        jSifreDegisLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSifreDegisLabelMousePressed(evt);
            }
        });

        jLabel1.setText("PROFİL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTelLabel)
                                .addGap(35, 35, 35)
                                .addComponent(jTelText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTcLabel)
                                .addGap(57, 57, 57)
                                .addComponent(jTcText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jDateText))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSoyadLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jAdLabel)
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel1)))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLeftLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSifreDegisLabel)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancel)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdLabel)
                    .addComponent(jAdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSoyadLabel)
                    .addComponent(jSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTcLabel)
                            .addComponent(jTcText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTelLabel)
                            .addComponent(jTelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLeftLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jSifreDegisLabel)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLeftLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLeftLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MusteriMenu.mainMusteriMenu(currentUser);
    }//GEN-LAST:event_jLeftLabelMousePressed

    private void jCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jCancelMousePressed

    private void jSifreDegisLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSifreDegisLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        ProfilSifreDegis.main(currentUser);
    }//GEN-LAST:event_jSifreDegisLabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainMusteriProfil(User currentUser) {
        MusteriProfil.currentUser = currentUser;
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
            java.util.logging.Logger.getLogger(MusteriProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdLabel;
    private javax.swing.JTextField jAdText;
    private javax.swing.JLabel jCancel;
    private javax.swing.JLabel jDateLabel;
    private javax.swing.JTextField jDateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLeftLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jSifreDegisLabel;
    private javax.swing.JLabel jSoyadLabel;
    private javax.swing.JTextField jSoyadText;
    private javax.swing.JLabel jTcLabel;
    private javax.swing.JTextField jTcText;
    private javax.swing.JLabel jTelLabel;
    private javax.swing.JTextField jTelText;
    // End of variables declaration//GEN-END:variables
}