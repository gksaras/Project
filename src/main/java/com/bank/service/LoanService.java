package com.bank.service;

import com.bank.entity.Loan;

public interface LoanService {

	public  Loan saveLoanWithIncrementedID(Loan loan);
	
	public Loan findById(Long id);
}
