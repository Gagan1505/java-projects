package com.xworkz.fertilizer.repository.impl;

import com.xworkz.fertilizer.entity.DiseaseEntity;
import com.xworkz.fertilizer.repository.interfaces.DiseaseRepository;

import javax.persistence.*;

public class DiseaseRepositoryImpl implements DiseaseRepository {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer saveDisease(DiseaseEntity entity) {
        System.out.println("Save disease method invoked to save : "+entity);
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            System.out.println("Starting transaction");
            transaction.begin();

            System.out.println("Saving the record");
            manager.persist(entity);

            System.out.println("saving success");
            transaction.commit();

            return entity.getDiseaseId();
        }catch(PersistenceException pe){
            System.err.println("Saving operation unsuccessfull"+pe.getMessage());
            transaction.rollback();
        }finally{
            System.out.println("Closing resources --- giving back the connection from manager");
            manager.close();
        }
        return null;
    }
}
