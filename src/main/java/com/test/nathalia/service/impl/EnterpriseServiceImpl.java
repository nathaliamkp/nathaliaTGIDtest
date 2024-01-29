package com.test.nathalia.service.impl;

import com.test.nathalia.controller.dto.EnterpriseDTO;
import com.test.nathalia.entity.Enterprise;
import com.test.nathalia.repository.EnterpriseRepository;
import com.test.nathalia.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

   @Autowired
   private EnterpriseRepository enterpriseRepository;

    @Override
    public Enterprise saveEnterprise(EnterpriseDTO enterpriseDTO) {

        return enterpriseRepository.save(Enterprise.builder()
                        .cnpj(enterpriseDTO.cnpj())
                        .name(enterpriseDTO.name())
                        .balance(enterpriseDTO.balance())
                        .tax(enterpriseDTO.tax())
                .build());
    }

    @Override
    public Enterprise getEnterprise() {
        return null;
    }

    @Override
    public void deleteEnterprise() {

    }
}
