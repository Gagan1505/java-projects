package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        System.out.println("Delete operation start");
        SuperHeroEntity superHeroEntity = em.find(SuperHeroEntity.class,1);
        if(superHeroEntity != null){
            em.remove(superHeroEntity);
            System.out.println("Data deleted successfully");
        }

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
