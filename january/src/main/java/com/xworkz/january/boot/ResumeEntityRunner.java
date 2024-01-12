package com.xworkz.january.boot;

import com.xworkz.january.entity.ResumeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ResumeEntityRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");

        EntityManager em3 = emf.createEntityManager();
        System.out.println("EM3 : "+em3);

        EntityTransaction et3 = em3.getTransaction();
        System.out.println("ET3 : "+et3);
        et3.begin();
        System.out.println("Transaction begin");
        System.out.println("Operation begin");
        ResumeEntity resumeEntity = new ResumeEntity(1,"Gagan","Bachelor's degree","UBDTCE","Fresher");
        em3.persist(resumeEntity);
        System.out.println("Operation completed");
        et3.commit();
        System.out.println("ET3 commit");

        System.out.println("closing EM3 : ");
        em3.close();
        emf.close();
    }
}
