package com.xworkz.touristapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
    private static EntityManagerFactory managerFactory;

    public static EntityManagerFactory getManagerFactory(){
        return managerFactory;
    }

    static{
        System.out.println("Creating EMF using EMFUtil");
        managerFactory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After EMF Util");
    }
}
