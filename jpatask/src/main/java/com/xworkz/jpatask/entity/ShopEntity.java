package com.xworkz.jpatask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopEntity {

    @Id
    @Column(name = "sh_id")
    private int shopId;

    @Column(name = "sh_name")
    private String shopName;

    @Column(name = "sh_gstNo")
    private String shopGSTNo;

    @Column(name = "sh_address")
    private String shopAddress;

    @Column(name = "sh_pincode")
    private int shopPincode;
}
