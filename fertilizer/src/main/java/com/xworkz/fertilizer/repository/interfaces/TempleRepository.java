package com.xworkz.fertilizer.repository.interfaces;

import com.xworkz.fertilizer.entity.TempleEntity;

import java.time.LocalDate;
import java.util.List;

public interface TempleRepository {

    Integer saveTempleInfo(TempleEntity temple);

    void saveAllTemples(List<TempleEntity> temples);

    List<TempleEntity> findAllByLocation(String location);

    List<TempleEntity> findAllByEntryFeeGreaterThan(int fee);

    List<TempleEntity> findAllByEntryFeeBetween(int startFee,int  endFee);

    List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date);

    List<TempleEntity> findAllByMainGodAndLocation(String mainGod,String location);

    TempleEntity findById(int id);

    TempleEntity findByIdAndMainGod(int id,String mainGod);

    Long findTotal();

    TempleEntity findTempleByMaxEntryFee();

    void updateLocationByName(String location,String name);

    void updateEntryFeeByName(int fee,String name);

    void updateLocationAndDimensionById(String location,int dimension,int id);

    void updateAllVipEntry(int vipEntry,List<Integer> ids);

    void deleteByName(String name);
}
