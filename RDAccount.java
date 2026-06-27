package com.wipro.bank.acc;

public class RDAccount extends Account{
	public RDAccount(int Tenure, float Principle) {
		this.Tenure = Tenure;
		this.Principle = Principle;
		
	}
	public float calculateAmountDeposited() {
		int totalMonths = this.Tenure*12;
		return this.Principle*totalMonths;
	}
	public float calculateInterest() {
		float totalDeposited = calculateAmountDeposited();
		
		float interest = (totalDeposited*(this.RateOfInterest/100)*this.Tenure);
		return interest;
	}
	public float calculateMaturityAmount() {
		 return calculateAmountDeposited() + calculateInterest();
		
	}
}

