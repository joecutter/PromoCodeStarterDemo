package com.quickbus.demo.dao.Impl;

import com.quickbus.demo.dao.GeneratePromoDao;
import com.quickbus.demo.entity.PromoCodesEntity;
import com.quickbus.demo.model.PromoCodeResModel;
import com.quickbus.demo.repo.PromoCodesRepo;
import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class GeneratePromoDaoImpl implements GeneratePromoDao {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PromoCodesRepo promoCodesRepo;

    @Override
    public PromoCodeResModel generateCodes(double amount,String event) {
        try{
            String code = generateRandomCodes().toUpperCase();
            log.info("Code is "+code);

            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, 7);

            String date = simpleDateFormat.format(c.getTime());

            PromoCodesEntity promoCodesEntity = new PromoCodesEntity();
            promoCodesEntity.setAmount(amount);
            promoCodesEntity.setPromocodes(code);
            promoCodesEntity.setStatus(false);
            promoCodesEntity.setDestination(event);
            promoCodesEntity.setExpiration(date);  //set to expire after a 7days
            promoCodesRepo.save(promoCodesEntity);

            return new PromoCodeResModel(code,amount,"Successful");
        }catch (Exception ex){
            log.error(ex.getMessage(), ex);
        }

        return new PromoCodeResModel("Failed to generate",amount,"Failed");
    }

    private String generateRandomCodes(){
        int length = 6;
        boolean useLetters = true;
        boolean useNumbers = true;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
