package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "temple")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findAllByLocation",query = "select t from TempleEntity t where t.templeLocation = :location")
@NamedQuery(name = "findAllByEntryFeeGreaterThan",query = "select t from TempleEntity t where t.entryFee > :fee")
@NamedQuery(name = "findAllByEntryFeeBetween",query = "select t from  TempleEntity t where t.entryFee between :startFee and :endFee")
@NamedQuery(name = "findAllByInaguratedDateGreaterThan",query = "select t from TempleEntity t where t.inaguratedDate > :date")
@NamedQuery(name = "findAllByMainGodAndLocation",query = "select t from TempleEntity t where t.mainGodWorshipped = :mainGod and t.templeLocation = :location")
@NamedQuery(name = "findByIdAndMainGod",query = "select t from TempleEntity t where t.templeId = :id and t.mainGodWorshipped = :mainGod")
@NamedQuery(name = "findTotal",query = "select count(t) from TempleEntity t")
@NamedQuery(name = "findTempleByMaxEntryFee",query = "select t from TempleEntity t where t.entryFee = (select max(t1.entryFee) from TempleEntity t1)")
@NamedQuery(name = "updateLocationByName",query = "update TempleEntity t set t.templeLocation = :location where t.templeName = :name")
@NamedQuery(name = "updateEntryFeeByName",query = "update TempleEntity t set t.entryFee = :fee where t.templeName = :name")
@NamedQuery(name = "updateLocationAndDimensionById",query = "update TempleEntity t set t.templeLocation = :location,t.dimensionsInSqrFeet = :dimension where id = :id")
@NamedQuery(name = "updateAllVipEntry",query = "update TempleEntity t set t.vipEntryFee = :vipEntry where t.id = :id")
@NamedQuery(name = "deleteByName",query = "delete from TempleEntity t where t.templeName = :name")
public class TempleEntity {
    @Id
    @Column(name = "t_id")
    private int templeId;

    @Column(name = "t_name")
    private String templeName;

    @Column(name = "t_location")
    private String templeLocation;

    @Column(name = "t_entryFee")
    private int entryFee;

    @Column(name = "t_vipEntryFee")
    private int vipEntryFee;

    @Column(name = "t_inaguratedDate")
    private LocalDate inaguratedDate;

    @Column(name = "t_mainGod")
    private String mainGodWorshipped;

    @Column(name = "t_dimensionInSqFt")
    private int dimensionsInSqrFeet;
}
