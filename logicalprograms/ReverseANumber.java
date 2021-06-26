package com.bridgelabz.logicalprograms;

import com.bridgelabz.utility.Utility;

public class ReverseANumber {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter a number to reverse:");
        int numToReverse = utility.getIntValue();
        utility.reverseTheNumber(numToReverse);
    }
}
