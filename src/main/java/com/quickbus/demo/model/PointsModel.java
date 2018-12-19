package com.quickbus.demo.model;

import com.vividsolutions.jts.geom.Geometry;

import java.awt.*;

public class PointsModel {
    private Geometry point;

    public Geometry getPoint() {
        return point;
    }

    public void setPoint(Geometry point) {
        this.point = point;
    }
}
