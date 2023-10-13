package Practice9;
public class Website implements Nameable{
    private String adress;
    public Website(String adress){
        this.adress = adress;
    }
    public String getName(){
        return adress;
    }
}
