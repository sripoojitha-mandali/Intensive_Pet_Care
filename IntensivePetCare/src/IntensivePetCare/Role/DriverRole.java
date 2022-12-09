/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensivePetCare.Role;
import IntensivePetCare.Ecosystem;
import IntensivePetCare.UserAccount.UserAccount;
import UserInterface.Driver.DriverWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author saran
 */
public class DriverRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel ipcuserProcessContainer, UserAccount ipcaccount, Ecosystem ipcsystem) {
        return new DriverWorkArea(ipcuserProcessContainer, ipcaccount, ipcsystem);
    }
}
