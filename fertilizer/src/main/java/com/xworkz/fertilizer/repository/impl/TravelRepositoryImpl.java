package com.xworkz.fertilizer.repository.impl;

import com.xworkz.fertilizer.entity.TravelEntity;
import com.xworkz.fertilizer.repository.interfaces.TravelRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TravelRepositoryImpl implements TravelRepository {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer saveTravelInfo(TravelEntity travelEntity) {
        EntityManager manager = this.factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        return null;
    }
}
