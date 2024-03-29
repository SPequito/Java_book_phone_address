/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stefa
 */
public class appFrame extends javax.swing.JFrame {

    SQliteDatabase base = new SQliteDatabase();
    JTable table;
    
    /**
     * Creates new form appFrame
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public appFrame() throws SQLException, ClassNotFoundException {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSqlite = new javax.swing.JTable();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTextFieldFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFirstNameKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jTextFieldFirstName, gridBagConstraints);

        jTextFieldLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLastNameKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jTextFieldLastName, gridBagConstraints);

        jTextFieldPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jTextFieldPhone, gridBagConstraints);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jButtonDelete, gridBagConstraints);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jButtonAdd, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jTextFieldAddress, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jTextFieldEmail, gridBagConstraints);

        jLabelFirstName.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelFirstName, gridBagConstraints);

        jLabelLastName.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelLastName, gridBagConstraints);

        jLabelPhone.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelPhone, gridBagConstraints);

        jLabelAddress.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelAddress, gridBagConstraints);

        jLabelEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelEmail, gridBagConstraints);

        jTableSqlite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "First Name", "Last Name", "Phone", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSqlite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSqliteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSqlite);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        jPanel1.add(jButtonUpdate, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 16, 16);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            if (!jTextFieldEmail.getText().contains("@") && jTextFieldEmail.getText().isBlank() == false) {
                JOptionPane.showMessageDialog(null, "Please the email need to contaneed @");
            }
            else if  (jTextFieldAddress.getText().isBlank() && jTextFieldFirstName.getText().isBlank()&& jTextFieldEmail.getText().isBlank() && jTextFieldLastName.getText().isBlank() && jTextFieldPhone.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Please write something");
            } else {
                base.add(jTextFieldFirstName.getText(), jTextFieldLastName.getText(), jTextFieldPhone.getText(), jTextFieldAddress.getText(), jTextFieldEmail.getText());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Ja foste");
        } catch (SQLException ex) {
            System.out.println("Ja foste");
        }
       DefaultTableModel model = (DefaultTableModel) jTableSqlite.getModel();
       model.setRowCount(0);
        try {
            base.populateTable(jTableSqlite);
        } catch (ClassNotFoundException ex) {
              System.out.println("Ja foste 2");
        } catch (SQLException ex) {
             System.out.println("Ja foste 2");
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
      if(jTableSqlite.getSelectedRow() > -1){
      try{
      base.delete(String.valueOf(jTableSqlite.getValueAt(jTableSqlite.getSelectedRow(), 0)),String.valueOf(jTableSqlite.getSelectedRow()));
      } catch (SQLException ex) {
               System.out.println("Ja foste");
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(appFrame.class.getName()).log(Level.SEVERE, null, ex);
          }     
      }  
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameKeyPressed
       char c = evt.getKeyChar();
       
       if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
           jTextFieldFirstName.setEditable(true);
    }else 
           jTextFieldFirstName.setEditable(false);
    }//GEN-LAST:event_jTextFieldFirstNameKeyPressed

    private void jTextFieldLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastNameKeyPressed
        char c = evt.getKeyChar();
       
       if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
           jTextFieldLastName.setEditable(true);
    }else 
           jTextFieldLastName.setEditable(false);
    }//GEN-LAST:event_jTextFieldLastNameKeyPressed

    private void jTextFieldPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneKeyPressed
   char c = evt.getKeyChar();
       
       if(Character.isDigit(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
           jTextFieldPhone.setEditable(true);
    }else 
           jTextFieldPhone.setEditable(false);
    }//GEN-LAST:event_jTextFieldPhoneKeyPressed

    private void jTableSqliteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSqliteMouseClicked
     DefaultTableModel model = (DefaultTableModel) jTableSqlite.getModel();
     int i = jTableSqlite.getSelectedRow();
     try{
         jTextFieldFirstName.setText(model.getValueAt(i, 1).toString());
         jTextFieldLastName.setText(model.getValueAt(i, 2).toString());
         jTextFieldPhone.setText(model.getValueAt(i, 3).toString());
         jTextFieldAddress.setText(model.getValueAt(i, 4).toString());
         jTextFieldEmail.setText(model.getValueAt(i, 5).toString());

     }catch(Exception e){
     }
    }//GEN-LAST:event_jTableSqliteMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
    if(jTableSqlite.getSelectedRow() > -1){
      try{
          if (!jTextFieldEmail.getText().contains("@") && jTextFieldEmail.getText().isBlank() == false) {
                JOptionPane.showMessageDialog(null, "Please the email need to contaneed @");
            }
            else if  (jTextFieldAddress.getText().isBlank() && jTextFieldFirstName.getText().isBlank()&& jTextFieldEmail.getText().isBlank() && jTextFieldLastName.getText().isBlank() && jTextFieldPhone.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Please write something");
            } else {
                base.update(String.valueOf(jTableSqlite.getValueAt(jTableSqlite.getSelectedRow(), 0)),jTableSqlite.getSelectedRow(),jTextFieldFirstName.getText(), jTextFieldLastName.getText(), jTextFieldPhone.getText(), jTextFieldAddress.getText(), jTextFieldEmail.getText());
            }

      } catch (SQLException ex) {
               System.out.println("Ja foste");
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(appFrame.class.getName()).log(Level.SEVERE, null, ex);
          }     
      }
       DefaultTableModel model = (DefaultTableModel) jTableSqlite.getModel();
       model.setRowCount(0);
            try {
            base.populateTable(jTableSqlite);
        } catch (ClassNotFoundException ex) {
              System.out.println("Ja foste 2");
        } catch (SQLException ex) {
             System.out.println("Ja foste 2");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSqlite;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables

    public JTable getTable(){
    return jTableSqlite;
}


}
