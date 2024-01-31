package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.DiseaseEntity;
import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.impl.DiseaseRepositoryImpl;
import com.xworkz.fertilizer.repository.impl.EmailRepositoryImpl;
import com.xworkz.fertilizer.repository.interfaces.DiseaseRepository;
import com.xworkz.fertilizer.repository.interfaces.EmailRepository;
import com.xworkz.fertilizer.repository.interfaces.FertilizerRepository;
import com.xworkz.fertilizer.repository.impl.FertilizerRepositoryImpl;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        FertilizerRepository impl = new FertilizerRepositoryImpl();

//        FertilizerEntity entity = new FertilizerEntity(1,"Urea","Nagarjun",45,
//                LocalDate.of(2023,10,23),LocalDate.of(2025,04,18),
//                "Inorganic",1289.78);
//
//        System.out.println(impl.save(entity));

        DiseaseRepository diseaseRepo = new DiseaseRepositoryImpl();

//        DiseaseEntity diseaseEntity = new DiseaseEntity(1,"Malaria","Parasite","Fever,Chills,Headache","Suitable drugs");
//        System.out.println("Disease Id is : "+diseaseRepo.saveDisease(diseaseEntity));

        EmailRepository emailRepo = new EmailRepositoryImpl();

//        EmailEntity email = new EmailEntity(1,"Davangere","gagan@gmail.com","amruth1@yahoo.com",
//                "Regarding joining to new company","cc","I am joining to a new company ",
//                LocalDate.of(2024,01,24),true);
//        System.out.println("Id of the email is : "+emailRepo.saveMail(email));


    }
}
