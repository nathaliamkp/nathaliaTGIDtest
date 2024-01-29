package com.test.nathalia.service;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.entity.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

    Client saveClient(Long enterpriseId, ClientDTO clientDTO);

    Client getClientById();

    void deleteClient();

    void deposit();

    void withdraw();



}
