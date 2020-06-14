package com.dreadnought.ternary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Set up the usual scanner to read stuff from terminal and store it in a variable
        Scanner read = new Scanner(System.in);
        System.out.println("What is your income?");
        int income = read.nextInt();

        /*
            This is called a ternary operator.
            I first initialize a string variable called "className" to
            store if a passenger is eligible for business class or economy
            class.

            On the right, I first check if income is > 100,000$, however,
            className is a string, not boolean. So we use the ternary operator
            "?" to compare the boolean output and then store either the
            business or economy variables in the className variable.
         */

        String className = income > 100_000 ? "Business" : "Economy";

        System.out.println(className);
    }
}
