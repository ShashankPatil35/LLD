package SOLID.Liskov.Example2;

import SOLID.Liskov.Example1.Bicycle;
import SOLID.Liskov.Example1.Bike;
import SOLID.Liskov.Example1.MotorCycle;

public class Demo {
    public static void main(String[] args){
        MotorCycle motorCycle = new MotorCycle("Royal Enf", 100);
        Bicycle bicycle = new Bicycle("heracules",10);
        //works fine with motorCycle implements all Bike class behaviour
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBrakes();
        motorCycle.turnOffEngine();

        //works fine with bicycle implements all Bike class behaviour
        bicycle.accelerate();
        bicycle.applyBrakes();
    }
}
