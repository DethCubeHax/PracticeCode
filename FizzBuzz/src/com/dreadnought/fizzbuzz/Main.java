package com.dreadnought.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int tmp = scan.nextInt();

        // Calculating fizz and buzz by calculating the remainders of 3 and 5
        int fizz = tmp%3;
        int buzz = tmp%5;

        // Printing out fizz and buzz if either the remainder of 3 is zero or the rem of 5 is zero respectively.
        switch(fizz) {
            case 0:
                System.out.print("Fizz");
                break;
            default:
                break;
        }

        switch(buzz) {
            case 0:
                System.out.println("Buzz");
                break;
            default:
                System.out.println(tmp);
                break;
        }
    }
}
