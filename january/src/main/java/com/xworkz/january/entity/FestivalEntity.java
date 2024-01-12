package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "festival")
@Data
@AllArgsConstructor
public class FestivalEntity {

    @Id
    @Column(name = "f_id")
    private int id;

    @Column(name = "f_name")
    private String festivalName;

    @Column(name = "f_rituals")
    private String ritualsDone;

    @Column(name = "f_godPraised")
    private String godPraised;

    @Column(name = "f_state")
    private String state;
}
