package com.xworkz.studentsapp.student;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

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
