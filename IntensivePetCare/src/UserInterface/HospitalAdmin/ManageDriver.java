/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author saran
 */
public class ManageDriver extends javax.swing.JPanel {

    /**
     * Creates new form ManageDriver
     */
    JPanel ipcuserProcessContainer;
    Ecosystem ipcsystem;
    private UserAccount ipcaccount;

    public ManageDriver(JPanel ipcuserProcessContainer, Ecosystem ipcsystem) {
        initComponents();
        this.ipcuserProcessContainer = ipcuserProcessContainer;
        this.ipcsystem = ipcsystem;
        this.ipcaccount = ipcaccount;
        populateManageDriverTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManagerDriver = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblManagerDriver.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblManagerDriver);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 376, 91));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 102, 102));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 60, 30));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 110, 30));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 80, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 102, 102));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setText("NAME");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 60, 30));

        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 120, 30));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 102, 102));
        lblusername.setText("USERNAME");
        jPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 80, 30));

        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 120, 30));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 102, 102));
        lblpassword.setText("PASSWORD");
        jPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 90, 30));

        btnadd.setBackground(new java.awt.Color(255, 255, 255));
        btnadd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 102, 102));
        btnadd.setText("ADD DRIVER");
        btnadd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 120, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE DRIVER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 290, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 30));

        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 120, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int ipcselectedRow = tblManagerDriver.getSelectedRow();
        if (ipcselectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String ipcusername = (String) tblManagerDriver.getValueAt(ipcselectedRow, 1);
                String ipcpwd = (String) tblManagerDriver.getValueAt(ipcselectedRow, 2);
                UserAccount user = ipcsystem.getUserAccountDirectory().authenticateUser(ipcusername, ipcpwd);

                ipcsystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcsystem.getLabAssistantDirectory().deleteLabAssistant(user.getIpcuserName());
                populateManageDriverTable();
            }
        } else 
        {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Driver details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ipcuserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.previous(ipcuserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tblManagerDriver.getSelectedRow();
        if (ipcselectRow >= 0) {
            String name = (String) tblManagerDriver.getValueAt(ipcselectRow, 0);
            String username = (String) tblManagerDriver.getValueAt(ipcselectRow, 1);
            String password = (String) tblManagerDriver.getValueAt(ipcselectRow, 2);

            txtname.setText(name + "");
            txtusername.setText(username + "");
            txtpass.setText(password + "");
            btnadd.setEnabled(false);
        }
 else  {
            JOptionPane.showMessageDialog(null, "Please select a row to view the Driver details");
        }         
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tblManagerDriver.getSelectedRow();
        if (ipcselectRow >= 0) {
        String name = (String) tblManagerDriver.getValueAt(ipcselectRow, 0);
        String username = (String) tblManagerDriver.getValueAt(ipcselectRow, 1);
        String password = (String) tblManagerDriver.getValueAt(ipcselectRow, 2);
        ipcaccount = ipcsystem.getUserAccountDirectory().authenticateUser(username, password);
        ipcsystem.getUserAccountDirectory().updateUserAccount(ipcaccount, txtname.getText(), txtusername.getText(), txtpass.getText());
        populateManageDriverTable();

        txtname.setText("");
        txtusername.setText("");
        txtpass.setText("");
        btnadd.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to update the Driver details");
             }
    }//GEN-LAST:event_btnUpdateActionPerformed
       
    private void populateManageDriverTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblManagerDriver.getModel();
        tablemodel.setRowCount(0);
        
         for (UserAccount user : ipcsystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("IntensivePetCare.Role.DriverRole")) {
                Object[] row = new Object[3];
                row[0] = user.getIpcname();
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
         }
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblManagerDriver;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtname.getText());
        
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txtusername.getText());
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txtpass.getText());
        
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided name,Please Try agian!");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided username ,Please Try agian!");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided password ,Please Try agian!");
            return false;
        }
        else {
            return true;
        }
    }
}


