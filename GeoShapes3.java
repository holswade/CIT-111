/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chunk2mehtods;

import java.util.Scanner;

/**
 *
 * @author lauren.holswade319
 */
public class GeoShapes3 {

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Enter the side length of the cube to calculate its volume");
        double userSideLength = userInputScanner.nextDouble();

        double volUser = calcVolumeOfCube(userSideLength);

        System.out.println("The volume of a cube with user side length " + userSideLength + " is " + volUser);
        
        
        System.out.println(" Enter the cylinder radius: ");
        double userRadius = userInputScanner.nextDouble();
        System.out.println(" Enter the cylinder height: ");
        double userHeight = userInputScanner.nextDouble();

        double returnedCylVolume = calcVolumeOfCylinder(userRadius,userHeight );
        System.out.println(" The volume of a cylinder with radius: " + userRadius+
                " and height of " + userHeight + " is " + returnedCylVolume);
        System.out.println("-------------------------------------------------------");
    
        
        System.out.println("Enter the sphere radius: ");
        double usRadius = userInputScanner.nextDouble();

        double returnedSphVolume = calcVolumeOfSphere(usRadius);
        System.out.println("The volume of sphere with radius: " + usRadius+" is "+ returnedSphVolume);
        
   
        
    
    
    
    
    }//close main method

    public static double calcVolumeOfCube(double SideLength) {
        double cubeVolume = Math.pow(SideLength, 3);

        return cubeVolume;
    }


   public static double calcVolumeOfCylinder(double radius, double height) {
        final double PI = 3.14;
        double cyVol = PI * (radius * radius) * height;
        return cyVol;
   }
    public static double calcVolumeOfSphere (double radius) {
       final double PI = 3.14;
        double  sphereVolume = Math.pow (radius, 3)* PI *4/3 ;
               
    return sphereVolume;
        
   }//close method
}// close main method