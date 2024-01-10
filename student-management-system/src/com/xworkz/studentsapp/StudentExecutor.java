package com.xworkz.studentsapp;

import com.xworkz.studentsapp.classroom.ClassRoom;
import com.xworkz.studentsapp.student.Student;
import java.util.Scanner;

public class StudentExecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students to add : ");
        int studentCount = scanner.nextInt();
        ClassRoom classroom = new ClassRoom();

        for (int i = 0; i < studentCount; i++) {
            Student students = new Student();

            System.out.println("Enter the student "+(i+1)+" Id : ");
            students.setStudentId(scanner.nextInt());

            System.out.println("Enter the student "+(i+1)+" name : ");
            students.setStudentName(scanner.next());

            System.out.println("Enter the student's "+(i+1)+" father's name : ");
            students.setStudentFatherName(scanner.next());

            System.out.println("Enter the student "+(i+1)+" Classroom : ");
            students.setClassRoom(scanner.nextInt());

            System.out.println("Enter the student "+(i+1)+" section : ");
            students.setSection(scanner.next());

            System.out.println("Enter the student "+(i+1)+" gender : ");
            students.setStudentGender(scanner.next());

            System.out.println("Enter the student "+(i+1)+" blood group : ");
            students.setBloodGroup(scanner.next());

            System.out.println("Enter the student "+(i+1)+" email-id : ");
            students.setEmailId(scanner.next());

            System.out.println("Enter the student "+(i+1)+" caste : ");
            students.setStudentCaste(scanner.next());

            System.out.println("Enter the student "+(i+1)+" contact number : ");
            students.setContactNumber(scanner.nextLong());

            System.out.println("Enter the student "+(i+1)+" address : ");
            students.setAddress(scanner.next());

            classroom.addStudentDetails(students);
        }

        String input = null;
        do{
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter");
            System.out.println("1. To get details of all students ");
            System.out.println("2. To get details of a student using their student id ");
            System.out.println("3. To update student class room using their student id ");
            System.out.println("4. To delete student details having given id ");
            int option = scanner.nextInt();
            try {

                switch (option) {
                    case 1:
                        classroom.getAllStudentsDetails();
                        break;

                    case 2:
                        System.out.println("Enter the student id to get details : ");
                        Student newStudent = classroom.getStudentInfoById(scanner.nextInt());
                        System.out.println(newStudent);
                        break;

                    case 3:
                        System.out.println("Enter the student id and new class room to update : ");
                        classroom.updateStudentClassById(scanner.nextInt(), scanner.nextInt());
                        break;

                    case 4:
                        System.out.println("Enter the student id to delete : ");
                        classroom.deleteStudentDetailsByName(scanner.next());
                        break;

                    default:
                        System.out.println("INVALID INPUT --- Enter a valid option from above ");

                }
            }catch(NullPointerException e){
                e.printStackTrace();
            }
            System.out.println("Do you want to continue? --- Y/N ---");
            input = scanner.next();
        }while(input.equals("Y"));

        System.out.println("----- THANK YOU FOR USING!!! --- VISIT AGAIN ---");
    }

}
