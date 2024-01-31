package com.xworkz.fertilizer.repository.impl;

import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.repository.interfaces.EmailRepository;

import javax.persistence.*;

public class EmailRepositoryImpl implements EmailRepository {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer saveMail(EmailEntity email) {
        System.out.println("Invoking saveMail to save : "+email);
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            System.out.println("Transaction begin");
            transaction.begin();

            System.out.println("Saving new mail in mail box");
            manager.persist(email);

            System.out.println("Transaction success");
            transaction.commit();

            return email.getEmailId();

        }catch(PersistenceException pe){
            System.err.println("Unsuccessfull transaction "+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("Finally block --- ");
            manager.close();
        }
        return null;
    }
}
