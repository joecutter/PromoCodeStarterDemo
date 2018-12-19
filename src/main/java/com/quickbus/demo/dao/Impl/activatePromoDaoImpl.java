package com.quickbus.demo.dao.Impl;

import com.quickbus.demo.dao.activatePromoDao;
import com.quickbus.demo.entity.PromoCodesEntity;
import com.quickbus.demo.model.ActivateDeactivateModel;
import com.quickbus.demo.repo.PromoCodesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class activatePromoDaoImpl implements activatePromoDao {

    @Autowired
    PromoCodesRepo promoCodesRepo;

    @Override
    public boolean activateAndDeactivate(ActivateDeactivateModel activateDeactivateModel) {
        try{
            String code = activateDeactivateModel.getReq();

            if(activateDeactivateModel.getRequestType().equals("activated")){
                setActive(code);
                return true;
            }else if(activateDeactivateModel.getRequestType().equals("deactivated")){
                deactivate(code);
                return true;
            }

        }catch (Exception ex){

        }
        return false;
    }

    private void setActive(String code){
        if(promoCodesRepo.findByPromocodes(code).isPresent()){
            PromoCodesEntity promo = promoCodesRepo.findByPromocodes(code).get();
            promo.setStatus(true);
            promoCodesRepo.save(promo);
            return;
        }
    }

    private void deactivate(String code){
        if(promoCodesRepo.findByPromocodes(code).isPresent()){
            PromoCodesEntity promo = promoCodesRepo.findByPromocodes(code).get();
            promo.setStatus(false);
            promoCodesRepo.save(promo);
            return;
        }
    }
}
