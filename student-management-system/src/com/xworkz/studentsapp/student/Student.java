package com.xworkz.studentsapp.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private int studentId;
    private String studentName;
    private String studentFatherName;
    private int classRoom;
    private String section;
    private String studentGender;
    private String bloodGroup;
    private String emailId;
    private String studentCaste;
    private long contactNumber;
    private String address;

}
