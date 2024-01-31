package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        EntityTransaction et = em.getTransaction();

        et.begin();

        System.out.println("Updation operation start");
        SuperHeroEntity superHeroEntity = em.find(SuperHeroEntity.class,1);
        if(superHeroEntity != null){
            superHeroEntity.setPower("Ego");
            em.merge(superHeroEntity);
            System.out.println("Updation successfull");
        }
        System.out.println("Operation end");

        et.commit();
        System.out.println("Committed updation");

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
