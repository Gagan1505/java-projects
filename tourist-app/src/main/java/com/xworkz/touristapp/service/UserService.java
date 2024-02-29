package com.xworkz.touristapp.service;

import com.xworkz.touristapp.entity.UserEntity;

import java.util.List;

public interface UserService {

    void validateAndSaveUser(UserEntity user);

    UserEntity validateAndGetUserById(int id);

    List<UserEntity> validateAndGetAllUsers();

    void validateAndUpdateUser(UserEntity user);

    void validateAndDeleteUserById(int id);
}
