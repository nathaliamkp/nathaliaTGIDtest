package com.test.nathalia.controller;

import com.test.nathalia.controller.dto.EnterpriseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EnterpriseController {




    @PostMapping
    public ResponseEntity<HttpStatus> createEnterprise(EnterpriseDTO enterpriseDTO){
        return null;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createClient(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteEnterprise(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteClient(){
        return null;
    }









}
