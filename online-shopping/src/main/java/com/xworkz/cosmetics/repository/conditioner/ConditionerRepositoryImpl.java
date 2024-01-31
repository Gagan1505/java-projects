package com.xworkz.cosmetics.repository.conditioner;

import com.xworkz.cosmetics.entity.ConditionerEntity;
import com.xworkz.cosmetics.util.EMFUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ConditionerRepositoryImpl implements ConditionerRepository{

    EntityManagerFactory factory = EMFUtil.getManagerFactory();

    @Override
    public void save(ConditionerEntity dto) {
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked save ------ ");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();
            System.out.println("Saving a record started");
            manager.persist(dto);
            System.out.println("Committing the transaction");
            transaction.commit();
        }catch(PersistenceException pe){
            System.err.println("Saving the record failed!!!!!"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("-------- Save method's finally block ------ ");
            manager.close();
        }
    }

    @Override
    public void saveList(List<ConditionerEntity> list) {
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked saveList ------ ");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            for(ConditionerEntity entity : list){
                transaction.begin();
                manager.persist(entity);
                transaction.commit();
            }
            System.out.println("---- Saved all records successfully -----");

        }catch(PersistenceException pe){
            System.err.println("Saving the record failed!!!!!"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("-------- saveList method's finally block ------ ");
            manager.close();
        }

    }

    @Override
    public void updateNetQuantityByBrand(String brand, double netQuantity) {
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked updateNetQuantityByBrand ------ ");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();
            Query query = manager.createNamedQuery("updateNetQuantityByBrand");
            query.setParameter("netQuantity",netQuantity);
            query.setParameter("brand",brand);
            query.executeUpdate();
            System.out.println("---- Updated successfully ----");
            transaction.commit();
        }catch(PersistenceException pe){
            System.err.println("Updating the record failed!!!!!"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("-------- updateNetQuantityByBrand method's finally block ------ ");
            manager.close();
        }
    }

    @Override
    public void updateUsesByBrand(String brand, String uses) {
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked updateUsesByBrand ------ ");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();
            Query query = manager.createNamedQuery("updateUsesByBrand");
            query.setParameter("uses",uses);
            query.setParameter("brand",brand);
            query.executeUpdate();
            System.out.println("---- Updated successfully ----");
            transaction.commit();
        }catch(PersistenceException pe){
            System.err.println("Updating the record failed!!!!!"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("-------- updateUsesByBrand method's finally block ------ ");
            manager.close();
        }
    }

    @Override
    public List<ConditionerEntity> findALlByBrand(String brand) {

        List<ConditionerEntity> conditioners = new ArrayList<>();
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked findALlByBrand ------ ");
        EntityManager manager = this.factory.createEntityManager();
        try{
            Query query = manager.createNamedQuery("findALlByBrand");
            query.setParameter("brand",brand);
            conditioners = query.getResultList();
            System.out.println("---- fetched details of all conditioners with brand : "+brand);
        }catch(PersistenceException pe){
            System.err.println("Fetching the record failed!!!!!"+pe.getMessage());
        }finally{
            System.out.println("-------- findALlByBrand method's finally block ------ ");
            manager.close();
        }
        return conditioners;
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String hairType) {

        List<ConditionerEntity> conditioners = new ArrayList<>();
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked findAllByHairType ------ ");
        EntityManager manager = this.factory.createEntityManager();
        try{
            Query query = manager.createNamedQuery("findAllByHairType");
            query.setParameter("hairType",hairType);
            conditioners = query.getResultList();
            System.out.println("---- fetched details of all conditioners with hair type : "+hairType);
        }catch(PersistenceException pe){
            System.err.println("Fetching the record failed!!!!!"+pe.getMessage());
        }finally{
            System.out.println("-------- findAllByHairType method's finally block ------ ");
            manager.close();
        }
        return conditioners;
    }

    @Override
    public String findScentById(int id) {
        String scent = "";
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked findScentById ------ ");
        EntityManager manager = this.factory.createEntityManager();
        try{
            Query query = manager.createNamedQuery("findScentById");
            query.setParameter("id",id);
            scent = (String)query.getSingleResult();
            System.out.println("---- fetched scent of id : "+id);
        }catch(PersistenceException pe){
            System.err.println("Fetching the record failed!!!!!"+pe.getMessage());
        }finally{
            System.out.println("-------- findScentById method's finally block ------ ");
            manager.close();
        }
        return scent;
    }

    @Override
    public List<Integer> getAllSize() {

        List<Integer> sizes = new ArrayList<>();
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked getAllSize ------ ");
        EntityManager manager = this.factory.createEntityManager();
        try{
            Query query = manager.createNamedQuery("getAllSize");
            sizes = query.getResultList();
            System.out.println("---- fetched size details of all conditioners ");
        }catch(PersistenceException pe){
            System.err.println("Fetching the record failed!!!!!"+pe.getMessage());
        }finally{
            System.out.println("-------- getAllSize method's finally block ------ ");
            manager.close();
        }
        return sizes;
    }

    @Override
    public List<String> getAllBrand() {

        List<String> brands = new ArrayList<>();
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------");
        System.out.println("----- Invoked getAllBrand ------ ");
        EntityManager manager = this.factory.createEntityManager();
        try{
            Query query = manager.createNamedQuery("getAllBrand");
            brands = query.getResultList();
            System.out.println("---- fetched all brands in table ------ ");
        }catch(PersistenceException pe){
            System.err.println("Fetching the record failed!!!!!"+pe.getMessage());
        }finally{
            System.out.println("-------- getAllBrand method's finally block ------ ");
            manager.close();
        }
        return brands;
    }
}
