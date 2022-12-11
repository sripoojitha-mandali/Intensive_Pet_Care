/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import Model.UserAccount.UserAccount;
import Model.Hospital.Hospital;
import Model.Role.HospitalAdminRole;
import Model.Ecosystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/**
 *
 * @author varshakuruva
 */
public class ManageHospitalNetwork extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalNetwork
     */
    
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount user;
    
    public ManageHospitalNetwork(JPanel ipcUserProcessContainer, Ecosystem ipcSystem) {
        initComponents();
        
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        ipcPopulateHospitalTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack1 = new javax.swing.JButton();
        lbManageHospNetwork = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHospital = new javax.swing.JTable();
        btnViewHospital1 = new javax.swing.JButton();
        btnDeleteHospital1 = new javax.swing.JButton();
        txtName1 = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        btnAddHospitalNet1 = new javax.swing.JButton();
        btnUpdateHospital1 = new javax.swing.JButton();
        lbUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(199, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 40));

        lbManageHospNetwork.setBackground(new java.awt.Color(0, 153, 153));
        lbManageHospNetwork.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbManageHospNetwork.setForeground(new java.awt.Color(153, 0, 0));
        lbManageHospNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbManageHospNetwork.setText("MANAGE HOSPITAL NETWORK");
        add(lbManageHospNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, 87));

        tbHospital.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tbHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbHospital);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 91));

        btnViewHospital1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnViewHospital1.setForeground(new java.awt.Color(153, 0, 0));
        btnViewHospital1.setText("VIEW");
        btnViewHospital1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospital1ActionPerformed(evt);
            }
        });
        add(btnViewHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 30));

        btnDeleteHospital1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDeleteHospital1.setForeground(new java.awt.Color(153, 0, 0));
        btnDeleteHospital1.setText("DELETE");
        btnDeleteHospital1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospital1ActionPerformed(evt);
            }
        });
        add(btnDeleteHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 90, 30));

        txtName1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtName1.setForeground(new java.awt.Color(0, 153, 153));
        txtName1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 30));

        txtUsername1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUsername1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 180, 30));

        lbName.setBackground(new java.awt.Color(0, 153, 153));
        lbName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbName.setForeground(new java.awt.Color(153, 0, 51));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbName.setText("NAME");
        add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 260, 210, 30));

        lbPassword.setBackground(new java.awt.Color(0, 153, 153));
        lbPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(153, 0, 0));
        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPassword.setText("PASSWORD");
        add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 350, 210, 30));

        txtPassword1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(0, 153, 153));
        txtPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 180, 30));

        btnAddHospitalNet1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAddHospitalNet1.setForeground(new java.awt.Color(153, 0, 51));
        btnAddHospitalNet1.setText("ADD HOSPITAL NETWORK");
        btnAddHospitalNet1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddHospitalNet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalNet1ActionPerformed(evt);
            }
        });
        add(btnAddHospitalNet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 230, 40));

        btnUpdateHospital1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdateHospital1.setForeground(new java.awt.Color(153, 0, 0));
        btnUpdateHospital1.setText("UPDATE");
        btnUpdateHospital1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospital1ActionPerformed(evt);
            }
        });
        add(btnUpdateHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 100, 30));

        lbUserName.setBackground(new java.awt.Color(0, 153, 153));
        lbUserName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(153, 0, 0));
        lbUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUserName.setText("USERNAME");
        add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 310, 210, 24));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/m1.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -10, 590, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnViewHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospital1ActionPerformed
        // TODO add your handling code here:
        int selectRow = tbHospital.getSelectedRow();

        if (selectRow >= 0) {
            String name = (String) tbHospital.getValueAt(selectRow, 0);
            String username = (String) tbHospital.getValueAt(selectRow, 1);
            String password = (String) tbHospital.getValueAt(selectRow, 2);

            txtName1.setText(name + "");
            txtUsername1.setText(username + "");
            txtPassword1.setText(password + "");
        }
        else  
        {
            JOptionPane.showMessageDialog(null, " Please select one row to see the Hospital network details");
        }         
             
    }//GEN-LAST:event_btnViewHospital1ActionPerformed

    private void btnDeleteHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospital1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbHospital.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tbHospital.getValueAt(selectedRow, 1);
                String pwd = (String) tbHospital.getValueAt(selectedRow, 2);
                UserAccount user = ipcSystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ipcSystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcSystem.getHospitalDirectory().deleteHospital(user.getIpcuserName());
                ipcPopulateHospitalTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row to delete the Hospital network details");
        }
    }//GEN-LAST:event_btnDeleteHospital1ActionPerformed

    private void btnAddHospitalNet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalNet1ActionPerformed
        // TODO add your handling code here:
        if(ipcValidateInputFields()){
        if (ipcSystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername1.getText())) {
            UserAccount userAccount = ipcSystem.getUserAccountDirectory().createUserAccount(txtName1.getText(), txtUsername1.getText(), txtPassword1.getText(), null, new HospitalAdminRole());
            Hospital hospital = ipcSystem.getHospitalDirectory().createUserAccount(txtUsername1.getText(), txtName1.getText());
            ipcPopulateHospitalTable();
            txtName1.setText("");
            txtUsername1.setText("");
            txtPassword1.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username not unique");
        }
    }//GEN-LAST:event_btnAddHospitalNet1ActionPerformed
    }
    private void btnUpdateHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospital1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tbHospital.getSelectedRow();
        if (selectedRow >= 0) {
        String name = (String) tbHospital.getValueAt(selectedRow, 0);
        String username = (String) tbHospital.getValueAt(selectedRow, 1);
        String password = (String) tbHospital.getValueAt(selectedRow, 2);
        user = ipcSystem.getUserAccountDirectory().authenticateUser(username, password);
        ipcSystem.getUserAccountDirectory().updateUserAccount(user, txtName1.getText(), txtUsername1.getText(), txtPassword1.getText());
        ipcPopulateHospitalTable();

        txtName1.setText("");
        txtUsername1.setText("");
        txtPassword1.setText("");
        
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row to update the Hospital network details");
        }
    }//GEN-LAST:event_btnUpdateHospital1ActionPerformed

    private void ipcPopulateHospitalTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tbHospital.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcSystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("Model.Role.HospitalAdminRole")) {
                Object[] row = new Object[3];
                row[0] = user.getIpcname();
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHospitalNet1;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDeleteHospital1;
    private javax.swing.JButton btnUpdateHospital1;
    private javax.swing.JButton btnViewHospital1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbManageHospNetwork;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTable tbHospital;
    private javax.swing.JTextField txtName1;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables

private boolean ipcValidateInputFields() {

        Pattern p2 = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m2 = p2.matcher(txtName1.getText());
        
        Pattern p3 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m3 = p3.matcher(txtUsername1.getText());
        
        Pattern p1 = Pattern.compile("^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$");
        Matcher m1 = p1.matcher(txtPassword1.getText());
        
        
        if (!m2.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide correct input for Name!!");
            return false;
        } else if (!m3.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide correct input for User Name!!");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide a strong Password!!");
            return false;
        }
        else {
            return true;
        }
    }
}