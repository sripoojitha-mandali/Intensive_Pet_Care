/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;


import Model.Ecosystem;
import Model.FundRaising.FundRaising;
import Model.Role.FundRaisingRole;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author varshakuruva
 */
public class ManageFundAgency extends javax.swing.JPanel {

    /**
     * Creates new form ManageFundAgency
     */
    
    JPanel ipcuserProcessContainer;
    Ecosystem ipcsystem;
    private UserAccount ipcaccount;
    public ManageFundAgency(JPanel ipcuserProcessContainer, Ecosystem system) {
        initComponents();
        this.ipcuserProcessContainer = ipcuserProcessContainer;
        this.ipcsystem = ipcsystem;
        this.ipcaccount = ipcaccount;
        populateFundRaisingTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblfundagency = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lblusername = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 209, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 36));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE FUND AGENCY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 310, 50));

        tblfundagency.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblfundagency);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 600, 200));

        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnView.setForeground(new java.awt.Color(63, 40, 101));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 80, 30));

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(63, 40, 101));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 100, 30));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(63, 40, 101));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 90, 30));

        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 140, 30));

        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 140, 30));

        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 140, 30));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(63, 40, 101));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("USERNAME");
        add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 120, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(63, 40, 101));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setText("NAME");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 90, 30));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(63, 40, 101));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpassword.setText("PASSWORD");
        add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 110, 30));

        btnsave.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnsave.setForeground(new java.awt.Color(63, 40, 101));
        btnsave.setText("ADD FUNDING AGENCY");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 190, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/ezgif.com-gif-maker (18).gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ipcuserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.previous(ipcuserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectRow = tblfundagency.getSelectedRow();

        if (selectRow >= 0) {
            String name = (String) tblfundagency.getValueAt(selectRow, 0);
            String username = (String) tblfundagency.getValueAt(selectRow, 1);
            String password = (String) tblfundagency.getValueAt(selectRow, 2);

            txtname.setText(name + "");
            txtusername.setText(username + "");
            txtpass.setText(password + "");
            btnsave.setEnabled(false);
        }
   else {
            JOptionPane.showMessageDialog(null, "Please select a row to view the FundAgency details");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblfundagency.getSelectedRow();
        if (selectRow >= 0) {
        String name = (String) tblfundagency.getValueAt(selectRow, 0);
        String username = (String) tblfundagency.getValueAt(selectRow, 1);
        String password = (String) tblfundagency.getValueAt(selectRow, 2);
        ipcaccount = ipcsystem.getUserAccountDirectory().authenticateUser(username, password);
        ipcsystem.getUserAccountDirectory().updateUserAccount(ipcaccount, txtname.getText(), txtusername.getText(), txtpass.getText());
        populateFundRaisingTable();

        txtname.setText("");
        txtusername.setText("");
        txtpass.setText("");
        btnsave.setEnabled(true);
        }
   else {
            JOptionPane.showMessageDialog(null, "Please select a row to update the FundAgency details");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblfundagency.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblfundagency.getValueAt(selectedRow, 1);
                String pwd = (String) tblfundagency.getValueAt(selectedRow, 2);
                UserAccount user = ipcsystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ipcsystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcsystem.getFundRaisingDirectory().deleteFundRaiser(user.getIpcuserName());
                populateFundRaisingTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the FundAgency details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (ipcsystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtusername.getText())) {
            UserAccount userAccount = ipcsystem.getUserAccountDirectory().createUserAccount(txtname.getText(), txtusername.getText(), txtpass.getText(), null, new FundRaisingRole());
            FundRaising fundRaising = ipcsystem.getFundRaisingDirectory().createUserAccount(txtusername.getText());
            populateFundRaisingTable();
            txtname.setText("");
            txtusername.setText("");
            txtpass.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    public void populateFundRaisingTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblfundagency.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcsystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("IntensivePetCare.Role.FundRaisingRole")) {
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
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblfundagency;
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