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
public class ProfilSifreDegis extends javax.swing.JFrame {
    public static User currentUser = null  ;
    /**
     * Creates new form ProfilSifreDegis
     */
    public ProfilSifreDegis() {
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
        jSifreLabel = new javax.swing.JLabel();
        jYeniUyari = new javax.swing.JLabel();
        jTekrarUyari = new javax.swing.JLabel();
        jCancelLabel = new javax.swing.JLabel();
        jGeriLabel = new javax.swing.JLabel();
        jEskiSifreLabel = new javax.swing.JLabel();
        jEskiPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jEskiLabel = new javax.swing.JLabel();
        jYeniPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSifreTekrarLabel = new javax.swing.JLabel();
        jTekrarPass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jOnaylaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSifreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock1.png"))); // NOI18N

        jYeniUyari.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jYeniUyari.setForeground(new java.awt.Color(255, 0, 0));

        jTekrarUyari.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTekrarUyari.setForeground(new java.awt.Color(255, 0, 0));

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });

        jGeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriLabel.setText("GER?? G??T");
        jGeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriLabelMousePressed(evt);
            }
        });

        jEskiSifreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock_eski.png"))); // NOI18N
        jEskiSifreLabel.setText("ESK?? S??FRE");

        jEskiPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEskiPass.setText(".");
        jEskiPass.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jEskiLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sifre_yeni.png"))); // NOI18N
        jEskiLabel.setText("YEN?? S??FRE");

        jYeniPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jYeniPass.setText(".");
        jYeniPass.setBorder(null);
        jYeniPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jYeniPassActionPerformed(evt);
            }
        });
        jYeniPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jYeniPassKeyReleased(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSifreTekrarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sifre_yeni.png"))); // NOI18N
        jSifreTekrarLabel.setText("S??FRE TEKRAR");

        jTekrarPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTekrarPass.setText(".");
        jTekrarPass.setBorder(null);
        jTekrarPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTekrarPassKeyReleased(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jOnaylaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jOnaylaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right.png"))); // NOI18N
        jOnaylaLabel.setText("ONAYLA");
        jOnaylaLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jEskiPass.setText("");
        jYeniPass.setText("");
        jTekrarPass.setText("");
        jOnaylaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jOnaylaLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jGeriLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSifreTekrarLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jEskiLabel)
                                .addComponent(jEskiSifreLabel)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jSifreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                .addComponent(jCancelLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2)
                                        .addComponent(jEskiPass)
                                        .addComponent(jSeparator1)
                                        .addComponent(jTekrarPass, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(jSeparator3))
                                    .addComponent(jYeniPass, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jYeniUyari, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jTekrarUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jOnaylaLabel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSifreLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCancelLabel)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEskiSifreLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jEskiPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jYeniPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jEskiLabel))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jSifreTekrarLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTekrarUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(jTekrarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jGeriLabel)
                            .addComponent(jOnaylaLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jYeniUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void jCancelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jCancelLabelMousePressed

    private void jGeriLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGeriLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MusteriProfil.mainMusteriProfil(currentUser);
    }//GEN-LAST:event_jGeriLabelMousePressed

    private void jYeniPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jYeniPassKeyReleased
        // TODO add your handling code here:
                int rValue = User.checkUyari(jYeniPass.getText(),6);
        if(rValue==1){
            jYeniUyari.setText("6 HANE VE RAKAM G??R??N??Z");
        }
        else if(rValue==2){
            jYeniUyari.setText("6 HANE G??R??N??Z");
         
        }
        else if(rValue==3){
           jYeniUyari.setText("SADEC RAKAM G??R??N??Z");
       
        }
        else{
         jYeniUyari.setText("");
         if(jYeniPass.getText().equals(jTekrarPass.getText())) jTekrarUyari.setText("");
         
   
        }
    }//GEN-LAST:event_jYeniPassKeyReleased

    private void jTekrarPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTekrarPassKeyReleased
        // TODO add your handling code here:
           int rValue = User.checkUyari(jTekrarPass.getText(),6);
        if(rValue==1){
            jTekrarUyari.setText("6 HANE VE RAKAM G??R??N??Z");
        }
        else if(rValue==2){
            jTekrarUyari.setText("6 HANE G??R??N??Z");
         
        }
        else if(rValue==3){
           jTekrarUyari.setText("SADEC RAKAM G??R??N??Z");
       
        }
        else{
         if(!(jTekrarPass.getText().equals(jYeniPass.getText()))){
             jTekrarUyari.setText("YUKARIDAK?? ??LE AYNI OLMALI");
         }
         else jTekrarUyari.setText("");
   
        }        
    }//GEN-LAST:event_jTekrarPassKeyReleased

    private void jOnaylaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOnaylaLabelMousePressed
        // TODO add your handling code here:
        if((jYeniPass.getText().equals(jTekrarPass.getText()))&&!(jYeniPass.getText().equals(""))&&(jYeniUyari.getText().equals("")) && jTekrarUyari.getText().equals("")){
            if(ProfilSifreDegis.currentUser.getSifre().equals(jEskiPass.getText())){
                    int onayKodu = User.createOnayKodu();
                    this.setVisible(false);
                    this.dispose();
                    TelefonOnay.mainTelefonOnay(onayKodu, currentUser);
                    ProfilOnayKod.mainProFilOnayKod(onayKodu, currentUser, jYeniPass.getText());
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "ESK?? S??FREN??Z?? YANLIS G??RD??N??Z");
            }
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "LUTFEN S??FREN??Z?? 6 HANE VE SADECE RAKAMLAR\nKULLANARAK OLUSTURUN");
        }
    }//GEN-LAST:event_jOnaylaLabelMousePressed

    private void jYeniPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jYeniPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jYeniPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(User currentUser) {
        ProfilSifreDegis.currentUser = currentUser ; 
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
            java.util.logging.Logger.getLogger(ProfilSifreDegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilSifreDegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilSifreDegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilSifreDegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilSifreDegis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JLabel jEskiLabel;
    private javax.swing.JPasswordField jEskiPass;
    private javax.swing.JLabel jEskiSifreLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JLabel jOnaylaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jSifreLabel;
    private javax.swing.JLabel jSifreTekrarLabel;
    private javax.swing.JPasswordField jTekrarPass;
    private javax.swing.JLabel jTekrarUyari;
    private javax.swing.JPasswordField jYeniPass;
    private javax.swing.JLabel jYeniUyari;
    // End of variables declaration//GEN-END:variables
}
