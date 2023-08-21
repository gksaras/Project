package com.bank.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<String> nullPointer(NullPointerException e){
        return new ResponseEntity<>("Null Value Prohibited!", HttpStatus.BAD_REQUEST);
    }
}
