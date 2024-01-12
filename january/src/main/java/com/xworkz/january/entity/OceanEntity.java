package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocean")
@Data
@AllArgsConstructor
public class OceanEntity {

    @Id
    @Column(name = "o_id")
    private int id;

    @Column(name = "o_name")
    private String oceanName;

    @Column(name = "o_area")
    private String area;

    @Column(name = "o_depthInFeet")
    private int depthInFeet;

    @Column(name = "o_distanceInKm")
    private int distanceInKm;
}
