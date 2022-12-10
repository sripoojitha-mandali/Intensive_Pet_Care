/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.ManageLabAssistant;
import UserInterface.SystemAdminWorkArea.ManagePetVolunteer;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author saran
 */
public class HospitalAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkArea
     */
    JPanel ipcuserProcessContainer;
    Ecosystem ipcsystem;
    private UserAccount ipcaccount;
    public HospitalAdminWorkArea(JPanel ipcuserProcessContainer,UserAccount ipcaccount, Ecosystem ipcsystem) {
        initComponents();
        this.ipcuserProcessContainer = ipcuserProcessContainer;
        this.ipcsystem = ipcsystem;
        this.ipcaccount = ipcaccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        ManageLabAssitant = new javax.swing.JPanel();
        lblManageLabAssistant = new javax.swing.JLabel();
        ManageHospitalInfo = new javax.swing.JPanel();
        lblmanagehospitalinfo = new javax.swing.JLabel();
        ManagePet = new javax.swing.JPanel();
        lblmanagepet = new javax.swing.JLabel();
        ManageVet = new javax.swing.JPanel();
        lblManageVet = new javax.swing.JLabel();
        ManageSponsor = new javax.swing.JPanel();
        lblAddSponsor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidepane.setBackground(new java.awt.Color(63, 40, 101));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageLabAssitant.setBackground(new java.awt.Color(187, 177, 205));

        lblManageLabAssistant.setBackground(new java.awt.Color(187, 177, 205));
        lblManageLabAssistant.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblManageLabAssistant.setForeground(new java.awt.Color(54, 34, 86));
        lblManageLabAssistant.setText("Manage LabAssistant");
        lblManageLabAssistant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageLabAssistantMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageLabAssitantLayout = new javax.swing.GroupLayout(ManageLabAssitant);
        ManageLabAssitant.setLayout(ManageLabAssitantLayout);
        ManageLabAssitantLayout.setHorizontalGroup(
            ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageLabAssitantLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblManageLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        ManageLabAssitantLayout.setVerticalGroup(
            ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageLabAssitantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageLabAssistant, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManageLabAssitant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 50));

        ManageHospitalInfo.setBackground(new java.awt.Color(187, 177, 205));

        lblmanagehospitalinfo.setBackground(new java.awt.Color(187, 177, 205));
        lblmanagehospitalinfo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblmanagehospitalinfo.setForeground(new java.awt.Color(54, 34, 86));
        lblmanagehospitalinfo.setText("Manage Hospital Info");
        lblmanagehospitalinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanagehospitalinfoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageHospitalInfoLayout = new javax.swing.GroupLayout(ManageHospitalInfo);
        ManageHospitalInfo.setLayout(ManageHospitalInfoLayout);
        ManageHospitalInfoLayout.setHorizontalGroup(
            ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblmanagehospitalinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        ManageHospitalInfoLayout.setVerticalGroup(
            ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanagehospitalinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManageHospitalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 50));

        ManagePet.setBackground(new java.awt.Color(187, 177, 205));

        lblmanagepet.setBackground(new java.awt.Color(187, 177, 205));
        lblmanagepet.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblmanagepet.setForeground(new java.awt.Color(54, 34, 86));
        lblmanagepet.setText("Manage Pet Info");
        lblmanagepet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanagepetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManagePetLayout = new javax.swing.GroupLayout(ManagePet);
        ManagePet.setLayout(ManagePetLayout);
        ManagePetLayout.setHorizontalGroup(
            ManagePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagePetLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lblmanagepet, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        ManagePetLayout.setVerticalGroup(
            ManagePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanagepet, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManagePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 50));

        ManageVet.setBackground(new java.awt.Color(187, 177, 205));
        ManageVet.setForeground(new java.awt.Color(0, 153, 153));

        lblManageVet.setBackground(new java.awt.Color(187, 177, 205));
        lblManageVet.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblManageVet.setForeground(new java.awt.Color(54, 34, 86));
        lblManageVet.setText("Manage Vet");
        lblManageVet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageVetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageVetLayout = new javax.swing.GroupLayout(ManageVet);
        ManageVet.setLayout(ManageVetLayout);
        ManageVetLayout.setHorizontalGroup(
            ManageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageVetLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(lblManageVet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        ManageVetLayout.setVerticalGroup(
            ManageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageVetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageVet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        sidepane.add(ManageVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 50));

        ManageSponsor.setBackground(new java.awt.Color(187, 177, 205));

        lblAddSponsor.setBackground(new java.awt.Color(187, 177, 205));
        lblAddSponsor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblAddSponsor.setForeground(new java.awt.Color(54, 34, 86));
        lblAddSponsor.setText("Manage Sponsor");
        lblAddSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddSponsorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageSponsorLayout = new javax.swing.GroupLayout(ManageSponsor);
        ManageSponsor.setLayout(ManageSponsorLayout);
        ManageSponsorLayout.setHorizontalGroup(
            ManageSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSponsorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblAddSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        ManageSponsorLayout.setVerticalGroup(
            ManageSponsorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSponsorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAddSponsor)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        sidepane.add(ManageSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You are logged in as a hospital..");
        sidepane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schronisko_01.gif"))); // NOI18N

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageLabAssistantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageLabAssistantMousePressed
        // TODO add your handling code here:
        ManageLabAssistant manageLabAssistantJPanel = new ManageLabAssistant(ipcuserProcessContainer,ipcaccount, ipcsystem);
        ipcuserProcessContainer.add("ManageLabAssistant", manageLabAssistantJPanel);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.next(ipcuserProcessContainer);
    }//GEN-LAST:event_lblManageLabAssistantMousePressed

    private void lblmanagehospitalinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanagehospitalinfoMousePressed
        // TODO add your handling code here:
        ManageHospitalInfo manageHospitalInfoJPanel = new ManageHospitalInfo(ipcuserProcessContainer,ipcaccount, ipcsystem);
        ipcuserProcessContainer.add("ManageHospitalInfo", manageHospitalInfoJPanel);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.next(ipcuserProcessContainer);
    }//GEN-LAST:event_lblmanagehospitalinfoMousePressed

    private void lblmanagepetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanagepetMousePressed
        // TODO add your handling code here:

        ManagePetInfo managePetInfoJPanel = new ManagePetInfo(ipcuserProcessContainer,ipcaccount, ipcsystem);
        ipcuserProcessContainer.add("ManagePetInfo", managePetInfoJPanel);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.next(ipcuserProcessContainer);
    }//GEN-LAST:event_lblmanagepetMousePressed

    private void lblManageVetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageVetMousePressed
        // TODO add your handling code here:
        ManageVet manageVetJPanel = new ManageVet(ipcuserProcessContainer, ipcaccount, ipcsystem);
        ipcuserProcessContainer.add("ManageVet", manageVetJPanel);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.next(ipcuserProcessContainer);
    }//GEN-LAST:event_lblManageVetMousePressed

    private void lblAddSponsorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSponsorMousePressed
        // TODO add your handling code here:
        ManageSponsor manageSponsorJPanel = new ManageSponsor(ipcuserProcessContainer,ipcaccount, ipcsystem);
        ipcuserProcessContainer.add("ManageSponsorInfo", manageSponsorJPanel);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();

        layout.next(ipcuserProcessContainer);

    }//GEN-LAST:event_lblAddSponsorMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageHospitalInfo;
    private javax.swing.JPanel ManageLabAssitant;
    private javax.swing.JPanel ManagePet;
    private javax.swing.JPanel ManageSponsor;
    private javax.swing.JPanel ManageVet;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddSponsor;
    private javax.swing.JLabel lblManageLabAssistant;
    private javax.swing.JLabel lblManageVet;
    private javax.swing.JLabel lblmanagehospitalinfo;
    private javax.swing.JLabel lblmanagepet;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
