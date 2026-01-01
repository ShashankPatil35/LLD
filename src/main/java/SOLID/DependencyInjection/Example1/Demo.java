package SOLID.DependencyInjection.Example1;

public class Demo {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "RR01");
        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard);

        // cannot create macbook with bluetooth keyboard bcoz
        //- macbook depends on wired keyboard - tight coupling - violation of DIP

        //create keyboard object
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("B1", "Dell", "Y601");
//    MacBook MacbookWithBluetoothkeyboard = new MacBook(bluetoothKeyboard); // wrong
// we have already harcoded wired there is no way for bluetoothkeyboard
    }
}
