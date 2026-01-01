package SOLID.DependencyInjection.Example1;

//high level module directly dependeing on lowlevel module
public class MacBook {
    private final WiredKeyboard keyboard;
    public MacBook(WiredKeyboard wiredKeyboard){
        keyboard = wiredKeyboard; // tight coupling
    }
    public Keyboard getKeyBoard(){
        return keyboard;
    }
}
