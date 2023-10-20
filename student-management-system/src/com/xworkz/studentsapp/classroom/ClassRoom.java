package com.xworkz.studentsapp.classroom;
import com.xworkz.studentsapp.student.Student;

import java.util.Arrays;

public class ClassRoom {

    Student students[] ;
    public ClassRoom(int studentsCount){
        students = new Student[studentsCount];
    }

    int index = 0;

    public boolean addStudentDetails(Student student){

        boolean isAdded = false;
        if(student != null){
            students[index++] = student;
            isAdded = true;
            System.out.println("Student details added successfully");
        }
        return isAdded;
    }

    public void getAllStudentsDetails(){
        for (int i = 0; i < this.students.length; i++) {
            System.out.println("ID: " + students[i].getStudentId() + "   Name: "
                    + students[i].getStudentName() + "   FatherName: "
                    + students[i].getStudentFatherName() + "   Class: "
                    + students[i].getClassRoom() + "   Section: "
                    + students[i].getSection() + "   Gender: "
                    + students[i].getStudentGender() + "   Blood Group: "
                    + students[i].getBloodGroup() + "   E-mail-id: "
                    + students[i].getEmailId() + "   Caste: "
                    + students[i].getStudentCaste() + "   Contact: "
                    + students[i].getContactNumber() + "   Address: "
                    + students[i].getAddress());
        }
    }

    public Student getStudentInfoById(int studentId){
        Student newStudent = null;

        for (int i = 0; i < this.students.length; i++) {
            if(students[i].getStudentId() == studentId){
                newStudent = students[i];
                System.out.println("Student Info found ---- visit executor ---");
            }
        }

        return newStudent;
    }

    public boolean updateStudentClassById(int studentId, int newClassName){
        boolean isUpdated = false;
        for (int i = 0; i < this.students.length; i++) {
            if(students[i].getStudentId() == studentId){
                students[i].setClassRoom(newClassName);
                System.out.println("Classroom updated successfully : ");
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public void deleteStudentDetailsByName(String studentName){

        int newIndex = 0;
        for (int i = 0; i < this.students.length; i++) {
            if(!students[i].getStudentName().equals(studentName)){
                students[newIndex++] = students[i];
            }
            else{
                System.out.println("Student deleted successfully : And details are --- ");
                System.out.println(" ID : " +students[i].getStudentId()+
                        "  Name : " +students[i].getStudentName()+
                        "  ClassRoom : " +students[i].getClassRoom()+
                        "  Section : " +students[i].getSection());
            }
        }

        students = Arrays.copyOf(students,newIndex);
    }
}
