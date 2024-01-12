package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
@Data
@AllArgsConstructor
public class SportsEntity {

    @Id
    @Column(name = "sp_id")
    private int id;

    @Column(name = "sp_name")
    private String sportName;

    @Column(name = "sp_type")
    private String type;

    @Column(name = "sp_numberOfPlayers")
    private int numberOfPlayers;

    @Column(name = "sp_originCountry")
    private String originCountry;
}
