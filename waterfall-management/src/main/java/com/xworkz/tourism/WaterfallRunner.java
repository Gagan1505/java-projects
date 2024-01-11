package com.xworkz.tourism;

import com.xworkz.tourism.dto.WaterFalldto;
import com.xworkz.tourism.service.WaterFallService;
import com.xworkz.tourism.service.WaterFallServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class WaterfallRunner {

    public static void main(String[] args) {

        //WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();

        WaterFallService waterFallService = new WaterFallServiceImpl();

//        WaterFalldto waterFalldto = new WaterFalldto("Gokak Falls","Gokak","Ghataprabha","Karnataka");
        //waterFallService.validateAndSaveWaterFall(waterFalldto);

//        WaterFalldto waterFalldto = new WaterFalldto("Shivana Samudhra","Mandya","Kaveri","Karnataka");
//        WaterFalldto waterFalldto1 = new WaterFalldto("Iruppu Falls","Coorg","Brahmagiri and Lakshmana Theertha","Karnataka");
//        WaterFalldto waterFalldto2 = new WaterFalldto("Abbey Falls","Coorg","Many Streams","Karnataka");
//        List<WaterFalldto> waterFalldtos = new ArrayList<>();
//        waterFalldtos.add(waterFalldto);
//        waterFalldtos.add(waterFalldto1);
//        waterFalldtos.add(waterFalldto2);
//
//        waterFallService.validateAndSaveWaterFall(waterFalldtos);

//        waterFallService.validateAndUpdateRiverByName("Abbey Falls","Kaveri");

//        waterFallService.validateAndDeleteWaterFallByName("Abbey Falls");

//        waterFallService.validateAndGetWaterFallByName("shivana samudhra");

//        waterFallService.validateAndGetRiverNameByName("Iruppu Falls");

        waterFallService.validatAndGetAllWaterFalls();


    }
}
