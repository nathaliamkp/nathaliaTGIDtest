package com.test.nathalia.controller;

import com.test.nathalia.exception.ApiErrors;
import com.test.nathalia.exception.NoBalanceAvailable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(NoBalanceAvailable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleUfNotFoundException(NoBalanceAvailable ex) {
        String errorMessage = ex.getMessage();
        return new ApiErrors(errorMessage);
    }






}
