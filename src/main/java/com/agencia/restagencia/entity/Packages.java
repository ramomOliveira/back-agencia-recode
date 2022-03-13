package com.agencia.restagencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Packages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String includedPackage;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String daysHosted;

    @Column(nullable = false)
    private String hotelStars;

    @Column(nullable = false)
    private String amountPeople;

    @Column(nullable = false)
    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}
