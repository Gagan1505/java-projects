package com.xworkz.january.boot;

import com.xworkz.january.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyEntityExecutor {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);
        System.out.println("Creating transaction");

        EntityTransaction et = em.getTransaction();
        et.begin();

        System.out.println("Operation start");
        ToyEntity toyEntity = new ToyEntity(1,"Car","Red",45.890,"Plastic");
        em.persist(toyEntity);
        System.out.println("Operation end");

        et.commit();
        System.out.println("Committed transaction");


        System.out.println("Closing EM,EMF ");
        em.close();
        emf.close();
    }
}
