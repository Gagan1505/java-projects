package com.xworkz.fertilizer.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
    //singleton design pattern.................
    private static EntityManagerFactory managerFactory;

    public static EntityManagerFactory getManagerFactory() {
        return managerFactory;
    }

    static{
        System.out.println("Creating emf in EMFUtil ");
        managerFactory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After creating emf with EMFUtil");
    }

}
