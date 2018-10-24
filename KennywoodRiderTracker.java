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
public class KennywoodRiderTracker {
   int totalRiders = 0;
   int failedRideAttempts = 0;
   int totalSickRiders = 0;
   final int CRAZY_MINHEIGHT = 9;
   final int THEME_MINHEIGHT = 6;
    
   Random rand = new Random();
   int numSickRiders = rand.nextInt(riders);
   
  
    public static void main(String[] args){
 
    public static void ridersOnBlackWidow (int riders, int avgheight){
        if(avgHeight >= MIN_HEIGHT_CRAZY_RIDES){
            System.out.println("Riding Black Widow...");
            System.out.println("I H88888 SPIDERSS!!!!!/n");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.extInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        }else{
            System.out.println(riders + " riders turned away sad: too short!/n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }// end if/else
    
    }// close method
}