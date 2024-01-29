package com.test.nathalia.controller;

import com.test.nathalia.controller.dto.ClientDTO;
import com.test.nathalia.controller.dto.EnterpriseDTO;
import com.test.nathalia.entity.Enterprise;
import com.test.nathalia.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;


    @PostMapping
    public ResponseEntity<HttpStatus> createEnterprise(EnterpriseDTO enterpriseDTO){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteEnterprise(){
        return null;
    }





}
