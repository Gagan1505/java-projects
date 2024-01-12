package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
@Data
@AllArgsConstructor
public class ActorEntity {

    @Id
    @Column(name = "a_id")
    private int id;

    @Column(name = "a_name")
    private String actorName;

    @Column(name = "a_starName")
    private String starName;

    @Column(name = "a_industry")
    private String industry;

    @Column(name = "a_birthPlace")
    private String birthPlace;
}
