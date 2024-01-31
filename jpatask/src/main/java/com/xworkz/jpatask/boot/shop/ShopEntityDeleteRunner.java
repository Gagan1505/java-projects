package com.xworkz.jpatask.boot.shop;

import com.xworkz.jpatask.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopEntityDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        System.out.println("Transaction creation");
        EntityTransaction et = em.getTransaction();
        System.out.println(("ET : "+et));
        et.begin();

        ShopEntity shopEntity = em.find(ShopEntity.class,1);
        if(shopEntity != null){
            em.remove(shopEntity);
            System.out.println("Deletion successfull");
        }

        et.commit();
        System.out.println("Committed");

        System.out.println("Closing EM,EMF :");
        em.close();
        emf.close();
    }
}
