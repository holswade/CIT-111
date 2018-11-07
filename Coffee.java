/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classstructure;


import java.util.Scanner;
/**
 *
 * @author lauren.holswade319
 */
public class Coffee {
   public static int totalPumpkinSpiceLattes = 0;
    public static int totalPeppermintMocha = 0;
    public static double totalSales = 0.0;
    public static int orderpumpkinspice;
    public static int orderpeppermintmocha;
    public static final double PRICE_PUMPKIN_SPICE = 4.50;
    public static final double PRICE_PEPPERMINT_MOCHA = 5.00;
    
    
    public static Scanner userPerson = new Scanner (System.in);
    int order = o; 
    
    public static void main(String[] args) {
        // calling method while passing in 12 as an input
        if(order == 1){
            compScore = compScore + 10;
            System.out.println(" Do you want a pumpkin spice latte? ");
        } else { 
            System.out.println (" Ugh then would like a peppermint mocha ? ");
        }// end if/else blocks
        
        int order = 1; 
        displayOrderTotals();    

        buyPumpkinSpiceLattes(12);
        buyPeppermintMocha(20);
        
       System.out.println("Do you seasonal coffee? ( 0 = no, 1 = yes)");

        
    }// close main method
    
        
   
// num pumps sold on this transaction

    public static void buyPumpkinSpiceLattes (int numPump){
      totalPumpkinSpiceLattes = totalPumpkinSpiceLattes + numPump;
        System.out.println("Number of Pumpkin Spice lattes ordered: "+totalPumpkinSpiceLattes);  
        totalSales = totalSales + numPump * PRICE_PUMPKIN_SPICE;
        System.out.println("Making Pumpkin Spice lattes: " + totalPumpkinSpiceLattes);
        System.out.println("Total Pumpkin Spice Latte ordered: " + totalPumpkinSpiceLattes);
        System.out.println("Total price " + totalSales);
        
    
    } // end buyPumpkinSpiceLattes
    
    public static void buyPeppermintMocha (int numPump){
      totalPeppermintMocha = totalPeppermintMocha + numPump;
        System.out.println("Number of Peppermint Mochas ordered: "+totalPeppermintMocha);  
        totalSales = totalSales + numPump * PRICE_PEPPERMINT_MOCHA;
        System.out.println("Making Peppermint Mochas : " + totalPeppermintMocha);
         System.out.println("Total Peppermint Mocha ordered "+ totalPeppermintMocha);
        System.out.println("Total price " + totalSales);
    } // end buyPeppermintMocha
        
   public static void printPumpkin(){
       System.out.println("Making Pumpkin Spice lattes: " + totalPumpkinSpiceLattes);
       totalSales = totalSales + 4.5; 
   }
    
   public static void printPeppermint(){
       System.out.println("Making Peppermint Mochas : " + totalPeppermintMocha);
       totalSales = totalSales + 5.00; 
   }
   
   
   
   public static void displayOrderTotals(){
        System.out.println("**********ORDER TOTALS*************");
       
        
        
    }
}

