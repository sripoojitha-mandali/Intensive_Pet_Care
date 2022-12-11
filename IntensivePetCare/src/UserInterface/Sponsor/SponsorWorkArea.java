/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Sponsor;
import Model.Ecosystem;
import Model.FundRaising.FundRaising;
import Model.Sponsor.Sponsor;
import Model.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author varshakuruva
 */
public class SponsorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    public SponsorWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateTable();
    }

    
    public void populateTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblSponsorPetOwnerInfo.getModel();

        tablemodel.setRowCount(0);
        for(Sponsor sponsor : system.getSponsorDirectory().getSponsorDirectory()) {
            Object[] row= new Object[4];
            row[2] = sponsor.getIpcpetType();
            row[3] = sponsor.getIpchospitalName();
            row[0] = sponsor;
            row[1] = sponsor.getIpcpetOwner();
            
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
        tblSponsorPetOwnerInfo = new javax.swing.JTable();
        btnApproveFunds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblManageInfo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSponsorPetOwnerInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sponsor", "Pet owner", "Pet type", "Hospital name"
            }
        ));
        jScrollPane1.setViewportView(tblSponsorPetOwnerInfo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 650, 200));

        btnApproveFunds.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnApproveFunds.setForeground(new java.awt.Color(102, 0, 0));
        btnApproveFunds.setText("APPROVE SPONSOR");
        btnApproveFunds.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApproveFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveFundsActionPerformed(evt);
            }
        });
        add(btnApproveFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 169, 34));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SPONSOR APPROVAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 150, 399, 42));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        lblManageInfo1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo1.setText("SPONSOR WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));
    }// </editor-fold>//GEN-END:initComponents
    
     public void populatefundAgencyTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblSponsorPetOwnerInfo.getModel();

        tablemodel.setRowCount(0);
        for(Sponsor sponsor : system.getSponsorDirectory().getSponsorDirectory()) {
            Object[] row= new Object[4];
            row[2] = sponsor.getIpcfuser();
            row[3] = sponsor.getIpchospitalName();
            row[0] = sponsor;
            row[1] = sponsor.getIpcpetType();
            
            tablemodel.addRow(row);
        }
    }

    private void btnApproveFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveFundsActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblSponsorPetOwnerInfo.getSelectedRow();
        Sponsor sponsorRowSelected = (Sponsor) tblSponsorPetOwnerInfo.getValueAt(selectedRow, 0);
        for(FundRaising fundRaising: system.getFundRaisingDirectory().getFundRaisingDirectory()) {
            if(sponsorRowSelected.getIpcpetOwner().equals(fundRaising.getIpcpetOwner())) {
                system.getFundRaisingDirectory().updateFundRaisingSponsorStatus(fundRaising, "Approved");
            }
        }

        JOptionPane.showMessageDialog(this,"Funds has been approved successfully");
    }//GEN-LAST:event_btnApproveFundsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveFunds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInfo1;
    private javax.swing.JTable tblSponsorPetOwnerInfo;
    // End of variables declaration//GEN-END:variables
}
