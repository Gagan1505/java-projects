package com.xworkz.cosmetics.boot;

import com.xworkz.cosmetics.entity.ConditionerEntity;
import com.xworkz.cosmetics.repository.conditioner.ConditionerRepository;
import com.xworkz.cosmetics.repository.conditioner.ConditionerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ConditionerRunner {
    public static void main(String[] args) {
        ConditionerRepository repo = new ConditionerRepositoryImpl();

//        ConditionerEntity dto = new ConditionerEntity(4,"Dove",175,"Liquid","Frizzy,Dry","Detangling","Adult"
//                ,"Smoothening",175.0,2,"Floral","Paraben Free");
//
//        ConditionerEntity dto1 = new ConditionerEntity(3,"Dove",180,"Liquid","All","Detangling","Adult"
//                ,"Smoothening",180.0,1,"Hair Fall Rescue","Paraben Free");
//
//
//        List<ConditionerEntity> dtos = new ArrayList<>();
//        dtos.add(dto);
//        dtos.add(dto1);

//        repo.save(dto);
//        repo.saveList(dtos);
//        repo.updateNetQuantityByBrand("Dove",210);
//        repo.updateUsesByBrand("Tresemme","Smoothening");

        List<ConditionerEntity> conditioersByBrand = repo.findALlByBrand("Dove");
        conditioersByBrand.forEach(System.out::println);

        List<ConditionerEntity> conditionersByHairType = repo.findAllByHairType("All");
        conditionersByHairType.forEach(System.out::println);

        String scent = repo.findScentById(2);
        System.out.println("Scent used in given id is : "+scent);

        List<Integer> sizesOfAllConditioners = repo.getAllSize();
        sizesOfAllConditioners.forEach(System.out::println);

        List<String> allBrands = repo.getAllBrand();
        allBrands.forEach(System.out::println);
    }
}
