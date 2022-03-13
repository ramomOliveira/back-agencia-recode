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

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String daysHosted;

    @Column(nullable = false)
    private String includedPackage;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDaysHosted() {
        return daysHosted;
    }

    public void setDaysHosted(String daysHosted) {
        this.daysHosted = daysHosted;
    }

    public String getIncludedPackage() {
        return includedPackage;
    }

    public void setIncludedPackage(String includedPackage) {
        this.includedPackage = includedPackage;
    }

}
