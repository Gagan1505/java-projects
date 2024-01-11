package com.xworkz.tourism.service;

import com.xworkz.tourism.dto.WaterFalldto;

import java.util.List;

public interface WaterFallService {

    public void validateAndSaveWaterFall(WaterFalldto waterFalldto);

    public void validateAndSaveWaterFall(List<WaterFalldto> waterFalldtos);


    public void validateAndUpdateRiverByName(String waterFall,String riverName);

    public void validateAndDeleteWaterFallByName(String waterFallName);

    public void validateAndGetWaterFallByName(String waterFall);

    public void validateAndGetRiverNameByName(String waterFallName);

    void validatAndGetAllWaterFalls();


}
