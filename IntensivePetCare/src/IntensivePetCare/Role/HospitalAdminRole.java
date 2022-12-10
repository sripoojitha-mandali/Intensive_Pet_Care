/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensivePetCare.Role;

import javax.swing.JPanel;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.UserAccount.UserAccount;
import UserInterface.HospiitalAdmin.HospitalAdminWorkArea;
/**
 *
 * @author saran
 */
public class HospitalAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel ipcuserProcessContainer, UserAccount ipcaccount, Ecosystem ipcsystem) {
        return new HospitalAdminWorkArea(ipcuserProcessContainer,ipcaccount, ipcsystem);
    }
}
