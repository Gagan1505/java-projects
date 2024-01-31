package com.xworkz.jpatask.boot.sport;

import com.xworkz.jpatask.entity.ShopEntity;
import com.xworkz.jpatask.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportEntityUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        System.out.println("Transaction creation");
        EntityTransaction et = em.getTransaction();
        System.out.println(("ET : "+et));
        et.begin();

        SportEntity sportEntity = em.find(SportEntity.class,1);
        if(sportEntity != null){
            sportEntity.setCaptainName("Virat Kohli");
            System.out.println("Updation successfull");
        }

        et.commit();
        System.out.println("Committed");

        System.out.println("Closing EM,EMF :");
        em.close();
        emf.close();
    }
}
