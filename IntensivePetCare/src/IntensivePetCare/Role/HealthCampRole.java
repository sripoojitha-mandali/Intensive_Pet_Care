/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensivePetCare.Role;
import IntensiveFostorCare.Ecosystem;
import IntensiveFostorCare.UserAccount.UserAccount;
import IntensiveFostorCare.HealthCamp.MainPageOrganiser;
import IntensiveFostorCare.PetVolunteer.PetVolunteerDirectory;
import javax.swing.JPanel;

/**
 *
 * @author saran
 */
public class HealthCampRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel ipcuserProcessContainer, UserAccount ipcaccount, Ecosystem ipcsystem) {
        return new MainPageOrganiser(ipcuserProcessContainer, ipcaccount, ipcsystem);
    }
}

