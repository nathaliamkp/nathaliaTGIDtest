package com.test.nathalia.service;

import com.test.nathalia.entity.Client;
import org.springframework.stereotype.Service;

@Service
public interface EnterpriseService {


    void saveEnterprise();

    Client getEnterprise();

    void deleteEnterprise();

}
