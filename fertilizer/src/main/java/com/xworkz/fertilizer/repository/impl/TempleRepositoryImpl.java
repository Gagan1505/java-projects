package com.xworkz.fertilizer.repository.impl;

import com.xworkz.fertilizer.entity.TempleEntity;
import com.xworkz.fertilizer.repository.interfaces.TempleRepository;
import com.xworkz.fertilizer.util.EMFUtil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository {

    private EntityManagerFactory factory = EMFUtil.getManagerFactory();


    @Override
    public Integer saveTempleInfo(TempleEntity temple) {

        System.out.println("----Invoked saveTempleInfo -----------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            System.out.println("Saving the temple info ");
            transaction.begin();

            manager.persist(temple);

            System.out.println("Saved successfully");
            transaction.commit();
            return temple.getTempleId();

        }catch(PersistenceException pe){
            System.err.println("Saving failed --------- "+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("-----Save temple finally block-----");
            manager.close();
        }
        return null;
    }

    @Override
    public void saveAllTemples(List<TempleEntity> temples) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("----Invoked saveAllTemples -----------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            System.out.println("Saving the temples info ");
            for(TempleEntity temple: temples){
                transaction.begin();

                manager.persist(temple);

                System.out.println("Saved successfully");
                transaction.commit();
            }
        }catch(PersistenceException pe){
            System.err.println("Saving failed --------- "+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("-----SaveAll temples finally block-----");
            manager.close();
        }
    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        System.out.println("--------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------");
        System.out.println("----Invoked findAllByLocation -----------");
        EntityManager manager = this.factory.createEntityManager();
        List<TempleEntity> result = new ArrayList<>();

        try{
            System.out.println("Finding all temples's details ");
            Query query = manager.createNamedQuery("findAllByLocation");
            query.setParameter("location",location);

            result = query.getResultList();

            System.out.println("All temple's datails are fetched");

        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findAllByLocation temples finally block-----");
            manager.close();
        }
        return result;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(int fee) {
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findAllByEntryFeeGreaterThan -----------");
        EntityManager manager = this.factory.createEntityManager();
        List<TempleEntity> result = new ArrayList<>();

        try{
            System.out.println("Finding all temples's details using fee greater than entered fee");
            Query query = manager.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("fee",fee);

            result = query.getResultList();

            System.out.println("All temple's datails are fetched");

        }catch (PersistenceException pe){
            System.err.println("-----------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findAllByEntryFeeGreaterThan temples finally block-----");
            manager.close();
        }
        return result;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(int startFee, int endFee) {
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findAllByEntryFeeBetween -----------");
        EntityManager manager = this.factory.createEntityManager();
        List<TempleEntity> result = new ArrayList<>();

        try{
            System.out.println("Finding all temples's details using fee between given ranges of fees");
            Query query = manager.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("startFee",startFee);
            query.setParameter("endFee",endFee);

            result = query.getResultList();

            System.out.println("All temple's datails are fetched");

        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findAllByEntryFeeBetween temples finally block-----");
            manager.close();
        }
        return result;
    }

    @Override
    public List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date) {
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findAllByInaguratedDateGreaterThan -----------");
        EntityManager manager = this.factory.createEntityManager();
        List<TempleEntity> result = new ArrayList<>();

        try{
            System.out.println("Finding all temples's details using inagurated date between");
            Query query = manager.createNamedQuery("findAllByInaguratedDateGreaterThan");
            query.setParameter("date",date);

            result = query.getResultList();

            System.out.println("All temple's datails are fetched");

        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findAllByInaguratedDateGreaterThan temples finally block-----");
            manager.close();
        }
        return result;
    }

    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location) {
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findAllByMainGodAndLocation -----------");
        EntityManager manager = this.factory.createEntityManager();
        List<TempleEntity> result = new ArrayList<>();

        try{
            System.out.println("Finding all temples's details using main god worshipped and temple location");
            Query query = manager.createNamedQuery("findAllByMainGodAndLocation");
            query.setParameter("mainGod",mainGod);
            query.setParameter("location",location);

            result = query.getResultList();

            System.out.println("All temple's datails are fetched");
        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findAllByMainGodAndLocation temples finally block-----");
            manager.close();
        }
        return result;
    }

    @Override
    public TempleEntity findById(int id) {
        TempleEntity temple = null;
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findById -----------");
        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("Fetcheing details of temple with entered id : "+id);
            temple = manager.find(TempleEntity.class,id);

        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findById temples finally block-----");
            manager.close();
        }
        return temple;
    }

    @Override
    public TempleEntity findByIdAndMainGod(int id, String mainGod) {
        TempleEntity temple = null;
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findByIdAndMainGod -----------");
        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("Fetching details of temple with entered id : "+id+" and main god : "+mainGod);
            Query query = manager.createNamedQuery("findByIdAndMainGod");
            query.setParameter("id",id);
            query.setParameter("mainGod",mainGod);

            temple = (TempleEntity) query.getSingleResult();

        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findById temples finally block-----");
            manager.close();
        }
        return temple;
    }

    @Override
    public Long findTotal() {
        Long result = 0L;
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findTotal -----------");
        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("Fetching count(Number) of temples present in the table");
            Query query = manager.createNamedQuery("findTotal");

            result= (Long) query.getSingleResult();

        }catch (PersistenceException pe){
            System.err.println("---------Fetching count failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findTotal temples finally block-----");
            manager.close();
            System.out.println("--------------------------------------------------------------------------" +
                    "--------------------------------------------------------------------------------");
        }
        return result;
    }

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        TempleEntity temple = null;
        System.out.println("-------------------------------------------------------------------------" +
                "------------------------------------------------------------------");
        System.out.println("----Invoked findTempleByMaxEntryFee -----------");
        EntityManager manager = this.factory.createEntityManager();
        try{
            System.out.println("Fetching details of temple having maximum entry fee");
            Query query = manager.createNamedQuery("findTempleByMaxEntryFee");

            temple = (TempleEntity) query.getSingleResult();

        }catch (PersistenceException pe){
            System.err.println("---------Fetching details failed --------- "+pe.getMessage());
        }finally{
            System.out.println("-----findTempleByMaxEntryFee temples finally block-----");
            manager.close();
        }
        return temple;
    }

    @Override
    public void updateLocationByName(String location, String name) {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("-------------- Invoked updateLocationByName--------------------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();

            Query query = manager.createNamedQuery("updateLocationByName");
            query.setParameter("location",location);
            query.setParameter("name",name);
            if(query.executeUpdate() != 0){
                System.out.println("----- Updation successfull ----");
            }

            transaction.commit();

        }catch(PersistenceException pe){
            System.err.println("Updation failed ---- "+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("updateLocationByName finally block --------------------");
            manager.close();
        }
    }

    @Override
    public void updateEntryFeeByName(int fee, String name) {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("-------------- Invoked updateEntryFeeByName--------------------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();

            Query query = manager.createNamedQuery("updateEntryFeeByName");
            query.setParameter("fee",fee);
            query.setParameter("name",name);
            if(query.executeUpdate() != 0){
                System.out.println("----- Updation successfull ----");
            }

            transaction.commit();

        }catch(PersistenceException pe){
            System.err.println("Updation failed ---- "+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("updateEntryFeeByName finally block --------------------");
            manager.close();
        }
    }

    @Override
    public void updateLocationAndDimensionById(String location, int dimension, int id) {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("-------------- Invoked updateLocationAndDimensionById--------------------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();

            Query query = manager.createNamedQuery("updateLocationAndDimensionById");
            query.setParameter("location",location);
            query.setParameter("dimension",dimension);
            query.setParameter("id",id);
            if(query.executeUpdate() != 0){
                System.out.println("----- Updation successfull ----");
            }

            transaction.commit();

        }catch(PersistenceException pe){
            System.err.println("Updation failed ---- "+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("updateLocationAndDimensionById finally block --------------------");
            manager.close();
        }
    }

    @Override
    public void updateAllVipEntry(int vipEntry, List<Integer> ids) {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("-------------- Invoked updateAllVipEntry--------------------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        int value = 1;
        try{
            for (Integer id : ids){
                transaction.begin();

                Query query = manager.createNamedQuery("updateAllVipEntry");
                query.setParameter("vipEntry",vipEntry);
                query.setParameter("id",id);
                if(query.executeUpdate() == 0){
                    value = 0;
                    break;
                }
                transaction.commit();
            }
            if(value != 0){
                System.out.println("----- Updated all entries successfully ----- ");
            }
        }catch(PersistenceException pe){
            System.err.println("Updation failed ---- "+ pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("------- updateAllVipEntry finally block ------");
        }
    }

    @Override
    public void deleteByName(String name) {
        System.out.println("---------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------");
        System.out.println("-------------- Invoked deleteByName--------------------");
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();

            Query query = manager.createNamedQuery("deleteByName");
            query.setParameter("name",name);
            if(query.executeUpdate() != 0){
                System.out.println("----- Delete successfull ----");
            }

            transaction.commit();

        }catch(PersistenceException pe){
            System.err.println("Deletion failed ---- "+pe.getMessage());
            transaction.rollback();
        }finally {
            System.out.println("deleteByName finally block --------------------");
            manager.close();
        }
    }
}