package Practice9;
public class Smartphone implements Nameable{
    private String model;
    Smartphone(String model){
        this.model = model;
    }
    public String getName(){
        return model;
    }
}
