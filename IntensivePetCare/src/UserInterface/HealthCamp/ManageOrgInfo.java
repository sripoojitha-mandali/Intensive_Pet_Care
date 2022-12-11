/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCamp;
import Model.Ecosystem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Model.HealthCamp.HealthCamp;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import Model.Hospital.Hospital;

/**
 *
 * @author poojitha
 */
public class ManageOrgInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrgInfo
     */
    private UserAccount ipcAccount;
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    

    public ManageOrgInfo(JPanel ipcUserProcessContainer, UserAccount ipcAccount, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        this.ipcAccount = ipcAccount;
        populateTextFields();
    }

    private void populateTextFields() {
        for (HealthCamp healthCamp : ipcSystem.getHealthCampDirectory().getHealthCampDirectory()) {
                System.out.println("account username : " + ipcAccount.getIpcuserName());
            if (healthCamp.getIpcuserName().equals(ipcAccount.getIpcuserName())) {
                //txtorgname.setText(healthCamp.getUsername());
                //System.out.println("Hospital name : " + hospital.getName());
                txtOName.setText(healthCamp.getIpcname());
                txtLocation.setText(healthCamp.getIpcAddress());
                txtPhoneNo.setText(healthCamp.getIpcNumber());
                txtON.setText(healthCamp.getIpchealthCampName());
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
        lbOName = new javax.swing.JLabel();
        txtOName = new javax.swing.JTextField();
        lbON = new javax.swing.JLabel();
        txtON = new javax.swing.JTextField();
        lbLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lbPhoneno = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lbTitle1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbHCM = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbOName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbOName.setForeground(new java.awt.Color(153, 0, 0));
        lbOName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbOName.setText("NAME");
        jPanel1.add(lbOName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 31));

        txtOName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtOName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 190, 30));

        lbON.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbON.setForeground(new java.awt.Color(153, 0, 51));
        lbON.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbON.setText("OWNER NAME");
        jPanel1.add(lbON, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, 24));

        txtON.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtON, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 190, 30));

        lbLocation.setBackground(new java.awt.Color(255, 255, 255));
        lbLocation.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbLocation.setForeground(new java.awt.Color(153, 0, 0));
        lbLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLocation.setText("LOCATION");
        jPanel1.add(lbLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 30));

        txtLocation.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 190, 30));

        lbPhoneno.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbPhoneno.setForeground(new java.awt.Color(153, 0, 0));
        lbPhoneno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPhoneno.setText("PHONE NUMBER");
        jPanel1.add(lbPhoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 120, 22));

        txtPhoneNo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 190, 30));

        lbTitle1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbTitle1.setForeground(new java.awt.Color(153, 0, 51));
        lbTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTitle1.setText("ORGANISATION INFORMATION ");
        jPanel1.add(lbTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 50));

        btnSave.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(204, 0, 51));
        btnSave.setText("SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 120, 40));

        btnUpdate1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(204, 0, 0));
        btnUpdate1.setText("UPDATE");
        btnUpdate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 120, 40));

        btnPrevious.setBorder(null);
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHCM.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbHCM.setForeground(new java.awt.Color(255, 255, 255));
        lbHCM.setText("HEALTH CAMP MANAGEMENT");
        jPanel2.add(lbHCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 420, 60));

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(ipcValidateInputFields()){
            for (HealthCamp healthCamp : ipcSystem.getHealthCampDirectory().getHealthCampDirectory()) {
                System.out.println("account username : " + ipcAccount.getIpcuserName());
                System.out.println("health camp username : " + healthCamp.getIpcuserName());
                if (healthCamp.getIpcuserName().equals(ipcAccount.getIpcuserName())) {

                    ipcSystem.getHealthCampDirectory().updateHealthCampInfo(healthCamp, txtON.getText(), txtLocation.getText(), txtPhoneNo.getText(), txtOName.getText());

                }
            }

            btnUpdate1.setEnabled(true);
            txtON.setEnabled(false);
            txtPhoneNo.setEnabled(false);
            txtOName.setEnabled(false);
            txtLocation.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Organization details have been saved" );
          
        }
    }//GEN-LAST:event_btnSaveActionPerformed
private boolean ipcValidateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtON.getText());
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txtLocation.getText());
        Pattern p2 = Pattern.compile("^[0-9]{10,10}+$");
        Matcher m2 = p2.matcher(txtPhoneNo.getText());
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txtOName.getText());
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide correct input!!");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide correct organization name!!");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, " Please provide correct format for address!!");
            return false;
        }
         else if (!m2.matches()) {

        JOptionPane.showMessageDialog(this, "Please provide correct format for phone number!!");
            return false; 
         }
        else {
            return true;
        }
    }
    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        txtOName.setEnabled(true);
        txtON.setEnabled(true);
        txtLocation.setEnabled(true);
        txtPhoneNo.setEnabled(true);
        btnUpdate1.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Hospital Organization details have been updated" );
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btnPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbHCM;
    private javax.swing.JLabel lbLocation;
    private javax.swing.JLabel lbON;
    private javax.swing.JLabel lbOName;
    private javax.swing.JLabel lbPhoneno;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtON;
    private javax.swing.JTextField txtOName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables


}

