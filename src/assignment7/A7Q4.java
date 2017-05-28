/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ahmaa1808
 */
public class A7Q4 {

    public static double compoundInterest(double principal, double interest, int years) {

        //calculations to find the balance
        double balance = principal * Math.pow(1 + interest, years);

        //balance is returned
        return balance;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a new scanner for user input
        Scanner input = new Scanner(System.in);

        // inform the user the purpose of the program
        System.out.println("This program will help find the balance of your account after a compund interest is added");

        //ask user to input their principal amount -- required for calculating their balance
        System.out.println("Enter the principal amount: ");
        double initialAmount = input.nextDouble();

        // ask user for their interest rate in a percentage and store it as a double -- will convert the percentage into a decimal for calculations
        System.out.println("Enter in the interest rate, in percent form");
        double interest = input.nextDouble() / 100;

        //ask user for the number of years and save it as an integer
        System.out.println("Enter in the number of years: ");
        int years = input.nextInt();

        // round to two decimal places
        DecimalFormat n = new DecimalFormat("###.##");

        // output the final compound interest
        System.out.println("Your compound interest is: $" + n.format(compoundInterest(initialAmount, interest, years)));
    }
}
