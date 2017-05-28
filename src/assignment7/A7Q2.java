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
public class A7Q2 {
    
        public static double examMark (double finalScore) {
        
        //creating an if statement for the output of the letter grade according to the score inputterd by the user    
         char letter  = ' '; 
        if (finalScore >= 80) {
            letter = 'A';
        } else if (finalScore >= 70) {
            letter = 'B';
        } else if (finalScore >= 60 ) {
            letter = 'C';
        } else if (finalScore >= 50) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        // return statement for the variable 
        return letter;

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // input a scanner 
        Scanner input = new Scanner (System.in);
        
        //ask user to input their marks\
        System.out.println("Please enter in your marks:");
        double finalScore = input.nextDouble();
        
        System.out.println(" ");
        System.out.println(examMark(finalScore));
        
        
        
        
        
        //
    }
}
