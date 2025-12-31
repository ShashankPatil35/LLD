package SOLID.InterfaceSegregation.Example1;

public class Waiter implements RestaurantEmployee{
    @Override
    public void takeOrder() {
        System.out.println("taking order");
    }

    @Override
    public void serveFoodnDriks() {
        System.out.println("serving food n drinks");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("waiter cannot clean the kitchen");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("waiter cannot decide menu");
    }

    @Override
    public void prepareFoods() {
        throw new AssertionError("waiter cannot prepare food");
    }
}
