package com.xworkz.usermanagement.service;

import com.xworkz.usermanagement.entity.UserEntity;

import java.util.List;

public interface UserService {

    void validateAndSave(UserEntity entity);

    List<UserEntity> validateAndGetAllUsers();

    UserEntity validateAndGetUserById(int id);

    void validateAndUpdateUser(UserEntity user);

    void validateAndDeleteUserById(int id);
}
