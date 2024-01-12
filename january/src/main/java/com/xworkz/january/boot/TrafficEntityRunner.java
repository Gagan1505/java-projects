package com.xworkz.january.boot;

import com.xworkz.january.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficEntityRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

        EntityManager em2 = emf.createEntityManager();
        System.out.println("EM : "+em2);
        System.out.println("Creating transaction");
        EntityTransaction et2 = em2.getTransaction();
        System.out.println("Transaction begin");
        et2.begin();
        System.out.println("Starting operation");
        TrafficEntity trafficEntity = new TrafficEntity(1,"Gundi",40,"Davanagere","Karnataka");
        em2.persist(trafficEntity);
        System.out.println("Completed operation");
        et2.commit();
        System.out.println("ET2 commit : "+et2);
        System.out.println("Closing EM,EMF  ");

        em2.close();
        emf.close();
    }
}
