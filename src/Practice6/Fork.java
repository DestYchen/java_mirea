package Practice6;

public class Fork extends Dish{
    protected int cost;
    public Fork(){
        super();
        cost = 0;
    }
    public Fork(String name, int amount, int cost){
        super(name, amount);
        this.cost = cost;
    }
    public Fork(int cost){
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int get_cost(){
        return cost * Amount;
    }
    @Override
    public String toString() {
        return "Fork{" +
                "cost=" + cost + "Name='" + Name + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}
