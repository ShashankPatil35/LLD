package SOLID.InterfaceSegregation.Example2;


public class Waiter implements WaiterTasks {
    @Override
    public void takeOrder() {
        System.out.println("taking order");
    }

    @Override
    public void serveFoodnDrinks() {
        System.out.println("serve..");
    }
}
