/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit111java;

import java.util.Scanner;

/**
 *
 * @author lauren.holswade319
 */
public class FriendsWithUserInput {
    
    public static void main(String[] args) {
        System.out.println("Might we be friends?");
        int responseSpotify;
        int compScore = 0;
        int responseNewplaylist;
      
        
        System.out.println("Q1/2: Do you like to use Spotify? (0 = no, 1 = yes)");
        Scanner keyboardReader = new Scanner(System.in);
        responseSpotify = keyboardReader.nextInt();
        
        
        if(responseSpotify == 1){
            compScore = compScore + 10;
          //  System.out.println("Awesome, How about that new Rap Caviar playlist?");
            System.out.println("Do you like the teen party playlist?");
         Scanner playlist= new Scanner(System.in);
         responseNewplaylist = playlist.nextInt();  
         if(responseNewplaylist == 1){
             System.out.println("Cool, that playist rocks!");
             compScore = compScore + 10;
                 }else{ 
             System.out.println("You should try that playlist sometime");
             compScore = compScore - 5;
             
         }
            System.out.println("The compatability score is:" + compScore);
       
        
      
        if(compScore > 5){
            System.out.println("Awesome, we might be good friends then!");
        } else {
            System.out.println("Oh no, according to my calculations,"
                    + " we will not be friends then."); 
        }// end of if/else blocks
    }// close main
}//close class
} 
