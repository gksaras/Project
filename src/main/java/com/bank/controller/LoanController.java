package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Loan;
import com.bank.service.LoanService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/loan")
public class LoanController {
	
	   private final LoanService loanService;

	    @Autowired
	    public LoanController(LoanService loanService) {
	        this.loanService = loanService;
	    }

	    @PostMapping("/addLoan")
	    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan) {
	         Loan createLoan = loanService.saveLoanWithIncrementedID(loan);
	         return new ResponseEntity<>(createLoan, HttpStatus.CREATED);
	    }
	    
	    @GetMapping("/findLoan/{id}")
	    public ResponseEntity<Loan> fetchLoan(@PathVariable(value = "id") Long id){
	    	Loan findById = loanService.findById(id);
	    	return new ResponseEntity<>(findById,HttpStatus.FOUND);
	    }

}
