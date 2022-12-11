/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import Model.HealthCamp.HealthCamp;
import Model.Hospital.Hospital;
import Model.Role.HealthCampRole;
import Model.Role.HospitalAdminRole;
import Model.Ecosystem;
import Model.UserAccount.UserAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/**
 *
 * @author varshakuruva
 */
public class ManageHealthCamp extends javax.swing.JPanel {

    /**
     * Creates new form ManageHealthCamp
     */
    
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount user; 
    
    public ManageHealthCamp(JPanel ipcUserProcessContainer, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        ipcPopulateHealthCampTable();
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
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHealthCamp = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        txtName1 = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        lbl1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 0, 51));
        lbl1.setText("MANAGE HEALTH CAMP");
        add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 40));

        tbHealthCamp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbHealthCamp);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 640, 170));

        btnView1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnView1.setForeground(new java.awt.Color(153, 0, 51));
        btnView1.setText("VIEW");
        btnView1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 80, 30));

        btnUpdate1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(153, 0, 51));
        btnUpdate1.setText("UPDATE");
        btnUpdate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 80, 30));

        btnDelete1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete1.setText("Delete");
        btnDelete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 90, 30));

        txtName1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 120, 30));

        txtUsername1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 120, 30));

        txtPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 120, 30));

        lbPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(153, 0, 51));
        lbPassword.setText("PASSWORD");
        add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 90, 30));

        lbUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(153, 0, 51));
        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsername.setText("USERNAME");
        add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 90, 30));

        lbName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbName.setForeground(new java.awt.Color(153, 0, 51));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("NAME");
        add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 80, 30));

        btnAdd1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAdd1.setForeground(new java.awt.Color(153, 0, 0));
        btnAdd1.setText("ADD HEALTH CAMP");
        btnAdd1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 190, 30));

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/doggie5.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:

        int selectRow = tbHealthCamp.getSelectedRow();

        if (selectRow >= 0) {
            String name = (String) tbHealthCamp.getValueAt(selectRow, 0);
            String username = (String) tbHealthCamp.getValueAt(selectRow, 1);
            String password = (String) tbHealthCamp.getValueAt(selectRow, 2);

            txtName1.setText(name + "");
            txtUsername1.setText(username + "");
            txtPassword1.setText(password + "");
            btnAdd1.setEnabled(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "to view the Health Camp details, Please select a row");
        }
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        if(ipcValidateInputFields()){
        int selectRow = tbHealthCamp.getSelectedRow();
        if (selectRow >= 0) {
        String name = (String) tbHealthCamp.getValueAt(selectRow, 0);
        String username = (String) tbHealthCamp.getValueAt(selectRow, 1);
        String password = (String) tbHealthCamp.getValueAt(selectRow, 2);
        user = ipcSystem.getUserAccountDirectory().authenticateUser(username, password);
        ipcSystem.getUserAccountDirectory().updateUserAccount(user, txtName1.getText(), txtUsername1.getText(), txtPassword1.getText());
        ipcPopulateHealthCampTable();

        txtName1.setText("");
        txtUsername1.setText("");
        txtPassword1.setText("");
        btnAdd1.setEnabled(true);
        
        }
        else {
            JOptionPane.showMessageDialog(null, "to update the Health Camp details, Please select a row");
        }
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbHealthCamp.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tbHealthCamp.getValueAt(selectedRow, 1);
                String pwd = (String) tbHealthCamp.getValueAt(selectedRow, 2);
                UserAccount user = ipcSystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ipcSystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcSystem.getHealthCampDirectory().deleteHealthCamp(user.getIpcuserName());
                ipcPopulateHealthCampTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "to delete the Health Camp details, Please select a row");
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        if(ipcValidateInputFields()){
        if (ipcSystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername1.getText())) {
            UserAccount userAccount = ipcSystem.getUserAccountDirectory().createUserAccount(txtName1.getText(), txtUsername1.getText(), txtPassword1.getText(), null, new HealthCampRole());
            HealthCamp healthCamp = ipcSystem.getHealthCampDirectory().createUserAccount(txtUsername1.getText());
            System.out.println("health camp username while adding : "+ txtUsername1.getText());
            ipcPopulateHealthCampTable();
            txtName1.setText("");
            txtUsername1.setText("");
            txtPassword1.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Unique User Name");
        }
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    public void ipcPopulateHealthCampTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tbHealthCamp.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcSystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("Model.Role.HealthCampRole")) {
                Object[] row = new Object[3];
                row[0] = user.getIpcname();
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTable tbHealthCamp;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables

private boolean ipcValidateInputFields() {

        Pattern p2 = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m2 = p2.matcher(txtName1.getText());
        
        Pattern p3 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m3 = p3.matcher(txtUsername1.getText());
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
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