package com.test.nathalia.controller;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.entity.Client;
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

    @PostMapping("/empresa/{id}")
    public ResponseEntity<HttpStatus> createClient(@PathVariable long enterpriseId, ClientDTO clientDTO){
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity<HttpStatus> deleteClient(){
        return null;
    }
}
