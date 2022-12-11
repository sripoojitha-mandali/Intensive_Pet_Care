/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import Model.Ecosystem;
import javax.swing.JPanel;
import java.awt.CardLayout;
/**
 *
 * @author varshakuruva
 */
public class SystemAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaPanel
     */
    
    JPanel ipcUserProcessContainer;
    Ecosystem ecosystem;
    
    public SystemAdminWorkAreaPanel(JPanel ipcUserProcessContainer, Ecosystem ecosystem) {
        initComponents();
        
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePane = new javax.swing.JPanel();
        hospitalManage = new javax.swing.JPanel();
        txtHNet = new javax.swing.JTextField();
        sponsorManage = new javax.swing.JPanel();
        txtManageSponsor = new javax.swing.JTextField();
        vetManage = new javax.swing.JPanel();
        txtManagePetV = new javax.swing.JTextField();
        fundAgencyManage = new javax.swing.JPanel();
        txtFundAgency = new javax.swing.JTextField();
        healthCampManage = new javax.swing.JPanel();
        txtManageHCamp = new javax.swing.JTextField();
        driverManage = new javax.swing.JPanel();
        lbManageDriver = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 210));

        sidePane.setBackground(new java.awt.Color(102, 0, 0));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalManage.setBackground(new java.awt.Color(255, 204, 204));
        hospitalManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hospitalManageMousePressed(evt);
            }
        });

        txtHNet.setBackground(new java.awt.Color(255, 204, 204));
        txtHNet.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtHNet.setForeground(new java.awt.Color(153, 0, 0));
        txtHNet.setText("Manage Hospital Network");
        txtHNet.setBorder(null);
        txtHNet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHNetMousePressed(evt);
            }
        });
        txtHNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHNetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hospitalManageLayout = new javax.swing.GroupLayout(hospitalManage);
        hospitalManage.setLayout(hospitalManageLayout);
        hospitalManageLayout.setHorizontalGroup(
            hospitalManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalManageLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtHNet, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        hospitalManageLayout.setVerticalGroup(
            hospitalManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hospitalManageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHNet, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(hospitalManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 40));

        sponsorManage.setBackground(new java.awt.Color(255, 204, 204));
        sponsorManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sponsorManageMousePressed(evt);
            }
        });

        txtManageSponsor.setBackground(new java.awt.Color(255, 204, 204));
        txtManageSponsor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtManageSponsor.setForeground(new java.awt.Color(153, 0, 0));
        txtManageSponsor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtManageSponsor.setText("Manage Sponsors");
        txtManageSponsor.setBorder(null);
        txtManageSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtManageSponsorMousePressed(evt);
            }
        });
        txtManageSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManageSponsorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sponsorManageLayout = new javax.swing.GroupLayout(sponsorManage);
        sponsorManage.setLayout(sponsorManageLayout);
        sponsorManageLayout.setHorizontalGroup(
            sponsorManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sponsorManageLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtManageSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        sponsorManageLayout.setVerticalGroup(
            sponsorManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sponsorManageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtManageSponsor, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(sponsorManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 40));

        vetManage.setBackground(new java.awt.Color(255, 204, 204));
        vetManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vetManageMousePressed(evt);
            }
        });

        txtManagePetV.setBackground(new java.awt.Color(255, 204, 204));
        txtManagePetV.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtManagePetV.setForeground(new java.awt.Color(153, 0, 0));
        txtManagePetV.setText("Manage Pet Volunteer");
        txtManagePetV.setBorder(null);
        txtManagePetV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtManagePetVMousePressed(evt);
            }
        });
        txtManagePetV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagePetVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vetManageLayout = new javax.swing.GroupLayout(vetManage);
        vetManage.setLayout(vetManageLayout);
        vetManageLayout.setHorizontalGroup(
            vetManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vetManageLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(txtManagePetV, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        vetManageLayout.setVerticalGroup(
            vetManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vetManageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtManagePetV, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(vetManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 40));

        fundAgencyManage.setBackground(new java.awt.Color(255, 204, 204));
        fundAgencyManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fundAgencyManageMousePressed(evt);
            }
        });

        txtFundAgency.setBackground(new java.awt.Color(255, 204, 204));
        txtFundAgency.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtFundAgency.setForeground(new java.awt.Color(153, 0, 0));
        txtFundAgency.setText("Manage Fundraising Agency");
        txtFundAgency.setBorder(null);
        txtFundAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFundAgencyMousePressed(evt);
            }
        });

        javax.swing.GroupLayout fundAgencyManageLayout = new javax.swing.GroupLayout(fundAgencyManage);
        fundAgencyManage.setLayout(fundAgencyManageLayout);
        fundAgencyManageLayout.setHorizontalGroup(
            fundAgencyManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundAgencyManageLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(txtFundAgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        fundAgencyManageLayout.setVerticalGroup(
            fundAgencyManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundAgencyManageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFundAgency, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(fundAgencyManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 40));

        healthCampManage.setBackground(new java.awt.Color(255, 204, 204));
        healthCampManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                healthCampManageMousePressed(evt);
            }
        });
        healthCampManage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtManageHCamp.setBackground(new java.awt.Color(255, 204, 204));
        txtManageHCamp.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtManageHCamp.setForeground(new java.awt.Color(153, 0, 0));
        txtManageHCamp.setText("Manage Health Camp");
        txtManageHCamp.setBorder(null);
        txtManageHCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtManageHCampMousePressed(evt);
            }
        });
        healthCampManage.add(txtManageHCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 169, -1));

        sidePane.add(healthCampManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 40));

        driverManage.setBackground(new java.awt.Color(255, 204, 204));

        lbManageDriver.setBackground(new java.awt.Color(187, 177, 205));
        lbManageDriver.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbManageDriver.setForeground(new java.awt.Color(153, 0, 0));
        lbManageDriver.setText("Manage Drivers");
        lbManageDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbManageDriverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout driverManageLayout = new javax.swing.GroupLayout(driverManage);
        driverManage.setLayout(driverManageLayout);
        driverManageLayout.setHorizontalGroup(
            driverManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverManageLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lbManageDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        driverManageLayout.setVerticalGroup(
            driverManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverManageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbManageDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidePane.add(driverManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/ha2.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHNetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHNetMousePressed
        // TODO add your handling code here:
        ManageHospitalNetwork manageHospitalNetworkJPanel = new ManageHospitalNetwork(ipcUserProcessContainer, ecosystem);
        ipcUserProcessContainer.add("ManageHospitals", manageHospitalNetworkJPanel);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.next(ipcUserProcessContainer);
    }//GEN-LAST:event_txtHNetMousePressed

    private void txtHNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHNetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHNetActionPerformed

    private void hospitalManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitalManageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalManageMousePressed

    private void txtManageSponsorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManageSponsorMousePressed
        // TODO add your handling code here:
        ManageSponsor manageSponsorJPanel = new ManageSponsor(ipcUserProcessContainer, ecosystem);
        ipcUserProcessContainer.add("ManageSponsors", manageSponsorJPanel);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.next(ipcUserProcessContainer);
    }//GEN-LAST:event_txtManageSponsorMousePressed

    private void txtManageSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManageSponsorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManageSponsorActionPerformed

    private void sponsorManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sponsorManageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sponsorManageMousePressed

    private void txtManagePetVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManagePetVMousePressed
        // TODO add your handling code here:
        ManagePetVolunteer managePetVolunteerJPanel = new ManagePetVolunteer(ipcUserProcessContainer, ecosystem);
        ipcUserProcessContainer.add("ManagePetVolunteers", managePetVolunteerJPanel);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.next(ipcUserProcessContainer);
    }//GEN-LAST:event_txtManagePetVMousePressed

    private void txtManagePetVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagePetVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManagePetVActionPerformed

    private void vetManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vetManageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_vetManageMousePressed

    private void txtFundAgencyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFundAgencyMousePressed
        // TODO add your handling code here:
        ManageFundAgency manageFundRaisingAgencyJPanel = new ManageFundAgency(ipcUserProcessContainer, ecosystem);
        ipcUserProcessContainer.add("ManageFundRaisingAgency", manageFundRaisingAgencyJPanel);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.next(ipcUserProcessContainer);
    }//GEN-LAST:event_txtFundAgencyMousePressed

    private void fundAgencyManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundAgencyManageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundAgencyManageMousePressed

    private void txtManageHCampMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManageHCampMousePressed
        // TODO add your handling code here:
        ManageHealthCamp manageHealthCampJPanel = new ManageHealthCamp(ipcUserProcessContainer, ecosystem);
        ipcUserProcessContainer.add("ManageHealthCamp", manageHealthCampJPanel);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.next(ipcUserProcessContainer);
    }//GEN-LAST:event_txtManageHCampMousePressed

    private void healthCampManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healthCampManageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthCampManageMousePressed

    private void lbManageDriverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbManageDriverMousePressed
        // TODO add your handling code here:
        Managedriver manageDriverJPanel = new Managedriver(ipcUserProcessContainer, ecosystem);
        ipcUserProcessContainer.add("ManageDrivers", manageDriverJPanel);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.next(ipcUserProcessContainer);
    }//GEN-LAST:event_lbManageDriverMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel driverManage;
    private javax.swing.JPanel fundAgencyManage;
    private javax.swing.JPanel healthCampManage;
    private javax.swing.JPanel hospitalManage;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbManageDriver;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel sponsorManage;
    private javax.swing.JTextField txtFundAgency;
    private javax.swing.JTextField txtHNet;
    private javax.swing.JTextField txtManageHCamp;
    private javax.swing.JTextField txtManagePetV;
    private javax.swing.JTextField txtManageSponsor;
    private javax.swing.JPanel vetManage;
    // End of variables declaration//GEN-END:variables
}
