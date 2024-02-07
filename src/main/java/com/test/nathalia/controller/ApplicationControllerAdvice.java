package com.test.nathalia.controller;

import com.test.nathalia.exception.ApiErrors;
import com.test.nathalia.exception.InvalidCnpjException;
import com.test.nathalia.exception.InvalidCpfException;
import com.test.nathalia.exception.NoBalanceAvailable;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
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

    @ExceptionHandler(InvalidCpfException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleInvalidCpfException(InvalidCpfException ex){
        String errorMessage = ex.getMessage();
        return new ApiErrors(errorMessage);
    }

    @ExceptionHandler(InvalidCnpjException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleInvalidCnpjException(InvalidCnpjException ex){
        String errorMessage = ex.getMessage();
        return new ApiErrors(errorMessage);
    }

}
