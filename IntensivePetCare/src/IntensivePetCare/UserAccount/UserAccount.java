/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensivePetCare.UserAccount;

import IntensivePetCare.Person.Person;
import IntensivePetCare.Role.Role;

/**
 *
 * @author varshakuruva
 */
public class UserAccount {
    
    private String ipcname;
    private String ipcuserName;
    private String ipcpassword;
    private Person ipcperson;
    private Role ipcrole;
//    private WorkQueue workQueue;

    public String getIpcname() {
        return ipcname;
    }

    public void setIpcname(String ipcname) {
        this.ipcname = ipcname;
    }

    public String getIpcuserName() {
        return ipcuserName;
    }

    public void setIpcuserName(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }

    public String getIpcpassword() {
        return ipcpassword;
    }

    public void setIpcpassword(String ipcpassword) {
        this.ipcpassword = ipcpassword;
    }

    public Person getIpcperson() {
        return ipcperson;
    }

    public void setIpcperson(Person ipcperson) {
        this.ipcperson = ipcperson;
    }

    public Role getIpcrole() {
        return ipcrole;
    }

    public void setIpcrole(Role ipcrole) {
        this.ipcrole = ipcrole;
    }

    @Override
    public String toString() {
        return ipcname;
    }
}
