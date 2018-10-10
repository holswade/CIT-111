/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chunk2mehtods;

/**
 *
 * @author lauren.holswade319
 */
public class BasicSwitchMethodCalls {
    public static void main(String[] args) {
        System.out.println("This code inside method: main");
        printStatement();
        
        System.out.println("...back in main");
        
        printStatement();
        
    }
    
    
    public static void printStatement(){
        System.out.println("********** INSIDE printStatement**********");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("*************************************************")
    }// close method printSpecialStatement

}// clsoe class
