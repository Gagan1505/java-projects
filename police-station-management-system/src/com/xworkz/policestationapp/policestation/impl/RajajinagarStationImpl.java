package com.xworkz.policestationapp.policestation.impl;

import com.xworkz.policestationapp.exception.*;
import com.xworkz.policestationapp.officer.Officer;
import com.xworkz.policestationapp.policestation.PoliceStation;

import java.util.ArrayList;
import java.util.List;

public class RajajinagarStationImpl implements PoliceStation {

    List<Officer> officers = new ArrayList<>();
    int officerId = 1;
    @Override
    public boolean addOfficer(Officer officer) {
        boolean isAdded = false;
        try {
            if (officer != null) {
                officer.setOfficerId(officerId++);
                officers.add(officer);
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
                for(Officer officer:officers ){
                    if(officer.getOfficerId() == officerId){
                        officerName = officer.getOfficerName();
                        System.out.println("Officer name fetched successfully");
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
                for(Officer officer : officers){
                    if(officer.getOfficerId() == officerId){
                        officerPostName = officer.getOfficerPostName();
                        System.out.println("Officer name fetched successfully");
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
            for(Officer officer : officers){
                if(officer.getOfficerName().equals(officerName)){
                    officerAge = officer.getOfficerAge();
                    System.out.println("Officer age fetched successfully--");
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
    public List<String> getOfficersNameByPostName(String postName) {
        List<String> officersName = new ArrayList<>();

        System.out.println("Fetching all officers name that are working in the given post-name");
        try {
            for(Officer officer : officers){
                if(officer.getOfficerPostName().equals(postName)){
                    officersName.add(officer.getOfficerName());
                    System.out.println("Officers names fetced ---");
                }
            }
            if(officersName.size() == 0){
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
                for(Officer officer: officers){
                    if(officer.getOfficerId() == officerId){
                        officerAddress = officer.getOfficerAddress();
                        System.out.println("Officer address fetched succesfully");
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
                for(Officer officer : officers){
                    if(officer.getOfficerId() == officerId){
                        officerInfo = officer;
                        System.out.println("Officer details are fetched in object form");
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
            for(Officer officer : officers){
                if(officer.getOfficerName().equals(officerName)){
                    officer.setOfficerPostName(updatedPostName);
                    System.out.println("Officer postname updated successfully");
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
        boolean isDeleted = false;
        System.out.println("invoking deleteOfficerById");
        try {
            if(officers.size() > 0) {
                for(Officer officer : officers){
                    if(officer.getOfficerId() == officerId){
                        officers.remove(officer);
                        System.out.println("Officer details are deleted-----");
                        isDeleted = true;
                    }
                }
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
            if(officers.size() > 0){
                for(Officer officer : officers){
                    System.out.println(officer.toString());
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
