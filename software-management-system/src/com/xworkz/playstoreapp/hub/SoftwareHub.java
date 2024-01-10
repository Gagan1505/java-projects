package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;
public interface SoftwareHub {

    boolean addApplications(Application application);

    void getApplications();
    Application getApplicationById(int appId);
     Application getApplicationByName(String appName);
     Application getApplicationByType(String appType);
     String getApplicationNameByAppType(String appType);
     String getApplicationTypeByAppName(String appName);
     int getApplicationIdByName(String appName);
     double getApplicationSizeByAppName(String appName);

     String getApplicationCompanyNameByAppName(String appName);

     boolean updateApplicationVersionByAppName(String appName, String updatedVersion);

//     boolean updateAppCompanyNameById(int appId, String updateCompanyName);

//     boolean updateAppVersionAndSizeByAppName(String appName,String updatedVersion, double newVersionSize);
     boolean updateCompaniesNameByOldCompanyName(String oldCompanyName, String newCompanyName);
    //-------------------------------------------------------------------------------
     void deleteApplicationByAppName(String appName);



}
