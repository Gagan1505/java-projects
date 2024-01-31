package com.xworkz.cosmetics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "conditioner")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQuery(name = "updateNetQuantityByBrand",query = "update ConditionerEntity c set c.netQuantityInMilliMeters = :netQuantity where c.conditionerBrandName = :brand")
@NamedQuery(name = "updateUsesByBrand",query = "update ConditionerEntity c set c.uses = :uses where c.conditionerBrandName = :brand")
@NamedQuery(name = "findALlByBrand",query = "select c from ConditionerEntity c where c.conditionerBrandName = :brand")
@NamedQuery(name = "findAllByHairType",query = "select c from ConditionerEntity c where c.hairType = :hairType")
@NamedQuery(name = "findScentById",query = "select c.scent from ConditionerEntity c where c.conditionerId = :id")
@NamedQuery(name = "getAllSize",query = "select c.sizeInGram from ConditionerEntity c")
@NamedQuery(name = "getAllBrand",query = "select distinct(c.conditionerBrandName) from ConditionerEntity c")
public class ConditionerEntity {

    @Id
    @Column(name = "c_id")
    private int conditionerId;

    @Column(name = "c_brand")
    private String conditionerBrandName;

    @Column(name = "c_sizeInGram")
    private int sizeInGram;

    @Column(name = "c_itemForm")
    private String conditionerForm;

    @Column(name = "c_hairType")
    private String hairType;

    @Column(name = "c_benefits")
    private String benefits;

    @Column(name = "c_ageRange")
    private String ageRange;

    @Column(name = "c_uses")
    private String uses;

    @Column(name = "c_netQuantityInMM")
    private double netQuantityInMilliMeters;

    @Column(name = "c_numberOfItems")
    private int numberOfItems;

    @Column(name = "c_scent")
    private String scent;

    @Column(name = "c_materialTypeFree")
    private String conditionerTypeFree;
}
