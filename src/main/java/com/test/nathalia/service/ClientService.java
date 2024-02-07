package com.test.nathalia.service;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.controller.dto.TransactionDTO;
import com.test.nathalia.entity.Client;
import jakarta.validation.ConstraintViolationException;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

    Client saveClient(Long enterpriseId, ClientDTO clientDTO) throws ConstraintViolationException;

    Client getClientById(Long id);

    void deleteClient(Long id);

    void deposit(Long clientId, TransactionDTO transactionDTO);

    void withdraw(Long clientId, TransactionDTO transactionDTO);



}
