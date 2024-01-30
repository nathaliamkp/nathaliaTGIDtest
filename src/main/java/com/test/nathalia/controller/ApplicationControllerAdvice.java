package com.test.nathalia.controller;

import com.test.nathalia.exception.ApiErrors;
import com.test.nathalia.exception.NoBalanceAvailable;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(NoBalanceAvailable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleNoBalanceAvailableException(NoBalanceAvailable ex) {
        String errorMessage = ex.getMessage();
        return new ApiErrors(errorMessage);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleConstraintViolationException(ConstraintViolationException ex){
        String errorMessage = ex.getConstraintViolations().stream().findFirst().get().getMessage();
        return new ApiErrors(errorMessage);
    }







}
