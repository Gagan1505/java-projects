package com.xworkz.cosmetics.repository.conditioner;

import com.xworkz.cosmetics.entity.ConditionerEntity;

import java.util.List;

public interface ConditionerRepository {

    void save(ConditionerEntity dto);

    void saveList(List<ConditionerEntity> list);

    void updateNetQuantityByBrand(String brand, double netQuantity);

    void updateUsesByBrand(String brand,String uses);

    List<ConditionerEntity> findALlByBrand(String brand);

    List<ConditionerEntity> findAllByHairType(String hairType);

    String findScentById(int id);

    List<Integer> getAllSize();

    List<String> getAllBrand();
}
