/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HospitalAdmin;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.Role.vetRole;
import IntensivePetCare.UserAccount.UserAccount;
import IntensivePetCare.Vet.Vet;
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
public class ManageVet extends javax.swing.JPanel {

    /**
     * Creates new form ManageVet
     */
    JPanel ipcuserProcessContainer;
    Ecosystem ipcsystem;
    private UserAccount ipcaccount;

    public ManageVet(JPanel ipcuserProcessContainer, UserAccount ipcaccount, Ecosystem ipcsystem) {
        initComponents();
        this.ipcuserProcessContainer = ipcuserProcessContainer;
        this.ipcsystem = ipcsystem;
        this.ipcaccount = ipcaccount;
        ipcpopulateVetTable();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVet = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lblManageInfo1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE VET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 227, -1));

        tblVet.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblVet);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 420, 92));

        btnview.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnview.setForeground(new java.awt.Color(102, 0, 51));
        btnview.setText("VIEW");
        btnview.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 80, 30));

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 0, 51));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 90, 30));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 0, 51));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 90, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(153, 0, 51));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblname.setText("NAME");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, 30));

        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 150, 30));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(153, 0, 51));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("USERNAME");
        jPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 120, 30));

        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 150, 30));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(153, 0, 51));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpassword.setText("PASSWORD");
        jPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 110, 30));

        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 40));

        btnadd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnadd.setForeground(new java.awt.Color(153, 0, 51));
        btnadd.setText("ADD VET");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 120, 40));

        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 150, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        lblManageInfo1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo1.setText("HOSPITAL ADMIN WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tblVet.getSelectedRow();

        if (ipcselectRow >= 0) {
            String ipcname = (String) tblVet.getValueAt(ipcselectRow, 0);
            String ipcusername = (String) tblVet.getValueAt(ipcselectRow, 1);
            String ipcpassword = (String) tblVet.getValueAt(ipcselectRow, 2);

            txtname.setText(ipcname + "");
            txtusername.setText(ipcusername + "");
            txtpass.setText(ipcpassword + "");
            btnadd.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row to view the Vet details");
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tblVet.getSelectedRow();
        if (ipcselectRow >= 0) {
            String ipcname = (String) tblVet.getValueAt(ipcselectRow, 0);
            String ipcusername = (String) tblVet.getValueAt(ipcselectRow, 1);
            String ipcpassword = (String) tblVet.getValueAt(ipcselectRow, 2);
            ipcaccount = ipcsystem.getUserAccountDirectory().authenticateUser(ipcusername, ipcpassword);
            ipcsystem.getUserAccountDirectory().updateUserAccount(ipcaccount, txtname.getText(), txtusername.getText(), txtpass.getText());
            ipcpopulateVetTable();

            txtname.setText("");
            txtusername.setText("");
            txtpass.setText("");
            btnadd.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to update the Vet details");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int ipcselectedRow = tblVet.getSelectedRow();
        if (ipcselectedRow >= 0) {
            int ipcselectionButton = JOptionPane.YES_NO_OPTION;
            int ipcselectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", ipcselectionButton);
            if (ipcselectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblVet.getValueAt(ipcselectedRow, 1);
                String pwd = (String) tblVet.getValueAt(ipcselectedRow, 2);
                UserAccount user = ipcsystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ipcsystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcsystem.getVetDirectory().deleteVet(user.getIpcuserName());
                ipcpopulateVetTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Vet details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ipcuserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.previous(ipcuserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        if (ipcsystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtusername.getText())) {
            UserAccount userAccount = ipcsystem.getUserAccountDirectory().createUserAccount(txtname.getText(), txtusername.getText(), txtpass.getText(), null, new vetRole());
            Vet vet = ipcsystem.getVetDirectory().createUserAccount(txtusername.getText(), ipcaccount.getIpcname());
            ipcpopulateVetTable();
            txtname.setText("");
            txtusername.setText("");
            txtpass.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
        
        
        
    }//GEN-LAST:event_btnaddActionPerformed

public void ipcpopulateVetTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblVet.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcsystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("IntensivePetCare.Role.vetRole")) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInfo1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblVet;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables






}
