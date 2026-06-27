package com.wipro.bank.acc;

public class RDAccount extends Account {

	public RDAccount(int tenure, float principal) {
		this.Tenure = tenure;
		this.Principle = principal;
	}
	@Override

	public float calculateAmountDeposited() {
		return Tenure * Principle*12;
	}

	@Override
	public float calculateInterest() {
		float totalDeposited = calculateAmountDeposited();
        return (float) (totalDeposited * (Math.pow(1 + ((this.RateOfInterest / 100.0) / 4), 4 * this.Tenure) - 1));
		
	}
	
	public float calculateMaturityAmount() {
	    return calculateAmountDeposited() + calculateInterest();
	}

}
