package com.xworkz.touristapp.repository;

import com.xworkz.touristapp.entity.UserEntity;
import com.xworkz.touristapp.util.EMFUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    EntityManagerFactory factory = EMFUtil.getManagerFactory();
    public void saveUser(UserEntity user) {

        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("Invoked Repo.saveUser");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            System.out.println("Saving the user info");
            transaction.begin();
            manager.persist(user);
            transaction.commit();
            System.out.println("Saved user info successfully");
        }catch(PersistenceException pe){
            System.err.println("Error occurred in saving the record"+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("Repo.saveUser finally block");
            manager.close();
        }
    }

    public UserEntity getUserById(int id) {
        UserEntity user = new UserEntity();
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("Invoked Repo.getUserById");

        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("finding the user");
            user = manager.find(UserEntity.class,id);
        }catch(PersistenceException pe){
            System.err.println("Error in finding"+pe.getMessage());
        }finally{
            System.out.println("Repo.getUserById finally block");
            manager.close();
        }
        return user;
    }

    public List<UserEntity> getAllUsers() {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("Invoked Repo.getAllUsers");
        List<UserEntity> users = new ArrayList<UserEntity>();

        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("Searching details");
            Query query = manager.createNamedQuery("getAllUsers");
            users = query.getResultList();
            System.out.println(users);
        }catch(PersistenceException pe){
            System.out.println("Error occurred "+pe.getMessage());
        }finally{
            System.out.println("Repo.getAllUsers finally block");
            manager.close();
        }
        return users;
    }

    public void updateUser(UserEntity user) {

        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("Invoked Repo.updateUserById");
        System.out.println(user);
        EntityManager manager = this.factory.createEntityManager();
        manager.getTransaction().begin();
        try{
            System.out.println("Updating the user info");

            Query query = manager.createNamedQuery("updateUserById");

            query.setParameter("name",user.getUserName());
            query.setParameter("email",user.getUserEmail());
            query.setParameter("address",user.getUserAddress());
            query.setParameter("age",user.getUserAge());
            query.setParameter("phone",user.getUserPhoneNumber());
            query.setParameter("id",user.getUserId());
            int rowsAffected = query.executeUpdate();
            System.out.println(rowsAffected);

            manager.getTransaction().commit();
            System.out.println("Updated user info successfully");
        }catch(PersistenceException pe){
            System.err.println("Error occurred in saving the record"+pe.getMessage());
            manager.getTransaction().rollback();
        }finally {
            System.out.println("Repo.updateUserById finally block");
            manager.close();
        }
    }

    public void deleteUserById(int id) {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("Invoked Repo.deleteUserById");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            System.out.println("Saving the user info");
            transaction.begin();
            UserEntity user = manager.find(UserEntity.class,id);
            manager.remove(user);
            transaction.commit();
            System.out.println("Saved user info successfully");
        }catch(PersistenceException pe){
            System.err.println("Error occurred in saving the record"+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("Repo.saveUser finally block");
            manager.close();
        }

    }
}
