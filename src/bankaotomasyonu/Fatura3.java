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
public class Fatura3 extends javax.swing.JFrame {
    public static User currentUser ; 
    public static String vadesizHesapNo ; 
    public static String vadesizBakiye ; 
    /**
     * Creates new form 
     */
    public Fatura3() {
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
        jTamText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jNoktaLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jOndalikText = new javax.swing.JTextField();
        jYaziLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCancelLabel = new javax.swing.JLabel();
        jGeriLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jTamText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTamText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTamText.setBorder(null);
        jTamText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTamTextKeyReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jNoktaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNoktaLabel.setText(".");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jOndalikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jOndalikText.setBorder(null);
        jOndalikText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jOndalikTextKeyReleased(evt);
            }
        });

        jYaziLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jYaziLabel.setText("ODENECEK TUTARI GIRIN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right.png"))); // NOI18N
        jLabel3.setText("FATURA ODE");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout jArkaPanelLayout = new javax.swing.GroupLayout(jArkaPanel);
        jArkaPanel.setLayout(jArkaPanelLayout);
        jArkaPanelLayout.setHorizontalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jTamText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jNoktaLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(jOndalikText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jYaziLabel)))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCancelLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jGeriLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jArkaPanelLayout.setVerticalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancelLabel)
                .addGap(33, 33, 33)
                .addComponent(jYaziLabel)
                .addGap(45, 45, 45)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNoktaLabel)
                    .addComponent(jOndalikText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jGeriLabel))
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

    private void jTamTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTamTextKeyReleased
        // TODO add your handling code here:
        long tam,ondalik;
        double kullaniciSayisi ; // Kullan??c??n istedgi tutar ama vadesiz hesab??ndan daha fazla girmis ise bunu kontol etmem laz??m!
        double vadesizSayi ;
        try{
            if(jTamText.getText().equals(""));
            else  Long.valueOf(jTamText.getText());

            if(jOndalikText.getText().equals("")) ;
            else  Long.valueOf(jOndalikText.getText());
            // S??MD??YE KADAR NUMBER FORMATINDA SIKINTI VARSA D??YE YAPTIK EGER BURAYI GECER ISE SAYI FORMATINDA SIKINTI YOKTUR!
            if(jTamText.getText().equals("")) tam = 0 ;
            else tam = Long.valueOf(jTamText.getText());
            vadesizSayi = Double.valueOf(vadesizBakiye);
            if((long)vadesizSayi < tam){
                jTamText.setText(String.valueOf((long)vadesizSayi));
            }
            else{

            }

        }catch(NumberFormatException e ){
            jTamText.setText("");
        }
    }//GEN-LAST:event_jTamTextKeyReleased

    private void jOndalikTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jOndalikTextKeyReleased
        // TODO add your handling code here:
        long tam, ondalik;
        double kullaniciSayisi;
        double vadesizSayi;
        try{
            if(jTamText.getText().equals(""));
            else  Long.valueOf(jTamText.getText());

            if(jOndalikText.getText().equals("")) ;
            else  Long.valueOf(jOndalikText.getText());
            // S??MD??YE KADAR NUMBER FORMATINDA SIKINTI VARSA D??YE YAPTIK EGER BURAYI GECER ISE SAYI FORMATINDA SIKINTI YOKTUR!
            if(jTamText.getText().equals("")&&jOndalikText.getText().equals("")){
                kullaniciSayisi = 0.0 ;
            }
            else if(jTamText.getText().equals("")||jOndalikText.getText().equals("")){
                if(jTamText.getText().equals("")){
                    kullaniciSayisi = Double.valueOf("0."+jOndalikText.getText());
                }
                else{
                    kullaniciSayisi = Double.valueOf(jTamText.getText()+".0");
                }
            }
            else{
                kullaniciSayisi = Double.valueOf(jTamText.getText()+"."+jOndalikText.getText());
            }
            vadesizSayi = Double.valueOf(vadesizBakiye);
            if(vadesizSayi < kullaniciSayisi){
                java.util.StringTokenizer token = new java.util.StringTokenizer(vadesizBakiye,".");
                jTamText.setText(token.nextToken());
                jOndalikText.setText(token.nextToken());
            }
            else{

            }

        }catch(NumberFormatException e){
            jOndalikText.setText("");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"B??LG??N??N SAKNLAMASINDA HATA VAR!");
        }
    }//GEN-LAST:event_jOndalikTextKeyReleased

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        String tam = jTamText.getText();
        String ondalik = jOndalikText.getText();
        if(tam == null || tam.equals("")){
            tam = "0";
        }
        if(ondalik == null || ondalik.equals("")){
            ondalik ="0";
        }
        String para = tam+"."+ondalik;

        try{
            double vadeliHesapPara = Double.valueOf(para);
            if(vadeliHesapPara <=0){
                javax.swing.JOptionPane.showMessageDialog(null,"YUKLEMEK ISTEDIGINIZ BAK??YE NEGAT??F VEYA SIFIR OLAMAZ");
                this.setVisible(false);
                this.dispose();
                Fatura1.mainFatura1(currentUser);
                return ;
            }
            else{
                if(!((((Musteri)currentUser).vadesizHesapBakiye(vadesizHesapNo, vadeliHesapPara, false)))){
                    // yani cikarma islemi bakiye yetersizliginden olmamis ise
                    this.setVisible(false);
                    this.dispose();
                    VadesizFrame.mainVadesizFrame(currentUser);
                    javax.swing.JOptionPane.showMessageDialog(null,"SEC??LEN VADES??Z HESAPTA BU KADAR PARA YOK!");
                }
                else{
                    this.setVisible(false);
                    this.dispose();
                    // 3. asama
                    javax.swing.JOptionPane.showMessageDialog(null,"ISLEM BASARILI BIR SEKILDE GERCEKLESTI");
                    MusteriMenu.mainMusteriMenu(currentUser);

                }
            }

        }catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null,"LUTFEN SADECE RAKAM G??R??N??Z!");
        }
    }//GEN-LAST:event_jLabel3MousePressed

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
        Fatura2.mainFatura2(currentUser);
    }//GEN-LAST:event_jGeriLabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainFatura3(User currentUser , String vadesizHesapNo , String vadesizBakiye) {
        Fatura3.currentUser = currentUser ; 
        Fatura3.vadesizHesapNo = vadesizHesapNo ; 
        Fatura3.vadesizBakiye = vadesizBakiye  ;
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
            java.util.logging.Logger.getLogger(Fatura3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fatura3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fatura3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fatura3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fatura3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jNoktaLabel;
    private javax.swing.JTextField jOndalikText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTamText;
    private javax.swing.JLabel jYaziLabel;
    // End of variables declaration//GEN-END:variables
}
