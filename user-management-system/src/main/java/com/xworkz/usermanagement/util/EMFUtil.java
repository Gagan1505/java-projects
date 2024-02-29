package com.xworkz.usermanagement.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

    private static EntityManagerFactory managerFactory;
    public static EntityManagerFactory getManagerFactory(){
        return managerFactory;
    }
    static{
        System.out.println("creating Emf using EMFUtil");
        managerFactory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After creating EMFUtil");
    }
}
