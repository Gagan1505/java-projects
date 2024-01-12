package com.xworkz.january.boot;

import com.xworkz.january.entity.ActorEntity;
import com.xworkz.january.entity.FestivalEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FestivalEntityRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        System.out.println("Creating transaction");
        EntityTransaction et = em.getTransaction();
        System.out.println("ET : "+et);

        et.begin();
        System.out.println("tx begin ");
        System.out.println("Starting operation");
        FestivalEntity festivalEntity = new FestivalEntity(1,"Dasara","Ambaari","Chamundeshwari","Karnataka");
        em.persist(festivalEntity);
        System.out.println("Completed operation");

        et.commit();
        System.out.println("TX Commit");

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
