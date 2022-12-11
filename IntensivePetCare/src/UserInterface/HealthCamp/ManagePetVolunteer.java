/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCamp;
import Model.Hospital.Hospital;
import Model.Driver.Driver;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import Model.HealthCamp.HealthCamp;
import Model.Ecosystem;
import Model.PetVolunteer.PetVolunteer;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author poojitha
 */
public class ManagePetVolunteer extends javax.swing.JPanel {

    /**
     * Creates new form ManagePetVolunteer
     */
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    UserAccount ipcAccount;

    public ManagePetVolunteer(JPanel ipcUserProcessContainer, UserAccount ipcAccount, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        this.ipcAccount = ipcAccount;

        ipcPopulatePetVolunteerTable();
        ipcPopulateHospitalTable();
        ipcPopulateDriverTable();
    }
    
    private void ipcPopulateHospitalTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tbHN.getModel();
        tablemodel.setRowCount(0);

        for (Hospital hospital : ipcSystem.getHospitalDirectory().getHospitalDirectory()) {
            Object[] row = new Object[1];
            row[0] = hospital;
            tablemodel.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPetHC = new javax.swing.JTable();
        lbpetOwn = new javax.swing.JLabel();
        txtPetOwn = new javax.swing.JTextField();
        lbPetType = new javax.swing.JLabel();
        txtPetType = new javax.swing.JTextField();
        lbOrgName = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jcbHStatus = new javax.swing.JComboBox<>();
        lblhealthstatus = new javax.swing.JLabel();
        btnSignUpforH = new javax.swing.JButton();
        lbHosName = new javax.swing.JLabel();
        txtHosName = new javax.swing.JTextField();
        lbDriver = new javax.swing.JLabel();
        txtDriver = new javax.swing.JTextField();
        btnView1 = new javax.swing.JButton();
        lbPetUser = new javax.swing.JLabel();
        txtPetUser = new javax.swing.JTextField();
        lbtitle2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHN = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDN = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPetHC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pet Owner", "Pet Type", "Pet username", "Org name"
            }
        ));
        jScrollPane1.setViewportView(tbPetHC);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 570, 113));

        lbpetOwn.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbpetOwn.setForeground(new java.awt.Color(204, 0, 51));
        lbpetOwn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbpetOwn.setText("PET OWNER");
        jPanel1.add(lbpetOwn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 120, 20));

        txtPetOwn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtPetOwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPetOwnActionPerformed(evt);
            }
        });
        jPanel1.add(txtPetOwn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 130, 20));

        lbPetType.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbPetType.setForeground(new java.awt.Color(204, 0, 51));
        lbPetType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPetType.setText("PET TYPE");
        jPanel1.add(lbPetType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, 20));

        txtPetType.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtPetType, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, 20));

        lbOrgName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbOrgName.setForeground(new java.awt.Color(204, 0, 0));
        lbOrgName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbOrgName.setText("ORGANISATION NAME");
        jPanel1.add(lbOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 20));

        txtOrgName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 130, 20));

        jcbHStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jcbHStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Bad" }));
        jcbHStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcbHStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbHStatusItemStateChanged(evt);
            }
        });
        jcbHStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcbHStatusMousePressed(evt);
            }
        });
        jPanel1.add(jcbHStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 140, 20));

        lblhealthstatus.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhealthstatus.setForeground(new java.awt.Color(204, 0, 51));
        lblhealthstatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblhealthstatus.setText("HEALTH STATUS");
        jPanel1.add(lblhealthstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 150, 20));

        btnSignUpforH.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSignUpforH.setForeground(new java.awt.Color(204, 0, 51));
        btnSignUpforH.setText("SIGN UP FOR HOSPITAL");
        btnSignUpforH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUpforH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpforHActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUpforH, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, 30));

        lbHosName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbHosName.setForeground(new java.awt.Color(204, 0, 51));
        lbHosName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHosName.setText("HOSPITAL NAME");
        jPanel1.add(lbHosName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 150, 20));

        txtHosName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtHosName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 140, 20));

        lbDriver.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbDriver.setForeground(new java.awt.Color(204, 0, 51));
        lbDriver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver.setText("DRIVER");
        jPanel1.add(lbDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 130, 20));

        txtDriver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverActionPerformed(evt);
            }
        });
        jPanel1.add(txtDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 150, 20));

        btnView1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnView1.setForeground(new java.awt.Color(204, 0, 51));
        btnView1.setText("VIEW");
        btnView1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 90, 30));

        lbPetUser.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbPetUser.setForeground(new java.awt.Color(204, 0, 0));
        lbPetUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPetUser.setText("PET USERNAME");
        jPanel1.add(lbPetUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, 20));

        txtPetUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtPetUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, 20));

        lbtitle2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbtitle2.setForeground(new java.awt.Color(153, 0, 0));
        lbtitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtitle2.setText("MANAGE PET VOLUNTEER");
        jPanel1.add(lbtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 430, 50));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 40, 40));

        tbHN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital Name"
            }
        ));
        jScrollPane2.setViewportView(tbHN);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 160, 110));

        tbDN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Driver name"
            }
        ));
        jScrollPane3.setViewportView(tbDN);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 150, 110));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -40, 930, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbHStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbHStatusItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHStatusItemStateChanged

    private void jcbHStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbHStatusMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHStatusMousePressed

    private void btnSignUpforHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpforHActionPerformed
        // TODO add your handling code here:
        if(ipcValidateInputFields()){

            for (PetVolunteer petVolunteer : ipcSystem.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
                if (petVolunteer.getIpcuserName().equals(txtPetUser.getText())) {
                    ipcSystem.getPetVolunteerDirectory().updatePetVolunteerHospitalInfo(petVolunteer, txtHosName.getText(), txtDriver.getText());
                }
            }

            for (Driver driver : ipcSystem.getDriverDirectory().getDriverDirectory()) {
                if (driver.getIpcuserName().equals(txtDriver.getText())) {
                    ipcSystem.getDriverDirectory().updateDriverHealthCampInfo(driver, txtPetUser.getText(), txtPetType.getText(), txtOrgName.getText(), txtHosName.getText());
                }
            }

            JOptionPane.showMessageDialog(this, "The Pet has been signed up successfully for the hospital ");
        }
    }//GEN-LAST:event_btnSignUpforHActionPerformed

    private void txtDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDriverActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbPetHC.getSelectedRow();
        if (selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please Select a row to view");
            return;
        }
        PetVolunteer petVolunterSelected = (PetVolunteer) tbPetHC.getValueAt(selectedRow, 0);
        txtPetType.setText(petVolunterSelected.getIpcpetType());
        txtPetUser.setText(petVolunterSelected.getIpcuserName());
        txtPetOwn.setText(petVolunterSelected.getIpcName());
        txtOrgName.setText(petVolunterSelected.getIpchealthCamp());
        
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
   
       private void ipcPopulateDriverTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tbDN.getModel();
        tablemodel.setRowCount(0);

        for (Driver driver : ipcSystem.getDriverDirectory().getDriverDirectory()) {
            Object[] row = new Object[1];
            row[0] = driver;
            tablemodel.addRow(row);
        }
    }

    private void txtPetOwnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPetOwnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPetOwnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignUpforH;
    private javax.swing.JButton btnView1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcbHStatus;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHosName;
    private javax.swing.JLabel lbOrgName;
    private javax.swing.JLabel lbPetType;
    private javax.swing.JLabel lbPetUser;
    private javax.swing.JLabel lblhealthstatus;
    private javax.swing.JLabel lbpetOwn;
    private javax.swing.JLabel lbtitle2;
    private javax.swing.JTable tbDN;
    private javax.swing.JTable tbHN;
    private javax.swing.JTable tbPetHC;
    private javax.swing.JTextField txtDriver;
    private javax.swing.JTextField txtHosName;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextField txtPetOwn;
    private javax.swing.JTextField txtPetType;
    private javax.swing.JTextField txtPetUser;
    // End of variables declaration//GEN-END:variables

public void ipcPopulatePetVolunteerTable() {
        String healthCampName = null;
        
        for (HealthCamp healthCamp : ipcSystem.getHealthCampDirectory().getHealthCampDirectory()) {
            if (healthCamp.getIpcuserName().equals(ipcAccount.getIpcuserName())) {
                healthCampName = healthCamp.getIpchealthCampName();
            }
        }
        DefaultTableModel tablemodel = (DefaultTableModel) tbPetHC.getModel();
        tablemodel.setRowCount(0);

        for (PetVolunteer petVolunteer : ipcSystem.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getIpchealthCamp().equals(healthCampName)) {
                Object[] row = new Object[4];
                row[1] = petVolunteer.getIpcpetType();
                row[3] = petVolunteer.getIpchealthCamp();
                row[0] = petVolunteer;
                row[2] = petVolunteer.getIpcuserName();
                

                tablemodel.addRow(row);
            }
        }
    }

 
    private boolean ipcValidateInputFields() {
        
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]{3,14}+$");
        Matcher m7 = p7.matcher(txtDriver.getText());
        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtHosName.getText());
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide the correct format for hospital !!!");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Please provide the correct format for driver !!!");
            return false;
        }     
        else {
            return true;
        }
    }
}       

