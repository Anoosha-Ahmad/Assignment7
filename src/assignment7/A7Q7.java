/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author Anoosha
 */
public class A7Q7 {

    //getting the first number
    public static int firstDigit(int number) {
        while (number > 9) {
            number /= 10;
        }

        //after the first number is found, return it
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // input scanner for user input
        Scanner input = new Scanner(System.in);

        //asking user to input an integer and storing it as a variable 
        System.out.println("Please enter in an integer");
        int number = input.nextInt();

        //output the first digit to the user
        System.out.println(" ");
        System.out.println("The first digit is " + firstDigit(number));

    }

}
