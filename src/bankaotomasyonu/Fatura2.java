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
public class Fatura2 extends javax.swing.JFrame {
    public static User currentUser ; 
    /**
     * Creates new form 
     */
    public Fatura2() {
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
        jCancelLabel = new javax.swing.JLabel();
        jGeriLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jVadesizTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });

        jGeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriLabel.setText("GERİ GİT");
        jGeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriLabelMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HANGİ HESAPTAN ÖDEMEK İSTİYORSUN");

        jVadesizTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HESAPNO", "BAKİYE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jVadesizTable.getTableHeader().setReorderingAllowed(false);
        jVadesizTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jVadesizTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jVadesizTable);
        if (jVadesizTable.getColumnModel().getColumnCount() > 0) {
            jVadesizTable.getColumnModel().getColumn(0).setResizable(false);
            jVadesizTable.getColumnModel().getColumn(1).setResizable(false);
        }

        ((Musteri)currentUser).hesapFieldAta(1);
        javax.swing.table.DefaultTableModel table = (javax.swing.table.DefaultTableModel)jVadesizTable.getModel();
        if(((Musteri)currentUser).hesapNull(1)){

        }

        else{
            int size = ((Musteri)currentUser).sizeOfHesap(1);
            if(size==0){

            }
            else{
                String[] dataRow = null ; 
                for(int i = 0 ; i < size ; ++i){
                    dataRow = ((Musteri)currentUser).getHesapAtIndex(1,i);
                    table.addRow(dataRow);
                }
            }
        }
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank.png"))); // NOI18N
        jLabel2.setText("20 YILDIR GUCUNU SIZDEN ALAN BANKA...");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jArkaPanelLayout = new javax.swing.GroupLayout(jArkaPanel);
        jArkaPanel.setLayout(jArkaPanelLayout);
        jArkaPanelLayout.setHorizontalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel1))
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCancelLabel))
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addComponent(jGeriLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))))
                .addContainerGap())
        );
        jArkaPanelLayout.setVerticalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancelLabel)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGeriLabel)
                    .addComponent(jLabel2))
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
        Fatura1.mainFatura1(currentUser);
    }//GEN-LAST:event_jGeriLabelMousePressed

    private void jVadesizTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVadesizTableMousePressed
        // TODO add your handling code here:
 
        int index = jVadesizTable.getSelectedRow();
        if(index!=-1){
           String hesapNo = jVadesizTable.getValueAt(index,0).toString();
           String bakiye = jVadesizTable.getValueAt(index,1).toString();
           this.setVisible(false);
           this.dispose();
           Fatura3.mainFatura3(currentUser, hesapNo, bakiye);
        }       
    }//GEN-LAST:event_jVadesizTableMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainFatura2(User currentUser ) {
        Fatura2.currentUser = currentUser ; 
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
            java.util.logging.Logger.getLogger(Fatura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fatura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fatura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fatura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fatura2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jVadesizTable;
    // End of variables declaration//GEN-END:variables
}