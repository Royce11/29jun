package com.training;

public class TaxWhiz {

	private double currentTaxRate;
	private double surRate;
	public TaxWhiz() {
	
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TaxWhiz(double currentTaxRate, double surRate) {
		super();
		this.currentTaxRate = currentTaxRate;
		this.surRate = surRate;
	}

	public double getCurrentTaxRate() {
		return currentTaxRate;
	}

	public void setCurrentTaxRate(double currentTaxRate) {
		this.currentTaxRate = currentTaxRate;
	}

	public double getSurRate() {
		return surRate;
	}

	public void setSurRate(double surRate) {
		this.surRate = surRate;
	}
	
	public double calcTax(double purchase)
	{
		double saleTax = (purchase*currentTaxRate/100) + (purchase*surRate/100); 
		
		return saleTax;
	
	}
	
}
