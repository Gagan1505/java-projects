package com.xworkz.jpatask.boot.bulb;

import com.xworkz.jpatask.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbEntityInsertRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        EntityTransaction et = em.getTransaction();
        System.out.println("Transaction is : "+et);

        et.begin();
        System.out.println("Operation begin");
        BulbEntity bulbEntity = new BulbEntity(3,"Havells","No harmfull rays","CFL","12 Watts","Round","White","12 Volts",110);
        em.persist(bulbEntity);
        System.out.println("Operation end");

        et.commit();
        System.out.println("Committed transaction");

        System.out.println("Closing EM,EMF---");
        em.close();
        emf.close();
    }
}
