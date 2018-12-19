package com.quickbus.demo.model;

import lombok.Getter;
import lombok.Setter;


public class GenerateCodesModel {
    int code;
    PromoCodeResModel description;

    public GenerateCodesModel(int code, PromoCodeResModel description) {
        this.code = code;
        this.description = description;
    }

    public GenerateCodesModel() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PromoCodeResModel getDescription() {
        return description;
    }

    public void setDescription(PromoCodeResModel description) {
        this.description = description;
    }
}
