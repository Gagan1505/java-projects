package com.xworkz.jpatask.boot.sport;

import com.xworkz.jpatask.entity.ShopEntity;
import com.xworkz.jpatask.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SportEntityReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        SportEntity sportEntity = em.find(SportEntity.class,1);
        if(sportEntity != null){
            System.out.println("Object found : ");
            System.out.println(sportEntity);
        }

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
