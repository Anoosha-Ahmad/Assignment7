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
public class A7Q6 {

    // calculating/finding the last number ans returning it 
    public static int lastDigit(int number) {
        return Math.abs(number % 10);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input scanner for user input
        Scanner input = new Scanner(System.in);

        // ask user to input an integer, and storing it be creating a variable
        System.out.println("Please enter in an integer");
        int number = input.nextInt();

        //output the last digit to the user 
        System.out.println("");
        System.out.println("The last digit is:" + lastDigit(number));
    }

}
