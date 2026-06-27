package com.wipro.bank.acc;

abstract class Account {
	int Tenure;
	float Principle;
	float RateOfInterest;
	public void setInterest(int age, String gender) {
		if(age>18) {
			if(gender.equals("male")) {
				RateOfInterest=10;
			}
			else {
				if(gender.equals("female")) {
					RateOfInterest=8;
				}
			}
		}
		else if(age>60) {
			if(gender.equals("male")) {
				RateOfInterest=8;
			}
			else {
				if(gender.equals("female")) {
					RateOfInterest=6;
				}
			}
		}
		else {
			RateOfInterest=2;
		}
		
	}
	float MaturityAmount;
	public float calculateMaturityAmount(float totalPrincipleDeposited, float maturityInterest) {
		 return MaturityAmount = totalPrincipleDeposited + maturityInterest;
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();
	
	
	
}
