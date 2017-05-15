/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author ahmaa1808
 */
public class A7Q4 {
    public static double compoundInterest (double principal, double interest, int years){
        
        //calculations to find the balance
        double balance = principal*Math.pow(1 + interest, years);
        
        //balance is returned
        return balance;
        
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
