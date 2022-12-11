/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HospitalAdmin;
import Model.Ecosystem;
import Model.FundRaising.FundRaising;
import Model.PetVolunteer.PetVolunteer;
import Model.UserAccount.UserAccount;
import Model.Vet.Vet;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author saran
 */
public class ManagePetInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManagePetInfo
     */
    JPanel ipcuserProcessContainer;
    Ecosystem ipcsystem;
    private UserAccount ipcaccount;
    
    public ManagePetInfo(JPanel ipcuserProcessContainer,UserAccount ipcaccount, Ecosystem ipcsystem) {
        initComponents();
        this.ipcuserProcessContainer= ipcuserProcessContainer;
        this.ipcsystem = ipcsystem;
        this.ipcaccount = ipcaccount;
        ipcpopulatePetInfo();
        ipcpopulateVetTable();
    }

    public void ipcpopulatePetInfo() {
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblpetinfo.getModel();
        tablemodel.setRowCount(0);
        for (PetVolunteer petVolunteer : ipcsystem.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getIpchospitalName().equals(ipcaccount.getIpcname())) {
                Object[] row = new Object[5];
                row[0] = petVolunteer;
                row[1] = petVolunteer.getIpcName();
//                row[2] = petVolunteer.getUsername();
                row[2] = petVolunteer.getIpcpetType();
                row[3] = petVolunteer.getIpchealthCamp();
                row[4] = petVolunteer.getIpclabResultStatus() == null ? "N/A" : petVolunteer.getIpclabResultStatus();
                tablemodel.addRow(row);
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
        jPanel2 = new javax.swing.JPanel();
        lblManageInfo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpetinfo = new javax.swing.JTable();
        btnAssignPetOwnerToVet = new javax.swing.JButton();
        btnaddfundraiser = new javax.swing.JButton();
        lblVet = new javax.swing.JLabel();
        txtvet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVets = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(63, 40, 101));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        lblManageInfo1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo1.setText("HOSPITAL ADMIN WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1070, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 575));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblpetinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "pet username", "pet owner", "pet type", "Health Camp", "Lab result status"
            }
        ));
        jScrollPane1.setViewportView(tblpetinfo);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 640, 170));

        btnAssignPetOwnerToVet.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAssignPetOwnerToVet.setForeground(new java.awt.Color(153, 0, 0));
        btnAssignPetOwnerToVet.setText("ADD VET");
        btnAssignPetOwnerToVet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignPetOwnerToVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignPetOwnerToVetActionPerformed(evt);
            }
        });
        jPanel3.add(btnAssignPetOwnerToVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 150, 30));

        btnaddfundraiser.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnaddfundraiser.setForeground(new java.awt.Color(153, 0, 51));
        btnaddfundraiser.setText("ADD FUNDRAISER");
        btnaddfundraiser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddfundraiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddfundraiserActionPerformed(evt);
            }
        });
        jPanel3.add(btnaddfundraiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 150, 30));

        lblVet.setBackground(new java.awt.Color(255, 255, 255));
        lblVet.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblVet.setForeground(new java.awt.Color(153, 0, 51));
        lblVet.setText("VET NAME");
        jPanel3.add(lblVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 100, 30));

        txtvet.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel3.add(txtvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 150, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASSIGN PET TO VET");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 360, 60));

        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        tblVets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Vet username"
            }
        ));
        jScrollPane2.setViewportView(tblVets);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 500, 100));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 40, 101));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ASSIGN PET TO VET");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 360, 60));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 40, 101));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ASSIGN PET TO VET");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 360, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignPetOwnerToVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignPetOwnerToVetActionPerformed
        // TODO add your handling code here:
        int ipcselectedRow = tblpetinfo.getSelectedRow();
        PetVolunteer ipcvetSelected = (PetVolunteer) tblpetinfo.getValueAt(ipcselectedRow, 0);
        String ipcvetPetOwner = ipcvetSelected.getIpcName();
        String ipcvetPetType = ipcvetSelected.getIpcpetType();
        String ipcvetHealthCamp = ipcvetSelected.getIpchealthCamp();
        String ipcvetHospitalName = ipcvetSelected.getIpchospitalName();
        for(Vet vet: ipcsystem.getVetDirectory().getVetDirectory()) {
            if(vet.getIpcuserName().equals(txtvet.getText())){
                ipcsystem.getVetDirectory().updateVetInfo(vet, ipcvetPetOwner, ipcvetPetType, ipcvetHealthCamp, ipcvetHospitalName);
            }
        }
        JOptionPane.showMessageDialog(this, "Vet added Successfuly");
    }//GEN-LAST:event_btnAssignPetOwnerToVetActionPerformed

    private void btnaddfundraiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddfundraiserActionPerformed
        // TODO add your handling code here:
        int ipcselectedRow = tblpetinfo.getSelectedRow();
        PetVolunteer ipcvetSelected = (PetVolunteer) tblpetinfo.getValueAt(ipcselectedRow, 0);
        String ipcvetPetOwner = ipcvetSelected.getIpcName();
        String ipcvetPetType = ipcvetSelected.getIpcpetType();
        String ipcvetHealthCamp = ipcvetSelected.getIpchealthCamp();
        String ipcvetHospitalName = ipcvetSelected.getIpchospitalName();
        for(FundRaising fundRaising: ipcsystem.getFundRaisingDirectory().getFundRaisingDirectory()) {
            ipcsystem.getFundRaisingDirectory().updateFundRaisingInfo(fundRaising, ipcvetPetOwner, ipcvetPetType, ipcvetHealthCamp, ipcvetHospitalName);
            System.out.println("Fund raising agency has been added sucessfully");
        }
        JOptionPane.showMessageDialog(this, "Request sent to the Fundraising agency successfully");
    }//GEN-LAST:event_btnaddfundraiserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ipcuserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcuserProcessContainer.getLayout();
        layout.previous(ipcuserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
private void ipcpopulateVetTable() {
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblVets.getModel();
        tablemodel.setRowCount(0);
        
        for(Vet vet: ipcsystem.getVetDirectory().getVetDirectory()){
            System.out.println("vet name :" + vet.getIpchospitalName());
            System.out.println("account name :" + ipcaccount.getIpcname());
            if(vet.getIpchospitalName().equals(ipcaccount.getIpcname())) {
                Object[] row = new Object[1];
                System.out.println("here");
                row[0] = vet;
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignPetOwnerToVet;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnaddfundraiser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageInfo1;
    private javax.swing.JLabel lblVet;
    private javax.swing.JTable tblVets;
    private javax.swing.JTable tblpetinfo;
    private javax.swing.JTextField txtvet;
    // End of variables declaration//GEN-END:variables
}
