package com.quickbus.demo.model;

import com.quickbus.demo.entity.PromoCodesEntity;

import java.util.List;

public class PromoCodesModel {

    int code;
    List<PromoCodesEntity> promoCodesEntity;

    public PromoCodesModel(int code, List<PromoCodesEntity> promoCodesEntity) {
        this.code = code;
        this.promoCodesEntity = promoCodesEntity;
    }

    public PromoCodesModel() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<PromoCodesEntity> getPromoCodesEntity() {
        return promoCodesEntity;
    }

    public void setPromoCodesEntity(List<PromoCodesEntity> promoCodesEntity) {
        this.promoCodesEntity = promoCodesEntity;
    }
}
