package SOLID.Liskov.Example1;

public class Demo {
    public static void main(String[] args){
        Bike bikeObj = new MotorCycle("Royal Enfield", 10);
        bikeObj.turnOnEngine();
        bikeObj.accelerate();
        bikeObj.applyBrakes();
        bikeObj.turnOffEngine();

        //now client expects to see same behaviour with bicycle
        bikeObj = new Bicycle("herculus", 10);
        bikeObj.turnOnEngine(); // failes to implement bike class behvaiour
        bikeObj.accelerate();
        bikeObj.applyBrakes();
        bikeObj.turnOffEngine();
    }
}
