package com.xworkz.fertilizer.repository.impl;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.interfaces.FertilizerRepository;

import javax.persistence.*;

public class FertilizerRepositoryImpl implements FertilizerRepository {


    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");


    @Override
    public Integer save(FertilizerEntity entity) {
        System.out.println("Starting save method to save entity : "+entity);
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            System.out.println("Transaction start");
            entityTransaction.begin();
            System.out.println("Persisting entity");
            entityManager.persist(entity);
            System.out.println("Persist success");
            entityTransaction.commit();
            return entity.getId();
        }catch(PersistenceException pe){
            System.err.println("PersistenceException caught in save method  : "+pe.getMessage());
            entityTransaction.rollback();
        }
        finally {
            System.out.println("Closing manager in finally");
            entityManager.close();
        }
        return null;
    }
}
