package com.xworkz.policestationapp;

import com.xworkz.policestationapp.officer.Officer;
import com.xworkz.policestationapp.policestation.PoliceStation;
import com.xworkz.policestationapp.policestation.impl.RajajinagarStationImpl;

import java.util.Scanner;

public class OfficerExecutor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of officers to add : ");
        int officerCount = scanner.nextInt();

        PoliceStation station = new RajajinagarStationImpl(officerCount);
        for(int i=0; i<officerCount; i++){
            Officer officers = new Officer();

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

            try {
                switch (choice) {
                    case 1:
                        station.getAllOfficers();
                        break;

                    case 2:
                        System.out.println("Enter the officer's id to get details : ");
                        Officer officerNew = station.getOfficerInfoById(scanner.nextInt());
                        System.out.println(officerNew.getOfficerId() +
                                "  " + officerNew.getOfficerName() +
                                "  " + officerNew.getOfficerPostName());
                        break;

                    case 3:
                        System.out.println("Enter the officer's id to get their name : ");
                        String officerName = station.getOfficerNameById(scanner.nextInt());
                        System.out.println("Name is : " + officerName);
                        break;

                    case 4:
                        System.out.println("Enter the officer's id to get their post-name : ");
                        String postName = station.getPostNameByOfficerId(scanner.nextInt());
                        System.out.println("Post name : " + postName);
                        break;

                    case 5:
                        System.out.println("Enter officer's name to get their age : ");
                        int officerAge = station.getOfficerAgeByOfficerName(scanner.next());
                        System.out.println("Age is : " + officerAge);
                        break;

                    case 6:
                        System.out.println("Enter the officer's id to get their address : ");
                        String officerAddress = station.getOfficerAddressById(scanner.nextInt());
                        System.out.println("Address is : " + officerAddress);
                        break;

                    case 7:
                        System.out.println("Enter the post-name to know all officers names working in that post : ");
                        String allOfficers[] = station.getOfficersNameByPostName(scanner.next());
                        for (int i = 0; i < allOfficers.length; i++) {
                            if (allOfficers[i] != null)
                                System.out.println(allOfficers[i]);
                        }
                        break;

                    case 8:
                        System.out.println("Enter officer's name and new post-name to update : ");
                        station.updateOfficerPostNameByOfficerName(scanner.next(), scanner.next());
                        break;

                    case 9:
                        System.out.println("Enter the officer's id to delete their details : ");
                        station.deleteOfficerById(scanner.nextInt());
                        break;

                    default:
                        System.out.println("--------Please enter a valid choice from above choices ------------");
                }
            }catch(NullPointerException e){
                System.out.println("--------------------Cannot access null object-----------------------");
            }

            System.out.println("Do you want to continue?------- Y/N-");
            input = scanner.next();
        }while(input.equals("Y"));

        System.out.println("Thank you !!--------- VISIT AGAIN -----------");

    }
}
