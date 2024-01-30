package com.test.nathalia.controller;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.controller.dto.TransactionDTO;
import com.test.nathalia.entity.Client;
import com.test.nathalia.service.ClientService;
import com.test.nathalia.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @PostMapping("/enterprise/{enterpriseId}/client")
    public ResponseEntity<Client> createClient(@PathVariable long enterpriseId, @RequestBody ClientDTO clientDTO){
        Client client = clientService.saveClient(enterpriseId, clientDTO);
        return new ResponseEntity<>(client, HttpStatus.CREATED );
    }

    @DeleteMapping("/client")
    public ResponseEntity<HttpStatus> deleteClient(){
        return null;
    }

    @PostMapping("/client/{clientId}/withdraw")
    public ResponseEntity<HttpStatus> withdraw(@PathVariable Long clientId, @RequestBody TransactionDTO transactionDTO){
        clientService.withdraw(clientId, transactionDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/client/{clientId}/deposit")
    public ResponseEntity<HttpStatus> deposit(@PathVariable Long clientId, @RequestBody TransactionDTO transactionDTO){
        clientService.deposit(clientId, transactionDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }





}
