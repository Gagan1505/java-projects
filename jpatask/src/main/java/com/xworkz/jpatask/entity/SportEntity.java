package com.xworkz.jpatask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sport")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportEntity {

    @Id
    @Column(name = "sp_id")
    private int sportId;

    @Column(name = "sp_name")
    private String sportName;

    @Column(name = "sp_originCountry")
    private String sportoriginCountry;

    @Column(name = "sp_captainName")
    private String captainName;

    @Column(name = "sp_totalPlayers")
    private int totalPlayers;
}
