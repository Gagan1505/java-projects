package com.xworkz.january.boot;

import com.xworkz.january.entity.FestivalEntity;
import com.xworkz.january.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanEntityRunner {
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
        OceanEntity oceanEntity = new OceanEntity(1,"Pacific Ocean","Below India",20020,7894);
        em.persist(oceanEntity);
        System.out.println("Completed operation");

        et.commit();
        System.out.println("TX Commit");

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
