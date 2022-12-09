/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntensiveFosterCare.Driver;

import java.util.ArrayList;

/**
 *
 * @author poojitha
 */
public class DriverDirectory {
        private ArrayList<Driver> driverDirectory;
    private Driver driver;

    public DriverDirectory() {
        driverDirectory = new ArrayList<Driver>();
    }

    public ArrayList<Driver> getDriverDirectory() {
        return driverDirectory;
    }

    public void setPetVolunteerDirectory(ArrayList<Driver> driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setPetVolunteer(Driver petVolunteer) {
        this.driver = petVolunteer;
    }

    public Driver createUserAccount(String username) {
        driver = new Driver(username);
        driverDirectory.add(driver);
        return driver;
    }

    public void updateDriverInfo(Driver driver, String name, String gender, String fosterParent, String healthCamp, String hospitalName) {
        driver.setName(name);
        driver.setGender(gender);
        driver.setFosterParent(fosterParent);
        driver.setHealthCamp(healthCamp);
        driver.setHospitalName(hospitalName);
    }
    
    public void updateDriverPersonalInfo(Driver driver, String name, String username) {
        driver.setName(name);
        driver.setUsername(username);
    }
    
    public void updateDriverHealthCampInfo(Driver driver, String fosterParent, String gender, String healthCamp, String hospitalName){
        driver.setGender(gender);
        driver.setFosterParent(fosterParent);
        driver.setHealthCamp(healthCamp);
        driver.setHospitalName(hospitalName);
//        driver.setHospitalName(hospitalName);
    }
    
    public void updateDropOffStatus(Driver driver, String status) {
        driver.setDropOffStatus(status);
    }

    public void deleteDriver(String username) {
        for (int i = 0; i < driverDirectory.size(); i++) {
            if (driverDirectory.get(i).getUsername() == username) {
                driverDirectory.remove(i);
            }
        }
    }
}
