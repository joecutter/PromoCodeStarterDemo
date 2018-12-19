package com.quickbus.demo.repo;


import com.quickbus.demo.entity.PromoCodesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PromoCodesRepo extends JpaRepository<PromoCodesEntity, String> {
    Optional<PromoCodesEntity> findByPromocodes(String code);
    List<PromoCodesEntity> findByStatus(boolean status);

}
