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
public class A7Q8 {

    private static String seasons(int month, int day) {
        String season = "";
        //calculating if it is winter 
        if (month <= 3 && day <= 15) {
            season = "Winter";
            //if it is spring
        } else if (month <= 3 && day <= 15) {
            season = "Spring";
        } else if (month <= 6 && day <= 15) {
            season = "Spring";
            //if it is summer 
        } else if (month <= 6 && day <= 16) {
            season = "Summer";
        } else if (month <= 9 && day <= 15) {
            season = "Summer";
            //if it is Fall
        } else if (month <= 9 && day <= 16) {
            season = "Fall";
        } else if (month <= 12 && day <= 15) {
            season = "Fall";
        } else if (month <= 12 && day <= 16) {
            season = "Winter";
        }
        //outputing the season 
        return season;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner
        Scanner input = new Scanner(System.in);

        // statement and variable for the month 
        System.out.println("Please enter the Month as a number");
        int month = input.nextInt();

        //statement and variable for day 
        System.out.println("Please enter the Day as a number");
        int day = input.nextInt();

        //output
        System.out.println("The season is " + seasons(month, day));

    }

}
