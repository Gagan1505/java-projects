package com.xworkz.january.boot;

import com.xworkz.january.entity.FilmEntity;
import com.xworkz.january.entity.ResumeEntity;
import com.xworkz.january.entity.SuperHeroEntity;
import com.xworkz.january.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
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
        SuperHeroEntity superHeroEntity = new SuperHeroEntity(1,"Yash","Rocky Bhai","Gold","India","Mother");
        em.persist(superHeroEntity);
        System.out.println("Completed operation");

        et.commit();
        System.out.println("TX Commit");

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();

// emf -> em -> transaction(tx) -> tx.begin() -> entity(dto) creation -> persisting the entity -> tx.commit() -> em.close() -> emf.close()

    }
}
