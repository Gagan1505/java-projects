package com.xworkz.jpatask.boot.trafficfine;

import com.xworkz.jpatask.entity.ShopEntity;
import com.xworkz.jpatask.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineEntityInsertRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        System.out.println("Transaction creation");
        EntityTransaction et = em.getTransaction();
        System.out.println(("ET : "+et));
        et.begin();

        System.out.println("Inserting a record");
        TrafficFineEntity trafficFineEntity = new TrafficFineEntity(111,"No Helmet","KA17EM2001","Amruth",500.00);
        em.persist(trafficFineEntity);

        et.commit();
        System.out.println("Committed");

        System.out.println("Closing EM,EMF :");
        em.close();
        emf.close();

    }
}
