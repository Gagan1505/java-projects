package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
@Data
@AllArgsConstructor
public class ShopEntity {

    @Id
    @Column(name = "s_id")
    private int id;

    @Column(name = "s_name")
    private String shopName;

    @Column(name = "s_category")
    private String category;

    @Column(name = "s_owner")
    private String owner;

    @Column(name = "s_address")
    private String address;
}
