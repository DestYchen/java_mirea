package Practice6;

public abstract class Dish {
    protected String Name;
    protected int Amount;
    public Dish(String name, int amount) {
        Name = name;
        Amount = amount;
    }
    public Dish(){
        Name = "Вилка";
        Amount = 2;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAmount() {
        return Amount;
    }
    public void setAmount(int amount) {
        Amount = amount;
    }
    public abstract int get_cost();
    @Override
    public String toString() {
        return "Dish{" +
                "Name='" + Name + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}
