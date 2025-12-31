package SOLID.InterfaceSegregation.Example2;

public class Chef implements ChefTasks {

    @Override
    public void decideMenu() {
        throw new AssertionError("waiter cannot decide menu");
    }

    @Override
    public void prepareFoods() {
        throw new AssertionError("waiter cannot prepare food");
    }
}
