package SOLID.Liskov.Example1;

public class Bicycle implements Bike {
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
    public void applyBrakes() {
        this.speed = this.speed + 5;
        System.out.println("appying brakes.. " + this.speed);
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicycle has no engine");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("Bicycle has no egnine");
    }
}
