package com.test.nathalia.controller;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.controller.dto.TransactionDTO;
import com.test.nathalia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/enterprise/{id}/client")
    public ResponseEntity<HttpStatus> createClient(@PathVariable long enterpriseId, ClientDTO clientDTO){
        return null;
    }

    @DeleteMapping("/client")
    public ResponseEntity<HttpStatus> deleteClient(){
        return null;
    }

    @PostMapping("/enterprise/{enterpriseId}/client/{clientId}/withdraw")
    public ResponseEntity<HttpStatus> withdraw(@PathVariable Long enterpriseId, @PathVariable Long clientId, @RequestBody TransactionDTO transactionDTO){

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/enterprise/{enterpriseId}/client/{clientId}/deposit")
    public ResponseEntity<HttpStatus> deposit(@PathVariable Long enterpriseId, @PathVariable Long clientId, @RequestBody TransactionDTO transactionDTO){

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }





}
