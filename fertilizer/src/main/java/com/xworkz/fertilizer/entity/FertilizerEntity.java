package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "fertilizer")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class FertilizerEntity {

    @Id
    @Column(name = "f_id")
    private int id;

    @Column(name = "f_name")
    private String fertilizerName;

    @Column(name = "f_brand")
    private String brandName;

    @Column(name = "f_quantity")
    private int quantity;

    @Column(name = "f_mfgDate")
    private LocalDate mfgDate;

    @Column(name = "f_expDate")
    private LocalDate expDate;

    @Column(name = "f_type")
    private String type;

    @Column(name = "cost")
    private double cost;
}
