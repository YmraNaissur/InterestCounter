package com.naissur.interestCounter.controller;

import javax.faces.bean.ManagedBean;

import com.naissur.interestCounter.form.Form;

@ManagedBean(name="simpleCounterController")
public class Controller {
	public String countByInitAndInterest(Form form) {
		double init = form.getInitialAmount();
		double interest = form.getInterest();
		double numOfUnits = form.getNumOfUnits();
		form.setCountResult(init * Math.pow((1 + interest / 100), numOfUnits));
		
		return "resultPage";
	}
}