package com.xworkz.usermanagement.repository;

import com.xworkz.usermanagement.entity.UserEntity;
import com.xworkz.usermanagement.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    EntityManagerFactory factory = EMFUtil.getManagerFactory();

    public void saveUser(UserEntity userEntity) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Invoked saveUser");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try{
            System.out.println("Transaction begin");
            transaction.begin();

            System.out.println("Starting the operation");
            manager.persist(userEntity);
            System.out.println("Starting the operation");

            System.out.println("Transaction commit");
            transaction.commit();

        }catch(PersistenceException pe){
            System.err.println("Failed to save the user------"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("saveUser finally block-----");
            manager.close();
        }
    }

    public List<UserEntity> getAllUsers() {
        List<UserEntity> entities = null;

        EntityManager manager = this.factory.createEntityManager();
        try{
            Query query = manager.createNamedQuery("getAllUsers");
            entities = query.getResultList();
        }catch(PersistenceException pe){
            System.err.println("Cannot fetch details"+ pe.getMessage());
        }finally{
            System.out.println("getAllUsers finally block");
            manager.close();
        }
        return entities;
    }

    public UserEntity getUserById(int id) {
        UserEntity user = null;
        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("Get User by id method ---");
            user = manager.find(UserEntity.class,id);
            System.out.println("After the operation");
        }catch(PersistenceException pe){
            System.err.println("Fetching failed ---- "+pe.getMessage());
        }finally{
            System.out.println("GetUser BY Id finally block");
            manager.close();
        }
        return user;
    }

    public void updateUserById(UserEntity user) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Invoked updateUserById");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try{
            System.out.println("Transaction begin");
            transaction.begin();

            System.out.println("Starting updateUserById");
            Query query = manager.createNamedQuery("updateUser");
            query.setParameter("name",user.getUserName());
            query.setParameter("email",user.getEmail());
            query.setParameter("age",user.getAge());
            query.setParameter("phone",user.getPhoneNumber());
            query.setParameter("id",user.getUserId());

            query.executeUpdate();
            System.out.println("Ending updateUserById");

            System.out.println("Transaction commit");
            transaction.commit();
            System.out.println("Successfully updated the values-------------");

        }catch(PersistenceException pe){
            System.err.println("Failed to update the user------"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("updateUser finally block-----");
            manager.close();
        }
    }

    public void deleteUserById(int id) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Invoked deleteUserById");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try{
            System.out.println("Transaction begin");
            transaction.begin();

            System.out.println("Starting deleteUserById");
            Query query = manager.createNamedQuery("deleteUserById");
            query.setParameter("id",id);
            query.executeUpdate();
            System.out.println("Ending deleteUserById");

            System.out.println("Transaction commit");
            transaction.commit();

            System.out.println("Successfully deleted");

        }catch(PersistenceException pe){
            System.err.println("Failed to delete the user------"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("deleteUserById finally block-----");
            manager.close();
        }
    }
}
