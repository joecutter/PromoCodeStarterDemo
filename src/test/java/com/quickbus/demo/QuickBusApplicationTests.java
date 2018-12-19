package com.quickbus.demo;

import com.quickbus.demo.controller.PromoController;
import com.quickbus.demo.dao.Impl.ValidatePromoCodeDaoImpl;
import com.quickbus.demo.entity.PromoCodesEntity;
import com.quickbus.demo.model.PromoCodesModel;
import com.quickbus.demo.model.ValidityModel;
import com.quickbus.demo.repo.PromoCodesRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest(PromoController.class)
public class QuickBusApplicationTests {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PromoController promoController;

//    @Autowired
//    private TestEntityManager entityManager;

//    @Autowired
//    private MockMvc mvc;

    @Autowired
    private PromoCodesRepo promoCodesRepo;

    @Autowired
    ValidatePromoCodeDaoImpl validatePromoCodeDao;

//    @Test
//    public void returnAllActiveCodes()
//            throws Exception {
//
//        PromoCodesEntity code = new PromoCodesEntity();
//        List<PromoCodesEntity> promoCodesEntities = Arrays.asList(code);
//
//        given(promoCodesRepo.findByStatus(true)).willReturn(promoCodesEntities);
//
//        mvc.perform(get("/promo/activate/all")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }

    @Test
    public void whenFindByCode() {
        String code = "8D19KN";
//        PromoCodesEntity alex = new PromoCodesEntity(code);
//        entityManager.persist(alex);
//        entityManager.flush();

        PromoCodesEntity found = promoCodesRepo.findByPromocodes(code).get();
        log.info(found.getPromocodes());

        assertThat(found.getPromocodes())
                .isEqualTo(code);
    }

    @Test
    public void whenFindByStatus() {
        boolean code = true; //or false

        List<PromoCodesEntity> found = promoCodesRepo.findByStatus(code);
        log.info("size of found "+found.size());

        assertThat(found.size())
                .isGreaterThan(0);
    }

    @Test
    public void whenValidate() {
        String code = "8D19KN";

        ValidityModel validityModel = new ValidityModel();
        validityModel.setOrigin("Mombasa");
        validityModel.setDestination("Mombasa");
        validityModel.setPromocode(code);

        boolean found = validatePromoCodeDao.findDestination(validityModel);
        log.info("Is found "+found);

        assertThat(found)
                .isTrue();
    }

}

