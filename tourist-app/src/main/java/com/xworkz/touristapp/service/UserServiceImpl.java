package com.xworkz.touristapp.service;

import com.xworkz.touristapp.entity.UserEntity;
import com.xworkz.touristapp.repository.UserRepository;
import com.xworkz.touristapp.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserRepository repo = new UserRepositoryImpl();
    public void validateAndSaveUser(UserEntity user) {
        repo.saveUser(user);
    }

    public UserEntity validateAndGetUserById(int id) {
        return this.repo.getUserById(id);
    }

    public List<UserEntity> validateAndGetAllUsers() {
        System.out.println("In service are : "+repo.getAllUsers());
        return repo.getAllUsers();
    }

    public void validateAndUpdateUser(UserEntity user) {
        this.repo.updateUser(user);
    }

    public void validateAndDeleteUserById(int id) {
        this.repo.deleteUserById(id);
    }
}
