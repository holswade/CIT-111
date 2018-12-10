/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author lauren.holswade319
 */
public class carland {
    public static void main(String[] args){
        Car beamer = new Car();
        beamer.year = 1980;
        beamer.makeModel = "Beamer 120";
        
        displayCarStats(beamer);
        beamer.startCar();
        beamer.accelerate(98);
        beamer.decelerate(13);
        displayCarStats(beamer);
        beamer.stopCar();
        displayCarStats(beamer);
        
        Car chevy = new Car();
        chevy.year = 2014;
        chevy.makeModel = "Chevy LT ";
        
        displayCarStats(chevy);
        chevy.startCar();
        chevy.accelerate(80);
        chevy.decelerate(20);
        displayCarStats(chevy);
        chevy.stopCar();
        displayCarStats(chevy);
        
        Car mazda = new Car();
        mazda.year = 2016;
        mazda.makeModel = "Mazda 3";
        
        displayCarStats(mazda);
        mazda.startCar();
        mazda.accelerate(120);
        mazda.decelerate(10);
        displayCarStats(mazda);
        mazda.stopCar();
        displayCarStats(mazda);
    
    } // close main

    public static void displayCarStats(Car anyCarObject){
        System.out.println("*******STATS************");
        System.out.println(anyCarObject.year + " " +  anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("Current Speed " + anyCarObject.getCurrentSpeed());
        System.out.println("**************************");
    
    } // close displayCarStats
    
}// cllose class