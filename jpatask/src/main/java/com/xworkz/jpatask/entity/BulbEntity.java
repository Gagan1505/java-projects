package com.xworkz.jpatask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "bulb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findByBrand",query = "select et.lightColor from BulbEntity et where et.brandName = :bn")
@NamedQuery(name = "findLightColorAndWattageByBrand", query = "select et.lightColor,et.wattage from BulbEntity et where brandName = :bn")
@NamedQuery(name = "findLightColorAndPriceByBrand", query = "select et.lightColor,et.price from BulbEntity et where brandName = :bn")
public class BulbEntity {

    @Id
    @Column(name = "b_id")
    private int bulbId;

    @Column(name = "b_brand")
    private String brandName;

    @Column(name = "b_specialFeature")
    private String specialFeature;

    @Column(name = "b_lightType")
    private String lightType;

    @Column(name = "b_wattage")
    private String wattage;

    @Column(name = "b_shape")
    private String bulbShape;

    @Column(name = "b_color")
    private String lightColor;

    @Column(name = "b_voltage")
    private String voltage;

    @Column(name = "b_price")
    private int price;
}
