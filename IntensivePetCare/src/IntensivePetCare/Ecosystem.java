/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensivePetCare;


import IntensivePetCare.Driver.DriverDirectory;
import IntensivePetCare.FundRaising.FundRaisingDirectory;
import IntensivePetCare.HealthCamp.HealthCampDirectory;
import IntensivePetCare.Hospital.HospitalDirectory;
import IntensivePetCare.LabAssistant.LabAssistantDirectory;
import IntensivePetCare.PetVolunteer.PetVolunteerDirectory;
import IntensivePetCare.Role.Role;
import IntensivePetCare.Role.SystemAdminRole;
import IntensivePetCare.Sponsor.SponsorDirectory;
import IntensivePetCare.Vet.VetDirectory;
import java.util.ArrayList;
/**
 *
 * @author saran
 */
 public class Ecosystem extends Organization{

    private static Ecosystem IntensivePetCare;
    private HospitalDirectory ipchospitalDirectory;
    private VetDirectory ipcvetDirectory;
    private PetVolunteerDirectory ipcpetVolunteerDirectory;
    private HealthCampDirectory ipchealthCampDirectory;
    private FundRaisingDirectory ipcfundRaisingDirectory;
    private LabAssistantDirectory ipclabAssistantDirectory;
    private SponsorDirectory ipcsponsorDirectory;
    private DriverDirectory ipcdriverDirectory;

    public Ecosystem(HospitalDirectory ipchospitalDirectory, VetDirectory ipcvetDirectory, PetVolunteerDirectory ipcpetVolunteerDirectory, HealthCampDirectory ipchealthCampDirectory, FundRaisingDirectory ipcfundRaisingDirectory, LabAssistantDirectory ipclabAssistantDirectory,SponsorDirectory ipcsponsorDirectory,DriverDirectory ipcdriverDirectory) {
        this.ipchospitalDirectory = ipchospitalDirectory;
        this.ipcvetDirectory = ipcvetDirectory;
        this.ipcpetVolunteerDirectory = ipcpetVolunteerDirectory;
        this.ipchealthCampDirectory = ipchealthCampDirectory;
        this.ipcfundRaisingDirectory = ipcfundRaisingDirectory;
        this.ipclabAssistantDirectory = ipclabAssistantDirectory;
        this.ipcsponsorDirectory = ipcsponsorDirectory;
        this.ipcdriverDirectory = ipcdriverDirectory;
    }

    public static Ecosystem getInstance() {
        if (IntensivePetCare == null) {
            IntensivePetCare = new Ecosystem();
        }
        return IntensivePetCare;
    }

    public static void setInstance(Ecosystem ipcsystem) {
        IntensivePetCare = ipcsystem;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> ipcroleList = new ArrayList<Role>();
        ipcroleList.add(new SystemAdminRole());
        return ipcroleList;
    }

    private Ecosystem() {
        super(null);
    }

    public boolean checkIfUserIsUnique(String ipcuserName) {
        
        return false;
    }

    public HospitalDirectory getHospitalDirectory() {
        if (ipchospitalDirectory == null) {
            ipchospitalDirectory = new HospitalDirectory();
        }
        return ipchospitalDirectory;
    }

    public VetDirectory getVetDirectory() {
        if (ipcvetDirectory == null) {
            ipcvetDirectory = new VetDirectory();
        }
        return ipcvetDirectory;
    }

    public PetVolunteerDirectory getPetVolunteerDirectory() {
        if (ipcpetVolunteerDirectory == null) {
            ipcpetVolunteerDirectory = new PetVolunteerDirectory();
            System.out.println("This should not show up");
        }
        return ipcpetVolunteerDirectory;
    }

    public HealthCampDirectory getHealthCampDirectory() {
        if (ipchealthCampDirectory == null) {
            ipchealthCampDirectory = new HealthCampDirectory();
        }
        return ipchealthCampDirectory;
    }
    
    public LabAssistantDirectory getLabAssistantDirectory() {
        if (ipclabAssistantDirectory == null) {
            ipclabAssistantDirectory = new LabAssistantDirectory();
        }
        return ipclabAssistantDirectory;
    }
    
    
    public FundRaisingDirectory getFundRaisingDirectory() {
        if (ipcfundRaisingDirectory == null) {
            ipcfundRaisingDirectory = new FundRaisingDirectory();
        }
        return ipcfundRaisingDirectory;
    }
    
    public SponsorDirectory getSponsorDirectory() {
        if (ipcsponsorDirectory == null) {
            ipcsponsorDirectory = new SponsorDirectory();
        }
        return ipcsponsorDirectory;
    }
    
     public DriverDirectory getDriverDirectory() {
        if (ipcdriverDirectory == null) {
            ipcdriverDirectory = new DriverDirectory();
        }
        return ipcdriverDirectory;
    }
}
