
package com.nghiaduy.petshop;

import com.nghiaduy.petshop.dao.ProductDAO;
import com.nghiaduy.petshop.dao.categoriesDAO;
import com.nghiaduy.petshop.model.Product;
import com.nghiaduy.petshop.model.categories;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ViewEditDeleteProduct extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName());

    
    public ViewEditDeleteProduct() {
        initComponents();
        buttonDelete.setEnabled(false);
        buttonUpdate.setEnabled(false);
    }
    
    public void validateField(){
        String name = fieldName.getText();
        String price = fieldPrice.getText();
        String category = (String)fieldCategory.getSelectedItem();
        if(!name.equals("") && !price.equals("") && category != null)
            buttonUpdate.setEnabled(true);
        else
            buttonUpdate.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldCategory = new javax.swing.JComboBox<>();
        fieldPrice = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View, Edit, Delete Products");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 460, -1));

        jLabel2.setBackground(new java.awt.Color(153, 102, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Price");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 70, -1));

        jLabel3.setBackground(new java.awt.Color(153, 102, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 40, -1));

        jLabel4.setBackground(new java.awt.Color(153, 102, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, -1));

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Category");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, -1));

        lblId.setBackground(new java.awt.Color(153, 102, 0));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("00");
        lblId.setOpaque(true);
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 50, -1));

        fieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNameKeyReleased(evt);
            }
        });
        getContentPane().add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 240, -1));

        getContentPane().add(fieldCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 240, -1));

        fieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldPriceKeyReleased(evt);
            }
        });
        getContentPane().add(fieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 240, -1));

        buttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(this::buttonDeleteActionPerformed);
        getContentPane().add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(this::buttonUpdateActionPerformed);
        getContentPane().add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 370, 500));

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBack.setText("Go back");
        buttonBack.addActionListener(this::buttonBackActionPerformed);
        getContentPane().add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nghiaduy/petshop/images/bg800.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_fieldNameKeyReleased

    private void fieldPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPriceKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_fieldPriceKeyReleased

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        int id = Integer.parseInt(lblId.getText());
        product.setId(id);
        product.setName(fieldName.getText());
        product.setCategory((String)fieldCategory.getSelectedItem());
        product.setPrice(fieldPrice.getText());
        ProductDAO.update(product);
        setVisible(false);
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Product> list = ProductDAO.getAllRecords();
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getId(),productObj.getName(),productObj.getCategory(),productObj.getPrice()});
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        lblId.setText(id);
        String name = model.getValueAt(index, 1).toString();
        fieldName.setText(name);
        String category = model.getValueAt(index, 2).toString();
        String price = model.getValueAt(index, 3).toString();
        fieldPrice.setText(price);
        
        buttonUpdate.setEnabled(true);
        buttonDelete.setEnabled(true);
        fieldCategory.removeAllItems();
        fieldCategory.addItem(category);
        ArrayList<categories> categoryList = categoriesDAO.getAllRecords();
        Iterator<categories> categoryItr = categoryList.iterator();
        while(categoryItr.hasNext()) {
            categories categoryObj = categoryItr.next();
            if(!categoryObj.getName().equals(category)){
                fieldCategory.addItem(categoryObj.getName());
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        String id = lblId.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Product","Select",JOptionPane.YES_NO_OPTION);
        if (a==0){
            ProductDAO.delete(id);
            setVisible(false);
            new ViewEditDeleteProduct().setVisible(true);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ViewEditDeleteProduct().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> fieldCategory;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblId;
    // End of variables declaration//GEN-END:variables
}
