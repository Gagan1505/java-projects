package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.hub.SoftwareHub;
import com.xworkz.playstoreapp.hub.impl.PlaystoreImpl;

import java.util.*;

public class AppExecutor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of applications to be added :");
        int appsCount = scanner.nextInt();

        SoftwareHub softwareHubNew = new PlaystoreImpl();

        for (int i = 0; i < appsCount; i++) {
            Application applications = new Application();

            System.out.println("Enter the app name");
            applications.setApplicationName(scanner.next());

            System.out.println("Enter the app company name");
            applications.setCompanyName(scanner.next());

            System.out.println("Enter the app version");
            applications.setAppVersion(scanner.next());

            System.out.println("Enter the app size");
            applications.setAppSizeInMb(scanner.nextDouble());

            System.out.println("Enter the app type");
            applications.setAppType(scanner.next());

            System.out.println("Enter the app release date");
            applications.setReleaseYear(scanner.next());

            softwareHubNew.addApplications(applications);
        }

        String input = null;
        do{
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Press");
            System.out.println(" 1. To fetch the details of all applications.");
            System.out.println(" 2. To fetch the details of application using app id");
            System.out.println(" 3. To fetch the details of application using app name");
            System.out.println(" 4. To fetch the details of application using app type");
            System.out.println(" 5. To fetch the application name using app type");
            System.out.println(" 6. To fetch the application type using app name");
            System.out.println(" 7. To fetch the application id using app name");
            System.out.println(" 8. To fetch the application size using app name");
            System.out.println(" 9. To update/change the company name of all applications having the old company name to newer one");
            System.out.println(" 10. To delete an application  using app name");
            System.out.println(" 11. To add a new application");
            int options  = scanner.nextInt();

            try {
                switch (options) {
                    case 1:
                        softwareHubNew.getApplications();
                        break;

                    case 2:
                        System.out.println("Provide an id of an application to be searched");
                        scanner.nextLine();
                        Application app3 = softwareHubNew.getApplicationById(scanner.nextInt());
                        System.out.println(app3.toString());
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Enter the name of the application to be searched :");
                        Application app1 = softwareHubNew.getApplicationByName(scanner.next());
                        System.out.println(app1.toString());
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Enter the type of an application to find :");
                        Application app2 = softwareHubNew.getApplicationByType(scanner.next());
                        System.out.println(app2.toString());
                        System.out.println();
                        break;

                    case 5:
                        System.out.println("Provide the Type of an application to get it's name");
                        String appName1 = softwareHubNew.getApplicationNameByAppType(scanner.next());
                        System.out.println("Application Type of the Given AppName is: " + appName1);
                        System.out.println();
                        break;

                    case 6:
                        System.out.println("Enter the application name to find it's type");
                        String appType2 = softwareHubNew.getApplicationTypeByAppName(scanner.next());
                        System.out.println("Application Type of the Given AppName is: " + appType2);
                        System.out.println();
                        break;

                    case 7:
                        System.out.println("Enter the Application name to get it's id:");
                        int appId = softwareHubNew.getApplicationIdByName(scanner.next());
                        System.out.println("Application Id of the given application name is:  " + appId);
                        System.out.println();
                        break;

                    case 8:
                        System.out.println("Enter the app name to get it's size in MB");
                        double appSize = softwareHubNew.getApplicationSizeByAppName(scanner.next());
                        System.out.println("Size of the given Application is: " + appSize);
                        System.out.println();
                        break;

                    case 9:
                        System.out.println("Enter the old name and the new name of a company to change:");
                        softwareHubNew.updateCompaniesNameByOldCompanyName(scanner.next(), scanner.next());
                        break;

                    case 10:
                        System.out.println("Enter the application name that you want to delete: ");
                        softwareHubNew.deleteApplicationByAppName(scanner.next());
                        break;

                    case 11:Application applications1 = new Application();
                        System.out.println("Enter the app name");
                        applications1.setApplicationName(scanner.next());

                        System.out.println("Enter the app company name");
                        applications1.setCompanyName(scanner.next());

                        System.out.println("Enter the app version");
                        applications1.setAppVersion(scanner.next());

                        System.out.println("Enter the app size");
                        applications1.setAppSizeInMb(scanner.nextDouble());

                        System.out.println("Enter the app type");
                        applications1.setAppType(scanner.next());

                        System.out.println("Enter the app release date");
                        applications1.setReleaseYear(scanner.next());

                        softwareHubNew.addApplications(applications1);
                        break;

                    default:
                        System.out.println("----- Invalid option --------- Please Enter a valid option ----------");

                }
            }catch(NullPointerException e){
                System.out.println("--------------Cannot access null object------------");
                e.printStackTrace();
            }

            System.out.println("Do you want to continue : Y/N ");
            input = scanner.next();

        }while(input.equals("Y"));

        System.out.println("Thank for using our app !! -----Visit again !!!!!!!!!");

    }
}
