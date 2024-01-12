package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resume")
@Data
@AllArgsConstructor
public class ResumeEntity {

    @Id
    @Column(name = "r_id")
    private int id;

    @Column(name = "r_name")
    private String name;

    @Column(name = "r_degree")
    private String degree;

    @Column(name = "r_collegeName")
    private String collegeName;

    @Column(name = "r_type")
    private String type;
}
