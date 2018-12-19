package com.quickbus.demo.model;

public class PromoCodeResModel {
    String promocode;
    double amount;
    String status;

    public PromoCodeResModel(String promocode, double amount, String status) {
        this.promocode = promocode;
        this.amount = amount;
        this.status = status;
    }

    public PromoCodeResModel() {
    }

    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
