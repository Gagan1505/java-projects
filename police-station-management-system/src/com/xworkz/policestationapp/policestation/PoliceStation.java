package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.officer.Officer;
import java.util.Arrays;

public class PoliceStation {
    Officer officers[];
    public PoliceStation(int officersCount){
        officers = new Officer[officersCount];
    }
    int index = 0, officerId = 1;

    public boolean addOfficer(Officer officer){
        boolean isAdded = false;
        if(officer != null){
            officer.setOfficerId(officerId++);
            this.officers[index++] = officer;
            System.out.println("New officer is added successfully");
            isAdded = true;
        }
        return isAdded;
    }

    public String getOfficerNameById(int officerId){
        String officerName = "";

//        System.out.println("invoking getOfficerNameById");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerId() == officerId) {
                officerName = officers[i].getOfficerName();
                System.out.println("Officer found --- visit executor ---" );
            }
        }
        return officerName;
    }

    public String getPostNameByOfficerId(int officerId){
        String officerPostName = "";

//        System.out.println("invoking getOfficerNameById");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerId() == officerId) {
                officerPostName = officers[i].getOfficerPostName();
                System.out.println("Officer found --- visit executor ");
            }
        }
        return officerPostName;
    }

    public int getOfficerAgeByOfficerName(String officerName){
        int officerAge = 0;
        System.out.println("invoking getOfficerAgeByOfficerName");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerName().equals(officerName)){
                officerAge = officers[i].getOfficerAge();
            }
        }
        return officerAge;
    }

    public String[] getOfficersNameByPostName(String postName){
        String officersName[] = new String[this.officers.length];

        System.out.println("Fetching all officers name that are working in the given post-name");
        int index = 0;
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerPostName().equals(postName)) {
                officersName[index++] = officers[i].getOfficerName();
            }
        }
        return officersName;
    }

    public String getOfficerAddressById(int officerId){
        String officerAddress = "";

//        System.out.println("invoking getOfficerAddressById");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerId() == officerId){
                officerAddress = officers[i].getOfficerAddress();
                System.out.println("Officer Address fetched Successfully :");
            }
        }
        return officerAddress;
    }

    public Officer getOfficerInfoById(int officerId){
        Officer officerInfo = null;

//        System.out.println("invoking getOfficerInfoById");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerId() == officerId){
                officerInfo = officers[i];
                System.out.println("Officer found --- visit executor for details --");
            }
        }
        return officerInfo;
    }

    public boolean updateOfficerPostNameByOfficerName(String officerName,String updatedPostName){
        boolean isUpdated = false;

//        System.out.println("invoking updateOfficerPostNameByOfficerName");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerName().equals(officerName)){
                officers[i].setOfficerPostName(updatedPostName);
                System.out.println("Officer post updated successfully :");
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public void deleteOfficerById(int officerId){

        int index = 0;
        System.out.println("invoking deleteOfficerById");
        for (int i = 0; i < this.officers.length; i++) {
            if(officers[i].getOfficerId() != officerId){
                officers[index++] = officers[i];
            }
        }
        officers = Arrays.copyOf(officers,index);
    }

    public void getAllOfficers(){

        for (int i = 0; i < this.officers.length; i++) {
            System.out.println(officers[i].getOfficerId() + "  "
                    + officers[i].getOfficerName() + "  "
                    + officers[i].getOfficerGender() + "  "
                    + officers[i].getOfficerAge() + "  "
                    + officers[i].getOfficerPostName() + "  "
                    + officers[i].getBloodGroup() + "  "
                    + officers[i].getOfficerEmailId() + "  "
                    + officers[i].getOfficerAddress());
        }
    }
}
