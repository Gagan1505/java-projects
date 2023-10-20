package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;
import lombok.Builder;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SoftwareHub {

    int appsCount;
    Application application[];

    public SoftwareHub(int appsCount){
        application = new Application[appsCount];
    }
    int index;
    public boolean addApplications(Application application){
        boolean isAdded = false;
        if(application != null){
            this.application[index++] = application;
            System.out.println("Application Successfully Added");
            isAdded = true;
        }
        return isAdded;
    }

    public void getApplications(){

        for(int index = 0; index < this.application.length; index++){
            System.out.println("Id: " +application[index].getApplicationId() +
                    "  Name: " + application[index].getApplicationName()+
                    "  Company: "+application[index].getCompanyName()+
                    "  Size-in-mb: "+application[index].getAppSizeInMb()+
                    "  version: "+application[index].getAppVersion()+
                    "  release year: "+application[index].getReleaseYear()+
                    "  type: "+application[index].getAppType());
//            System.out.println("Application Info Fetched Successfully");
        }
    }

    public Application getApplicationById(int appId){
        Application app = null;

        System.out.println("Searching An Application using AppID");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationId() == appId){
                app = application[index];
                System.out.println("Application found Using App ID");
            }
        }
        return app;
    }
    public Application getApplicationByName(String appName){
        Application app = null;

        System.out.println("Application Fetching using appName");
        for(int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getApplicationName().equals(appName)) {
                app = application[appIndex];
                System.out.println("Application found using appName ---- Visit Executor");
            }
        }
        return app;
    }

    public Application getApplicationByType(String appType){

        Application app = null;

        System.out.println("Application Fetching using appType");
        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getAppType().equals(appType)) {
                app = application[index];
                System.out.println("Application found using appType ---- Visit Executor-----");
            }
        }
        return app;
    }

    public String getApplicationNameByAppType(String appType){
        String appName = "";

        System.out.println("Finding Application Name of the given type");
        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getAppType().equals(appType)) {
                appName = application[index].getApplicationName();
                System.out.println("Application found --");
            }
        }

        return appName;
    }
    public String getApplicationTypeByAppName(String appName){
        String appType = "";

        System.out.println("Fetching Application Type Using Application Name");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationName().equals(appName) ){
                appType = application[index].getAppType();
                System.out.println("Application Type Found Successfully");
            }
        }
        return appType;
    }
    public int getApplicationIdByName(String appName){
        int appId = 0;

        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationName().equals(appName)){
                appId = application[index].getApplicationId();
                System.out.println("Application Id fetched Successfully------------");
            }
        }
        return appId;
    }
    public double getApplicationSizeByAppName(String appName){
        double appSize = 0.0;

        System.out.println("Finding Size of App using app name");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationName().equals(appName)){
                appSize = application[index].getAppSizeInMb();
                System.out.println("Application size found-----------------------");
            }
        }
        return appSize;
    }

    public String getApplicationCompanyNameByAppName(String appName){
        String appCompanyName = "";

        System.out.println("Fetching Application Type Using Application Name");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationName().equals(appName) ){
                appCompanyName = application[index].getCompanyName();
                System.out.println("Application Type Found Successfully");
            }
        }
        return appCompanyName;
    }

    public boolean updateApplicationVersionByAppName(String appName, String updatedVersion){
        boolean isVersionUpdated = false;

        System.out.println("Searching for a given application to update");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationName().equals(appName)){
                application[index].setAppVersion(updatedVersion);
                System.out.println("Application application version updated successfully using app name");
                isVersionUpdated = true;
            }
        }
        return isVersionUpdated;
    }

    public boolean updateAppCompanyNameById(int appId, String updateCompanyName){

        boolean isUpdated = false;

        System.out.println("Searching for a given application to update");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationId() == appId){
                application[index].setCompanyName(updateCompanyName);
                System.out.println("Application Company name updated successfully using app id");
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean updateAppVersionAndSizeByAppName(String appName,String updatedVersion, double newVersionSize){
        boolean isUpdated = false;

        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApplicationName().equals(appName)){
                application[index].setAppVersion(updatedVersion);
                application[index].setAppSizeInMb(newVersionSize);
                System.out.println("Application version and size is updated successfully");
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean updateCompaniesNameByOldCompanyName(String oldCompanyName, String newCompanyName){
        boolean isUpdated = false;
        int count = 0;

        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getCompanyName().equals(oldCompanyName)) {
                application[index].setCompanyName(newCompanyName);
                ++count;
            }
        }
        if(count >= 1)
            isUpdated = true;

        return isUpdated;
    }

    //-------------------------------------------------------------------------------

    public void deleteApplicationByAppName(String appName){
        System.out.println();
        System.out.println("Invoked deleteApplicationByAppName");

//        Application newApplications[] = new Application[this.application.length - 1];
//        int newIndex = 0;
//
//        for (int index = 0; index < this.application.length; index++) {
//            if(application[index].getApplicationName() != appName){
//                newApplications[newIndex++] = application[index];
//            }
//            else{
//                System.out.println("The given application is deleted successfully and it's details are :");
//                System.out.println(application[index].getApplicationId()+ "   " +application[index].getApplicationName());
//            }
//        }
//
//        System.out.println("Applications present in play-store post deleting are :");
//        for (int index = 0; index < newApplications.length; index++) {
//            System.out.println(newApplications[index].getApplicationId()+"  "
//            +newApplications[index].getApplicationName()+"  "
//            +newApplications[index].getCompanyName());
//        }

        int index , newIndex;
        for (index = 0,newIndex = 0; index < this.application.length; index++) {
            if(!application[index].getApplicationName().equals(appName)){
                application[newIndex++] = application[index];
            }
            else{
                System.out.println("The given application is deleted successfully and it's details are :");
                System.out.println(application[index].getApplicationId()+ "   " +application[index].getApplicationName());
            }
        }
        application = Arrays.copyOf(application,newIndex);
        // getAllNewApplications(application);
    }

//    public void getAllNewApplications(Application[] application){
//        System.out.println();
//        System.out.println("Applications present post deletion are : ");
//        for (int i = 0; i < application.length; i++) {
//            System.out.println(application[i].getApplicationId()+"   "
//            +application[i].getApplicationName()+"   ");
//        }
//    }

}
