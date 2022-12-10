/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import IntensivePetCare.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author varshakuruva
 */
public class SystemAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaPanel
     */
    
    JPanel userProcessContainer;
    Ecosystem ecosystem;
    
    public SystemAdminWorkAreaPanel(JPanel userProcessContainer, Ecosystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
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
        manageHospital = new javax.swing.JPanel();
        txtHospitalNetwork = new javax.swing.JTextField();
        manageSponsors = new javax.swing.JPanel();
        txtManageSponsors = new javax.swing.JTextField();
        manageVet = new javax.swing.JPanel();
        txtManagePetVolunteer = new javax.swing.JTextField();
        manageFundRaisongAgency = new javax.swing.JPanel();
        txtFundRaisingAgency = new javax.swing.JTextField();
        manageHealthCamp = new javax.swing.JPanel();
        txtManageHealthCamp = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblManageDrivers = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 210));

        sidePane.setBackground(new java.awt.Color(63, 40, 101));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageHospital.setBackground(new java.awt.Color(187, 177, 205));
        manageHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHospitalMousePressed(evt);
            }
        });

        txtHospitalNetwork.setBackground(new java.awt.Color(187, 177, 205));
        txtHospitalNetwork.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtHospitalNetwork.setForeground(new java.awt.Color(54, 34, 86));
        txtHospitalNetwork.setText("Manage Hospital Network");
        txtHospitalNetwork.setBorder(null);
        txtHospitalNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHospitalNetworkMousePressed(evt);
            }
        });
        txtHospitalNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageHospitalLayout = new javax.swing.GroupLayout(manageHospital);
        manageHospital.setLayout(manageHospitalLayout);
        manageHospitalLayout.setHorizontalGroup(
            manageHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageHospitalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtHospitalNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageHospitalLayout.setVerticalGroup(
            manageHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHospitalNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(manageHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 40));

        manageSponsors.setBackground(new java.awt.Color(187, 177, 205));
        manageSponsors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSponsorsMousePressed(evt);
            }
        });

        txtManageSponsors.setBackground(new java.awt.Color(187, 177, 205));
        txtManageSponsors.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtManageSponsors.setForeground(new java.awt.Color(54, 34, 86));
        txtManageSponsors.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtManageSponsors.setText("Manage Sponsors");
        txtManageSponsors.setBorder(null);
        txtManageSponsors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtManageSponsorsMousePressed(evt);
            }
        });
        txtManageSponsors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManageSponsorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageSponsorsLayout = new javax.swing.GroupLayout(manageSponsors);
        manageSponsors.setLayout(manageSponsorsLayout);
        manageSponsorsLayout.setHorizontalGroup(
            manageSponsorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSponsorsLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtManageSponsors, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        manageSponsorsLayout.setVerticalGroup(
            manageSponsorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSponsorsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtManageSponsors, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(manageSponsors, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 40));

        manageVet.setBackground(new java.awt.Color(187, 177, 205));
        manageVet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageVetMousePressed(evt);
            }
        });

        txtManagePetVolunteer.setBackground(new java.awt.Color(187, 177, 205));
        txtManagePetVolunteer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtManagePetVolunteer.setForeground(new java.awt.Color(54, 34, 86));
        txtManagePetVolunteer.setText("Manage Pet Volunteer");
        txtManagePetVolunteer.setBorder(null);
        txtManagePetVolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtManagePetVolunteerMousePressed(evt);
            }
        });
        txtManagePetVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagePetVolunteerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageVetLayout = new javax.swing.GroupLayout(manageVet);
        manageVet.setLayout(manageVetLayout);
        manageVetLayout.setHorizontalGroup(
            manageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageVetLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(txtManagePetVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        manageVetLayout.setVerticalGroup(
            manageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageVetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtManagePetVolunteer, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(manageVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 40));

        manageFundRaisongAgency.setBackground(new java.awt.Color(187, 177, 205));
        manageFundRaisongAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageFundRaisongAgencyMousePressed(evt);
            }
        });

        txtFundRaisingAgency.setBackground(new java.awt.Color(187, 177, 205));
        txtFundRaisingAgency.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtFundRaisingAgency.setForeground(new java.awt.Color(54, 34, 86));
        txtFundRaisingAgency.setText("Manage Fundraising Agency");
        txtFundRaisingAgency.setBorder(null);
        txtFundRaisingAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFundRaisingAgencyMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageFundRaisongAgencyLayout = new javax.swing.GroupLayout(manageFundRaisongAgency);
        manageFundRaisongAgency.setLayout(manageFundRaisongAgencyLayout);
        manageFundRaisongAgencyLayout.setHorizontalGroup(
            manageFundRaisongAgencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageFundRaisongAgencyLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(txtFundRaisingAgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        manageFundRaisongAgencyLayout.setVerticalGroup(
            manageFundRaisongAgencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageFundRaisongAgencyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFundRaisingAgency, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePane.add(manageFundRaisongAgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 40));

        manageHealthCamp.setBackground(new java.awt.Color(187, 177, 205));
        manageHealthCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHealthCampMousePressed(evt);
            }
        });
        manageHealthCamp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtManageHealthCamp.setBackground(new java.awt.Color(187, 177, 205));
        txtManageHealthCamp.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtManageHealthCamp.setForeground(new java.awt.Color(54, 34, 86));
        txtManageHealthCamp.setText("Manage Health Camp");
        txtManageHealthCamp.setBorder(null);
        txtManageHealthCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtManageHealthCampMousePressed(evt);
            }
        });
        manageHealthCamp.add(txtManageHealthCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 169, -1));

        sidePane.add(manageHealthCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 40));

        jPanel1.setBackground(new java.awt.Color(187, 177, 205));

        lblManageDrivers.setBackground(new java.awt.Color(187, 177, 205));
        lblManageDrivers.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblManageDrivers.setForeground(new java.awt.Color(54, 34, 86));
        lblManageDrivers.setText("Manage Drivers");
        lblManageDrivers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageDriversMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblManageDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblManageDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidePane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vet.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
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

    private void txtHospitalNetworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHospitalNetworkMousePressed
        // TODO add your handling code here:
        ManageHospitalNetwork manageHospitalNetworkJPanel = new ManageHospitalNetwork(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageHospitals", manageHospitalNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtHospitalNetworkMousePressed

    private void txtHospitalNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNetworkActionPerformed

    private void manageHospitalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHospitalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageHospitalMousePressed

    private void txtManageSponsorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManageSponsorsMousePressed
        // TODO add your handling code here:
        ManageSponsor manageSponsorJPanel = new ManageSponsor(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageSponsors", manageSponsorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtManageSponsorsMousePressed

    private void txtManageSponsorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManageSponsorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManageSponsorsActionPerformed

    private void manageSponsorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSponsorsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSponsorsMousePressed

    private void txtManagePetVolunteerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManagePetVolunteerMousePressed
        // TODO add your handling code here:
        ManagePetVolunteer managePetVolunteerJPanel = new ManagePetVolunteer(userProcessContainer, ecosystem);
        userProcessContainer.add("ManagePetVolunteers", managePetVolunteerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtManagePetVolunteerMousePressed

    private void txtManagePetVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagePetVolunteerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManagePetVolunteerActionPerformed

    private void manageVetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageVetMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageVetMousePressed

    private void txtFundRaisingAgencyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFundRaisingAgencyMousePressed
        // TODO add your handling code here:
        ManageFundAgency manageFundRaisingAgencyJPanel = new ManageFundAgency(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageFundRaisingAgency", manageFundRaisingAgencyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtFundRaisingAgencyMousePressed

    private void manageFundRaisongAgencyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFundRaisongAgencyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageFundRaisongAgencyMousePressed

    private void txtManageHealthCampMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManageHealthCampMousePressed
        // TODO add your handling code here:
        ManageHealthCamp manageHealthCampJPanel = new ManageHealthCamp(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageHealthCamp", manageHealthCampJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtManageHealthCampMousePressed

    private void manageHealthCampMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHealthCampMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageHealthCampMousePressed

    private void lblManageDriversMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageDriversMousePressed
        // TODO add your handling code here:
        Managedriver manageDriverJPanel = new Managedriver(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageDrivers", manageDriverJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageDriversMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblManageDrivers;
    private javax.swing.JPanel manageFundRaisongAgency;
    private javax.swing.JPanel manageHealthCamp;
    private javax.swing.JPanel manageHospital;
    private javax.swing.JPanel manageSponsors;
    private javax.swing.JPanel manageVet;
    private javax.swing.JPanel sidePane;
    private javax.swing.JTextField txtFundRaisingAgency;
    private javax.swing.JTextField txtHospitalNetwork;
    private javax.swing.JTextField txtManageHealthCamp;
    private javax.swing.JTextField txtManagePetVolunteer;
    private javax.swing.JTextField txtManageSponsors;
    // End of variables declaration//GEN-END:variables
}
