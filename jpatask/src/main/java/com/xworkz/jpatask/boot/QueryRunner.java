package com.xworkz.jpatask.boot;

import com.xworkz.jpatask.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class QueryRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM : "+em);

//        Query query = em.createNamedQuery("findByBrand");
//        query.setParameter("bn","Phillips");
//
//        Object object = query.getSingleResult();
//
//        String lightColor = (String) object;
//        System.out.println("Bulb's light color is : ");
//        System.out.println(lightColor);

        Query query1 = em.createNamedQuery("findLightColorAndWattageByBrand");
        query1.setParameter("bn","Phillips");
        Object result = query1.getSingleResult();
        Object[] lightColorAndWattageByBrand = (Object[])result;
        System.out.println("Light color : "+lightColorAndWattageByBrand[0]+" --- Wattage : "+lightColorAndWattageByBrand[1]);

        Query query2 = em.createNamedQuery("findLightColorAndPriceByBrand");
        query2.setParameter("bn","Phillips");

        Object result1 = query2.getSingleResult();
        Object[] lightColorAndPriceByBrand = (Object[]) result1;
        System.out.println("Light color : "+lightColorAndPriceByBrand[0]+" --- Price : "+lightColorAndPriceByBrand[1]);

    }
}
