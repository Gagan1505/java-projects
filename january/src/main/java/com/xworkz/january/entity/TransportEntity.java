package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport")
@Data
@AllArgsConstructor
public class TransportEntity {

    @Id
    @Column(name = "ts_id")
    private int id;

    @Column(name = "ts_name")
    private String transportName;

    @Column(name = "ts_type")
    private String transportType;

    @Column(name = "ts_wheels")
    private int numberOfWheels;

    @Column(name = "ts_state")
    private String stateName;
}
