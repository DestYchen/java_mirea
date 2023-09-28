package Practice6;

public class Plate extends Dish{
    protected int depth;
    public Plate(){
        super();
        depth = 0;
    }
    public Plate(int Depth){
        this.depth = Depth;
    }
    public Plate(String name, int amount, int depth){
        super(name, amount);
        this.depth = depth;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public int get_cost(){
        return Amount * depth / 2;
    }
    @Override
    public String toString() {
        return "Plate{" +
                "depth=" + depth + "Name='" + Name + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}
