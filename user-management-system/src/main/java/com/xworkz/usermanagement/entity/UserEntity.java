package com.xworkz.usermanagement.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@NamedQueries({
        @NamedQuery(name = "updateUser", query = "update UserEntity u set u.userName=:name,u.email=:email,u.age=:age,u.phoneNumber=:phone where u.userId=:id"),
        @NamedQuery(name = "getAllUsers", query = "select u from UserEntity u"),
        @NamedQuery(name = "deleteUserById",query = "delete from UserEntity u where u.userId=:id")
})

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private int userId;

    @Column(name = "u_name")
    @NotNull
    private String userName;

    @Column(name = "u_email")
    @NotNull
    private String email;

    @Column(name = "u_age")
    @NotNull
    private int age;

    @Column(name = "u_phoneNumber")
    @NotNull
    private long phoneNumber;

    @Column(name = "u_password")
    @NotNull
    private String password;

    public  UserEntity(String userName,String email,int age,long phoneNumber,String password){
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public  UserEntity(int id,String userName,String email,int age,long phoneNumber) {
        this.userId = id;
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
