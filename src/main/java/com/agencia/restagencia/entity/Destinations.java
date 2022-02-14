package com.agencia.restagencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destinations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String unitaryValue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(String unitaryValue) {
        this.unitaryValue = unitaryValue;
    }
}
