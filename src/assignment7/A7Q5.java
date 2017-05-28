/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anoosha
 */
public class A7Q5 {

    public static void random(int rows) {
        // creating a variable for random and to generate a number of stars in each line
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            int randomNumber = (int) (Math.random() * (5 - 1 + 1)) + 1;

            // outprint astericks instead
            System.out.println(" ");
            for (int n = 0; n < randomNumber; n++) {
                System.out.println("*");

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input scanner for user input 
        Scanner input = new Scanner(System.in);

        // ask user the amount of lines needed and to create a variable to store that number
        System.out.println("Enter how many lines you would like to have");
        random(input.nextInt());

        //inform the user that it is done
        System.out.println(" ");
        System.out.println("Those are your lines. Finished");
    }

}
