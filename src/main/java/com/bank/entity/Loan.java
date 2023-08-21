package com.bank.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column
	    private Long id;

	    @Column(nullable = false)
	    private String loanType;

	    @Column(unique = true,nullable = false)
	    private String loanId;

	    private String custId;

	    private Double loanAmount;

	    private Integer interestRate;

	    private Integer loanTenure;

	    private Integer dueCount;

	    private Double dueAmount;

	    private Date dueDate;

	    private Date dueEndDate;

	    private Date createdDate;

	    private Date lastUpdatedDate;

	    private Long createdBy;

	    private Long lastUpdatedBy;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getLoanId() {
	        return loanId;
	    }

	    public void setLoanId(String loanId) {
	        this.loanId = loanId;
	    }

	    public String getCustId() {
	        return custId;
	    }

	    public void setCustId(String custId) {
	        this.custId = custId;
	    }

	    public String getLoanType() {
	        return loanType;
	    }

	    public void setLoanType(String loanType) {
	        this.loanType = loanType;
	    }

	    public Double getLoanAmount() {
	        return loanAmount;
	    }

	    public void setLoanAmount(Double loanAmount) {
	        this.loanAmount = loanAmount;
	    }

	    public Integer getInterestRate() {
	        return interestRate;
	    }

	    public void setInterestRate(Integer interestRate) {
	        this.interestRate = interestRate;
	    }

	    public Integer getLoanTenure() {
	        return loanTenure;
	    }

	    public void setLoanTenure(Integer loanTenure) {
	        this.loanTenure = loanTenure;
	    }

	    public Integer getDueCount() {
	        return dueCount;
	    }

	    public void setDueCount(Integer dueCount) {
	        this.dueCount = dueCount;
	    }

	    public Double getDueAmount() {
	        return dueAmount;
	    }

	    public void setDueAmount(Double dueAmount) {
	        this.dueAmount = dueAmount;
	    }

	    public Date getDueDate() {
	        return dueDate;
	    }

	    public void setDueDate(Date dueDate) {
	        this.dueDate = dueDate;
	    }

	    public Date getDueEndDate() {
	        return dueEndDate;
	    }

	    public void setDueEndDate(Date dueEndDate) {
	        this.dueEndDate = dueEndDate;
	    }

	    public Date getCreatedDate() {
	        return createdDate;
	    }

	    public void setCreatedDate(Date createdDate) {
	        this.createdDate = createdDate;
	    }

	    public Date getLastUpdatedDate() {
	        return lastUpdatedDate;
	    }

	    public void setLastUpdatedDate(Date lastUpdatedDate) {
	        this.lastUpdatedDate = lastUpdatedDate;
	    }

	    public Long getCreatedBy() {
	        return createdBy;
	    }

	    public void setCreatedBy(Long createdBy) {
	        this.createdBy = createdBy;
	    }

	    public Long getLastUpdatedBy() {
	        return lastUpdatedBy;
	    }

	    public void setLastUpdatedBy(Long lastUpdatedBy) {
	        this.lastUpdatedBy = lastUpdatedBy;
	    }

}
