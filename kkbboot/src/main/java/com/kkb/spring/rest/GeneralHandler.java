package com.kkb.spring.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleMethodArgumentNotValidException(final MethodArgumentNotValidException value) {
        ErrorObj errorObjLoc = new ErrorObj();
        List<ObjectError> allErrorsLoc = value.getBindingResult()
                                              .getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            errorObjLoc.setMsg(objectErrorLoc.getDefaultMessage());
        }

        return errorObjLoc;
    }

}
