package com.xworkz.tourism.dto;

public class WaterFalldto {

    private int id;
    private String name;
    private String place;
    private String riverName;
    private String state;

    public WaterFalldto(){

    }

    public WaterFalldto(String name, String place, String riverName, String state){
        this.name = name;
        this.place = place;
        this.riverName = riverName;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
