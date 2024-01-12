package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traffic")
@Data
@AllArgsConstructor
public class TrafficEntity {

    @Id
    @Column(name = "t_id")
    private int id;

    @Column(name = "t_circleName")
    private String circleName;

    @Column(name = "t_vehiclesPerHour")
    private int vehiclesPerHour;

    @Column(name = "t_city")
    private String city;

    @Column(name = "t_state")
    private String stateName;
}
