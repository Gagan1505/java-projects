package com.xworkz.studentsapp.classroom;
import com.xworkz.studentsapp.exceptions.NoStudentsFoundException;
import com.xworkz.studentsapp.exceptions.NoStudentPresentException;
import com.xworkz.studentsapp.exceptions.StudentNullPointerException;
import com.xworkz.studentsapp.exceptions.UpdationFailedException;
import com.xworkz.studentsapp.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoom {

    List<Student> students = new ArrayList<>();
    public ClassRoom(){

    }

    int index = 0;

    public boolean addStudentDetails(Student student){

        boolean isAdded = false;
        try {
            if (student != null) {
                students.add(student);
                isAdded = true;
                System.out.println("Student details added successfully");
            }else {
                throw new StudentNullPointerException();
            }
        }catch(StudentNullPointerException e){
            e.printStackTrace();
        }
        return isAdded;
    }

    public void getAllStudentsDetails(){
        try{
            if(students.size() > 0){
                for(Student student : students){
                    System.out.println(student);
                }
            }else {
                throw new NoStudentsFoundException();
            }
        }catch(NoStudentsFoundException e){
            e.printStackTrace();
        }
    }

    public Student getStudentInfoById(int studentId){
        Student newStudent = null;

        try{
            if(students.size() > 0){
                for (Student student : students){
                    if(student.getStudentId() == studentId){
                        newStudent = student;
                    }else{
                        throw new NoStudentPresentException("given Id");
                    }
                }
            }else{
                throw new NoStudentsFoundException();
            }
        }catch(NoStudentsFoundException | NoStudentPresentException e){
            e.printStackTrace();
        }

        return newStudent;
    }

    public boolean updateStudentClassById(int studentId, int newClassName){
        boolean isUpdated = false;
        try{
            if(students.size() > 0){
                for (Student student : students){
                    if(student.getStudentId() == studentId){
                        student.setClassRoom(newClassName);
                        isUpdated = true;
                        System.out.println("Updation done successfully");
                    }else{
                        throw new UpdationFailedException();
                    }
                }
            }else{
                throw new NoStudentsFoundException();
            }
        }catch(UpdationFailedException | NoStudentsFoundException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    public void deleteStudentDetailsByName(String studentName){

        try{
            if (students.size() > 0){
                for (Student student : students){
                    if(student.getStudentName().equals(studentName)){
                        System.out.println("Details of deleted students are :");
                        System.out.println(student);
                        students.remove(student);
                    }else{
                        throw new NoStudentPresentException("with entered name ------");
                    }
                }
            }else{
                throw new NoStudentsFoundException();
            }
        }catch(NoStudentsFoundException | NoStudentPresentException e){
            e.printStackTrace();
        }
    }
}
