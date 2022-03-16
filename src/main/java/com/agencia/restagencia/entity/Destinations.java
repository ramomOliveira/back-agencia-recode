package com.agencia.restagencia.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Destinations {

    @Id
    private String id;

    private String place;

    private String unitaryValue;

    private String description;

    private String daysHosted;

    private String includedPackage;

    private String urlImg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

}
