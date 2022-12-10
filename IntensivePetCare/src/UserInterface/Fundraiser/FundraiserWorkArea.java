/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Fundraiser;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.FundRaising.FundRaising;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import IntensivePetCare.Sponsor.Sponsor;
import IntensivePetCare.UserAccount.UserAccount;
/**
 *
 * @author poojitha
 */
public class FundraiserWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FundraiserWorkArea
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    public FundraiserWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateFundRaisingTable();
    }

    
    public void populateFundRaisingTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblfundraiser.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
            
        }
        for(FundRaising fundRaising: system.getFundRaisingDirectory().getFundRaisingDirectory()){
             Object[] row = new Object[5];
                row[0] = fundRaising;
                row[1] = fundRaising.getIpcpetOwner();
                row[2] = fundRaising.getIpcpetType();
                row[3] = fundRaising.getIpchealthCamp();
                row[4] = fundRaising.getIpcsponsorStatus() == null ? "N/A" : fundRaising.getIpcsponsorStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblfundraiser = new javax.swing.JTable();
        btnAddSponsor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblManageInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 209, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblfundraiser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fundraiser Name", "Pet Owner", "Pet Type", "Health Camp", "Sponsor Status"
            }
        ));
        jScrollPane1.setViewportView(tblfundraiser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 560, 90));

        btnAddSponsor.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAddSponsor.setForeground(new java.awt.Color(63, 40, 101));
        btnAddSponsor.setText("ADD SPONSOR");
        btnAddSponsor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSponsorActionPerformed(evt);
            }
        });
        add(btnAddSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 130, 30));

        jPanel1.setBackground(new java.awt.Color(63, 40, 101));

        lblManageInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo.setText("FUNDRAISER WORK AREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(lblManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 40, 101));
        jLabel2.setText("You are logged in as a fundraiser..");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSponsorActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblfundraiser.getSelectedRow();
        FundRaising fundRaiserSelected = (FundRaising) tblfundraiser.getValueAt(selectedRow, 0);
        for(Sponsor sponsor: system.getSponsorDirectory().getSponsorDirectory()) {
            system.getSponsorDirectory().updateSponsorPetOwnerInfo(sponsor, fundRaiserSelected.getIpcpetOwner(), fundRaiserSelected.getIpcpetType(), fundRaiserSelected.getIpchealthCamp(), fundRaiserSelected.getIpchospitalName());
            System.out.println("Sponsor has been added successfully");
        }
        JOptionPane.showMessageDialog(this, "Request has been sent to the sponsor");
    }//GEN-LAST:event_btnAddSponsorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSponsor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInfo;
    private javax.swing.JTable tblfundraiser;
    // End of variables declaration//GEN-END:variables
}
