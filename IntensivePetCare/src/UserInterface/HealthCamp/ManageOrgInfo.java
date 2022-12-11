/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCamp;
import Model.Ecosystem;
import Model.HealthCamp.HealthCamp;
import Model.Hospital.Hospital;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author poojitha
 */
public class ManageOrgInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrgInfo
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;

    public ManageOrgInfo(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateTextFields();
    }

    private void populateTextFields() {
        for (HealthCamp healthCamp : system.getHealthCampDirectory().getHealthCampDirectory()) {
                System.out.println("account username : " + account.getIpcuserName());
            if (healthCamp.getIpcuserName().equals(account.getIpcuserName())) {
                //txtorgname.setText(healthCamp.getUsername());
                //System.out.println("Hospital name : " + hospital.getName());
                txtorgname.setText(healthCamp.getIpcname());
                txtorgadd.setText(healthCamp.getIpcAddress());
                txtphonenumber.setText(healthCamp.getIpcNumber());
                txtorgowner.setText(healthCamp.getIpchealthCampName());
                break;
            }
        }
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
        lblorgname = new javax.swing.JLabel();
        txtorgname = new javax.swing.JTextField();
        lblorgowner = new javax.swing.JLabel();
        txtorgowner = new javax.swing.JTextField();
        lblorgadd = new javax.swing.JLabel();
        txtorgadd = new javax.swing.JTextField();
        lblphonenumber = new javax.swing.JLabel();
        txtphonenumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblorgname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblorgname.setForeground(new java.awt.Color(153, 0, 0));
        lblorgname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblorgname.setText("NAME");
        jPanel1.add(lblorgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 31));

        txtorgname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtorgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 190, 30));

        lblorgowner.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblorgowner.setForeground(new java.awt.Color(153, 0, 51));
        lblorgowner.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblorgowner.setText("OWNER NAME");
        jPanel1.add(lblorgowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, 24));

        txtorgowner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtorgowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 190, 30));

        lblorgadd.setBackground(new java.awt.Color(255, 255, 255));
        lblorgadd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblorgadd.setForeground(new java.awt.Color(153, 0, 0));
        lblorgadd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblorgadd.setText("LOCATION");
        jPanel1.add(lblorgadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 30));

        txtorgadd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtorgadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 190, 30));

        lblphonenumber.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblphonenumber.setForeground(new java.awt.Color(153, 0, 0));
        lblphonenumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblphonenumber.setText("PHONE NUMBER");
        jPanel1.add(lblphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 120, 22));

        txtphonenumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 190, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ORGANISATION INFORMATION ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 50));

        btnsave.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnsave.setForeground(new java.awt.Color(204, 0, 51));
        btnsave.setText("SAVE");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 120, 40));

        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(204, 0, 0));
        btnupdate.setText("UPDATE");
        btnupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 120, 40));

        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HEALTH CAMP MANAGEMENT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 420, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if(validateInputFields()){
            for (HealthCamp healthCamp : system.getHealthCampDirectory().getHealthCampDirectory()) {
                System.out.println("account username : " + account.getIpcuserName());
                System.out.println("health camp username : " + healthCamp.getIpcuserName());
                if (healthCamp.getIpcuserName().equals(account.getIpcuserName())) {

                    system.getHealthCampDirectory().updateHealthCampInfo(healthCamp, txtorgowner.getText(), txtorgadd.getText(), txtphonenumber.getText(), txtorgname.getText());

                }
            }

            btnupdate.setEnabled(true);
            txtorgname.setEnabled(false);
            txtorgowner.setEnabled(false);
            txtorgadd.setEnabled(false);
            txtphonenumber.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Organization details saved" );
          
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        txtorgname.setEnabled(true);
        txtorgowner.setEnabled(true);
        txtorgadd.setEnabled(true);
        txtphonenumber.setEnabled(true);
        btnupdate.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Organization details updated" );
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblorgadd;
    private javax.swing.JLabel lblorgname;
    private javax.swing.JLabel lblorgowner;
    private javax.swing.JLabel lblphonenumber;
    private javax.swing.JTextField txtorgadd;
    private javax.swing.JTextField txtorgname;
    private javax.swing.JTextField txtorgowner;
    private javax.swing.JTextField txtphonenumber;
    // End of variables declaration//GEN-END:variables

private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtorgowner.getText());
        Pattern p2 = Pattern.compile("^[0-9]{10,10}+$");
        Matcher m2 = p2.matcher(txtphonenumber.getText());
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txtorgname.getText());
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txtorgadd.getText());
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided input format for owner,Please Try agian!");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided input format for organization name ,Please Try agian!");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided input format for address ,Please Try agian!");
            return false;
        }
         else if (!m2.matches()) {

        JOptionPane.showMessageDialog(this, "Error in provided input format for phonenumber ,Please Try agian!");
            return false; 
         }
        else {
            return true;
        }
    }
}

