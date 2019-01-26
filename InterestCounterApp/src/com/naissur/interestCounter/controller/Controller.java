package com.naissur.interestCounter.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.naissur.interestCounter.business.BusinessBean;
import com.naissur.interestCounter.form.Form;

@ManagedBean(name="simpleCounterController")
public class Controller {
	@ManagedProperty(value = "#{simpleCounterForm}")
	private Form form;
	
	@ManagedProperty(value = "#{simpleCounterBusinessBean}")
	private BusinessBean businessBean;
	
	public String countByInitAndInterest() {
		double init = form.getInitialAmount();
		double interest = form.getInterest();
		double numOfUnits = form.getNumOfUnits();
		double result = businessBean.countByInitAndInterest(init, interest, numOfUnits);
		form.setCountResult(result);
		
		return "resultPage";
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public void setBusinessBean(BusinessBean businessBean) {
		this.businessBean = businessBean;
	}
}