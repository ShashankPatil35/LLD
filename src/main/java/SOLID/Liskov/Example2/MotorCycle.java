package SOLID.Liskov.Example2;

import SOLID.Liskov.Example2.Bike;

public class MotorCycle extends Bike implements Engine {
    String Company;
    int speed;
    boolean isEngineOn;

    public MotorCycle(String company, int speed){
        this.Company = company;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
        System.out.println("Engine is on!");
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = false;
        System.out.println("Engine is off!");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Motocycle speed is " + this.speed);
    }

    @Override
    public void applybrakes() {
        this.speed = this.speed - 5;
        System.out.println("Applying breakes..");
    }
}
