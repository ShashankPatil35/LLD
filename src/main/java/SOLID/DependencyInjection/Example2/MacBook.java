package SOLID.DependencyInjection.Example2;

//high level module directly dependeing on lowlevel module
public class MacBook {
    private final Keyboard keyboard;
    public MacBook(Keyboard keyboard){
        this.keyboard = keyboard; // tight coupling
    }
    public Keyboard getKeyBoard(){
        return keyboard;
    }
}
