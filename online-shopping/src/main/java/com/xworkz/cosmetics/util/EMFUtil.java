package com.xworkz.cosmetics.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

    private static EntityManagerFactory managerFactory;

    public static EntityManagerFactory getManagerFactory(){
        return managerFactory;
    }
    static{
        System.out.println("Creating EMF in EMFuUtil");
        managerFactory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After creating EMF in EMFUtil");
    }
}
