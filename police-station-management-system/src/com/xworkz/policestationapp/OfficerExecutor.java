package com.xworkz.policestationapp;

import com.xworkz.policestationapp.officer.Officer;
import com.xworkz.policestationapp.policestation.PoliceStation;

import java.util.Scanner;

public class OfficerExecutor {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of officers to add : ");
        int officerCount = scanner.nextInt();

        PoliceStation station = new PoliceStation(officerCount);
        for(int i=0; i<officerCount; i++){
            Officer officers = new Officer();

//            System.out.println("Enter the officer " +(i+1)+ " id : ");
//            officers.setOfficerId(scanner.nextInt());

            System.out.println("Enter the officer " +(i+1)+ " name : ");
            officers.setOfficerName(scanner.next());

            System.out.println("Enter the officer " +(i+1)+ " age : ");
            officers.setOfficerAge(scanner.nextInt());

            System.out.println("Enter the officer " +(i+1)+ " gender : ");
            officers.setOfficerGender(scanner.next());

            System.out.println("Enter the officer " +(i+1)+ " blood group : ");
            officers.setBloodGroup(scanner.next());

            System.out.println("Enter the officer " +(i+1)+ " post name : ");
            officers.setOfficerPostName(scanner.next());

            System.out.println("Enter the officer " +(i+1)+ " mail-id : ");
            officers.setOfficerEmailId(scanner.next());

            System.out.println("Enter the officer " +(i+1)+ " address : ");
            officers.setOfficerAddress(scanner.next());

            station.addOfficer(officers);
        }

        String input = null;

        do{
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Enter");
            System.out.println("1. To get info of all officers : ");
            System.out.println("2. To get officer's details using officer's id : ");
            System.out.println("3. To get officer's name using officer's id : ");
            System.out.println("4. To get officer's post-name using officer's id : ");
            System.out.println("5. To get officer's age using officer's name : ");
            System.out.println("6. To get officer's address using officer's id : ");
            System.out.println("7. To get all officer's name serving in a similar post name : ");
            System.out.println("8. To update officer's post-name using officer's name : ");
            System.out.println("9. To delete officer's details using officer's id : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 : station.getAllOfficers();
                    break;

                case 2 : System.out.println("Enter the officer's id to get details : ");
                    Officer officerNew = station.getOfficerInfoById(scanner.nextInt());
                    System.out.println(officerNew.getOfficerId() +
                            "  " + officerNew.getOfficerName() +
                            "  "+ officerNew.getOfficerPostName());
                    break;

                case 3 : System.out.println("Enter the officer's id to get their name : ");
                    String officerName = station.getOfficerNameById(scanner.nextInt());
                    System.out.println("Name is : " +officerName);
                    break;

                case 4 : System.out.println("Enter the officer's id to get their post-name : ");
                    String postName = station.getPostNameByOfficerId(scanner.nextInt());
                    System.out.println("Post name : " +postName);
                    break;

                case 5 : System.out.println("Enter officer's name to get their age : ");
                    int officerAge = station.getOfficerAgeByOfficerName(scanner.next());
                    System.out.println("Age is : " +officerAge);
                    break;

                case 6 : System.out.println("Enter the officer's id to get their address : ");
                    String officerAddress = station.getOfficerAddressById(scanner.nextInt());
                    System.out.println("Address is : " +officerAddress);
                    break;

                case 7 : System.out.println("Enter the post-name to know all officers names working in that post : ");
                    String allOfficers[] = station.getOfficersNameByPostName(scanner.next());
                    for (int i = 0; i < allOfficers.length; i++) {
                        if(allOfficers[i] != null)
                            System.out.println(allOfficers[i]);
                    }
                    break;

                case 8 : System.out.println("Enter officer's name and new post-name to update : ");
                    station.updateOfficerPostNameByOfficerName(scanner.next(), scanner.next());
                    break;

                case 9 : System.out.println("Enter the officer's id to delete their details : ");
                    station.deleteOfficerById(scanner.nextInt());
                    break;

                default: System.out.println("--------Please enter a valid choice from above choices ------------");

            }

            System.out.println("Do you want to continue?------- Y/N-");
            input = scanner.next();
        }while(input.equals("Y"));

        System.out.println("Thank you !!--------- VISIT AGAIN -----------");

//        Officer officer1 = new Officer();
//        officer1.setOfficerId(1);
//        officer1.setOfficerName("Sachin");
//        officer1.setOfficerAge(34);
//        officer1.setOfficerGender("Male");
//        officer1.setBloodGroup("B +ve");
//        officer1.setOfficerPostName("SubInspector");
//        officer1.setOfficerEmailId("gagan123@gmail.com");
//        officer1.setOfficerAddress("Rajajinagara");
//
//        Officer officer2 = Officer.builder().
//                officerId(2).officerName("Manoj").
//                officerAge(37).officerGender("Male").
//                bloodGroup("B -ve").officerPostName("Head Constable").
//                officerEmailId("manoj2@yahoo.com").officerAddress("Majestic").build();
//
//        Officer officer3 = Officer.builder().
//                officerId(3).officerName("Santhosh").
//                officerAge(31).officerGender("Male").
//                bloodGroup("AB -ve").officerPostName("Head Constable").
//                officerEmailId("santhosh123@yahoo.com").officerAddress("Jayanagar").build();
//
//        Officer officer4 = Officer.builder().
//                officerId(4).officerName("Amruth").
//                officerAge(27).officerGender("Male").
//                bloodGroup("AB +ve").officerPostName("SubInspector").
//                officerEmailId("amruth123@yahoo.com").officerAddress("Jayanagar 4th block").build();
//
//        station.addOfficer(officer1);
//        station.addOfficer(officer2);
//        station.addOfficer(officer3);
//        station.addOfficer(officer4);
//
//        station.getOfficerNameById(1);
//        System.out.println();
//
//        System.out.println(station.getOfficerNameById(1));
//        System.out.println();
//
//        Officer officerNew = station.getOfficerInfoById(2);
//        System.out.println(officerNew.getOfficerId() +"  " + officerNew.getOfficerName() +"  "+ officerNew.getOfficerPostName());
//        System.out.println();
//
//        station.getOfficerAddressById(1);
//        System.out.println(station.getOfficerAddressById(1));
//        System.out.println();
//
//        String allOfficers[] = station.getOfficersNameByPostName("SubInspector");
//        for (int i = 0; i < allOfficers.length; i++) {
//            if(allOfficers[i] != null)
//                System.out.println(allOfficers[i]);
//        }
//        System.out.println();
//
//        System.out.println("All Officers before update are :");
//        station.getAllOfficers();
//        System.out.println();
//
//        station.updateOfficerPostNameByOfficerName("Sachin","PC");
//        System.out.println("All officers list before delete operation");
//        station.getAllOfficers();
//        System.out.println();
//
//        station.deleteOfficerById(2);
//        System.out.println("All officers list after delete operation");
//        station.getAllOfficers();

    }
}
