package com.xworkz.exceptionhandlingapp.exceptionexamples.User;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString

public class UserInfo {

    private int userId;
    private String firstName;
    private String lastName;
    private long phoneNumber;
}
