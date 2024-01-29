package com.test.nathalia.service.impl;

import com.test.nathalia.entity.Client;
import com.test.nathalia.repository.ClientRepository;
import com.test.nathalia.repository.EnterpriseRepository;
import com.test.nathalia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Override
    public void saveClient() {

    }

    @Override
    public Client getClientById() {
        return null;
    }

    @Override
    public void deleteClient() {

    }

    @Override
    public void deposite() {

    }

    @Override
    public void withdraw() {

    }
}
