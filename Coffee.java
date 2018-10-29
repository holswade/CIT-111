/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classstructure;

/**
 *
 * @author lauren.holswade319
 */
public class Coffee {
   public static int totalPumpkinSpiceLattes = 0;
    public static int totalPeppermintMocha = 0;
    public static double totalSales = 0.0;
    public static final double PRICE_PUMPKIN_SPICE = 4.50;
    public static final double PRICE_PEPPERMINT_MOCHA = 5.00;
    
    public static void main(String[] args) {
        // calling method while passing in 12 as an input
        buyPumpkinSpiceLattes(12);
        displayOrderTotals();
        
    }// close main method
    
        
   
// num pumps sold on this transaction

    public static void buyPumpkinSpiceLattes (int numPump){
      totalPumpkinSpiceLattes = totalPumpkinSpiceLattes + numPump;
        System.out.println("Number of Pumpkin Spice lattes ordered: ");  
        totalSales = totalSales + numPump * PRICE_PUMPKIN_SPICE;
        
        
    
    } // end buyPumpkinSpiceLattes
    
   public static void printPumpkin(){
       System.out.println("Total Pumpkin Spice lattes: " + totalPumpkinSpiceLattes);
   }
    public static void displayOrderTotals(){
        System.out.println("**********ORDER TOTALS*************");
        System.out.println("Total Pumpkin Spice Latte ordered: " + totalPumpkinSpiceLattes);
        System.out.println("Total price " + totalSales);
        
        System.out.println("Total Peppermint Mocha ordered");
        
        
    }
}

