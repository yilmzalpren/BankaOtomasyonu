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
public class AdminLogin extends javax.swing.JFrame {
    public static int flag ; 
    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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
        jCardLabel = new javax.swing.JLabel();
        jCancelLabel = new javax.swing.JLabel();
        jTcText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jUserLabel = new javax.swing.JLabel();
        jTcUyariLabel = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jPassUyariLabel = new javax.swing.JLabel();
        jPassLabel = new javax.swing.JLabel();
        jGirisButon = new javax.swing.JButton();
        jMusteri = new javax.swing.JLabel();
        jSoruButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSifreUnuttumButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));
        jArkaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/personel1.png"))); // NOI18N
        if(flag==2){
            jCardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yonetici1.png"))); // NOI18N
        }
        jArkaPanel.add(jCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });
        jArkaPanel.add(jCancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jTcText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTcText.setBorder(null);
        jTcText.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTcText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTcTextKeyReleased(evt);
            }
        });
        jArkaPanel.add(jTcText, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 192, 173, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jArkaPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 216, 173, 15));

        jUserLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jUserLabel.setText("TC KİMLİK NO");
        jArkaPanel.add(jUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 183, -1, -1));

        jTcUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTcUyariLabel.setForeground(new java.awt.Color(255, 0, 0));
        jArkaPanel.add(jTcUyariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 238, 170, 10));

        jPassword.setBorder(null);
        jPassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordKeyReleased(evt);
            }
        });
        jArkaPanel.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 321, 173, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jArkaPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 344, 173, 15));

        jPassUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPassUyariLabel.setForeground(new java.awt.Color(255, 51, 51));
        jArkaPanel.add(jPassUyariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 366, 173, 10));

        jPassLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPassLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        jPassLabel.setText("SİFRE");
        jArkaPanel.add(jPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 310, -1, -1));

        jGirisButon.setBackground(new java.awt.Color(255, 255, 255));
        jGirisButon.setText("GİRİŞ YAP");
        jGirisButon.setBorder(null);
        jGirisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGirisButonMousePressed(evt);
            }
        });
        jArkaPanel.add(jGirisButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 410, 95, 26));

        jMusteri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMusteri.setText("PERSONEL GIRIS EKRANI");
        if(flag==2) jMusteri.setText("YONETICI GIRIS EKRANI");
        jArkaPanel.add(jMusteri, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jSoruButton.setBackground(new java.awt.Color(255, 255, 255));
        jSoruButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question.png"))); // NOI18N
        jSoruButton.setText("PERSONEL ÜYE OL");
        jSoruButton.setBorder(null);
        if(flag==2){
            jSoruButton.setText("YONETICI UYE OL");
        }
        jSoruButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSoruButtonMousePressed(evt);
            }
        });
        jArkaPanel.add(jSoruButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 419, 149, 46));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jLabel1.setText("GERİ GİT");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jArkaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jSifreUnuttumButon.setBackground(new java.awt.Color(255, 255, 255));
        jSifreUnuttumButon.setText("SİFREMİ UNTTUM");
        jSifreUnuttumButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSifreUnuttumButonMousePressed(evt);
            }
        });
        jArkaPanel.add(jSifreUnuttumButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 411, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        PersonelOrYönetici.mainPersonelOrYönetici();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jCancelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jCancelLabelMousePressed

    private void jTcTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcTextKeyReleased
        // TODO add your handling code here:
        int keeper = User.checkUyari(jTcText.getText(),11);
        if(keeper==1){
            jTcUyariLabel.setText("11 HANE VE RAKAM İCERMELİ");
        }
        else if(keeper ==2){
            jTcUyariLabel.setText("11 HANE OLMALI");          
        }
        else if(keeper==3){
            jTcUyariLabel.setText("SADECE RAKAM İCERMELİ");        
        }
        else{
            jTcUyariLabel.setText("");
        }        
    }//GEN-LAST:event_jTcTextKeyReleased

    private void jPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyReleased
        // TODO add your handling code here:
                int size = User.checkUyari(jPassword.getText(),6);
        if(size==1){
            jPassUyariLabel.setText("6 HANE VE RAKAM İCERMELİ");
        }
        else if(size==2){
             jPassUyariLabel.setText("6 HANE OLMALI");           
        }
        else if(size ==3){
                jPassUyariLabel.setText("SADECE RAKAM İCERMELİ");             
        }
        else{
                jPassUyariLabel.setText("");
        }    
    }//GEN-LAST:event_jPasswordKeyReleased

    private void jSifreUnuttumButonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSifreUnuttumButonMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        SifreUnuttumTc.mainSifreUnuttumTc(flag+1);        
    }//GEN-LAST:event_jSifreUnuttumButonMousePressed

    private void jSoruButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSoruButtonMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        AdminKayit.mainAdminKayit(flag);
    }//GEN-LAST:event_jSoruButtonMousePressed

    private void jGirisButonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGirisButonMousePressed
        // TODO add your handling code here:,
        String tc = jTcText.getText();
        String sifre = jPassword.getText();
        if(tc==null){
            javax.swing.JOptionPane.showMessageDialog(null,"BOS ALAN BIRAKMAYINIZ!");
            return ; 
        } 
        if(sifre==null){
            javax.swing.JOptionPane.showMessageDialog(null, "BOS ALAN BIRAKMAYINIZ!");
            return ; 
        }
        int rValue = User.checkUyari(tc,11);
        if(rValue==1){
            javax.swing.JOptionPane.showMessageDialog(null,"TC'DE 11 HANE VE SADECE RAKAM OLMALI");
            return ;
        }
        else if(rValue==2){
            javax.swing.JOptionPane.showMessageDialog(null,"TC 11 HANE OLMALI");
            return ; 
        }
        else if(rValue==3){
            javax.swing.JOptionPane.showMessageDialog(null,"TC SADECE RAKAM İCERMELİ");
            return ; 
        }
        // rValue==4 ise devam etsin
       int rValue2 = User.checkUyari(sifre,6);
       if(rValue2==1){
         javax.swing.JOptionPane.showMessageDialog(null, "SİFRE 6 HANE VE SADECE RAKAM OLMALI");
         return ; 
       }
       else if(rValue2==2){
           javax.swing.JOptionPane.showMessageDialog(null, "SİFRE 6 HANE OLMALI");
           return ; 
       }
       else if(rValue2==3){
           javax.swing.JOptionPane.showMessageDialog(null,"SİFRE SADECE RAKAM İCERMELİ");
       }
       
       // rValue2==4 ise devam et
       User rUser = User.userVarmi(tc, sifre,flag+1);
       if(rUser!=null){
           this.setVisible(false);
           this.dispose();
           AdminPanel.mainAdminPanel(rUser, flag);
       }        
    }//GEN-LAST:event_jGirisButonMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainAdminLogin(int flag) {
        AdminLogin.flag = flag  ;
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JLabel jCardLabel;
    private javax.swing.JButton jGirisButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMusteri;
    private javax.swing.JLabel jPassLabel;
    private javax.swing.JLabel jPassUyariLabel;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jSifreUnuttumButon;
    private javax.swing.JButton jSoruButton;
    private javax.swing.JTextField jTcText;
    private javax.swing.JLabel jTcUyariLabel;
    private javax.swing.JLabel jUserLabel;
    // End of variables declaration//GEN-END:variables
}