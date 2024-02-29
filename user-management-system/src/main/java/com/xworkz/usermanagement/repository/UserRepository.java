package com.xworkz.usermanagement.repository;

import com.xworkz.usermanagement.entity.UserEntity;

import java.util.List;

public interface UserRepository {

    void saveUser(UserEntity userEntity);

    List<UserEntity> getAllUsers();

    UserEntity getUserById(int id);

    void updateUserById(UserEntity user);

    void deleteUserById(int id);
}
