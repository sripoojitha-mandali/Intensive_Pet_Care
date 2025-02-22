/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface;
import Model.DB4oUtil.DB4OUtil;
import java.awt.CardLayout;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import Model.Ecosystem;


/**
 *
 * @author saran
 */
public class MainJFrame extends javax.swing.JFrame {

    /** Creates new form MainJFrame */
    private Ecosystem ipcSystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        ipcSystem = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        lb3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JPasswordField();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        ControlPanel.setBackground(new java.awt.Color(102, 0, 0));
        ControlPanel.setMinimumSize(new java.awt.Dimension(200, 213));
        ControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        ControlPanel.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 30));

        btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(63, 40, 101));
        btn1.setText("LOGIN");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        ControlPanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 80, 30));

        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnlogout.setBorder(null);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        ControlPanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-lock-landscape-30.png"))); // NOI18N
        ControlPanel.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 30, 30));
        ControlPanel.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, 30));

        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-name-30.png"))); // NOI18N
        ControlPanel.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        lb1.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Login Credentials");
        ControlPanel.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 40));

        jSplitPane1.setLeftComponent(ControlPanel);

        container.setBackground(new java.awt.Color(255, 204, 204));
        container.setLayout(new java.awt.CardLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/v1.jpg"))); // NOI18N
        jLabel5.setFocusable(false);
        jLabel5.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel5.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel5.setPreferredSize(new java.awt.Dimension(800, 600));
        jLabel5.setRequestFocusEnabled(false);
        jLabel5.setVerifyInputWhenFocusTarget(false);
        container.add(jLabel5, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        UserAccount ipcuseraccount = ipcSystem.getUserAccountDirectory().authenticateUser(txt1.getText(), txt2.getText());

        CardLayout ipccrdLyt = (CardLayout) container.getLayout();
        container.add("Login", ipcuseraccount.getRole().createWorkArea(container, ipcuseraccount, ipcSystem));
        ipccrdLyt.next(container);
        btnlogout.setEnabled(true);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        btnlogout.setEnabled(false);
        txt1.setEnabled(true);
        txt2.setEnabled(true);
        btn1.setEnabled(true);

        txt1.setText("");
        txt2.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout ipccrdLyt = (CardLayout) container.getLayout();
        ipccrdLyt.next(container);
        dB4OUtil.storeSystem(ipcSystem);
        container.setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        StartScreen start = new StartScreen();
        start.setVisible(true);
        try {
            for (int row = 0; row <= 100; row++) {
                Thread.sleep(10);
                start.lb1.setText(Integer.toString(row) + "%");
                start.loadingprogressBar.setValue(row);
                if (row == 100) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            start.setVisible(false);
                            new MainJFrame().setVisible(true);
                        }
                    });

                }
            }
        } catch (Exception e) {
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JTextField txt1;
    private javax.swing.JPasswordField txt2;
    // End of variables declaration//GEN-END:variables

}
