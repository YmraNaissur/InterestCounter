package com.naissur.interestCounter.business;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "simpleCounterBusinessBean")
public class BusinessBean {
	public double countByInitAndInterest(double init, double interest, double numOfUnits) {
		return init * Math.pow((1 + interest / 100), numOfUnits);
	}
}