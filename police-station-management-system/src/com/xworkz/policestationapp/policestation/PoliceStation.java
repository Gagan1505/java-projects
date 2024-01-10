package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.officer.Officer;

import java.util.List;

public interface PoliceStation {

    public boolean addOfficer(Officer officer);

    public String getOfficerNameById(int officerId);

    public String getPostNameByOfficerId(int officerId);

    public int getOfficerAgeByOfficerName(String officerName);

    public List<String> getOfficersNameByPostName(String postName);

    public String getOfficerAddressById(int officerId);

    public Officer getOfficerInfoById(int officerId);

    public boolean updateOfficerPostNameByOfficerName(String officerName, String updatedPostName);

    public void deleteOfficerById(int officerId);

    public void getAllOfficers();
}
