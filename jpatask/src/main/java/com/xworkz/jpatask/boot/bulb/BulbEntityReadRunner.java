package com.xworkz.jpatask.boot.bulb;

import com.xworkz.jpatask.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BulbEntityReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        BulbEntity bulb = em.find(BulbEntity.class,1);
        if(bulb != null){
            System.out.println("Bulb details found : "+bulb);
        }

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
