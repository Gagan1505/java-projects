package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFalldto;

import java.util.List;
import java.util.Map;

public interface WaterFallRepository {

    public void saveWaterFall(WaterFalldto waterFalldto);

    public void saveWaterFall(List<WaterFalldto> waterFalldtos);

    public void updateRiverByName(String waterFallName, String riverName);

//    public void updateRiverByName(Map<String,String> waterFallDetails);

    public boolean deleteWaterFallByName(String waterFallName);

    public String getRiverNameByName(String waterFallName);

    public WaterFalldto getWaterFallByName(String waterFallName);

    List<WaterFalldto> getAllWaterFalls();


}
