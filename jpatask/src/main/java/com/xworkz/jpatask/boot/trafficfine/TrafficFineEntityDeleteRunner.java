package com.xworkz.jpatask.boot.trafficfine;

import com.xworkz.jpatask.entity.ShopEntity;
import com.xworkz.jpatask.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineEntityDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        System.out.println("Transaction creation");
        EntityTransaction et = em.getTransaction();
        System.out.println(("ET : "+et));
        et.begin();

        TrafficFineEntity trafficFineEntity = em.find(TrafficFineEntity.class,111);
        if(trafficFineEntity != null){
            em.remove(trafficFineEntity);
            System.out.println("Deletion successfull");
        }

        et.commit();
        System.out.println("Committed");

        System.out.println("Closing EM,EMF :");
        em.close();
        emf.close();
    }
}
