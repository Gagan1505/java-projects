package com.xworkz.jpatask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traffic_fine")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrafficFineEntity {

    @Id
    @Column(name = "t_id")
    private int fineId;

    @Column(name = "t_violation")
    private String fineViolation;

    @Column(name = "t_vehicleNo")
    private String vehicleNumber;

    @Column(name = "t_vehicleOwner")
    private String vehicleownerName;

    @Column(name = "t_fine")
    private double fineAmount;
}
