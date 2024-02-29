package com.xworkz.touristapp.repository;

import com.xworkz.touristapp.entity.UserEntity;

import java.util.List;

public interface UserRepository {
    void saveUser(UserEntity user);

    UserEntity getUserById(int id);

    List<UserEntity> getAllUsers();

    void updateUser(UserEntity user);

    void deleteUserById(int id);
}
