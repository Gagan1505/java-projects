package com.xworkz.jpatask.boot.trafficfine;

import com.xworkz.jpatask.entity.ShopEntity;
import com.xworkz.jpatask.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TrafficFineEntityReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

        TrafficFineEntity trafficFineEntity = em.find(TrafficFineEntity.class,111);
        if(trafficFineEntity != null){
            System.out.println("Object found : ");
            System.out.println(trafficFineEntity);
        }

        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
