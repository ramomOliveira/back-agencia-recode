package com.agencia.restagencia.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Packages {

    @Id
    private String id;

    private String name;

    private String includedPackage;

    private String description;

    private String daysHosted;

    private String hotelStars;

    private String amountPeople;

    private String price;

    private String urlImg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIncludedPackage() {
        return includedPackage;
    }

    public void setIncludedPackage(String includedPackage) {
        this.includedPackage = includedPackage;
    }

    public String getDaysHosted() {
        return daysHosted;
    }

    public void setDaysHosted(String daysHosted) {
        this.daysHosted = daysHosted;
    }

    public String getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(String hotelStars) {
        this.hotelStars = hotelStars;
    }

    public String getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(String amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

}
