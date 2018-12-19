package com.quickbus.demo.dao.Impl;


import com.quickbus.demo.entity.PromoCodesEntity;
import com.quickbus.demo.model.PointsModel;
import com.quickbus.demo.model.ValidityModel;
import com.quickbus.demo.repo.PromoCodesRepo;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import com.vividsolutions.jts.util.GeometricShapeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class ValidatePromoCodeDaoImpl {

    @Autowired
    PromoCodesRepo promoCodesRepo;

    public boolean findDestination(ValidityModel validityModel){
        if(promoCodesRepo.findByPromocodes(validityModel.getPromocode()).isPresent()){
            PromoCodesEntity promo = promoCodesRepo.findByPromocodes(validityModel.getPromocode()).get();

            if(validityModel.getDestination().equalsIgnoreCase(promo.getDestination())){
                return true;
            }

            return false;
        }

        return false;
    }

    public Geometry createLine(double x, double y) {
        GeometricShapeFactory shapeFactory = new GeometricShapeFactory();
        shapeFactory.setNumPoints(32);
        shapeFactory.setCentre(new Coordinate(x, y));
        shapeFactory.setSize(x);
        return shapeFactory.createArc(x, y);
    }


}
