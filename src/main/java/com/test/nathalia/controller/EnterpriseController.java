package com.test.nathalia.controller;

import com.test.nathalia.controller.dto.EnterpriseDTO;
import com.test.nathalia.entity.Enterprise;
import com.test.nathalia.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;


    @PostMapping
    public ResponseEntity<Enterprise> createEnterprise(@RequestBody EnterpriseDTO enterpriseDTO){
        //TODO change to return enterpriseResponseDTO
        return new ResponseEntity<>(enterpriseService.saveEnterprise(enterpriseDTO), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Enterprise> findbyId(@PathVariable Long id){
        return new ResponseEntity<>(enterpriseService.getEnterprise(id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteEnterprise(){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }






}
