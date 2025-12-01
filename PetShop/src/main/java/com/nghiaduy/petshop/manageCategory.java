package com.nghiaduy.petshop;

import com.nghiaduy.petshop.dao.categoriesDAO;
import com.nghiaduy.petshop.model.categories;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class manageCategory extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(manageCategory.class.getName());

    public manageCategory() {
        initComponents();
        addButton.setEnabled(false);
    }
    
    public void validateField(){
        String category = categoryField.getText();
        if(!category.equals("")) {
            addButton.setEnabled(true);
        }
        else {
            addButton.setEnabled(false);
        }
    }
    
  
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logoutButton4.setText("Go back");
        logoutButton4.addActionListener(this::logoutButton4ActionPerformed);
        getContentPane().add(logoutButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 340, 170));

        jLabel1.setBackground(new java.awt.Color(153, 102, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Category");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 102, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Click on Row to Delete Category");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 102, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add New Category");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        categoryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categoryFieldKeyReleased(evt);
            }
        });
        getContentPane().add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, -1));

        addButton.setText("Add");
        addButton.addActionListener(this::addButtonActionPerformed);
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nghiaduy/petshop/images/bg800.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
       
    }//GEN-LAST:event_logoutButton4ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        categories categories = new categories();
        categories.setName(categoryField.getText());
        categoriesDAO.save(categories);
        setVisible(false);
        new manageCategory().setVisible(true);
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void categoryFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryFieldKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_categoryFieldKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<categories> list = categoriesDAO.getAllRecords();
        Iterator<categories> itr = list.iterator();
        while(itr.hasNext()){
            categories categoriesObj = itr.next();
            dtm.addRow(new Object[] {categoriesObj.getId(),categoriesObj.getName()});
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        int a = JOptionPane.showConfirmDialog(null, "Do You Want to Delete '"+name+"' Category", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0) {
            categoriesDAO.delete(id);
            setVisible(false);
            new manageCategory().setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new manageCategory().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel background;
    private javax.swing.JTextField categoryField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton4;
    // End of variables declaration//GEN-END:variables
}
