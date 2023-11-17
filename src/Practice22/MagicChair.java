package Practice22;
public class MagicChair implements Chair{
    private String name = "Гарри Поттером.";
    public String getName(){
        return name;
    }
    @Override
    public void sitOn() {
        System.out.println("Вы сидите на магическом стуле с " + getName());
    }
}
