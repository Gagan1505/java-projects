package com.xworkz.playstoreapp.hub.impl;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.exception.*;
import com.xworkz.playstoreapp.hub.SoftwareHub;

import java.util.ArrayList;
import java.util.List;


public class PlaystoreImpl implements SoftwareHub {

    List<Application> applications = new ArrayList<>();

    int appId = 1;

    @Override
    public boolean addApplications(Application application){
        boolean isAdded = false;
        try {
            if (application != null) {
                application.setApplicationId(appId++);
                this.applications.add(application);
                System.out.println("Application Successfully Added");
                isAdded = true;
            }
            else{
                CannotAddNullException cannotAddNullException = new CannotAddNullException("------------Don't add null object--------------");
                throw cannotAddNullException;
            }
        }catch(CannotAddNullException e){
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public void getApplications() {
        try{
            if(this.applications.size()>0){
                for (Application application:applications) {
                    System.out.println(application);
                }
            }else{
                ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("------------No applications present to display----------");
                throw applicationNotFoundException;
            }
        }catch(ApplicationNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public Application getApplicationById(int appId) {
        Application app = null;

        System.out.println("Searching An Application using AppID");
        try {
            for (Application application:applications) {
                if(application.getApplicationId() == appId){
                    app = application;
                    System.out.println("Application found using id---");
                }
            }
            if (appId > 0) {
                if (app == null) {
                    ApplicationNotFoundException applicationNotFoundException =
                                new ApplicationNotFoundException("Application not found with entered id:");
                    throw applicationNotFoundException;
                }
            }
            else{
                InvalidInputException invalidInputException = new InvalidInputException("----------Entered invalid id:-------------");
                throw invalidInputException;
            }
        } catch (ApplicationNotFoundException|InvalidInputException e){
            e.printStackTrace();
        }

        return app;
    }

    @Override
    public Application getApplicationByName(String appName) {
        Application app = null;

        System.out.println("Application Fetching using appName");
        try{
            for (Application application:applications) {
                if(application.getApplicationName().equals(appName)){
                    app = application;
                    System.out.println("Application found using app name---");
                }
            }
            if(app == null){
                ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("-----------------Application not found using app-name--------------");
                throw applicationNotFoundException;
            }
        }catch(ApplicationNotFoundException e){
            e.printStackTrace();
        }

        return app;
    }

    @Override
    public Application getApplicationByType(String appType) {

        Application app = null;

        System.out.println("Application Fetching using appType");
        try{
            for (Application application:applications) {
                if(application.getAppType().equals(appType)){
                    app = application;
                    System.out.println("Application found using app type---");
                }
            }
            if(app == null) {

                ApplicationNotFoundException applicationNotFoundException =
                        new ApplicationNotFoundException("--------------------Application not found with entered application type:---------------");
                throw applicationNotFoundException;
            }
        }catch (ApplicationNotFoundException e){
            e.printStackTrace();
        }
        return app;
    }

    @Override
    public String getApplicationNameByAppType(String appType) {
        String appName = "";

        System.out.println("Finding Application Name of the given type");
        try{
            for (Application application:applications) {
                if(application.getAppType().equals(appType)){
                    appName = application.getApplicationName();
                    System.out.println("Application name found using type---");
                }
            }
            if(appName == ""){
                    ApplicationNameNotFoundException applicationNameNotFoundException = new ApplicationNameNotFoundException("--------------Application name not found----------------");
                    throw applicationNameNotFoundException;
            }
        }catch(ApplicationNameNotFoundException e){
            e.printStackTrace();
        }

        return appName;
    }

    @Override
    public String getApplicationTypeByAppName(String appName) {
        String appType = "";

        System.out.println("Fetching Application Type Using Application Name");
        try{
            for (Application application:applications) {
                if(application.getApplicationName().equals(appName)){
                    appType = application.getAppType();
                    System.out.println("Application type found using app name---");
                }
            }
            if(appType==""){
                    ApplicationTypeNotFoundException applicationTypeNotFoundException = new ApplicationTypeNotFoundException("------------Can't get the type of application using app-name:------------");
                    throw applicationTypeNotFoundException;
            }
        }catch(ApplicationTypeNotFoundException e){
            e.printStackTrace();
        }
        return appType;
    }

    @Override
    public int getApplicationIdByName(String appName) {
        int appId = 0;

        try{
            for (Application application:applications) {
                if(application.getApplicationName().equals(appName)){
                    appId = application.getApplicationId();
                    System.out.println("Application id fetched using name---");
                }
            }

            if(appId == 0){
                    ApplicationIdNotFoundException applicationIdNotFoundException = new ApplicationIdNotFoundException("--------------------Id not found for entered application name----------------");
                    throw applicationIdNotFoundException;
            }
        }catch(ApplicationIdNotFoundException e){
            e.printStackTrace();
        }
        return appId;
    }

    @Override
    public double getApplicationSizeByAppName(String appName) {
        double appSize = 0.0;

        System.out.println("Finding Size of App using app name");
        try {
            for (Application application:applications) {
                if(application.getApplicationName().equals(appName)){
                    appSize = application.getAppSizeInMb();
                    System.out.println("Application size fetched using app name---");
                }
            }
            if(appSize == 0.0){
                ApplicationSizeNotFoundException applicationSizeNotFoundException =  new ApplicationSizeNotFoundException("---------------No size for entered app------------");
                throw applicationSizeNotFoundException;
            }
        }catch(ApplicationSizeNotFoundException e){
            e.printStackTrace();
        }
        return appSize;
    }

    @Override
    public String getApplicationCompanyNameByAppName(String appName) {
        String appCompanyName = "";

        System.out.println("Fetching Application Type Using Application Name");
        try{
            for (Application application:applications) {
                if(application.getApplicationName().equals(appName)){
                    appCompanyName = application.getCompanyName();
                    System.out.println("Application company found using app name---");
                }
            }

            if(appCompanyName == ""){
                    ApplicationCompanyNotFoundException applicationCompanyNotFoundException = new ApplicationCompanyNotFoundException("-----------Company name not found-------------");
                    throw applicationCompanyNotFoundException;
            }
        }catch(ApplicationCompanyNotFoundException e){
            e.printStackTrace();
        }
        return appCompanyName;
    }

    @Override
    public boolean updateApplicationVersionByAppName(String appName, String updatedVersion) {
        boolean isVersionUpdated = false;

        System.out.println("Searching for a given application to update");
        try{
            for (Application application:applications) {
                if(application.getApplicationName().equals(appName)){
                    application.setAppVersion(updatedVersion);
                    System.out.println("Application application version updated successfully using app name");
                    isVersionUpdated = true;
                }
            }
            if(isVersionUpdated == false){
                    ApplicationVersionUpdationFailedException applicationVersionUpdationFailedException = new ApplicationVersionUpdationFailedException("-----------version not updated:-----------");
                    throw applicationVersionUpdationFailedException;
            }
        }catch(ApplicationVersionUpdationFailedException e){
            e.printStackTrace();
        }
        return isVersionUpdated;
    }

//    @Override
//    public boolean updateAppCompanyNameById(int appId, String updateCompanyName) {
//
//        boolean isUpdated = false;
//
//        System.out.println("Searching for a given application to update");
//        for (int index = 0; index < this.application.length; index++) {
//            if(application[index].getApplicationId() == appId){
//                application[index].setCompanyName(updateCompanyName);
//                System.out.println("Application Company name updated successfully using app id");
//                isUpdated = true;
//            }
//        }
//        return isUpdated;
//    }

//    @Override
//    public boolean updateAppVersionAndSizeByAppName(String appName, String updatedVersion, double newVersionSize) {
//        boolean isUpdated = false;
//
//        for (int index = 0; index < this.application.length; index++) {
//            if(application[index].getApplicationName().equals(appName)){
//                application[index].setAppVersion(updatedVersion);
//                application[index].setAppSizeInMb(newVersionSize);
//                System.out.println("Application version and size is updated successfully");
//                isUpdated = true;
//            }
//        }
//        return isUpdated;
//    }

    @Override
    public boolean updateCompaniesNameByOldCompanyName(String oldCompanyName, String newCompanyName) {
        boolean isUpdated = false;
        int count = 0;
        try {
            for (Application application:applications) {
                if (application.getCompanyName().equals(oldCompanyName)) {
                    application.setCompanyName(newCompanyName);
                    ++count;
                }
            }
            if (count >= 1) {
                isUpdated = true;
                System.out.println("--------Company updated successfully------");
            }
            else{
                ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("--------------No applications are present having entered--------------- ");
                throw applicationNotFoundException;
            }
        }catch(ApplicationNotFoundException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public void deleteApplicationByAppName(String appName) {
        System.out.println();
        System.out.println("Invoked deleteApplicationByAppName");
//        int index , newIndex;
        boolean isDeleted = false;
        try{
            if(applications.size()>0){
                for (Application application:applications) {
                    if(application.getApplicationName().equals(appName)){
                        applications.remove(application);

                        isDeleted = true;
                        System.out.println("Application deleted successfully----");
                    }
                }
                System.out.println("Applications after deletion are --- ");
                for (Application application:applications
                     ) {
                    System.out.println(application);
                }
//                for (index = 0,newIndex = 0; index < this.application.length; index++) {
//                    if(!application[index].getApplicationName().equals(appName)){
//                        application[newIndex++] = application[index];
//                    }
//                    else{
//                        System.out.println("The given application is deleted successfully and it's details are :");
//                        System.out.println(application[index].getApplicationId()+ "   " +application[index].getApplicationName());
//                        isDeleted = true;
//                        break;
//                    }
//                }
//                application = Arrays.copyOf(application,newIndex);
                if(isDeleted == false){
                    ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("-----------Application deletion failed---------");
                    throw applicationNotFoundException;
                }
            }
            else{
                ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("-------------No applications to delete---------");
                throw applicationNotFoundException;
            }
        }catch(ApplicationNotFoundException e){
            e.printStackTrace();
        }
    }

}
