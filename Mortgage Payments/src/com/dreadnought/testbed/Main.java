package com.dreadnought.testbed;

import java.security.Principal;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Open a scanner to read lines and currency to fix the formatting
        Scanner reader = new Scanner(System.in);
        NumberFormat outputCurrency = NumberFormat.getCurrencyInstance();

        // Read the principal amount
        System.out.print("Principal: ");
        float principal = reader.nextFloat();

        // Read the annual interest rate into a float variable
        System.out.print("Annual Interest Rate: ");
        float interestRate = (reader.nextFloat()/(float)100);

        // Read the number of years to mortgage
        System.out.print("Period (years): ");
        int years = reader.nextInt() * 12;

        // calculate (rate x (1 + rate)^years) beforehand for cleanliness
        double power = Math.pow(((double)((float)1 + interestRate)), (double)years);

        // print the mortgage
        System.out.println(outputCurrency.format(principal * (((float)(interestRate * power))/((power) - (float)1))));

    }
}
