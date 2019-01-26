package com.naissur.interestCounter.form;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.naissur.interestCounter.common.TimeUnit;

@ManagedBean(name="simpleCounterForm")
public class Form {
	double initialAmount = 10000;
	double interest = 6;
	double numOfUnits = 1;
	double countResult = 0;
	TimeUnit timeUnit = TimeUnit.YEAR;
	List<TimeUnit> possibleTimeUnits = new ArrayList<>();
	
	public Form() {
		possibleTimeUnits.add(TimeUnit.MONTH);
		possibleTimeUnits.add(TimeUnit.YEAR);
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

	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}

	public List<TimeUnit> getPossibleTimeUnits() {
		return possibleTimeUnits;
	}
}