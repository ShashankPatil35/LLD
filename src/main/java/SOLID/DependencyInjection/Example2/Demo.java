package SOLID.DependencyInjection.Example2;

public class Demo {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB","Dell","FR03");
        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard);

        // now we can create macbook with bluetooth keyboard
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("B1","dell","FY04");

        MacBook macBookwithnBlueetoothKeyboard = new MacBook(bluetoothKeyboard);
    }
}
