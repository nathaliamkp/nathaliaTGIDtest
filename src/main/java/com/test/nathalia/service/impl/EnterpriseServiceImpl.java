package com.test.nathalia.service.impl;

import com.test.nathalia.entity.Client;
import com.test.nathalia.repository.EnterpriseRepository;
import com.test.nathalia.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

   @Autowired
   private EnterpriseRepository enterpriseRepository;

    @Override
    public void saveEnterprise() {

    }

    @Override
    public Client getEnterprise() {
        return null;
    }

    @Override
    public void deleteEnterprise() {

    }
}
