package SOLID.Liskov.Example2;

import SOLID.Liskov.Example2.Bike;

public class Bicycle extends Bike {
    String brand;
    boolean hasGears;
    int speed;

    public Bicycle(String brand, int speed){
        this.brand =brand;
        this.speed = speed;
    }
    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Bicycle speed is " + this.speed);
    }

    @Override
    public void applybrakes() {
        this.speed = this.speed + 5;
        System.out.println("appying brakes.. " + this.speed);
    }

}
