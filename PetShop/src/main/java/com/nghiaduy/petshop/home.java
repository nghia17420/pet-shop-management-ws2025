package com.nghiaduy.petshop;

public class home extends javax.swing.JFrame {
    
    public String phone;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(home.class.getName());

    public home() {
        initComponents();
    }
    
    public home(String userPhone) {
        initComponents();
        phone = userPhone;
        if(!userPhone.equals("0799755429")) {
            manageCategoriesButton.setVisible(false);
            newProductsButton.setVisible(false);
            viewEditDeleteProductsButton.setVisible(false);
            verifyUsersButton.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeOrderButton = new javax.swing.JButton();
        manageCategoriesButton = new javax.swing.JButton();
        billAndOrderButton = new javax.swing.JButton();
        viewEditDeleteProductsButton = new javax.swing.JButton();
        verifyUsersButton = new javax.swing.JButton();
        newProductsButton = new javax.swing.JButton();
        logoutButton4 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(this::placeOrderButtonActionPerformed);
        getContentPane().add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 150));

        manageCategoriesButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        manageCategoriesButton.setText("Manage Categories");
        manageCategoriesButton.addActionListener(this::manageCategoriesButtonActionPerformed);
        getContentPane().add(manageCategoriesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        billAndOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        billAndOrderButton.setText("View Bill & Order Details");
        billAndOrderButton.addActionListener(this::billAndOrderButtonActionPerformed);
        getContentPane().add(billAndOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 150));

        viewEditDeleteProductsButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        viewEditDeleteProductsButton.setText("View, Edit & Delete Products");
        viewEditDeleteProductsButton.addActionListener(this::viewEditDeleteProductsButtonActionPerformed);
        getContentPane().add(viewEditDeleteProductsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        verifyUsersButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verifyUsersButton.setText("Verify Users");
        verifyUsersButton.addActionListener(this::verifyUsersButtonActionPerformed);
        getContentPane().add(verifyUsersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        newProductsButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        newProductsButton.setText("New Products");
        newProductsButton.addActionListener(this::newProductsButtonActionPerformed);
        getContentPane().add(newProductsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, -1));

        logoutButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logoutButton4.setText("Logout");
        logoutButton4.addActionListener(this::logoutButton4ActionPerformed);
        getContentPane().add(logoutButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nghiaduy/petshop/images/bg800.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PlaceOrder(phone).setVisible(true);
        
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void manageCategoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCategoriesButtonActionPerformed
        setVisible(false);
        new manageCategory().setVisible(true);
    }//GEN-LAST:event_manageCategoriesButtonActionPerformed

    private void billAndOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billAndOrderButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewBillsOrderPlacedDetails(phone).setVisible(true);
    }//GEN-LAST:event_billAndOrderButtonActionPerformed

    private void viewEditDeleteProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEditDeleteProductsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_viewEditDeleteProductsButtonActionPerformed

    private void verifyUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyUsersButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_verifyUsersButtonActionPerformed

    private void newProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_newProductsButtonActionPerformed

    private void logoutButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_logoutButton4ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton billAndOrderButton;
    private javax.swing.JButton logoutButton4;
    private javax.swing.JButton manageCategoriesButton;
    private javax.swing.JButton newProductsButton;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JButton verifyUsersButton;
    private javax.swing.JButton viewEditDeleteProductsButton;
    // End of variables declaration//GEN-END:variables
}
