package com.quickbus.demo.model;

public class ValidityModel {
    String origin;
    String destination;
    String promocode;

    public ValidityModel(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public ValidityModel() {
    }

    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
