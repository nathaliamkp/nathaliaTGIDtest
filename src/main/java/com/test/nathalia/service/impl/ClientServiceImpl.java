package com.test.nathalia.service.impl;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.controller.dto.TransactionDTO;
import com.test.nathalia.entity.Client;
import com.test.nathalia.entity.Enterprise;
import com.test.nathalia.exception.InvalidCpfException;
import com.test.nathalia.repository.ClientRepository;
import com.test.nathalia.repository.EnterpriseRepository;
import com.test.nathalia.service.ClientService;
import com.test.nathalia.service.EnterpriseService;
import jakarta.validation.ConstraintViolationException;
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
    public Client saveClient(Long enterpriseId, ClientDTO clientDTO) throws ConstraintViolationException {

        try {
            Enterprise referenceById = enterpriseRepository.getReferenceById(enterpriseId);
            Client save = clientRepository.save(Client.builder()
                    .cpf(clientDTO.cpf())
                    .name(clientDTO.name())
                    .email(clientDTO.email())
                    .enterprise(referenceById)
                    .build());
            return save;

        } catch (ConstraintViolationException e){
            throw new InvalidCpfException("CPF is not valid");
        } catch (Exception e){
            throw new RuntimeException("Unable to save client " + e.getMessage());
        }

    }

    @Override
    public Client getClientById(Long id) {
        try {
            return clientRepository.getReferenceById(id);


        }catch (Exception e){
            throw new RuntimeException("Client not found cause: " + e.getMessage());
        }
    }



    @Override

        public void deleteClient(Long id) {
        try {
           Client client = clientRepository.getReferenceById(id);
           clientRepository.delete(client);
        }catch (Exception e) {
            throw new RuntimeException("Client not found cause:" + e.getMessage());
        }
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
