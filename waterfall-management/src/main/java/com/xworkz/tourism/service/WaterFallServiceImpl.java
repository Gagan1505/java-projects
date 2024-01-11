package com.xworkz.tourism.service;

import com.xworkz.tourism.dto.WaterFalldto;
import com.xworkz.tourism.repository.WaterFallRepository;
import com.xworkz.tourism.repository.WaterFallRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class WaterFallServiceImpl implements WaterFallService{

    WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();

    @Override
    public void validateAndSaveWaterFall(WaterFalldto waterFalldto) {
        //validation logic
        if(waterFalldto.getName() != null && waterFalldto.getRiverName() != null){
            //repo method
            waterFallRepository.saveWaterFall(waterFalldto);
        }else {
            //print statement
            System.out.println("Invalid name or river name" + " ---- Please enter valid details");
        }
    }

    @Override
    public void validateAndSaveWaterFall(List<WaterFalldto> waterFalldtos) {

        //validation logic
        boolean isValid = false;
        for(WaterFalldto waterFalldto : waterFalldtos){
            if(waterFalldto.getName() != null && waterFalldto.getRiverName() != null){
                isValid = true;
            }else{
                isValid = false;
                System.out.println("Invalid name or river name" + " ---- Please enter valid details");
                break;
            }
        }
        //save in repository
        if(isValid == true){
            waterFallRepository.saveWaterFall(waterFalldtos);
        }
    }

    @Override
    public void validateAndUpdateRiverByName(String waterFall, String riverName) {

        if(waterFall != null && !waterFall.isEmpty() && riverName != null && !riverName.isEmpty()){
            System.out.println("Updating the entries-----------");
            waterFallRepository.updateRiverByName(waterFall,riverName);
        }else{
            System.out.println("Enter a valid values-----------------");
        }
    }

    @Override
    public void validateAndDeleteWaterFallByName(String waterFallName) {
        boolean deleteResult = false;
        if(waterFallName != null){
            deleteResult = waterFallRepository.deleteWaterFallByName(waterFallName);
        }else{
            System.out.println("--------------Invalid input------------------");
        }
    }

    @Override
    public void validateAndGetWaterFallByName(String waterFall) {
        WaterFalldto waterFalldto = new WaterFalldto();

        if(waterFall != null && !waterFall.isEmpty()){
            waterFalldto = waterFallRepository.getWaterFallByName(waterFall.toLowerCase());
            System.out.println("Details of the waterfall with entered name are --: ");
            System.out.println("Name : "+waterFalldto.getName());
            System.out.println("River_name : "+waterFalldto.getRiverName());
            System.out.println("Place : "+waterFalldto.getPlace());
            System.out.println("State : "+waterFalldto.getState());
        }else{
            System.out.println("-------Please provide valid details -------------");
        }
    }


    @Override
    public void validateAndGetRiverNameByName(String waterFallName) {
        String riverName = "";

        if(waterFallName != null && !waterFallName.isEmpty()){
            riverName = waterFallRepository.getRiverNameByName(waterFallName.toLowerCase());
            System.out.println("Name of the river that flows in ---"+waterFallName+"--- is -----"+riverName);
        }else{
            System.out.println("Entered invalid records -----------------------------------");
        }
    }

    @Override
    public void validatAndGetAllWaterFalls() {
        List<WaterFalldto> waterFalldtos = new ArrayList<>();

        waterFalldtos = waterFallRepository.getAllWaterFalls();

        for (WaterFalldto waterFall : waterFalldtos){
            if(waterFall != null){
                System.out.println("Name : "+waterFall.getName()+
                        "River name : "+waterFall.getRiverName()+
                        "Place : "+waterFall.getPlace()+
                        "State : "+waterFall.getState());
            }else{
                System.out.println("No waterfall is present in the table ------------");
            }
        }
    }
}
