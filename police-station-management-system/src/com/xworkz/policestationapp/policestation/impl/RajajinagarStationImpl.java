package com.xworkz.policestationapp.policestation.impl;

import com.xworkz.policestationapp.exception.*;
import com.xworkz.policestationapp.officer.Officer;
import com.xworkz.policestationapp.policestation.PoliceStation;

import java.util.Arrays;

public class RajajinagarStationImpl implements PoliceStation {

    Officer officers[];
    public RajajinagarStationImpl(int officersCount){
        officers = new Officer[officersCount];
    }
    int index = 0, officerId = 1;
    @Override
    public boolean addOfficer(Officer officer) {
        boolean isAdded = false;
        try {
            if (officer != null) {
                officer.setOfficerId(officerId++);
                this.officers[index++] = officer;
                System.out.println("New officer is added successfully");
                isAdded = true;
            }else{
                CantAddNullObjectException cantAddNullObjectException = new CantAddNullObjectException("--------------Don't add null object-----------");
                throw cantAddNullObjectException;
            }
        }catch (CantAddNullObjectException e){
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public String getOfficerNameById(int officerId) {
        String officerName = "";

        System.out.println("invoking getOfficerNameById");
        try {
            if(officerId > 0){
                for (int i = 0; i < this.officers.length; i++) {
                    if (officers[i].getOfficerId() == officerId) {
                        officerName = officers[i].getOfficerName();
                        System.out.println("Officer found --- visit executor ---");
                    }
                }

                if(officerName==""){
                    OfficerNameNotFoundException officerNameNotFoundException = new OfficerNameNotFoundException("-----------------No officer found with entered id----------------------");
                    throw officerNameNotFoundException;
                }
            }else{
                InvalidIdException invalidIdException = new InvalidIdException("--------------Entered invalid id-------------------");
                throw invalidIdException;
            }
        }catch(OfficerNameNotFoundException|InvalidIdException e){
            e.printStackTrace();
        }
        return officerName;
    }

    @Override
    public String getPostNameByOfficerId(int officerId) {
        String officerPostName = "";

        System.out.println("invoking getOfficerNameById");
        try {
            if(officerId > 0){
                for (int i = 0; i < this.officers.length; i++) {
                    if (officers[i].getOfficerId() == officerId) {
                        officerPostName = officers[i].getOfficerPostName();
                        System.out.println("Officer found --- visit executor ");
                    }
                }

                if(officerPostName == ""){
                    PostNameNotFoundException postNameNotFoundException = new PostNameNotFoundException("--------------No pos present with entered officer id-----------------");
                    throw postNameNotFoundException;
                }
            }
            else{
                InvalidIdException invalidIdException = new InvalidIdException("------------------Entered invalid officer id-----------------------");
                throw invalidIdException;
            }
        }catch(PostNameNotFoundException|InvalidIdException e){
            e.printStackTrace();
        }
        return officerPostName;
    }

    @Override
    public int getOfficerAgeByOfficerName(String officerName) {
        int officerAge = 0;
        System.out.println("invoking getOfficerAgeByOfficerName");
        try {
            for (int i = 0; i < this.officers.length; i++) {
                if (officers[i].getOfficerName().equals(officerName)) {
                    officerAge = officers[i].getOfficerAge();
                }
            }

            if(officerAge == 0){
                OfficerAgeNotFoundException officerAgeNotFoundException = new OfficerAgeNotFoundException("----------------------Age not found exception--------------------");
                throw officerAgeNotFoundException;
            }
        }catch (OfficerAgeNotFoundException e){
            e.printStackTrace();
        }
        return officerAge;
    }

    @Override
    public String[] getOfficersNameByPostName(String postName) {
        String officersName[] = new String[this.officers.length];

        System.out.println("Fetching all officers name that are working in the given post-name");
        int index = 0;
        try {
            for (int i = 0; i < this.officers.length; i++) {
                if (officers[i].getOfficerPostName().equals(postName)) {
                    officersName[index++] = officers[i].getOfficerName();
                }
            }

            if(officersName.length == 0){
                OfficerNameNotFoundException officerNameNotFoundException = new OfficerNameNotFoundException("-------------No officers present for entered post name-------------");
                throw officerNameNotFoundException;
            }
        }catch(OfficerNameNotFoundException e){
            e.printStackTrace();
        }
        return officersName;
    }

    @Override
    public String getOfficerAddressById(int officerId) {
        String officerAddress = "";

        System.out.println("invoking getOfficerAddressById");
        try {
            if(officerId > 0){
                for (int i = 0; i < this.officers.length; i++) {
                    if (officers[i].getOfficerId() == officerId) {
                        officerAddress = officers[i].getOfficerAddress();
                        System.out.println("Officer Address fetched Successfully :");
                    }
                }

                if(officerAddress ==""){
                    OfficerAddressNotFoundException officerAddressNotFoundException = new OfficerAddressNotFoundException("-----------------Officer address not found with entered id----------------------");
                    throw officerAddressNotFoundException;
                }

            }else{
                InvalidIdException invalidIdException = new InvalidIdException("--------------Entered invalid id-------------------");
                throw invalidIdException;
            }
        }catch(OfficerAddressNotFoundException|InvalidIdException e){
            e.printStackTrace();
        }

        return officerAddress;
    }

    @Override
    public Officer getOfficerInfoById(int officerId) {
        Officer officerInfo = null;

        System.out.println("invoking getOfficerInfoById");
        try {
            if(officerId > 0){
                for (int i = 0; i < this.officers.length; i++) {
                    if (officers[i].getOfficerId() == officerId) {
                        officerInfo = officers[i];
                        System.out.println("Officer found --- visit executor for details --");
                    }
                }
                if(officerInfo==null){
                    OfficerNotFoundException officerNotFoundException = new OfficerNotFoundException("----------------No officer present with entered id----------------");
                    throw officerNotFoundException;
                }
            }
            else{
                InvalidIdException invalidIdException = new InvalidIdException("------------Entered inalid id------------------");
                throw invalidIdException;
            }
        }catch(OfficerNotFoundException|InvalidIdException e){
            e.printStackTrace();
        }
        return officerInfo;
    }

    @Override
    public boolean updateOfficerPostNameByOfficerName(String officerName, String updatedPostName) {
        boolean isUpdated = false;

        System.out.println("invoking updateOfficerPostNameByOfficerName");
        try {
            for (int i = 0; i < this.officers.length; i++) {
                if (officers[i].getOfficerName().equals(officerName)) {
                    officers[i].setOfficerPostName(updatedPostName);
                    System.out.println("Officer post updated successfully :");
                    isUpdated = true;
                }
            }
            if(isUpdated==false){
                UpdationFailedException updationFailedException = new UpdationFailedException("--------------Updation failed --------------------");
                throw updationFailedException;
            }
        }catch(UpdationFailedException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public void deleteOfficerById(int officerId) {

        int index = 0;
        boolean isDeleted = false;
        System.out.println("invoking deleteOfficerById");
        try {
            if(this.officers.length > 0) {
                for (int i = 0; i < this.officers.length; i++) {
                    if (officers[i].getOfficerId() != officerId) {
                        officers[index++] = officers[i];
                    }else{
                        isDeleted = true;
                        break;
                    }
                }
                officers = Arrays.copyOf(officers, index);

                if(isDeleted == false){
                    throw new DeletionFailedException("-----------------Deletion failed -----------------");
                }
            }else{
                throw new OfficerNotFoundException("----------------No officers to delete-----------");
            }
        }catch(DeletionFailedException|OfficerNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    public void getAllOfficers() {

        try {
            if(this.officers.length > 0){
                for (int i = 0; i < this.officers.length; i++) {
                    System.out.println(officers[i].toString());
                }
            }
            else{
                throw new OfficerNotFoundException("---------------No officers present to display details-------------");
            }
        }catch(OfficerNotFoundException e){
            e.printStackTrace();
        }
    }

}
