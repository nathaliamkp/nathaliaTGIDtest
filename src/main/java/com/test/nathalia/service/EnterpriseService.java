package com.test.nathalia.service;

import com.test.nathalia.controller.dto.EnterpriseDTO;
import com.test.nathalia.entity.Client;
import com.test.nathalia.entity.Enterprise;
import org.springframework.stereotype.Service;

@Service
public interface EnterpriseService {


    Enterprise saveEnterprise(EnterpriseDTO enterpriseDTO);

    Enterprise getEnterprise();

    void deleteEnterprise();

}
