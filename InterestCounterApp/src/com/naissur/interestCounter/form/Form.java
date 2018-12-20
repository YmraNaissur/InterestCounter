package com.naissur.interestCounter.form;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="simpleCounterForm")
public class Form {
	double initialAmount = 10000;
	double interest = 6;
	double numOfUnits = 1;
	double countResult = 0;
	
	public Form() {
		/* No-arg constructor */
	}
	
	public double getInitialAmount() {
		return initialAmount;
	}
	
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public double getNumOfUnits() {
		return numOfUnits;
	}
	
	public void setNumOfUnits(double numOfPeriods) {
		this.numOfUnits = numOfPeriods;
	}

	public double getCountResult() {
		return countResult;
	}

	public void setCountResult(double countResult) {
		this.countResult = countResult;
	}
}