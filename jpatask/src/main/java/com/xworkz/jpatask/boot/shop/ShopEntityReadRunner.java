package com.xworkz.jpatask.boot.shop;

import com.xworkz.jpatask.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShopEntityReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        ShopEntity shopEntity = em.find(ShopEntity.class,1);
        if(shopEntity != null){
            System.out.println("Object found : ");
            System.out.println(shopEntity);
        }

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
