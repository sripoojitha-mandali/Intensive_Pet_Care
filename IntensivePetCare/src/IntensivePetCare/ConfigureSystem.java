/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensivePetCare;
import IntensivePetCare.Person.Person;
import IntensivePetCare.Role.SystemAdminRole;
import IntensivePetCare.UserAccount.UserAccount;
/**
 *
 * @author saran
 */
public class ConfigureSystem {
    
    
    public static Ecosystem configure(){
        
        Ecosystem ipcsystem = Ecosystem.getInstance();
        
        System.out.println("Test");
        Person person = ipcsystem.getPersonDirectory().createPerson("RRH");
        
        UserAccount ipcua = ipcsystem.getUserAccountDirectory().createUserAccount("Sysadmin","sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return ipcsystem;
    }
    
}
