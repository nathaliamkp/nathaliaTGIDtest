package com.test.nathalia.service;

import com.test.nathalia.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    void saveClient();

    Client getClientById();

    void deleteClient();

    void deposite();

    void withdraw();



}
