package com.xworkz.january.boot;

import com.xworkz.january.entity.FilmEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FilmEntityRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

        EntityManager em1 = emf.createEntityManager();
        System.out.println("EM : "+em1);

        System.out.println("Creating transaction");
        EntityTransaction et1 = em1.getTransaction();
        System.out.println("ET : "+et1);

        et1.begin();
        System.out.println("transaction begin ");
        System.out.println("Starting operation");
        FilmEntity filmEntity = new FilmEntity(1,"A","Kannada","A","Upendra");
        em1.persist(filmEntity);
        System.out.println("Completed operation");

        et1.commit();
        System.out.println("TX Commit");

        System.out.println("Closing EM,EMF");
        em1.close();
        emf.close();

    }
}
