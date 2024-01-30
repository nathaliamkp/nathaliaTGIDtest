package com.test.nathalia.service.impl;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.controller.dto.TransactionDTO;
import com.test.nathalia.entity.Client;
import com.test.nathalia.entity.Enterprise;
import com.test.nathalia.repository.ClientRepository;
import com.test.nathalia.repository.EnterpriseRepository;
import com.test.nathalia.service.ClientService;
import com.test.nathalia.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Autowired
    private EnterpriseService enterpriseService;

    @Override
    public Client saveClient(Long enterpriseId, ClientDTO clientDTO) {

        Enterprise referenceById = enterpriseRepository.getReferenceById(enterpriseId);
        Client save = clientRepository.save(Client.builder()
                .cpf(clientDTO.cpf())
                .name(clientDTO.name())
                .email(clientDTO.email())
                .enterprise(referenceById)
                .build());
        return save;

    }

    @Override
    public Client getClientById() {
        return null;
    }

    @Override
    public void deleteClient() {

    }

    @Override
    public void deposit(Long clientId, TransactionDTO transactionDTO) {
        Client client = clientRepository.getReferenceById(clientId);
        Double deposit = transactionDTO.value();
        Enterprise enterprise = client.getEnterprise();
        enterprise.deposit(deposit);
        enterpriseService.saveEnterprise(enterprise);

    }

    @Override
    public void withdraw(Long clientId, TransactionDTO transactionDTO) {
        Client client = clientRepository.getReferenceById(clientId);
        Double withdraw = transactionDTO.value();
        Enterprise enterprise = client.getEnterprise();
        enterprise.withdraw(withdraw);
        enterpriseService.saveEnterprise(enterprise);


    }
}
