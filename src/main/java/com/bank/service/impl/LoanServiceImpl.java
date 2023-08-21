package com.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.annotation.CustomAnnotation;
import com.bank.entity.Loan;
import com.bank.repository.LoanRepository;
import com.bank.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{
	
	private final LoanRepository loanRepository;

    @Autowired
    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

	@Override
	public Loan saveLoanWithIncrementedID(Loan loan) {
		
		
		String loanType = loan.getLoanType();

        String maxLoanId = loanRepository.findMaxLoanIdByLoanType(loanType);

        String firstLetter = loanType.substring(0,1).toUpperCase();

        int currentId;

        if (maxLoanId != null) {
            currentId = Integer.parseInt(maxLoanId.substring(loanType.length()))+1;
        } else {
            currentId=1;
        }

        String loanId = firstLetter+String.format("%04d", currentId);
        loan.setLoanId(loanId);
        if(loan.getCustId()!=null && loan.getLoanType()!=null && loan.getLoanAmount()!=null &&
                loan.getInterestRate()!=null && loan.getLoanTenure()!=null && loan.getDueCount()!=null &&
                loan.getDueAmount()!=null && loan.getDueDate()!=null && loan.getDueEndDate()!=null &&
                loan.getCreatedDate()!=null && loan.getLastUpdatedDate()!=null && loan.getCreatedBy()!=null &&
                loan.getLastUpdatedBy()!=null) {

            loanRepository.save(loan);
            

        }else {
            throw new NullPointerException();
        }
     
        return loan;
	}

	@CustomAnnotation
	@Override
	public Loan findById(Long id) {
	
		return loanRepository.findById(id).orElseThrow();
	}

}
