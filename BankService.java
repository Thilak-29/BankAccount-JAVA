package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;

public class BankService {

    public boolean validData(float principal, int tenure, int age, String gender) {

        try {

            if (principal <= 500)
                throw new Exception("Principal must be greater than 500");

            if (tenure != 5 && tenure != 10)
                throw new Exception("Tenure should be either 5 or 10 years");

            if (!gender.equals("male") && !gender.equals("female"))
                throw new Exception("Gender should be either male or female");

            if (age < 1 || age > 100)
                throw new Exception("Age should be between 1 and 100");

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void calculate(float principal, int tenure, int age, String gender) {

        RDAccount rd = new RDAccount(tenure, principal);

        rd.setInterest(age, gender);

        float interest = rd.calculateInterest();
        System.out.println("Interest = " + interest);

        float amountDeposited = rd.calculateAmountDeposited();
        System.out.println("Amount Deposited = " + amountDeposited);

        float maturityAmount = rd.calculateMaturityAmount();
        System.out.println("Maturity Amount = " + maturityAmount);
    }
}