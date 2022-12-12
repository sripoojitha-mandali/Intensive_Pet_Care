/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Fundraiser;
import Model.FundRaising.FundRaising;
import javax.swing.table.DefaultTableModel;
import Model.Sponsor.Sponsor;
import javax.swing.JOptionPane;
import Model.UserAccount.UserAccount;
import Model.Ecosystem;
import javax.swing.JPanel;
import Model.FundRaising.FundRaising;
/**
 *
 * @author poojitha
 */
public class FundraiserWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FundraiserWorkArea
     */
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount ipcAccount;
    public FundraiserWorkArea(JPanel ipcUserProcessContainer, UserAccount ipcAccount, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        this.ipcAccount = ipcAccount;
        ipcPopulateFundRaisingTable();
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
        tbTable = new javax.swing.JTable();
        btnSponsor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbFM = new javax.swing.JLabel();
        lbTag = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 640, 320));

        btnSponsor.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSponsor.setForeground(new java.awt.Color(153, 0, 51));
        btnSponsor.setText("ADD SPONSOR");
        btnSponsor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSponsorActionPerformed(evt);
            }
        });
        add(btnSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 130, 30));

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        lbFM.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbFM.setForeground(new java.awt.Color(255, 255, 255));
        lbFM.setText("FUNDRAISER MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(lbFM, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbFM, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 100));

        lbTag.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbTag.setForeground(new java.awt.Color(153, 0, 51));
        lbTag.setText("You can add the sponsers now !!");
        add(lbTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 390, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSponsorActionPerformed
        // TODO add your handling code here:

        int selectedRow = tbTable.getSelectedRow();
        FundRaising fundRaiserSelected = (FundRaising) tbTable.getValueAt(selectedRow, 0);
        for(Sponsor sponsor: ipcSystem.getSponsorDirectory().getSponsorDirectory()) {
            ipcSystem.getSponsorDirectory().updateSponsorPetOwnerInfo(sponsor, fundRaiserSelected.getIpcpetOwner(), fundRaiserSelected.getIpcpetType(), fundRaiserSelected.getIpchealthCamp(), fundRaiserSelected.getIpchospitalName());
            System.out.println("Sponsor added successfully");
        }
        JOptionPane.showMessageDialog(this, "The Request to the sponsor has been sent !!!");
    }//GEN-LAST:event_btnSponsorActionPerformed
public void ipcPopulateFundRaisingTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tbTable.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcSystem.getUserAccountDirectory().getUserAccountList()) {
            
        }
        for(FundRaising fundRaising: ipcSystem.getFundRaisingDirectory().getFundRaisingDirectory()){
             Object[] row = new Object[5];
                row[0] = fundRaising;
                row[1] = fundRaising.getIpcpetOwner();
                row[2] = fundRaising.getIpcpetType();
                row[3] = fundRaising.getIpchealthCamp();
                row[4] = fundRaising.getIpcsponsorStatus() == null ? "N/A" : fundRaising.getIpcsponsorStatus();
                tablemodel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSponsor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFM;
    private javax.swing.JLabel lbTag;
    private javax.swing.JTable tbTable;
    // End of variables declaration//GEN-END:variables
}
