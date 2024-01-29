package com.test.nathalia.service.impl;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.entity.Client;
import com.test.nathalia.entity.Enterprise;
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
    public Client saveClient(Long enterpriseId, ClientDTO clientDTO) {

        return clientRepository.save(Client.builder()
                        .cpf(clientDTO.cpf())
                        .name(clientDTO.name())
                        .email(clientDTO.email())
                        .enterprise(enterpriseRepository.getReferenceById(enterpriseId))

                .build());

    }

    @Override
    public Client getClientById() {
        return null;
    }

    @Override
    public void deleteClient() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }
}
