package com.bridgelabz.logicalprograms;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.println("Enter the number to check as prime number");
        int numPrimeCheck = utility.getIntValue();
        utility.primeNumberCheck(numPrimeCheck);
    }
}
