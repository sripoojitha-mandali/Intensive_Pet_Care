/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HospitalAdmin;

import javax.swing.JPanel;
import Model.Ecosystem;
import java.awt.CardLayout;
import Model.Role.vetRole;
import java.util.regex.Matcher;
import Model.Vet.Vet;
import java.util.regex.Pattern;
import Model.UserAccount.UserAccount;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author saran
 */
public class ManageVet extends javax.swing.JPanel {

    /**
     * Creates new form ManageVet
     */
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount ipcAccount;

    public ManageVet(JPanel ipcUserProcessContainer, UserAccount ipcAccount, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        this.ipcAccount = ipcAccount;
        ipcPopulateVetTable();
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
        lb2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        lb3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        txt3 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(102, 0, 51));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("MANAGE VET");
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 227, -1));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name ", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 420, 180));

        btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn1.setForeground(new java.awt.Color(102, 0, 51));
        btn1.setText("VIEW");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, 30));

        btn2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn2.setForeground(new java.awt.Color(102, 0, 51));
        btn2.setText("UPDATE");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 90, 30));

        btn3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn3.setForeground(new java.awt.Color(102, 0, 51));
        btn3.setText("DELETE");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 30));

        lb3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb3.setForeground(new java.awt.Color(153, 0, 51));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb3.setText("NAME");
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, 30));

        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 150, 30));

        lb4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb4.setForeground(new java.awt.Color(153, 0, 51));
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb4.setText("USERNAME");
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 120, 30));

        txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 150, 30));

        lb5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb5.setForeground(new java.awt.Color(153, 0, 51));
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb5.setText("PASSWORD");
        jPanel1.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 110, 30));

        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 40));

        btn4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn4.setForeground(new java.awt.Color(153, 0, 51));
        btn4.setText("ADD VET");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 120, 40));

        txt3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 150, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        lb1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("HOSPITAL ADMIN WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1075, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tb1.getSelectedRow();

        if (ipcselectRow >= 0) {
            String ipcname = (String) tb1.getValueAt(ipcselectRow, 0);
            String ipcusername = (String) tb1.getValueAt(ipcselectRow, 1);
            String ipcpassword = (String) tb1.getValueAt(ipcselectRow, 2);

            txt1.setText(ipcname + "");
            txt2.setText(ipcusername + "");
            txt3.setText(ipcpassword + "");
            btn4.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row in order to view the details of Vet");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tb1.getSelectedRow();
        if (ipcselectRow >= 0) {
            String ipcname = (String) tb1.getValueAt(ipcselectRow, 0);
            String ipcusername = (String) tb1.getValueAt(ipcselectRow, 1);
            String ipcpassword = (String) tb1.getValueAt(ipcselectRow, 2);
            ipcAccount = ipcSystem.getUserAccountDirectory().authenticateUser(ipcusername, ipcpassword);
            ipcSystem.getUserAccountDirectory().updateUserAccount(ipcAccount, txt1.getText(), txt2.getText(), txt3.getText());
            ipcPopulateVetTable();

            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            btn4.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row in order to update the details of Vet");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:

        int ipcselectedRow = tb1.getSelectedRow();
        if (ipcselectedRow >= 0) {
            int ipcselectionButton = JOptionPane.YES_NO_OPTION;
            int ipcselectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", ipcselectionButton);
            if (ipcselectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tb1.getValueAt(ipcselectedRow, 1);
                String pwd = (String) tb1.getValueAt(ipcselectedRow, 2);
                UserAccount user = ipcSystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ipcSystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcSystem.getVetDirectory().deleteVet(user.getIpcuserName());
                ipcPopulateVetTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row in order to delete the details of Vet");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (ipcSystem.getUserAccountDirectory().checkIfUsernameIsUnique(txt2.getText())) {
            UserAccount userAccount = ipcSystem.getUserAccountDirectory().createUserAccount(txt1.getText(), txt2.getText(), txt3.getText(), null, new vetRole());
            Vet vet = ipcSystem.getVetDirectory().createUserAccount(txt2.getText(), ipcAccount.getIpcname());
            ipcPopulateVetTable();
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
        
        
        
    }//GEN-LAST:event_btn4ActionPerformed

public void ipcPopulateVetTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tb1.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcSystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("Model.Role.vetRole")) {
                Object[] row = new Object[3];
                row[0] = user.getIpcname();
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
        }
    }



private boolean ipcvalidateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txt1.getText());
        
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txt2.getText());
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txt3.getText());
        
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Please try again by entering valid name");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Please try again by entering valid usernamename");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Please try again by entering valid password");
            return false;
        }
        else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JPasswordField txt3;
    // End of variables declaration//GEN-END:variables






}
