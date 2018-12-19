package com.quickbus.demo.dao;


import com.quickbus.demo.model.PromoCodeResModel;

public interface GeneratePromoDao {
    PromoCodeResModel generateCodes(double amount);
}
