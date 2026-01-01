package SOLID.DependencyInjection.Example1;

public class WiredKeyboard implements Keyboard{
    private final String connectionType;
    private final String company;
    private final String modelVersion;

    public WiredKeyboard(String connectionType, String company, String modelVersion){
        this.connectionType = connectionType;
        this.company = company;
        this.modelVersion = modelVersion;
    }

    @Override
    public void getSpecifications() {
        System.out.println("--Wired Keyboard");
        System.out.println("--connectionType" + connectionType);
        System.out.println("--company" + company);
        System.out.println("--model version" + modelVersion);
    }
}
