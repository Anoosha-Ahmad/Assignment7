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
public class A7Q1 {

    public static double circleArea(double radius) {

        // formula for radius
        double Area = Math.PI * Math.pow(radius, 2);
        // adding a return statement
        return Area;


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();

        System.out.println("The radius is " + circleArea(radius));

    }
}
