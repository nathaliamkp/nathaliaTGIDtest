package com.test.nathalia.entity;

import com.test.nathalia.exception.NoBalanceAvailable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import java.io.Serializable;

@Entity(name = "enterprise")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Enterprise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CNPJ(message = "cnpj must be valid")
    @NotBlank(message = "this field cannot be blank")
    @NotNull(message = "this field cannot be null")
    private String cnpj;
    @NotBlank(message = "this field cannot be blank")
    @NotNull(message = "this field cannot be null")
    private String name;
    private double balance;
    @NotBlank(message = "this field cannot be blank")
    @NotNull(message = "this field cannot be null")
    private double tax;

    public Enterprise(String cnpj, String name, double balance, double tax) {
        this.cnpj = cnpj;
        this.name = name;
        this.balance = balance;
        this.tax = tax;
    }

    private double calcTransationTax(double value){
        return value * tax;
    }

    public void deposite(double value){
        double transationTax = calcTransationTax(value);
        value = value - transationTax;
        this.balance = balance + value;
    }

    public void withdraw(double value){
        if(balance != 0){
            double transationTax = calcTransationTax(value);
            value = value + transationTax;
            if(isValid(value)){
                this.balance = balance - value;
            }else {
                throw new NoBalanceAvailable("No balance available");
            }

        }else{
            throw new NoBalanceAvailable("No balance available");
        }


    }

    private boolean isValid(double withdraw){
        return balance - withdraw > 0;
    }




}
