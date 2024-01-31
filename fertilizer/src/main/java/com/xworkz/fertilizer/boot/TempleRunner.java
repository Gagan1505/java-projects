package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.TempleEntity;
import com.xworkz.fertilizer.repository.impl.TempleRepositoryImpl;
import com.xworkz.fertilizer.repository.interfaces.TempleRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TempleRunner {
    public static void main(String[] args) {
        TempleRepository repo = new TempleRepositoryImpl();
//        TempleEntity temple1 = new TempleEntity(1,"HariHareshwara","Davanagere",40,50,
//                LocalDate.of(1876,02,14)
//                ,"Hari And Hara",2500);
//        repo.saveTempleInfo(temple1);
//
//        List<TempleEntity> temples = new ArrayList<>();
//        TempleEntity temple2 = new TempleEntity(2,"Santebennur","Davanagere",30,50,
//                LocalDate.of(1876,02,14)
//                ,"Hari And Hara",2500);
//        TempleEntity temple3 = new TempleEntity(3,"Murudeshwara","Udupi",10,20,
//                LocalDate.of(1300,02,15)
//                ,"Manjunatha",35000);
//        temples.add(temple2);
//        temples.add(temple3);
//        repo.saveAllTemples(temples);

        List<TempleEntity> templesByLocation = repo.findAllByLocation("Harihara,Davanagere");
        for (TempleEntity temple : templesByLocation){
            System.out.println(temple);
        }

        List<TempleEntity> templesByFeeGreaterThan = repo.findAllByEntryFeeGreaterThan(5);
        templesByFeeGreaterThan.forEach(System.out::println);

        List<TempleEntity> templesByFeeBetween = repo.findAllByEntryFeeBetween(5,20);
        templesByFeeBetween.forEach(System.out::println);

        List<TempleEntity> templesByDateGreaterThan = repo.findAllByInaguratedDateGreaterThan(LocalDate.of(1200,10,15));
        templesByDateGreaterThan.forEach(System.out::println);

        List<TempleEntity> templesByGodAndLocation = repo.findAllByMainGodAndLocation("Manjunatha","Murudeshwara");
        templesByGodAndLocation.forEach(System.out::println);

        TempleEntity entity = repo.findById(0);
        if(entity != null){
            System.out.println("Temple found with entered id : "+entity);
        }else{
            System.out.println("----- OOPS! ---- No temple found --------- ");
        }


        TempleEntity entity1 = repo.findByIdAndMainGod(2,"Hari and Hara");
        if(entity1 != null){
            System.out.println("Temple found with entered id and main god : "+entity1);
        }else{
            System.out.println("----- OOPS! ---- No temple found --------- ");
        }

        System.out.println("Count of temples is : "+repo.findTotal());

        System.out.println(repo.findTempleByMaxEntryFee());

        repo.updateLocationByName("Harihara","HariHareshwara");

        repo.updateEntryFeeByName(50,"HariHareshwara");

        repo.updateLocationAndDimensionById("Davanagere",45000,1);

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        repo.updateAllVipEntry(100,ids);

        repo.deleteByName("Murudeshwara");

    }
}
