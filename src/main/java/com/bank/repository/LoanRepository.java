package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

	   @Query(value = "SELECT MAX(loanId) FROM Loan WHERE loanType=?1")
	   String findMaxLoanIdByLoanType(String loanType);
}
