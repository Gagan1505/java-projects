package com.xworkz.usermanagement.service;

import com.xworkz.usermanagement.entity.UserEntity;
import com.xworkz.usermanagement.repository.UserRepository;
import com.xworkz.usermanagement.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    UserRepository repo = new UserRepositoryImpl();
    public void validateAndSave(UserEntity entity) {

        if(entity!=null && entity.getUserName()!=null && entity.getAge()!=0 ){
            System.out.println("Saving the " +
                    "record");
            repo.saveUser(entity);
        }else{
            System.out.println("Entered a wrong value");
        }
    }

    public List<UserEntity> validateAndGetAllUsers() {
        return repo.getAllUsers();
    }

    public UserEntity validateAndGetUserById(int id) {
        return repo.getUserById(id);
    }

    public void validateAndUpdateUser(UserEntity user) {
        this.repo.updateUserById(user);
    }

    public void validateAndDeleteUserById(int id) {
        this.repo.deleteUserById(id);
    }

}
