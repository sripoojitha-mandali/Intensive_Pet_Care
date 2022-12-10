/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;
import IntensivePetCare.Driver.Driver;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.Role.DriverRole;
import IntensivePetCare.Role.HealthCampRole;
import IntensivePetCare.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author varshakuruva
 */
public class Managedriver extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    
    
    public Managedriver(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        
        populateDriverTable();
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
        tblManageDriver = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(214, 209, 222));
        jPanel1.setForeground(new java.awt.Color(63, 40, 101));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblManageDriver.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblManageDriver);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 440, 91));

        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(63, 40, 101));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 60, 30));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(63, 40, 101));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 70, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(63, 40, 101));
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 70, 30));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 100, -1));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(63, 40, 101));
        lblusername.setText("Username");
        jPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, 30));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 100, -1));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(63, 40, 101));
        lblpassword.setText("Password");
        jPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 100, -1));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 100, -1));

        btnadd.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnadd.setForeground(new java.awt.Color(63, 40, 101));
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 100, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 40, 101));
        jLabel1.setText("MANAGE DRIVER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 218, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screenshot (2) (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1080, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageDriver.getSelectedRow();
        if (selectedRow >= 0) {
        UserAccount driverSelected = (UserAccount) tblManageDriver.getValueAt(selectedRow, 0);
        txtname.setText(driverSelected.getIpcname());
        txtusername.setText(driverSelected.getIpcuserName());
        txtpass.setText(driverSelected.getIpcpassword());
        //        btnadd.setEnabled(false);
        }
        else  
        {
            JOptionPane.showMessageDialog(null, "Please select a row to view the Driver details");
        }  
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageDriver.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblManageDriver.getValueAt(selectedRow, 1);
                String pwd = (String) tblManageDriver.getValueAt(selectedRow, 2);
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getDriverDirectory().deleteDriver(user.getIpcuserName());
                populateDriverTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Driver details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(txtusername.getText())) {
            UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(txtname.getText(), txtusername.getText(), txtpass.getText(), null, new DriverRole());
            Driver driver = system.getDriverDirectory().createUserAccount(txtusername.getText());
            System.out.println("health camp username while adding : "+ txtusername.getText());
            populateDriverTable();
            txtname.setText("");
            txtusername.setText("");
            txtpass.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
public void populateDriverTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblManageDriver.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("IntensivePetCare.Role.DriverRole")) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblManageDriver;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
