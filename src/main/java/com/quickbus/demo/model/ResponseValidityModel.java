package com.quickbus.demo.model;

import com.quickbus.demo.entity.PromoCodesEntity;
import com.vividsolutions.jts.geom.Geometry;

public class ResponseValidityModel {
    int code;
    PromoCodesEntity promoCodesEntity;
    String pointsModel;

    public ResponseValidityModel(int code, PromoCodesEntity promoCodesEntity, String pointsModel) {
        this.code = code;
        this.promoCodesEntity = promoCodesEntity;
        this.pointsModel = pointsModel;
    }

    public ResponseValidityModel() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PromoCodesEntity getPromoCodesEntity() {
        return promoCodesEntity;
    }

    public void setPromoCodesEntity(PromoCodesEntity promoCodesEntity) {
        this.promoCodesEntity = promoCodesEntity;
    }

    public String getPointsModel() {
        return pointsModel;
    }

    public void setPointsModel(String pointsModel) {
        this.pointsModel = pointsModel;
    }
}
