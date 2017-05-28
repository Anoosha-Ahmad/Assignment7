/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author ahmaa1808
 */
public class A7Q3 {

    public static void factors(int number) {
        // outprint the number to the user 
        System.out.println("The factors of the numbers" + number + " are: ");
        // creating a for loop to go through the numbers to find its factors (dividing the number by each number until it is divisible by itself)
        for (int i = 1; i <= number; i++) {
            double answer = number / i;

            // if there are no reaminders print out the factors- if there is a remainder it is not a factor
            if (number % i == 0) {
                System.out.println((int) answer);
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // input a scanner
        Scanner input = new Scanner(System.in);

        // ask user to input their integers
        System.out.println("Please enter in your integers");
        int number = (int) input.nextInt();

        //refer back to the method to find all the factors
        factors(number);

    }
}
