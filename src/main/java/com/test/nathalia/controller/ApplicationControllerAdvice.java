package com.test.nathalia.controller;

import com.test.nathalia.exception.ApiErrors;
import com.test.nathalia.exception.NoBalanceAvaible;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(NoBalanceAvaible.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleUfNotFoundException(NoBalanceAvaible ex) {
        String errorMessage = ex.getMessage();
        return new ApiErrors(errorMessage);
    }






}
