package com.xworkz.touristapp.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tourist_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
        @NamedQuery(name = "getAllUsers",query = "select u from UserEntity u"),
        @NamedQuery(name = "updateUserById", query = "update UserEntity u set u.userName=:name,u.userEmail=:email,u.userAddress=:address,u.userAge=:age,u.userPhoneNumber=:phone where u.userId=:id")
})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tu_id")
    private int userId;

    @Column(name = "tu_name")
    @NotNull
    private String userName;

    @Column(name = "tu_email")
    @NotNull
    private String userEmail;

    @Column(name = "tu_address")
    @NotNull
    private String userAddress;

    @Column(name = "tu_age")
    @NotNull
    private int userAge;

    @Column(name = "tu_phoneNumber")
    @NotNull
    private long userPhoneNumber;

    @Column(name = "tu_password")
    @NotNull
    private String password;

    public UserEntity(String userName, String userEmail, String userAddress, int userAge, Long userPhoneNumber, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userAge = userAge;
        this.userPhoneNumber = userPhoneNumber;
        this.password = password;
    }

    public UserEntity(int userId, String userName, String userEmail, String userAddress, int userAge, long userPhoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userAge = userAge;
        this.userPhoneNumber = userPhoneNumber;
    }

}
