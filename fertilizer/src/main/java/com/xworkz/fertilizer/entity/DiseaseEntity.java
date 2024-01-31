package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "disease")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseEntity {

    @Id
    @Column(name = "d_id")
    private int diseaseId;

    @Column(name = "d_name")
    private String diseaseName;

    @Column(name = "d_causedBy")
    private String causedBy;

    @Column(name = "d_symptoms")
    private String symptoms;

    @Column(name = "d_preventiveMeasures")
    private String preventiveMeasures;

}
