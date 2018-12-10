/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Models a car
 *
 * @author lauren.holswade319
 */
public class Car {

    //member variables
    boolean checkEngineStatus;
    double currentSpeed;
    public int year;
    public String makeModel;
    private boolean isCarOn;
    private double speed;

    public void startCar() {
        isCarOn = true;
        System.out.println("...crank....crank...VROOOMMM!!!");
    }//close method

    public void stopCar() {
        isCarOn = false;
        System.out.println("grllppp....clonajjk..");
    }//close method

    public boolean checkEngineStatus() {
        return isCarOn;
    }

    public double getCurrentSpeed() {
        return speed;
    }

    public double accelerate(int mphIncrease) {
        speed = speed + mphIncrease;
        return speed;
    }

    public double decelerate(int mphDecrease) {
        speed = speed - mphDecrease;
        return speed;
    }

}
